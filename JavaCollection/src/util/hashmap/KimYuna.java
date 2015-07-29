package util.hashmap;
/*
 * @ Date: 2015.07.29
 * @ Author: 김청명
 * @ Story: 
 */

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KimYuna {
	public static void main(String[] args) {
		// Map은 인터페이스이고, HashMap은 Map을 구현 (implement)한 클래스이다.
		Map<String, Integer> map = new HashMap<String, Integer>();
			// 키값이 String이고 밸류값은 숫자인 HashMap 객체를 생성한 것이다.
			// List 계열은 추가 할 때 add를 쓰고, Map 계열은 추가 할 때 put을 쓴다.
		map.put("김연아", new Integer(98));
			// int 타입은 맵에 들어올 수 없다.
			// 이것은.. Integer i = new Integer(98);
			// 			map.put("김연아", i); 와 동일하다.
		map.put("아사다마오", new Integer(60));
		map.put("소트니코바", new Integer(30));
		
		// 디자인패턴 23가지 중에서 Iterator 패턴을 사용해서 Map의 값을 출력한다.
		// 지금까지는 객체를 생성하라고 하면... Set set = new Set(); 으로 만들었는데.. 
		// Set, Iterator는 이처럼 생성(생성자를 통한 생성)하지 않고, 다른 객체를 
		// 통해 리턴받는 방식으로 생성을 하고.. 이를 팩토리 패턴이라고 한다.
		
		/*====== 키와 밸류를 동시에 출력하는 경우 ======*/
		Set set = map.entrySet();
		Iterator it = set.iterator();
			// Iterator: 순환기 => 지하철 2호선
		while (it.hasNext()) {
			// it.hasNext()는 value가 커서(이터레이터) 다음에 있는지 없는지를 
			// 따져서, 있으면 while loop을 계속 돌리고, 없으면 멈춘다.
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("참가자: " + e.getKey() + ", 점수: " + e.getValue());
		}
		
		/*======== 키 (<"K",V>)만 출력하는 경우 ========*/
		set = map.keySet();
		System.out.println("참가자 명단: " + set);
			// set은 toString이 내부적으로 오버라이딩 되어있다.
			// 따라서 set.toString() 하지 않아도 출력한다.
		
		/*====== 밸류만 (<K,"V">)만 출력하는 경우 ======*/
		Collection values = map.values();
		Iterator it2 = values.iterator();
		int total = 0; // 지역변수이다. 디폴트 값으로 초기화 해야 한다.
		while (it2.hasNext()) {
			// Map 내부에서는 int가 기본형이라 올 수 없고, 반드시 
			// Integer(=기본형 int의 Wrapper 클래스) 타입으로 와야 한다.
			Integer i = (Integer) it2.next();
			total += i.intValue();
				// => 각 선수들의 점수 합계
		}
		
		System.out.println("이번 대회 평균점수: " + total/set.size());
		System.out.println("최고점수: " + Collections.max(values));
		System.out.println("최저점수: " + Collections.min(values));
		// 위쪽에 있는 Collection은 인터페이스
		// 아래쪽에 있는 Collections는 클래스
		// 클래스.메소드() 이런 형태로 나오면 이 메소드는 클래스메소드라고 부르고
		// 다른 말로는 static method 라고 부른다.
	}
}