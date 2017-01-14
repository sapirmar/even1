package command_creator;

import levels.Level2D;
import levels.Moveable_Item;
import comands.Command;
import comands.MoveDownCommand;

public class MoveDownCommandCreator implements Command_Creator {
	private Level2D level2d;
	private Moveable_Item item;
	
public MoveDownCommandCreator ()
{
	level2d=null;
	item=null;
}
	
	public MoveDownCommandCreator(Level2D level2d) {
		this.level2d=level2d;
		this.item=level2d.getActors().get(0);
	}

	@Override
	public Command create() {
		return new MoveDownCommand(item, level2d);
	}

	public Level2D getLevel2d() {
		return level2d;
	}

	public void setLevel2d(Level2D level2d) {
		this.level2d = level2d;
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
