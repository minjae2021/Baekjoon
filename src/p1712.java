import java.io.*;
import java.util.StringTokenizer;

public class p1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long C = Integer.parseInt(st.nextToken());
	
		if(C<=B) {
			bw.write(String.valueOf(-1));
		}
		else {
			long i = A/(C-B)+1;
			bw.write(String.valueOf(i));
		}
		bw.flush();
		bw.close();
		br.close();
	}	
}
