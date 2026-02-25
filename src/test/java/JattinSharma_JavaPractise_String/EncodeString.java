package JattinSharma_JavaPractise_String;

public class EncodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Question no. 28
		
		String input = "ddmmmttta";
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
		sb.append(input.charAt(input.length()-1));
		sb.append(count);
		System.out.println(sb);
	}

}
