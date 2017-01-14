package save_level;

import java.io.IOException;
import java.io.OutputStream;

import levels.Level2D;

public interface Level_Saver {
public void SaveLevel(OutputStream out,Level2D level2d)throws IOException;

}
