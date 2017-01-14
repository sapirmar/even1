package item_creator;

import levels.Items;
import levels.Wall;

public class WallCreator implements ICreator {

	@Override
	public Items create() {

		return new Wall();
	}

}
