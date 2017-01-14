package save_level;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import levels.Level2D;

public class MyTextLevelSaver implements Level_Saver {

	public MyTextLevelSaver() {
		super();
	}

	public void SaveLevel(OutputStream out, Level2D level2d) throws IOException {
		BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(out));
		level2d.textSaver(writer);
		writer.close();
		
	}


}
