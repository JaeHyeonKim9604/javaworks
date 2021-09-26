package collection;

public class Member {
	private int memberId;		// 회원 번호
	private String memberName;	// 회원 이름
	
	public Member(int memberID, String memberName) {
		this.memberId = memberID;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberId + ", " + memberName;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;	// Object를 Member로 다운캐스팅
			if(this.memberId == member.memberId) {
				return true;
			}
		}
		return false;
	}
	
}
