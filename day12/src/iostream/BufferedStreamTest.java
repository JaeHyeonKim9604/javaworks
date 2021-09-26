package iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		// 이미지 복사
		long start = 0;
		long end = 0;
		String originFile = "/Users/jjaejjae/JavaDev/day12/friends.png";
		String copyFile = "/Users/jjaejjae/ncsTest/friends.png";
		
		try(FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile);
			BufferedInputStream bis = new BufferedInputStream(fis);		// Buffer 스트림은 보조임 - 기반 스트림과 같이 써야함
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			start = System.currentTimeMillis();
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			end = System.currentTimeMillis();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사 시간 : " + (end-start) + "milliseconds");
		System.out.println("실행 완료");
	}

}
