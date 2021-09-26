package file_io.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest3 {

	public static void main(String[] args) {
		//try ~ with ~ resource 구문 - close() 사용하지 않음
		try(OutputStream fos = new FileOutputStream("output3.txt")){
			byte[] bs = new byte[26];
			byte ch = 'a';
			for(int i = 0; i < bs.length; i++) {
				bs[i] = ch;
				ch++;
			}
			fos.write(bs);
			fos.write('\n');
			fos.write(bs, 3, 10);	//bs에서 3번인덱스에서 10개 추가
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("수행 완료");
	}

}
