import java.io.*;

public class 포도주시식_규영 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n], dp = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
        dp[0] = arr[0];
        if (1 < n) {
            dp[1] = arr[0]+arr[1];
            if (2 < n) dp[2] = Math.max(dp[1], Math.max(arr[0]+arr[2], arr[1]+arr[2]));
        }
        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]));
        }
        System.out.print(dp[n-1]);
    }
}
