import java.io.*;
import java.util.StringTokenizer;

public class p1920 {
	static boolean[] primeNum;
	public static void main(String args[]) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		primeNum = new boolean[N+1];
	
		getPrimeNum();
		for(int i=M;i<=N;i++) {
			if(!primeNum[i]) {
				bw.write(i+"\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
	static void getPrimeNum() {
		primeNum[1] = true;
		
		for(int i=2;i<primeNum.length;i++) {
			for(int j=2;j*i<primeNum.length;j++) {
				primeNum[i*j] = true;
			}
		}
	}
}

