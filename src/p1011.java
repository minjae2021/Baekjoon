import java.util.Scanner;

public class p1011 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long [] result = new long [N];

		for(int i=0;i<N;i++) {
			long a = 1;
			long b = 1;
			long max = 0;
			long cnt = 1;
			long x = sc.nextInt();
			long y = sc.nextInt();
			long space = y-x;
			if(space==1) {
				cnt = 1;
			}
			else {
				while(max<space) {
					if(cnt%2==0) {
						a++;	
					}
					else {
						b++;			
					}
					max = a*b;
					cnt++;
				}
			}			
			result[i] = cnt;
		}
		
		for(int i=0;i<N;i++) {
			System.out.println(result[i]);
		}
		sc.close();
	}	
}