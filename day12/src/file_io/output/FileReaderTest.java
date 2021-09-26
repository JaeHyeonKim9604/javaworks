package file_io.output;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {

		try(FileReader fr = new FileReader("data.txt")){
			int i;
			while((i = fr.read()) != -1) {	// 빈자리가 나올때 까지
				System.out.print((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
