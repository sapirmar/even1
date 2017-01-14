package comands;

import java.util.HashMap;

import save_level.IlevelSaverCreator;
import save_level.ObjectLevelSaverCreator;
import save_level.TextLevelSaverCreator;
import save_level.XmlSaverCreator;
import levels.Level;
import levels.Level2D;

public class SaveCommand implements Command {
          private Level2D level;
		  private String str;
		  private String type;
		  HashMap<String,IlevelSaverCreator> hm;
	public SaveCommand (Level2D level) {
		
		this.level=level;
		  //save according to the the type
		  hm=new HashMap<String,IlevelSaverCreator>();
		  hm.put("txt",new TextLevelSaverCreator());
		  hm.put("xml", new XmlSaverCreator() );
		  hm.put("obj", new ObjectLevelSaverCreator());
		  }
		 
		@Override
		public void execute() {		
			//this.str=str;
			this.type=str.substring(str.length()-3);
			System.out.println(str);
			hm.get(type).create(level,str);
		}
	
			public Level getLevel() {
				return level;
			}
			public void setLevel(Level2D level) {
				this.level =(level);
			}
			public String getFilename() {
				return str;
			}
			public void setFilename(String filename) {
				this.str = new String(filename);
			}
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}
			public HashMap<String, IlevelSaverCreator> getHm() {
				return hm;
			}
			public void setHm(HashMap<String, IlevelSaverCreator> hm) {
				this.hm = hm;
			}

}
