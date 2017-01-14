package policy;

import levels.Actor;
import levels.Level;
import levels.Level2D;
import levels.Moveable_Item;
import levels.Position;
import levels.Wall;


public class MySokobanPolicy {
	private Moveable_Item m_i;
	private String m_c;
	private Level2D level;
	
	public MySokobanPolicy( Moveable_Item m_i,String m_c,Level2D level) {
		
		this.m_i=new Moveable_Item(m_i);
		this.level=level;
		this.m_c=m_c;
	}
	
	
	public String getM_c() {
		return m_c;
	}


	public void setM_c(String m_c) {
		this.m_c = m_c;
	}


	public Moveable_Item getM_i() {
		return m_i;
	}
	public void setM_i( Moveable_Item m_i) {
		this.m_i = m_i;
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level2D level) {
		this.level = level;
	}
	//function check if the policy agree the move
	public Boolean moveByPolicy(Level2D level)
	{	Position new_p=null;
		Position old_p=m_i.p;
		Position final_p=null;
		if(m_c=="move up")
		{
			new_p=new Position(m_i.p.getI()-1, m_i.p.getJ());
			final_p=new Position(m_i.p.getI()-2, m_i.p.getJ());
		}
		if(m_c=="move down")
		{
			new_p=new Position(m_i.p.getI()+1, m_i.p.getJ());
			final_p=new Position(m_i.p.getI()+2, m_i.p.getJ());
		}
		if(m_c=="move right")
		{
			new_p=new Position(m_i.p.getI(), m_i.p.getJ()+1);
			final_p=new Position(m_i.p.getI(), m_i.p.getJ()+2);
		}
		if(m_c=="move left")
		{
			new_p=new Position(m_i.p.getI(), m_i.p.getJ()-1);
			final_p=new Position(m_i.p.getI(), m_i.p.getJ()-2);
		}
		
		
		//if the next is wall
		if (level.warehouse[new_p.getI()][new_p.getJ()].getClass().equals(Wall.class))
		{
			return false;
		}
		//if the next is box and after it is wall/box
	
		if((level.warehouse[new_p.getI()][new_p.getJ()].getClass().equals(levels.Box.class)))			
		{
			if ((level.warehouse[final_p.getI()][final_p.getJ()].getClass().equals(Wall.class))||(level.warehouse[final_p.getI()][final_p.getJ()].getClass().equals(levels.Box.class)))
			{
				return false;
			}
			
		}
		//the actor can pull the box
		if((level.warehouse[old_p.getI()][old_p.getJ()].getClass().equals(levels.Box.class))&&(level.warehouse[new_p.getI()][new_p.getJ()].getClass().equals(Actor.class)))
		{
			return false;
		}

		return true;	
		
	}
	 
	
	

}
