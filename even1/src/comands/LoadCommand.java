package comands;

import java.util.HashMap;

import levels.Level;
import load_level.ILevelCreator;
import load_level.ObjectLevelCreator;
import load_level.TextLevelCreator;
import load_level.XmlLevelCreator;


public class LoadCommand implements Command {
	private Level level;
	
	private String filename;
	private String type;
	
	public HashMap<String,ILevelCreator> hm= new HashMap<String,ILevelCreator>();
	
	public LoadCommand(String filename) {
		
		this.filename=filename;
		//give us the 3 last letters indicate the type of file
		this.type=filename.substring(filename.length()-3);
	
		//load according to the type
		hm.put("txt",new TextLevelCreator());
		hm.put("xml",new XmlLevelCreator());
		hm.put("obj",new ObjectLevelCreator());
		
				
	}
	public void execute() {
	this.level=hm.get(type).create(filename);
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level =level;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public HashMap<String, ILevelCreator> getHm() {
		return hm;
	}
	public void setHm(HashMap<String, ILevelCreator> hm) {
		this.hm = hm;
	}

}
