package command_creator;

import levels.Level2D;
import comands.Command;
import comands.ExitCommand;

public class ExitCommandCreator implements Command_Creator {
	private Level2D level;
	public ExitCommandCreator() {
		level=null;
	}

	@Override
	public Command create() {
		return new ExitCommand();
	}
	public void SetLevel(Level2D level) {
		this.level=level;
	}

	@Override
	public void SetStr(String str) {
		
	}

}
