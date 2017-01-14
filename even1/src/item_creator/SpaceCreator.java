package item_creator;

import levels.Items;
import levels.Space;

public class SpaceCreator implements ICreator {

	@Override
	public Items create() {

		return new Space();
	}

}
