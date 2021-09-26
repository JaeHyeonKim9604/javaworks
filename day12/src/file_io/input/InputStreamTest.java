package file_io.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) {
		// 파일 읽기
		try(InputStream fis = new FileInputStream("output2.txt")){
			int i;
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
