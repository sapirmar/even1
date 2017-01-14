package addItem;

import levels.Items;
import levels.Level;
import levels.Wall;

public class AddWallArrayList implements IAddArrayList{

	@Override
	public void addToArrayList(Level level, Items item) {
		Wall wall=(Wall)item;
		level.getWalls().add(wall);
		
	}
	

}
