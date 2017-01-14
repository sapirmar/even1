package command_creator;

import levels.Level2D;
import levels.Moveable_Item;
import comands.Command;
import comands.MoveRightCommand;

public class MoveRightCommandCreator implements Command_Creator {
	private Level2D level2d;
	private Moveable_Item item;
	
public MoveRightCommandCreator()
{
	
}
	
	public MoveRightCommandCreator(Level2D level2d) {
		
		this.level2d=new Level2D(level2d);
		
		this.item=new Moveable_Item(level2d.getActors().get(0)); 
		
		
		
		
	}

	@Override
	public Command create() {
		
		return new MoveRightCommand(item, level2d);
	}

	public Level2D getLevel2d() {
		return level2d;
	}

	public void setLevel2d(Level2D level2d) {
		System.out.println(level2d.getColumn());
		this.level2d = new Level2D(level2d);
		this.item=level2d.getActors().get(0);
		
	}

	public Moveable_Item getItem() {
		return item;
	}

	public void setItem(Moveable_Item item) {
		this.item = item;
	}
	public void SetLevel(Level2D level) {
		this.level2d=(level);
		this.item=(level2d.getActors().get(0));
	}

	@Override
	public void SetStr(String str) {
		
	}

}
