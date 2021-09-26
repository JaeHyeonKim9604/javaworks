package collection.set;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberhashset = new MemberHashSet();
		
		// 회원 추가
		memberhashset.addMember(new Member(1001, "네이버"));
		memberhashset.addMember(new Member(1002, "카카오"));
		memberhashset.addMember(new Member(1003, "엔씨소프트"));
		memberhashset.addMember(new Member(1001, "네이버"));
		
		// 회원 출력
		memberhashset.showAllMember();
		
		// 회원 삭제
		memberhashset.removeMember(1002);
		System.out.println("========== 삭제 후 ==========");
		memberhashset.showAllMember();
	}

}
