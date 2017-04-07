import java.io.*;
class BruteForce
{
	File f=new File("dictionary.txt");
	File aFile=new File("aFile.txt");
	File bFile=new File("bFile.txt");
	File cFile=new File("cFile.txt");
	File dFile=new File("dFile.txt");
	File eFile=new File("eFile.txt");
	File fFile=new File("fFile.txt");
	File gFile=new File("gFile.txt");
	File hFile=new File("hFile.txt");
	File iFile=new File("iFile.txt");
	File jFile=new File("jFile.txt");
	File kFile=new File("kFile.txt");
	File lFile=new File("lFile.txt");
	File mFile=new File("mFile.txt");
	File nFile=new File("nFile.txt");
	File oFile=new File("oFile.txt");
	File pFile=new File("pFile.txt");
	File qFile=new File("qFile.txt");
	File rFile=new File("rFile.txt");
	File sFile=new File("sFile.txt");
	File tFile=new File("tFile.txt");
	File uFile=new File("uFile.txt");
	File vFile=new File("vFile.txt");
	File wFile=new File("wFile.txt");
	File xFile=new File("xFile.txt");
	File yFile=new File("yFile.txt");
	File zFile=new File("zFile.txt");
	public void work()throws IOException
	{
		File data=new File("data.txt");
		File temp=new File("temp.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(data)));
		PrintWriter pw=new PrintWriter(new FileOutputStream(temp),true);
		String str=br.readLine();
		while(str!=null)
		{
			str=action(str,"");
			
			str=br.readLine();
		}
	}
	String action(String str,String temp)
	{
		int i,j,x;
		for(i=1;i<26;i++)
		{
			temp="";
			for(j=0;j<str.length();j++)
			{
				x=str.charAt(j);
				if(x!=32)
				{
					x-=96;
					x+=i;
					x%=26;
					x+=96;
				}
				temp+=(char)x;
			}
			if(sense(temp)!=true)
				break;
		}
	}
	
	public static void main(String args[])
	{
		BruteForce o=new BruteForce();
		o.work();
	}
}