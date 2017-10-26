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
	
	int[][] nextGen = {{0,1,0,0,0,0,0,0},
					   {0,1,0,0,0,1,1,1},
					   {0,1,0,0,0,0,0,0},
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
		count = life.howManyNeighbors(grid,1,1);
		assertEquals(2,count);
	}
	
	@Test
	public void testGameOfLifeRules(){
		int neighbors = 0;
		assertEquals(0,life.gameOfLifeRules(0,neighbors));
		assertEquals(0,life.gameOfLifeRules(1,neighbors));
		neighbors = 4;
		assertEquals(0,life.gameOfLifeRules(1,neighbors));
		neighbors = 2;
		assertEquals(1,life.gameOfLifeRules(1,neighbors));
		neighbors = 3;
		assertEquals(1,life.gameOfLifeRules(1,neighbors));
		assertEquals(1,life.gameOfLifeRules(0,neighbors));
	
	}
	
	@Test
	public void testNextGeneration(){
		
		int[][] check = life.nextGeneration(grid);
		for(int x = 0; x < nextGen.length;x++){
			for(int y = 0; y< nextGen[0].length; y++){
			assertEquals(nextGen[x][y],check[x][y]);
			}
		}
		
		assertEquals(nextGen,life.nextGeneration(grid));
		
		
		
	}
	}

