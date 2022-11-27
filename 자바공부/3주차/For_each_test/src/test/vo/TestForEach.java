package test.vo;

public class TestForEach {
	private ObjectForTest[] ob = new ObjectForTest[5];
	
	public void testForEach() {
		int obj3 = 0;
		for(ObjectForTest object : ob) {  //for each문을 통해서는 해당 배열요소의 값을 변경 시킬 수 없음.
			object = new ObjectForTest("테스트", "테스트", obj3);
			obj3++;
		}
		
		for(ObjectForTest object : ob) {
			System.out.println(object);
		}
	}
}
