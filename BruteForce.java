import java.io.*;
class BruteForce
{
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
	File wFile=new File("wFile.txt");
	File vFile=new File("vFile.txt");
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
			System.out.println(action(str));
			//pw.println(action(str));
			str=br.readLine();
		}
		System.out.println("Process Completed!!!");
	}
	String action(String str)throws IOException
	{
		int i,j,x;String temp="";
		for(i=1;i<26;i++)
		{
			temp="";
			for(j=0;j<str.length();j++)
			{
				x=str.charAt(j);
				x+=i;
				if(x>122)
					x-=26;
				temp+=(char)x;
			}
			//System.out.println(temp);
			if(sense(temp)==true)
				return temp;
		}
		return "";
	}
	boolean sense(String str)throws IOException
	{
		//File file=new File("dictionary.txt");
		BufferedReader in=new BufferedReader(new InputStreamReader(new FileInputStream(aFile)));
		switch(str.charAt(0))
		{
			case 'b':	in=new BufferedReader(new InputStreamReader(new FileInputStream(bFile)));
						break;
			case 'c':	in=new BufferedReader(new InputStreamReader(new FileInputStream(cFile)));
						break;
			case 'd':	in=new BufferedReader(new InputStreamReader(new FileInputStream(dFile)));
						break;
			case 'e':	in=new BufferedReader(new InputStreamReader(new FileInputStream(eFile)));
						break;
			case 'f':	in=new BufferedReader(new InputStreamReader(new FileInputStream(fFile)));
						break;
			case 'g':	in=new BufferedReader(new InputStreamReader(new FileInputStream(gFile)));
						break;
			case 'h':	in=new BufferedReader(new InputStreamReader(new FileInputStream(hFile)));
						break;
			case 'i':	in=new BufferedReader(new InputStreamReader(new FileInputStream(iFile)));
						break;
			case 'j':	in=new BufferedReader(new InputStreamReader(new FileInputStream(jFile)));
						break;
			case 'k':	in=new BufferedReader(new InputStreamReader(new FileInputStream(kFile)));
						break;
			case 'l':	in=new BufferedReader(new InputStreamReader(new FileInputStream(lFile)));
						break;
			case 'm':	in=new BufferedReader(new InputStreamReader(new FileInputStream(mFile)));
						break;
			case 'n':	in=new BufferedReader(new InputStreamReader(new FileInputStream(nFile)));
						break;
			case 'o':	in=new BufferedReader(new InputStreamReader(new FileInputStream(oFile)));
						break;
			case 'p':	in=new BufferedReader(new InputStreamReader(new FileInputStream(pFile)));
						break;
			case 'q':	in=new BufferedReader(new InputStreamReader(new FileInputStream(qFile)));
						break;
			case 'r':	in=new BufferedReader(new InputStreamReader(new FileInputStream(rFile)));
						break;
			case 's':	in=new BufferedReader(new InputStreamReader(new FileInputStream(sFile)));
						break;
			case 't':	in=new BufferedReader(new InputStreamReader(new FileInputStream(tFile)));
						break;
			case 'u':	in=new BufferedReader(new InputStreamReader(new FileInputStream(uFile)));
						break;
			case 'v':	in=new BufferedReader(new InputStreamReader(new FileInputStream(vFile)));
						break;
			case 'w':	in=new BufferedReader(new InputStreamReader(new FileInputStream(wFile)));
						break;
			case 'x':	in=new BufferedReader(new InputStreamReader(new FileInputStream(xFile)));
						break;
			case 'y':	in=new BufferedReader(new InputStreamReader(new FileInputStream(yFile)));
						break;
			case 'z':	in=new BufferedReader(new InputStreamReader(new FileInputStream(zFile)));
						break;
		}
		String word=in.readLine();
		while(word!=null)
		{
			word=word.toLowerCase();
			if(word.equalsIgnoreCase(str)==true)
				return true;
			if(str.compareTo(word)<0)
				break;
		}
		return false;
	}
	public static void main(String args[])throws IOException
	{
		BruteForce o=new BruteForce();
		o.work();
	}
}