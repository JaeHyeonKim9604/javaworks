package review;

public class MedalColor {
	
	private String color;
	private String mat;
	
	public void setMat(String mat) {
		this.mat = mat;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void getInfo() {
		System.out.println(color + " " + mat);
	}

}
