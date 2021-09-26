package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		/*ArrayList<String> companyList = new ArrayList<>();
		companyList.add("LG");
		companyList.add("SamSung");
		companyList.add("Hyundai");*/
		
		//Arrays 클래스 사용
		List<String> companyList = Arrays.asList("LG", "SamSung", "Hyudai");
		
		/*for(String company : companyList) {
			System.out.println(company);*/
		
		//Stream 클래스의 forEach() 사용
		Stream<String> stream = companyList.stream();
		stream.forEach(company -> System.out.println(company));
		
  	}

}
