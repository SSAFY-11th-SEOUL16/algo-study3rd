import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 로또_서빈 {
	static int k;
	static int[] s;
	static boolean[] visited;
	static int[] result;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while (true) {
			st = new StringTokenizer(br.readLine());
			k = Integer.parseInt(st.nextToken());
			if (k == 0) {
				break;
			}

			s = new int[k];
			result = new int[6];
			visited = new boolean[k];

			for (int i = 0; i < k; i++) {
				s[i] = Integer.parseInt(st.nextToken());
			}
			dfs(0, 0);
			sb.append("\n");
		}
		System.out.println(sb);
	}

	public static void dfs(int index, int count) {
		if (count == 6) {
			for (int i = 0; i < 6; i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = index; i < k; i++) {
			if (!visited[i]) {
				visited[i] = true;
				result[count] = s[i];
				dfs(i, count + 1);
				visited[i] = false;
			}
		}
	}
}
