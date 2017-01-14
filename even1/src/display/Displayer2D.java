package display;

import levels.Actor;
import levels.Box;
import levels.Destination_Box;
import levels.Level;
import levels.Level2D;
import levels.Space;
import levels.Wall;



public class Displayer2D implements Displayer{
	public int row;
	public int column;
	
	public Displayer2D() {
		row=0;
		column=0;
}
	
	//display the level
	public void display(Level level) {
		Level2D level2d=(Level2D)level;
		row=level2d.getRow();
		column=level2d.getColumn();
	
		
		char[][] char_level=new char[column][row];
		//convert from the array-lists to char
		for(Box box: level2d.getBoxes())
		{
			char_level[box.p.getI()][box.p.getJ()]= '@';
		}
		for(Wall wall: level2d.getWalls())
		{
			char_level[wall.p.getI()][wall.p.getJ()]= '#';
		}
		for(Space space: level2d.getSpaces())
		{
			char_level[space.p.getI()][space.p.getJ()]= ' ';
		}
		for(Actor actor: level2d.getActors())
		{
			char_level[actor.p.getI()][actor.p.getJ()]= 'A';
		}
		for(Destination_Box db: level2d.getDest_boxes())
		{
			char_level[db.p.getI()][db.p.getJ()]= 'o';
		}
		
		for(int i=0;i<column;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(char_level[i][j]);
			}
			System.out.println();
		}
	
	

		
	}
}


