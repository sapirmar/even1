package comands;

public class ExitCommand implements Command {

	@Override
	public void execute() {
		System.out.println("bye-bye");
		return;

	}

}
