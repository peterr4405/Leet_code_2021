import java.util.LinkedList;
import java.util.Queue;

public class leet_207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean canFinish(int numCourses, int[][] prerequisites) {
		int[] indegree = new int[numCourses];

		for (int[] tmp : prerequisites) {
			indegree[tmp[0]]++;
		}

		Queue<Integer> queue = new LinkedList();
		for (int i = 0; i < numCourses; i++) {
			if (indegree[i] == 0) {
				queue.add(i);
			}
		}

		while (!queue.isEmpty()) {
			int cur = queue.poll();
			for (int[] tmp : prerequisites) {
				if (indegree[tmp[0]] == 0) {
					continue;
				}

				if (tmp[1] == cur) {
					indegree[tmp[0]]--;
				}
				if (indegree[tmp[0]] == 0) {
					queue.add(tmp[0]);
				}

			}

		}
		for (int i = 0; i < numCourses; i++) {
			if (indegree[i] != 0) {
				return false;
			}
		}

		return true;
	}
}
