package save_level;

import java.io.FileOutputStream;
import java.io.IOException;

import levels.Level2D;

public class TextLevelSaverCreator implements IlevelSaverCreator{
	private String filename;
	private Level2D level;
	public TextLevelSaverCreator()  {
	}

	@Override
	public void create(Level2D level,String filename) {
		try{
			this.level=level;//////////////
			this.filename=filename;
			//System.out.println(level.getRow());
			MyTextLevelSaver text=new MyTextLevelSaver();
			text.SaveLevel(new FileOutputStream(this.filename), this.level);
			
		}catch(IOException e)
		{
			System.out.println("can not save the level");
			e.printStackTrace();
		}
		
	}

	@Override
	public void SetLevel(Level2D level) {
		this.level=new Level2D(level);
	}

	@Override
	public void SetStr(String str) {
		this.filename=new String(str);
		
	}

}
