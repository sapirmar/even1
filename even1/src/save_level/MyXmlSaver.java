package save_level;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import levels.Level2D;

public class MyXmlSaver implements Level_Saver {

	public MyXmlSaver() {
		super();
	}

	public void SaveLevel(OutputStream out, Level2D level2d) throws IOException {
		XMLEncoder xml=new XMLEncoder(new BufferedOutputStream(out));
		xml.writeObject(level2d);
		xml.close();

	}

}
