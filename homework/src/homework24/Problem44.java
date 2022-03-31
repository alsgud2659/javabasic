package homework24;

public class Problem44 {
	static int n = 4;															// 행의 개수
	static int m = 5;															// 열의 개수
	static int[][] map = {{0,0,1,1,0},{0,0,0,1,1},{1,1,1,1,1},{0,0,0,0,0}};		// 아이스크림틀
	public static void main(String[] args) {
		int count = 0;						// 만들어지는 아이스크림의 개수
		for (int i = 0; i < n; i++) {		// map의 행을 순회
			for (int j = 0; j < m; j++) {	// map의 열을 순회
				if (dfs(i,j) == true) {		// dfs메서드를 호출, 그 값이 true라면 count를 1증가
					count++;
				}
			}
		}
		System.out.println(count);			// 만들어지는 아이스크림의 개수를 출력

	}
	
	public static boolean dfs(int x, int y) {
		if (x <= -1 || x >= n || y <= -1 || y >= m) {		// map[x][y]에서 n이나 m을 넘거나 0보다 작은 인덱스는 없으므로 false를 반환
			return false;
		}
		if (map[x][y] == 0) {		// map[x][y]이 0이라면 
			map[x][y] = 1;			// 그 부분을 1로 변경
			dfs(x - 1, y);			// map[x][y]을 기준으로 좌를 dfs메서드를 재귀적으로 호출
			dfs(x + 1, y);			// map[x][y]을 기준으로 우를 dfs메서드를 재귀적으로 호출
			dfs(x, y + 1);			// map[x][y]을 기준으로 상을 dfs메서드를 재귀적으로 호출
			dfs(x, y - 1);			// map[x][y]을 기준으로 하를 dfs메서드를 재귀적으로 호출
			return true;			// 0이 하나라도 있으면 그 부분에는 아이스크림이 만들어지므로 true를 반환
		}
		
		return false;				// 1일 경우에는 false를 반환
	}
	

}
