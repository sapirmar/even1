package command_creator;

import levels.Level2D;
import comands.Command;
import comands.DisplayCommand;
import display.Displayer;
import display.Displayer2D;

public class DisplayCommandCreator implements Command_Creator {
	private Displayer2D dis;
	private Level2D level;
	
	public DisplayCommandCreator()
	{
		dis=new Displayer2D();
		this.level=null;
	}
	
	public DisplayCommandCreator(Level2D level) {
		dis=new Displayer2D();
		this.level=level;
		
	}

	@Override
	public Command create() {
		  return new DisplayCommand(level, dis);

	}

	@Override
	public void SetLevel(Level2D level) {
		this.level=level;
	}

	@Override
	public void SetStr(String str) {
		
		
	}

}
