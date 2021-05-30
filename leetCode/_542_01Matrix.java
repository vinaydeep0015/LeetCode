import java.util.ArrayDeque;
import java.util.Queue;

/*
 * Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.

The distance between two adjacent cells is 1.

 

Example 1:

Input: mat = [[0,0,0],[0,1,0],[0,0,0]]
Output: [[0,0,0],[0,1,0],[0,0,0]]

Example 2:

Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
Output: [[0,0,0],[0,1,0],[1,2,1]]

 

Constraints:

    m == mat.length
    n == mat[i].length
    1 <= m, n <= 104
    1 <= m * n <= 104
    mat[i][j] is either 0 or 1.
    There is at least one 0 in mat.


 */
/*
 * BFS 

1. first create a distance matrix
2. assign max int value to all distance
3. the matrix node that has 0 , change its dist as 0 and keep pushing in queue
4. pop element one by one > check its neighbour that are not visited which have max_int distance
5. change its dist as dist of current node +1
6. push this node to queue to check its neighbours
 */
public class _542_01Matrix {
	public class Loc {
		int x;
		int y;

		Loc(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	// use queue that will make it BFS
	public int[][] updateMatrix(int[][] mat) {
		Queue<Loc> q = new ArrayDeque<Loc>();

		int dist[][] = new int[mat.length][mat[0].length];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				dist[i][j] = Integer.MAX_VALUE;
			}
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == 0) {
					q.add(new Loc(i, j));
					dist[i][j] = 0;
				}
			}
		}

		int dx[] = { 1, -1, 0, 0 };
		int dy[] = { 0, 0, 1, -1 };

		while (!q.isEmpty()) {
			Loc loc = q.peek();
			int x = loc.x;
			int y = loc.y;
			q.remove();

			// 4 neighbours of current locstion l
			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];

				if (nx >= 0 && nx < mat.length && ny >= 0 && ny < mat[0].length) {
					if (dist[nx][ny] == Integer.MAX_VALUE) {
						dist[nx][ny] = dist[x][y] + 1;
						q.add(new Loc(nx, ny));
					}
				}

			}

		}

		return dist;
	}
}
