package command_creator;

import levels.Level2D;
import comands.Command;

public interface Command_Creator {
	public Command create();
	public void SetLevel(Level2D level);
	public void SetStr(String str);

}

