import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1) 입력 받은 값을 배열에 저장
 * 2) 1부터 11, 111, 1111, 반복문
 * 3) 정답 밷열에 없으면 계산해보기
 */
public class Main_04375 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input;
		int n;

		while ((input = br.readLine()) != null && !input.trim().isEmpty()) {
			n = Integer.parseInt(input);

			long tmp = 1;
			long count = 1;
			while (true) {
				if (tmp % n == 0) {
					sb.append(count).append("\n");
					break;
				} else {
					tmp *= 10;
					tmp += 1;
					tmp %= n;
					count += 1;
				}
			}
		}
		System.out.println(sb.toString());
	}
}
