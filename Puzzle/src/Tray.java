import java.applet.*;
import java.util.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

public class Tray{
	private int len;
	private int wid;
	private int [] bingoState = new int[2];
	
	Block[][] tray;
	
	public Tray(int l, int w){
		tray = new Block[l][w];
		
		for(int i = 0; i < w; i++){
			for(int j = 0; j < l; j++){
				tray[i][j] = null;
			}
		}
		
		//initialize the blokc by 
		/*
		2 1 0 0
		2 1 0 3
		2 1 2 0
		2 1 2 3
		2 2 1 1
		1 2 3 1
		1 1 4 0
		1 1 4 1
		1 1 4 2
		1 1 4 3
		
		goal state : (1,3)

		*/
		String b1 = "A";
		String b2 = "B";
		String b3 = "C";
		String b4 = "D";
		String b5 = "Bingo";
		String b6 = "F";
		String b7 = "G";
		String b8 = "H";
		String b9 = "I";
		String b10 = "J";
		
		bingoState[0] = 1;
		bingoState[1] = 1;
		
		initializeTray(2, 1, 0, 0, tray, b1);
		initializeTray(2, 1, 0, 3, tray, b2);
		initializeTray(2, 1, 2, 0, tray, b3);
		initializeTray(2, 1, 2, 3, tray, b4);
		initializeTray(2, 2, 1, 1, tray, b5);
		initializeTray(1, 2, 3, 1, tray, b6);
		initializeTray(1, 1, 4, 0, tray, b7);
		initializeTray(1, 1, 4, 1, tray, b8);
		initializeTray(1, 1, 4, 2, tray, b9);
		initializeTray(1, 1, 4, 3, tray, b10);
		
		System.out.println("It's ok for initiaization.");
	}
	
	public int[] getBingoState(){
		
		return bingoState;
	}
	
	public void initializeTray(int l, int w, int startY, int startX, Block[][] t, String idName) {
		for(int x = startX; x < w; x++){
			for(int y = startY; y < l; y++){
				t[x][y] = new Block(l, w, x, y, idName);
			}
		}
	}
	
	public class Step{
		private int x, y;
		private int moveX, moveY;
		
		public Step(int coorX, int coorY, int moveH, int moveV){
			x = coorX;
			y = coorY;
			moveX = moveH;
			moveY = moveV;
		}
	}
	
	public Queue getSolution(){
		Queue<Step> solu = new LinkedList<Step>();
		
		
		
		
		
		
	}
	
	
	
	public static void main(String [] args){
		Tray puzzle = new Tray(5, 4);
		
		
	}
	
}