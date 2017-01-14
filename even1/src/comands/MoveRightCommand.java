package comands;

import policy.MySokobanPolicy;
import levels.Level2D;
import levels.Moveable_Item;

public class MoveRightCommand extends MoveCommand implements Command {

	
	public MoveRightCommand(Moveable_Item item, Level2D level2d) {
		super(item, level2d);
		
		
		policy=new MySokobanPolicy(item,"move right", level2d);
	}

	//move only if the policy agree
	public void execute() {
		if(policy.moveByPolicy(level2d))
		item.move_right(level2d);
		else
			System.out.println("cant do the action");
	}


}
