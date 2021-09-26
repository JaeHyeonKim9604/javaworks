package file_io.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest2 {

	public static void main(String[] args) {
		OutputStream fos = null;
		try {
			fos = new FileOutputStream("output2.txt");
			byte[] bs = new byte[26];
			byte ch = 'A';
			for(int i = 0; i < bs.length; i++) {
				bs[i] = ch;
				ch++;
			}
			fos.write(bs);
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
