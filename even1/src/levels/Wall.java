package levels;

public class Wall extends Items {
	public Wall() {
		super();
	}

	public Wall(Position p) {
		super(p);

	}
	public char getChar()
	{
		return '#';
	}
}
