package addItem;

import levels.Actor;
import levels.Items;
import levels.Level;

public class AddActorArrayList implements IAddArrayList {

	@Override
	public void addToArrayList(Level level, Items item) {
		Actor actor;
		actor=(Actor)item;
		level.getActors().add(actor);

	}

}
