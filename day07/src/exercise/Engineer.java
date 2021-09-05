package exercise;

public class Engineer extends Employee {
	
	public Engineer(String name) {
		super(name);
	}
	// 매개 변수가 있는 생성자를 상속받을 경우,
	// 반드시 부모의 맴버변수를 super()로 명시해야함.

	private String skillset;
	
	public String getSkillSet() {
		return skillset;
	}
	
	public void setSkillSet(String skillset) {
		this.skillset = skillset;
	}

}
