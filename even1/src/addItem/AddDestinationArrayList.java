package addItem;

import levels.Destination_Box;
import levels.Items;
import levels.Level;

public class AddDestinationArrayList implements IAddArrayList {

	@Override
	public void addToArrayList(Level level, Items item) {
		Destination_Box db=(Destination_Box)item;
		level.getDest_boxes().add(db);

	}

}
