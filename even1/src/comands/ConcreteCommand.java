package comands;

import java.util.HashMap;

import levels.Level2D;
import command_creator.Command_Creator;
import command_creator.DisplayCommandCreator;
import command_creator.ExitCommandCreator;
import command_creator.LoadCommandCreator;
import command_creator.MoveDownCommandCreator;
import command_creator.MoveLeftCommandCreator;
import command_creator.MoveRightCommandCreator;
import command_creator.MoveUpCommandCreator;



public class ConcreteCommand {
	private HashMap<String, Command_Creator >hm;
	private	String str;
	private Level2D level2d;
	private	String[] str_2;
	
	public ConcreteCommand() {
		
		hm=new HashMap<String, Command_Creator >();
		//hash-map: key: what command the player write, value: create the command
		hm.put("load", new LoadCommandCreator());
		hm.put("move up",new MoveUpCommandCreator());
		hm.put("move down",new MoveDownCommandCreator());
		hm.put("move left",new MoveLeftCommandCreator());
		hm.put("move right",new MoveRightCommandCreator());
		hm.put("display", new DisplayCommandCreator());
		hm.put("exit", new ExitCommandCreator());
		
		
		
		
		
	}

	public void docommand()
	{
		Command_Creator cc;
		cc=hm.get(str);
		cc.SetLevel(level2d);
		Command command=cc.create();
		command.execute();
		
	}
	public HashMap<String, Command_Creator> getHm() {
		return hm;
	}


	public void setHm(HashMap<String, Command_Creator> hm) {
		this.hm = hm;
	}


	public String getStr() {
		return str;
	}


	public void setStr(String str) {
		this.str = str;
		this.str_2=str.split(" ");
	}


	public Level2D getLevel2d() {
		return level2d;
	}


	public void setLevel2d(Level2D level2d) {
		this.level2d = (level2d);
	}


	public String[] getStr_2() {
		return str_2;
	}


	public void setStr_2(String[] str_2) {
		this.str_2 = str_2;
	}







	
}
