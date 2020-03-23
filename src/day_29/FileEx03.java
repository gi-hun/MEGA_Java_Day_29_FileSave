package day_29;

import java.io.FileWriter;
import java.io.IOException;

//# 파일 저장하기 : 연습문제1

public class FileEx03 {
	public static void main(String[] args) {
		//김철수/20, 이만수/30, 이영희/40
		
		String[] name = {"김철수", "이만수", "이영희"};
		int[] ages = {	20,	30,	40};
		
		String fileName = "fileTest01.txt";
		
		String data = "";
		
		int size = name.length;
		for(int i=0;i<size;i++)
		{
			data += name[i];
			data += "/";
			data += ages[i];
			
			if(i != size-1)
			{
				data += ",";
			}
		}
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
