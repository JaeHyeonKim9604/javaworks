package collection.list;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList mArrayList = new MemberArrayList();
		
		// Member 객체 생성
		Member m1 = new Member(101, "김재현");
		Member m2 = new Member(102, "박철수");
		Member m3 = new Member(103, "이말년");
		Member m4 = new Member(101, "김재현");
		
		// 회원 추가
		mArrayList.addMember(m1);
		mArrayList.addMember(m2);
		mArrayList.addMember(m3);
		mArrayList.addMember(m4);
		
		// 회원 조회
		mArrayList.showAllMember();
		
		
		// 회원 삭제
		System.out.println("=======< 삭제 중 >=======");
		mArrayList.removeMember(101);
		mArrayList.removeMember(105);
		
		// (삭제 후 )회원 조회
		System.out.println("=======< 삭제 후 >=======");
		mArrayList.showAllMember();

	}

}
