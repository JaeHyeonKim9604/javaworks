package Exercise;

public class Parents {

	int x, y;
	
	// 상속되는 클래스의 메서드 이므로
	// public과 protected 둘 다 사용 가능
	
	/*
	public class : 모든  package에서 해당 class로 접근이 가능하다.
	private class : 자신을 포함한 package에서만 해당 class로 접근이 가능하다.
	protected class : 상속받은 class 에서만 해당 class로 접근이 가능하다.

	public method : 모든 class에서 해당 method로 접근이 가능하다.	
	private method : 자신이 포함된 class에서만 해당 method로 접근이 	가능하다.
	protected class : 상속 받은 class와 자신이 속한 class에서만 접근이 가능하다.
	 */
	
	public void setX(int x) {
		this.x = x;
	}
	
	protected void setY(int y) {
		this.y = y;
	}
	
	public void sum() {
		System.out.println(x+y);
	}
	
	protected void min() {
		System.out.println(x-y);
	}
	
}
