import java.io.*;
import java.util.*;

public class H {
	
	static char[][] grid;
	static int maxx, maxy;
	static int[] clusterSize;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(System.in);
		maxx = in.nextInt();
		maxy = in.nextInt();
		grid = new char[maxx][maxy];
		for (int i = 0; i < maxy; i++) {
			String line = in.next();
			for (int j = 0; j < maxx; j++) {
				grid[j][i] = line.charAt(j);
			}
		}
		int numClusters = 1;
		clusterSize = new int[maxx*maxy];
//		for (int i = 0; i < clusterSize.length; i++) {
//			clusterSize[i] = -1;
//		}
		for (int i = 0; i < maxy; i++) {
			for (int j = 0; j < maxx; j++) {
				if (grid[j][i] == 'x') {
					clusterSize[numClusters-1 ] =1;
					floodfill(j, i, numClusters, 1);
					numClusters++;
				}
			}
		}
		System.out.println(numClusters - 1);
		Arrays.sort(clusterSize);
		for (int i = clusterSize.length - 1; i >= 0; i--) {
			if (clusterSize[i] > 0) {
				System.out.println(clusterSize[i]+1);
			}
		}
		
	}
	
	static void floodfill(int x, int y, int n, int size) {
		grid[x][y] = (char) ('A' + n -1);
		int[] dx = {-1,0,1,1,1,0,-1,-1};
		int[] dy = {-1,-1,-1,0,1,1,1,0};
		for (int i = 0; i < 8; i++) {
			int newx = x+dx[i];
			int newy = y+dy[i];
			if (newx < 0 || newx >= maxx || newy < 0 || newy >= maxy) continue;
			if (grid[newx][newy] == 'x') {
				floodfill(newx,newy,n, size+1);
				clusterSize[n-1]++;
			}
		}
	}

}

