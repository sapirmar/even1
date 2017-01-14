package save_level;

import levels.Level2D;

public interface IlevelSaverCreator {
	
public void create(Level2D level,String filename);//function to save the level
public void SetLevel(Level2D level);
public void SetStr(String str);
}
