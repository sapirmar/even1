package load_level;


import java.io.InputStream;

import levels.Level;


public interface LevelLoader {
	
	public Level load_level(InputStream in);//get a file and load the level(txt,xml,obj)
	
}
