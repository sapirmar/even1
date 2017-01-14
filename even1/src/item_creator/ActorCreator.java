package item_creator;

import levels.Actor;
import levels.Items;

public class ActorCreator implements ICreator {

	public Items create() {
		return new Actor();
	}

}
