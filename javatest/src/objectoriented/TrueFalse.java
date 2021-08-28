package objectoriented;

public class TrueFalse {

	public static void main(String[] args) {
		
		int s1 = 0;
		int s2 = 1;
		
		boolean v2 = ((s1 = s1 + 7) < 3) || ((s2 = s2 + 4) < 1000);
		System.out.println(v2);
		System.out.println(s2);

	}

}
