package test;

public class Test {
	static int n = 4;															
	static int m = 5;
	static int[][] map = {{0,0,1,1,0},{0,0,0,1,1},{1,1,1,1,1},{0,0,0,0,0}};
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (dfs(i,j) == true) {
					count++;
				}
			}
		}
		System.out.println(count);

	}
	
	public static boolean dfs(int x, int y) {
		if (x <= -1 || x >= n || y <= -1 || y >= m) {
			return false;
		}
		if (map[x][y] == 0) {
			map[x][y] = 1;
			dfs(x - 1, y);
			dfs(x + 1, y);
			dfs(x, y + 1);
			dfs(x, y - 1);
			return true;
		}
		
		return false;
	}
	

}
