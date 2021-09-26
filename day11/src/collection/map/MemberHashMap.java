package collection.map;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	// 회원 추가
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	// 회원 추가
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			Integer key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
}