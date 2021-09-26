package file_io.output;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("data.txt")){
			fw.write("Hello! Java!\n");
			fw.write("안녕 자바~!\n");
			fw.write("48");
			fw.write('\n');
			//fw.write((int) 3.3); 정수, 실수는 실행 안됨
			char[] buf = {'s', 'k', 'y'};
			fw.write(buf);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("수행 완료!");
	}

}
