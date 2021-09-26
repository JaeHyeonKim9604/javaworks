package file_io.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {

	public static void main(String[] args) {
		OutputStream fos = null;
		
		try {
			fos = new FileOutputStream("output.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			fos.write(65);
			fos.write(66);
			fos.write('C');
			fos.write('D');
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
