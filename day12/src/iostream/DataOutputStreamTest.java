package iostream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		// DataStrea 클래스 - 자료형을 그대로 쓰기
		// 기반 스트림을 생성자로 전달
		try(FileOutputStream fos = new FileOutputStream("data2.txt");
				DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeByte('A');			// 영문 한글자
			dos.writeChar('한');			// 한글 한글자
			dos.writeInt(48);			// 정수 하나
			dos.writeFloat(5.5F);		// 실수 하나
			dos.writeUTF("감사합니다");	// 문자열
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행완료!!");

	}

}
