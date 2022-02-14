package Filehandling;

	import java.io.*;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.Reader;
	import java.io.Writer;
	import java.util.Arrays;

	public class FileDemo {

		public static void main(String[] args) {
			try {
				String x[] = {"are","is","am","were","was","has","have","had","do","does","did"};
				Writer o = new FileWriter("D:\\FileString.txt");
				o.write("I live in a flat with my family. We have two bedrooms and a living room. We have a garden and we have some flowers there. In weekdays I arrive home at five o'clock and I have lunch. Then I do my homework and go to bed. I had a computer but now it doesn't work. I have a brother and a sister and I think I am very lucky to live with them. Sometimes our relatives visit us. Our flat becomes very crowded sometimes but I like it");
				o.close();
				String s="";
				String s2="";
				Reader fr = new FileReader("D:\\FileString.txt");
				int size = fr.read();
				System.out.println(size);
				while(size!=-1) {
					s = s + ((char)size);
					size = fr.read();
			     }
				fr.close();
		     	 s2 = s.replaceAll("have","****").replaceAll("had", "***").replaceAll(" do ", "**").replaceAll("has", "***").replaceAll(" are ", "***").replaceAll(" am ", "**").replaceAll(" is ", "**").replaceAll(" were ", "****").replaceAll(" does ", "****").replaceAll(" did ", "***");;
				System.out.println(s2);
				Writer fw = new FileWriter("D:\\FileString.txt");
				fw.write(s2);
				fw.close();
				 
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}


