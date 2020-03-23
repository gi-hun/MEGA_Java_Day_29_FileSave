//파일 저장하기: 연습문제2
package day_29;

import java.io.IOException;
import java.io.FileWriter;

public class FileEx04 {
	public static void main(String[] args) {
		// momk/1111/20000
		// megait/2222/30000
		// github/3333/40000
		
		String[] names = {"momk", "megait", "github"};
		String[] pws   = {"1111",   "2222",   "3333"};
		int[]    moneys= { 20000,    30000,    40000};
		
		String fileName = "fileTest02.txt";
		
		String data = "";
		
		for(int i=0;i<names.length;i++)
		{
			data += names[i];
			data += "/";
		}
		data = data.substring(0, data.length()-1);
		System.out.println(data);
		
		data = "";
		for(int i=0;i<pws.length;i++)
		{
			data += pws[i];
			data += "/";
		}
		data = data.substring(0, data.length()-1);
		System.out.println(data);
		
		data = "";
		for(int i=0;i<pws.length;i++)
		{
			data += moneys[i];
			data += "/";
		}
		data = data.substring(0, data.length()-1);
		System.out.println(data);
		
		FileWriter fw = null;
		try
		{
			fw = new FileWriter(fileName);
			fw.write(data);
			fw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
