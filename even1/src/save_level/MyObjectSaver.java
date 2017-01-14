package save_level;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import levels.Level2D;


public class MyObjectSaver implements Level_Saver {

	public MyObjectSaver()
	{
		
	}

	@Override
	public void SaveLevel(OutputStream out, Level2D level2d) throws IOException {
		
		ObjectOutputStream oi=new ObjectOutputStream(out);
		oi.writeObject(level2d);
	}

}
