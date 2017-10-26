package conwaysgameoflife;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class conwaysTestCases {

	ConwaysGameOfLife life = new ConwaysGameOfLife();

	int[][] grid = {{0,0,0,0,0,0,1,0},
					{1,1,1,0,0,0,1,0},
					{0,0,0,0,0,0,1,0},
					{0,0,0,0,0,0,0,0},
					{0,0,0,1,1,0,0,0},
					{0,0,0,1,1,0,0,0}};
	
	int[][]wrong = {{0,1,0},
					{0,0,0},
	   				{2,1,4}};
	
	@Test
	public void testAccurateGrid() {

		
		
		assertEquals(true,life.isAccurateGrid(grid));
		assertEquals(false,life.isAccurateGrid(wrong));
		}
	
	@Test
	public void testHowManyNeighbors(){
		
		int count = 0;
		count = life.testHowManyNeighbors(grid,1,1);
		assertEquals(2,count);
	}
	}

