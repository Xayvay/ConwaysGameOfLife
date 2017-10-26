package conwaysgameoflife;

public class ConwaysGameOfLife {

	public ConwaysGameOfLife() {

	}

	public boolean isAccurateGrid(int[][] grid) {

		if (grid.length != 6) {
			return false;
		} else {
			for (int x = 0; x < grid.length; x++) {
				for (int y = 0; y < grid[x].length; y++) {
					if (grid[x].length != 8) {
						return false;
					} else if (grid[x][y] != 0 && grid[x][y] != 1) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public int howManyNeighbors(int[][]grid,int rowPos, int colPos){
		int count = 0;
		
		for(int x = -1; x<= 1; x++){
			for(int y = -1; y<=1 ; y++){
				count += grid[rowPos + x][colPos + y];
			}
		}
		
		count -= grid[rowPos][colPos];
		
		return count;
	}
}
