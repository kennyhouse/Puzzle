import java.util.*;
import java.applet.*;

public class Block{
	
	private int blocklen;
	private int blockwid;
	private String id;
	private int x;
	private int y;
	
	public Block(int l, int w, int coordinateX, int coordinateY, String blockName ){
		blocklen = l;
		blockwid = w;
		id = blockName;
		x = coordinateX;
		y = coordinateY;
	}
	
	public String getId(){
		return id;
	}
	
	public int[] getCoordinate(){
		int[] xy = new int[2];
		xy[0] = x;
		xy[1] = y;
		
		return xy;
	}
	
	public int[] getBlockSize(){
		int[] blockSize = new int[2];
		blockSize[0] = blocklen;
		blockSize[1] = blockwid;
		
		return blockSize;
	}
	
}