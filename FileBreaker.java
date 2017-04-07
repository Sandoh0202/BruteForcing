import java.io.*;
class FileBreaker
{
	public static void main(String args[])throws IOException
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
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(f)));
		PrintWriter pw=new PrintWriter(new FileOutputStream(aFile),true);
		String str="";int i;char ch;int arr[]=new int[26];
		while(str!=null)
		{
			str=br.readLine();
			if(str==null)
				break;
			ch=str.charAt(0);
			switch(ch)
			{
				case 'a':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(aFile),true);
							pw.println(str);
							break;
				case 'b':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(bFile),true);
							pw.println(str);
							break;
				case 'c':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(cFile),true);
							pw.println(str);
							break;
				case 'd':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(dFile),true);
							pw.println(str);
							break;
				case 'e':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(eFile),true);
							pw.println(str);
							break;
				case 'f':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(fFile),true);
							pw.println(str);
							break;
				case 'g':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(gFile),true);
							pw.println(str);
							break;
				case 'h':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(hFile),true);
							pw.println(str);
							break;
				case 'i':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(iFile),true);
							pw.println(str);
							break;
				case 'j':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(jFile),true);
							pw.println(str);
							break;
				case 'k':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(kFile),true);
							pw.println(str);
							break;
				case 'l':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(lFile),true);
							pw.println(str);
							break;
				case 'm':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(mFile),true);
							pw.println(str);
							break;
				case 'n':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(nFile),true);
							pw.println(str);
							break;
				case 'o':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(oFile),true);
							pw.println(str);
							break;			
				case 'p':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(pFile),true);
							pw.println(str);
							break;
				case 'q':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(qFile),true);pw.println(str);
							break;
				case 'r':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(rFile),true);
							pw.println(str);
							break;
				case 's':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(sFile),true);
							pw.println(str);
							break;
				case 't':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(tFile),true);pw.println(str);
							break;
				case 'u':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(uFile),true);pw.println(str);
							break;
				case 'v':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(vFile),true);
							pw.println(str);
							break;
				case 'w':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(wFile),true);
							pw.println(str);
							break;
				case 'x':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(xFile),true);
							pw.println(str);
							break;
				case 'y':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(yFile),true);
							pw.println(str);
							break;
				case 'z':	arr[ch-97]++;
							if(arr[ch-97]==1)
								pw=new PrintWriter(new FileOutputStream(zFile),true);
							pw.println(str);
							break;
			}
		}
	}
}