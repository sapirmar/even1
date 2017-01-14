package comands;

import java.util.Scanner;

import command_creator.Command_Creator;

import levels.Box;
import levels.Level2D;


public class CLI {
	private Boolean flag_win;
	private Level2D level;
	
	public CLI() {
		level=null;
		flag_win=false;
		
	}
	public void Run()
	{
		ConcreteCommand cc;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("\nMenu:\n"+"-load+filename\n"+"-display\n"+"-move up/down/left/right\n"+"-save+filename\n"+"-exit\n");
		String str;
		String[] str2;
		do{
			while(level==null){
				System.out.println("first, you need to load the level");
				str=scanner.nextLine();
				str2=str.split(" ");
				//if the first word is load
				if(str2[0].compareTo("load")==0)
				{
					LoadCommand lc=new LoadCommand(str2[1]);
					lc.execute();
					this.level=(Level2D)lc.getLevel();
					
					
				}		
			}
			str=scanner.nextLine();
			str2=str.split(" ");
		
			//if the first word is "load"
			if(str2[0].compareTo("load")==0)
			{
				LoadCommand lc=new LoadCommand(str2[1]);
				lc.execute();
				this.level=(Level2D)lc.getLevel();
				
				
			}
			//if the first word is "save"
			else if(str2[0].compareTo("save")==0)
			{
				
				SaveCommand sc=new SaveCommand(level);
				sc.setLevel(new Level2D(this.level));
				sc.setFilename(str2[1]);
				sc.execute();				
				
			}
			else{
			cc=new ConcreteCommand();
			Command_Creator command_c=cc.getHm().get(str);
			command_c.SetLevel(level);
			command_c.SetStr(new String(str));
			command_c.create().execute();
			
			}
			
			//check if the player win the level, if all the boxes is on target
			Boolean flag_win=true;
			for(Box box:level.getBoxes())
			{
				if(box.getP().getFlagDestination()==false)
				{
					flag_win=false;
				}
				
			}
			if(flag_win==true)
			System.out.println("congratulations you WON!!!");
			
			
		}while ((str.compareTo("exit")!=0));
		
		scanner.close();
				}

}
