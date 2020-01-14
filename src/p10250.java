import java.util.Scanner;

public class p10250 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int [] result = new int[t];
		for(int i=0;i<t;i++) {			
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			if(N%H==0) {
				result[i] = H*100+N/H;
			}
			else {
				result[i] = N%H*100+N/H+1;
			}	
		}	
		for(int i=0;i<t;i++) {
			System.out.println(result[i]);
		}
		sc.close();
	}	
}