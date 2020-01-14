import java.io.*;
import java.util.ArrayList;

public class p4948 {
	public static void main(String args[]) throws IOException {		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int[] data = new int[246913];
	
	      for(int i=1;i<246913;i++)
	    	  data[i]=i;
	      
	      for(int i=2;i<246913;i++) {
	    	  for(int j=i*2;j<246913;j+=i) {
	    		  if(data[j]!=0) {
	    			  data[j] = 0;
	    		  }	    		  
	    	  }
	      }
		while(true) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			int N = Integer.parseInt(br.readLine());
			if(N==0) {
				break;
			}
			for(int i=2;i<=2*N;i++) {
				if(data[i]!=0 && data[i]>N && data[i]<=2*N) {
					al.add(i);
				}
			}
			System.out.println(al.size());

		}
	}
}