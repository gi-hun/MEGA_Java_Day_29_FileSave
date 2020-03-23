package day_29;

import java.io.FileWriter;
import java.io.IOException;

//# ���� �����ϱ� : ��������1

public class FileEx03 {
	public static void main(String[] args) {
		//��ö��/20, �̸���/30, �̿���/40
		
		String[] name = {"��ö��", "�̸���", "�̿���"};
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
