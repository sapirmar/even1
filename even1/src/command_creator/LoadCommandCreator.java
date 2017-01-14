package command_creator;

import comands.Command;
import comands.LoadCommand;
import levels.Level2D;

public class LoadCommandCreator implements Command_Creator {
	private String filename;
	private Level2D level;
	
	public LoadCommandCreator() {
		
	}
	public LoadCommandCreator(String filename) {
		this.filename=filename;
		
		
	}


	@Override
	public Command create() {
		return new LoadCommand(filename);
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}

	public void SetLevel(Level2D level) {
		this.level=new Level2D(level);
		
	}
	@Override
	public void SetStr(String str) {
		String str_2[]=str.split(" ");
		this.filename=(str_2[1]);
		
	}
}
