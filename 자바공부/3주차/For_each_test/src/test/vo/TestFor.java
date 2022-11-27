package test.vo;

public class TestFor {
private ObjectForTest[] ob = new ObjectForTest[5];
	
	public void testFor() {
		for(int i = 0; i < ob.length;i++) {  //f
			ob[i] = new ObjectForTest("테스트", "테스트", i);	
		}
		
		for(ObjectForTest object : ob) {
			System.out.println(object);
		}
	}
}
