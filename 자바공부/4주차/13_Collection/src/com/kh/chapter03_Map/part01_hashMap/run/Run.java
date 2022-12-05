package com.kh.chapter03_Map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chapter03_Map.part01_hashMap.model.vo.Snack;

public class Run {

	public static void main(String[] args) {

		HashMap<String, Snack> hm = new HashMap<>();

		/*
		 * 계층구조를 보면 List나 Set계열은 Collection을 구현한 클래스 => 데이터를 추가할때 add메서드 단, Map은 제외 =>
		 * put메서드 사용(key , value 세트로 추가)
		 */

		// put(K key, V value) : map 공간에 key+value로 추가해주는 메서드
		hm.put("다이제", new Snack("초코", 1500));
		hm.put("칸쵸", new Snack("단맛", 900));
		hm.put("포카칩", new Snack("짠맛",1000));
		hm.put("포테이토칩", new Snack("짠맛", 1000));
		
		System.out.println(hm);
		//1. 저장순서 유지 x
		//2. value값이 동일하다고 해도, key값이 중복되지 않기때문에 잘 저장됨
		
		hm.put("포카칩", new Snack("매운맛", 1200));
		// 중복된 키값으로 사용할 경우 value값을 덮어씌움
		System.out.println(hm);
		
		//2. get(Object key) : V => 컬렉션에서 해당 키값의 value값을 돌려주는 메서드
		System.out.println(hm.get("다이제"));
		Snack s = hm.get("칸쵸");//제네릭 설정을 해놨기 때문에 Snack타입 객체로 강제형변환(다운캐스팅)하는 과정이 생략되었음.
		System.out.println(s);
		
		//3. size() = 컬렉션에 담겨있는 개수
		System.out.println(hm.size());
		
		//4. replace(K key, V value) => 컬렉션에서 해당 키값을 찾아내어 새로 전달된 value로 변경해주는 메서드 
		// 해당 키값이 없으면 아무것도안함
		hm.replace("포테이토칩", new Snack("겁나짠맛",1500));
		System.out.println(hm);
		//5. remove(Object key) => 컬렉션에 해당 key값을 찾아서 key+value값 동시에 지워주는 메서드	
		hm.remove("포테이토칩");
		System.out.println(hm);
		
		System.out.println("================hm.keySet()=====================");
		
		//순차적으로 HashMap안에 담겨있는 값에 접근하고자 할때?
		//for문 사용불가.
		//List와 Map은 다른 계열이기 때문에 ArrayList에 담은 후 출력불가.
		//ArrayList list = new ArrayList(hm);
		//iterator()는 List와 Set계열에서만 사용가능하기 때문에 사용불가
		
		//Map을 Set로 변경해주는 메서드가 2개 있음
		//HashMap => Set계열로 바꿔서 Iterator호출

		//1 keySet() 이용하는 방법
		//1) hm에 있는 key값들만 set에 담기.
		Set <String> keyset = hm.keySet();
		System.out.println(keyset);
		
		//2) 1번과정에서 작업된 keyset을 Iterator에 담기
		Iterator <String> itKey = keyset.iterator();
		
		//3) 반복자에 담긴 값들을 순차적으로 뽑기
		while(itKey.hasNext()) {
			String key = itKey.next();
			Snack value = hm.get(key);
			System.out.println("key : " + key);
			System.out.println("value : " + value);
		}
		
		System.out.println("=================entrySet()====================");
		
		//2. entrySet() 이용하는 방법
		
		//1) hm에 있는 key + value값 모두 (Entry)set에 담기 (Entry == 집합)
		Set <Entry<String, Snack>> entrySet =hm.entrySet();
		
		//2) entrySet에 있는 것들을 Iterator에 담기
		
		Iterator <Entry<String, Snack>> itEntry = entrySet.iterator();
		
		while(itEntry.hasNext()) {
			Entry <String, Snack> entry = itEntry.next();
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
		//메서드 체인을 이용해 축약가능
		String[] sArr = new String[3];
	}

}
