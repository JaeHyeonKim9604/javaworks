package collection.list;

import java.util.ArrayList;

import collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	// 회원 추가
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// 회원 출력
	public void showAllMember() {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	
	// 회원 삭제
	public boolean removeMember(int memberId) {		// 회원을 구분하는 방법 = 회원 Id
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);		// memberId, memberName 이 포함된 객체
			int dbMemberId = member.getMemberId();	// 이미 저장된 memberId를 가져와서 외부에서 입력한 memberId와 비
			if(dbMemberId == memberId) {			// 둘이 같다면
				System.out.println(memberId + "번 맴버가 삭제되었습니다.");
				arrayList.remove(i);				// 삭제
				return true;
			}
				
		}									// 같지 않으면(같은게 없으면)
		System.out.println(memberId + "번 맴버 아이디는 존재하지 않습니다.");
		return false;
	}
}
