package addItem;

import levels.Items;
import levels.Level;
import levels.Space;

public class AddSpacesArrayList implements IAddArrayList {

	@Override
	public void addToArrayList(Level level, Items item) {
		Space space=(Space)item;
		level.getSpaces().add(space);

	}

}
