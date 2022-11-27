package test.vo;

public class ObjectForTest {
	private String obj1;
	private String obj2;
	private int obj3;
	public ObjectForTest() {
		super();
	}
	public ObjectForTest(String obj1, String obj2, int obj3) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
		this.obj3 = obj3;
	}
	public String getObj1() {
		return obj1;
	}
	public void setObj1(String obj1) {
		this.obj1 = obj1;
	}
	public String getObj2() {
		return obj2;
	}
	public void setObj2(String obj2) {
		this.obj2 = obj2;
	}
	public int getObj3() {
		return obj3;
	}
	public void setObj3(int obj3) {
		this.obj3 = obj3;
	}
	
	@Override
	public String toString() {
		return "ObjectForTest [obj1=" + obj1 + ", obj2=" + obj2 + ", obj3=" + obj3 + "]";
	}
	
	
	

}
