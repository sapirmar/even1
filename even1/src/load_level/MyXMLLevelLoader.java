package load_level;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.InputStream;

import levels.Level;
import levels.Level2D;


public class MyXMLLevelLoader implements LevelLoader {
	
	@Override
	public Level load_level(InputStream in){
		Level2D level2d=new Level2D();
		XMLDecoder xml=new XMLDecoder(new BufferedInputStream(in));
		level2d=(Level2D)xml.readObject();
		xml.close();
		return level2d;
		
	
	
}


}
