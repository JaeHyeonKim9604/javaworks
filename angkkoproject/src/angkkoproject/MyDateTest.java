package angkkoproject;

public class MyDateTest {

	public static void main(String[] args) {

		MyDate md1 = new MyDate(2, 11, 2014);
		System.out.println(md1.isValid());
		MyDate md2 = new MyDate(29, 2, 2104);
		System.out.println(md2.isValid());
	}

}
