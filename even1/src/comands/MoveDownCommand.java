package comands;

import policy.MySokobanPolicy;
import levels.Level2D;
import levels.Moveable_Item;

public class MoveDownCommand extends MoveCommand implements Command  {
 

	public MoveDownCommand(Moveable_Item item, Level2D level2d) {
		super(item, level2d);
		policy=new MySokobanPolicy(item, "move down", level2d);
		
	}

	public void execute() {
		//move only if the policy agree
		if(policy.moveByPolicy(level2d))
		{
		item.move_down(level2d);
		}
		else
		System.out.println("cant do the action");
		
		
	}


}
