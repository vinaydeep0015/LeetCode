import java.util.ArrayDeque;
import java.util.Queue;

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
