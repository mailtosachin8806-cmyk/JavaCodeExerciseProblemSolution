package JattinSharma_JavaPractise;

public class EncodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Question no. 28
		
		String input = "ddmmmtttaacc";
		StringBuilder sb = new StringBuilder();
		
		int count=1;
		for(int i=1;i<input.length();i++)
		{
			if(input.charAt(i) == input.charAt(i-1))
			{
				count++;
			}
			else
			{
				sb.append(input.charAt(i-1));
				sb.append(count);
				count=1;
			}
		}
		
		System.out.println(sb);
	}

}
