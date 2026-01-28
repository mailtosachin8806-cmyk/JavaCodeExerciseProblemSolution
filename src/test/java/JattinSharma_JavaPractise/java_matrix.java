package JattinSharma_JavaPractise;

public class java_matrix {
//Question1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Transposition means to convert rows into column 	
	
		int a[][] = new int[2][3];
		
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		
		for(int rows=0;rows<a.length;rows++)
		{
			for(int col =0;col<a[0].length;col++)
			{
				System.out.print(a[rows][col] + " ");
			}
			
			System.out.println("");
		}
		
		int result[][]= new int[3][2];
		
		for(int rows=0;rows<a.length;rows++)
		{
			for (int col=0;col<a[0].length;col++)
			{
				result[col][rows]= a[rows][col];
			}
		}
		
		for(int rows=0;rows<result.length;rows++)
		{
			for (int col=0;col<result[0].length;col++)
			{
				System.out.print(result[rows][col]+" ");
			}
			System.out.println("");
		}
		
		
	}

}
