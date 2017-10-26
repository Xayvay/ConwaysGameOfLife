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

}
