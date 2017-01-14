package comands;


import display.Displayer;
import display.Displayer2D;
import levels.Level;

public class DisplayCommand implements Command {

	private Level level;
	private Displayer dis;

	public DisplayCommand(Level level, Displayer dis) {
		this.level=level;
		this.dis=dis;
	
		
	}
	
	public void execute() {
		if ((Displayer2D)dis!=null)
		{
			dis.display(level);
		}
		else System.out.println("can not display the level");
	
	}

}
