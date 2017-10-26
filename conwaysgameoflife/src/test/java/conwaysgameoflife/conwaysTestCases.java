package conwaysgameoflife;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class conwaysTestCases {


	@Test
	public void testAccurateGrid() {
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
		
		asserEquals(true,life.isAccurateGrid());
		}
	}

