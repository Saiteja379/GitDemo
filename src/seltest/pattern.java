package seltest;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int k=1;
		
		for(i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				int res=k*3;
				System.out.print(res+"\t");
				k++;
			}
			System.out.println("");
		} 

	}

} 
