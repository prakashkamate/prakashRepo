package streamAPI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileFind {

	public static void main(String[] args) throws IOException {
		
		File f=new File("E:\\Documents\\SpringCore\\SpringMvcMavenDemoExmaple\\SpringMvcMavenDemoExmaple\\pom.xml");
		//System.out.println(f.isFile());
	
		
			FileReader fr=new FileReader("E:\\Documents\\SpringCore\\SpringMvcMavenDemoExmaple\\SpringMvcMavenDemoExmaple\\pom.xml");
//			int i = fr.read();
//			while(i>=0)
//			{
//				System.out.print((char)i);
//				i=fr.read();
//			}
//			fr.close();
			
//			BufferedReader br=new BufferedReader(fr);
//			
//			String s=br.readLine();
//
//			while(s!=null)
//			{
//				System.out.println(s);
//				s=br.readLine();
//				
//			}
//			br.close();
			
//			File f1=new File("New.txt");
//			f1.createNewFile();
//					System.out.println(f1.isFile());
			
			String s="prakash";
			String s1="";
//			for(int i=s.length()-1;i>=0;i--)
//			{
//				s1=s1+s.charAt(i);
//			}
//			System.out.println(s1);
			
//			StringBuffer sb=new StringBuffer("prakash");
//			
//		//	System.out.println("sb1 "+sb1);
//			if(sb.toString().equalsIgnoreCase(sb.reverse().toString()))
//			{
//				//System.out.println(sb+" is pallindrome");
//			}
//			else {
//				
//				System.out.println("Not Pallindrome");
//				
//			}
			
			
		
	}

}
