package item_creator;

import levels.Box;
import levels.Items;

public class BoxCreator implements ICreator {

	@Override
	public Items create() {
		return new Box();
	}

}
