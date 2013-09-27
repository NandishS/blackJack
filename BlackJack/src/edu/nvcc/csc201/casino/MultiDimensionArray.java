package edu.nvcc.csc201.casino;

public class MultiDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int X=3;
		final int Y=3;
		final int Z=3;
		int magicCubic[][][] = new int[X][Y][Z];
/*		System.out.println(magicCubic.length);
		System.out.println(magicCubic[X-1].length);
		System.out.println(magicCubic[X-1][Y-1].length);
*/		
		int count=0;
		//initialize
		for(int x=0; x<magicCubic.length;x++)
			for(int y=0; y<magicCubic[X-1].length;y++)
				for(int z=0; z<magicCubic[X-1][Y-1].length;z++) {
					count++;
					magicCubic[x][y][z] = count;
				}
		
		
		//print out
		for(int x=0; x<magicCubic.length;x++)
			for(int y=0; y<magicCubic[X-1].length;y++)
				for(int z=0; z<magicCubic[X-1][Y-1].length;z++)
					System.out.println("magicCubic[" + x +"][" +y +"][" +z + "]" + magicCubic[x][y][z]);
		
	}

}
