package demo;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHanling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File f = new File("C:\\Users\\PRAKASH\\Desktop\\data.txt");
		//f.createNewFile();
		if(!f.exists())
		{
			f.createNewFile();
		}
		
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw =new BufferedWriter(fw);
		bw.write("Automation is the future");
		bw.newLine();
		bw.write("selenium is  the autgomation tool");
		bw.close();
		
		FileReader fr= new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		String i=" ";
		while((i=br.readLine())!=null)
		{
			System.out.println(i);
		}
		
		
	}

}
