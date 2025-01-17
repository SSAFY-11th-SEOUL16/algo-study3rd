import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 덱_서빈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		Deque<Integer> deque = new ArrayDeque<>();

		int n = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();

			switch (command) {
				case "push_front":
					deque.addFirst(Integer.parseInt(st.nextToken()));
					break;
				case "push_back":
					deque.addLast(Integer.parseInt(st.nextToken()));
					break;
				case "pop_front":
					sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
					break;
				case "pop_back":
					sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
					break;
				case "size":
					sb.append(deque.size()).append("\n");
					break;
				case "empty":
					sb.append(deque.isEmpty() ? 1 : 0).append("\n");
					break;
				case "front":
					sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
					break;
				case "back":
					sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
					break;
				default:
					break;
			}
		}
		System.out.println(sb.toString());
	}
}
