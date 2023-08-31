import java.util.*;
import java.io.*;

public class CoinPiles {

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
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextInt();
            long b = sc.nextInt();

            // while(a > 0 && b > 0){
            //     if(a > b){
            //         a -= 2;
            //         b -= 1;
            //     }else{
            //         b -= 2;
            //         a -= 1;
            //     }
            // }    

            // if((a == 0 && b != 0) || ( b == 0 && a != 0))
            //     out.println("NO");
            // else 
            //     out.println("YES");

            // if(a > 2 && b > 2){
            //     if( a == b){
            //         if( a% 3 == 0 && b %3 == 0)
            //             out.println("YES");
            //     }else if((a- b)%3 == 0 || (b-a)%3 == 0)
            //         out.println("YES");
                        
            // }else if( (a == 2 && b == 1) || (b == 2 && a == 1 )){
            //     out.println("YES");
            // }else{
            //     out.println("NO");
            // }

            long sum = a + b;
            if(Math.max(a, b) <= 2 * Math.min(a , b)){
                if(sum % 3 == 0)
                    out.println("YES");
                else
                    out.println("NO");
            }else
                out.println("NO");
        
        }
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