import java.util.*;
import java.io.*;

public class Main {

	static FastReader sc;
	static PrintWriter out;

	public static void main(String[] args) {
		if (System.getProperty("ONLINE_JUDGE") == null) {
			try {
				File f1 = new File("input.txt");
				File f2 = new File("output.txt");
				Reader r = new FileReader(f1);
				sc = new FastReader(r);
				out = new PrintWriter(f2);
				double prev = System.currentTimeMillis();
				solve();
				out.println("\n\nExecuted in : " + ((System.currentTimeMillis() - prev) / 1e3) + " sec");
			} catch (Exception e) {
				sc = new FastReader(new InputStreamReader(System.in));
				out = new PrintWriter(System.out);
				solve();
			}
		} else {
			sc = new FastReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			solve();
		}
		out.flush();
		out.close();
	}

	static void solve() {
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int num = sc.nextInt();

			char arr[] = sc.nextLine().toCharArray();
			
			for (int i = 0; i < arr.length; i++) {
				if(num == 0){
					sb.append(String.valueOf(arr));
					sb.append(0);
					break;
				}
				if(Integer.parseInt(String.valueOf(arr[i])) > num ){
					sb.append(arr[i]);
					//out.println((arr[i]));
				}else{
					sb.append(num);
					if(i>=0){
						for (int j = i; j < n; j++) {
							sb.append(arr[j]);
						}
					}
					break;
				}
			}
			sb.append("\n");
		}
		out.println(sb.toString());
	}

	/***********************************/
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader(Reader r) {
			br = new BufferedReader(r);
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		int[] readArrayI(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			return arr;
		}

		long[] readArrayL(int n) {
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
			}
			return arr;
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		boolean hasNext() {
			if (st != null && st.hasMoreTokens()) {
				return true;
			}
			String tmp;
			try {
				br.mark(1000);
				tmp = br.readLine();
				if (tmp == null) {
					return false;
				}
				br.reset();
			} catch (IOException e) {
				return false;
			}
			return true;
		}
	}

	/*
	 * ASCII Range--->(A-Z)--->[65,90]<<::>>(a-z)--->[97,122]
	 */
	/**************************************/
}