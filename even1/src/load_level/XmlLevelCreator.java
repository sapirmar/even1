package load_level;


import java.io.FileInputStream;
import java.io.FileNotFoundException;


import levels.Level;

public class XmlLevelCreator implements ILevelCreator {

	Level newlevel;
	@Override
	public Level create(String in) {
		
		try{
			newlevel=new MyXMLLevelLoader().load_level(new FileInputStream(in));
			return newlevel;
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
			return null;
		}
	}

}
