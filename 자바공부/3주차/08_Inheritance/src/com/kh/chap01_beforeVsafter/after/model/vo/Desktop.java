package com.kh.chap01_beforeVsafter.after.model.vo;

//             자식             부모
//             후손             조상
//             하위             상위
public class Desktop extends Product {
	private boolean allInOne;

	public Desktop() {
		super();
	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// brand, pCode, pName, price를 부모클래스의 product에 있는 필드에 초기화(대입)

		// 해결방법 1. 부모클래스의 필드를 자식까지는 접근가능하도록 접근제한자를 변경
		// private -> protected;
//		super.brand = brand;
//		super.pCode = pCode;
//		super.pName = pName;
//		super.price = price;

		// 해결방법 2. 부모클래스에서 접근할수있는 (public)setter메서드 활용

//		super.setBrand(brand);
//		super.setpCode(pCode);
//		super.setpName(pName);
//		super.setPrice(price);

		// 해결방법 3. 부모생성자 호출하기(단, 반드시 첫줄에 기술되어야한다.)
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}

	public void setAllInONe(boolean allInOne) {
		this.allInOne = allInOne;
	}

	public boolean getAllInOne() {
		return allInOne;
	}
	
	// 오버라이딩 : 부모클래스의 메서드를 내 입맛대로 정의하는 것
	public String information() {
		return super.information() + ", allInOne : " + allInOne;
	}

}
