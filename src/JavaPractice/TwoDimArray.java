package JavaPractice;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x[][]=new String [3][4];
		x[0][0]="A";
		x[0][2]="C";
		x[0][1]="B";
		x[0][3]="D";
		
		x[1][0]="A1";
		x[1][2]="C1";
		x[1][1]="B1";
		x[1][3]="D1";
		
		x[2][0]="A2";
		x[2][2]="C2";
		x[2][1]="B2";
		x[2][3]="D2";

		/// Row Lenght
		
	System.out.println(x.length);
	
	// col size
	
	System.out.println(x[0].length);
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++) {
				
				System.out.println(x[i][j]);
			}
			
			
		}
		}
		
		
		
		
		
		
		
		
		
	}


