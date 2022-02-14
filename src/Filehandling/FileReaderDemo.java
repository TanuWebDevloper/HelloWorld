package Filehandling;



	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.Reader;
	import java.io.Writer;

	public class FileReaderDemo {

		public static void main(String[] args) {
			try {
				Writer fw = new FileWriter("D:\\testout.txt");
				fw.write("I love my country");
				fw.close();
				
				Reader fr = new FileReader("D:\\testout.txt");
				int size = fr.read();
				while(size!=-1) {
					System.out.print((char)size);
					size = fr.read();
				}
				fr.close();
				}
			catch(Exception e)
			{
				System.out.println(e);
				
			}
			System.out.println("Success");

			
		}

	}

