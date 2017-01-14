package addItem;

import levels.Box;
import levels.Items;
import levels.Level;



public class AddBoxArrayList implements IAddArrayList {

	@Override
	public void addToArrayList(Level level, Items item) {
		level.getBoxes().add((Box)item);
		

	}

}
