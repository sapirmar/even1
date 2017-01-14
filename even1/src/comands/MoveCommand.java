package comands;

import levels.Level2D;
import levels.Moveable_Item;
import policy.MySokobanPolicy;

public abstract class MoveCommand {
	protected Moveable_Item item;
	protected Level2D level2d;	
	protected MySokobanPolicy policy;
	public MoveCommand()
	{
		level2d=null;
		item=null;
		policy=null;
	}
	public MoveCommand(Moveable_Item item,Level2D level2d) {
		this.item=item;
		this.level2d=level2d;
		
	}

	public Moveable_Item getItem() {
		return item;
	}

	public void setItem(Moveable_Item item) {
		this.item = item;
	}

	public Level2D getLevel2d() {
		return level2d;
	}

	public void setLevel2d(Level2D level2d) {
		this.level2d = level2d;
		//the actor is in the first position in the array-list of actors
		setItem(level2d.getActors().get(0));
	}

	
	public MySokobanPolicy getPolicy() {
		return policy;
	}

	public void setPolicy(MySokobanPolicy policy) {
		this.policy = policy;
	}
}
