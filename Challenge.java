import java.util.*;

public class Challenge {
	
	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		int[][] grid = new int[3][3];
		int[][] copy = new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grid[i][j] = in.nextInt();
				copy[i][j] = grid[i][j];
			}
		}
		Queue<String> q = new LinkedList<String>();
		q.add("U");
		q.add("D");
		q.add("L");
		q.add("R");
		Map<String,int[][]> m = new HashMap<String, int[][]>();
		while (!q.isEmpty()) {
			String cur = q.remove();
			System.out.println(cur);
			if (m.containsKey(cur.substring(0,cur.length()-1))) {
				grid = m.get(cur.substring(0,cur.length()-1));
				char c = cur.charAt(cur.length()-1);
				int pos = findWaldo(grid);
				int x = pos / 3;
				int y = pos % 3;
				if (c == 'U') {
					if (y == 0) continue;
					grid[x][y] = grid[x][y-1];
					grid[x][y-1] = 0;
				} else if (c == 'D') {
					if (y == 2) continue;
					grid[x][y] = grid[x][y+1];
					grid[x][y+1] = 0;
				} else if (c == 'L') {
					if (x == 0) continue;
					grid[x][y] = grid[x-1][y];
					grid[x-1][y] = 0;
				} else if (c == 'R') {
					if (x == 2) continue;
					grid[x][y] = grid[x+1][y];
					grid[x+1][y] = 0;
				}
				boolean flag = true;
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if (i == 2 && j == 2) if (grid[2][2] != 0) flag = false;
						if (grid[i][j] != 3*i+j) flag = false;
					}
				}
				if (flag) {
					System.out.println(cur.length());
					System.exit(0);
				}
				else m.put(cur, grid);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						grid[i][j] = copy[i][j];
					}
				}
			}
			q.add(cur+"U");
			q.add(cur+"D");
			q.add(cur+"L");
			q.add(cur+"R");
		}
	}
	
	public static int findWaldo(int[][] grid) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (grid[i][j] == 0) {
					return 3*i+j;
				}
			}
		}
		return 0;
	}

}
