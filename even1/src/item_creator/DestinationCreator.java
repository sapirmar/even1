package item_creator;

import levels.Destination_Box;
import levels.Items;

public class DestinationCreator implements ICreator {

	@Override
	public Items create() {
		
		return new Destination_Box()  ;
	}

}
