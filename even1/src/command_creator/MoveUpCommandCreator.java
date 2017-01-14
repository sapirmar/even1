package command_creator;

import levels.Level2D;
import levels.Moveable_Item;
import comands.Command;
import comands.MoveUpCommand;

public class MoveUpCommandCreator implements Command_Creator {
	private Level2D level2d;
	private Moveable_Item item;
	
public MoveUpCommandCreator ()
{
	level2d=null;
	item=null;
}
	
	public MoveUpCommandCreator(Level2D level2d) {
		this.level2d=level2d;
		this.item=level2d.getActors().get(0);
}

	@Override
	public Command create() {
	return new  MoveUpCommand(item, level2d);
	}

	public void SetLevel(Level2D level) {
		this.level2d=(level);
		this.item=(level2d.getActors().get(0));
	}

	@Override
	public void SetStr(String str) {
		// TODO Auto-generated method stub
		
	}
}
