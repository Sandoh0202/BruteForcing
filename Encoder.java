import java.util.*;
import java.io.*;
class Encoder
{
	public static void main(String args[])throws IOException
	{
		File file=new File("data.txt");
		Scanner in=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(new FileOutputStream(file),true);
		int k=in.nextInt(),x,i;
		String str,temp="";
		while(true)
		{
			System.out.print("Enter the text: ");
			str=in.next();
			if(str.equals("exit"))
				break;
			for(i=0;i<str.length();i++)
			{
				if(str.charAt(i)==32)
					temp+=' ';
				else
				{
					x=str.charAt(i)+k;
					if(x>122)
						x-=26;
					temp+=(char)x;
				}
			}
			pw.println(temp);
			temp="";
		}
		System.out.println("\nEncryption Complete!");
	}	
}