package com.kh.chap04;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.kh.model.vo.Product;

public class OperatorAndPredicate {
	/*
	 * Operator 인터페이스 특징 1. 단순연산시 사용 2. 받아온 타입, 혹은 인자를 통해 계산을 하고 해당타입 그대로 반환
	 * 
	 * Predicate 인터페이스 특징 1. 매개변수로 넘어온 값을 "검증"할때 사용 2. 받아온 타입을 확인하고 boolean값을 반환
	 */
	public static void main(String[] args) {

		// Predicate <T> : T형을 인자로 받아서 true / false값 리턴
		// Product 클래스를 인자로 받아 재고가 있다면 true, 없으면 false 반환
		Predicate<Product> checkStock = product -> product.getStock() > 0;

		ArrayList<Product> pList = new ArrayList<Product>();
		pList.add(new Product("갤럭시z플립4", 1350000, 51));
		pList.add(new Product("갤럭시폴드4", 1250000, 53));
		pList.add(new Product("아이폰14", 1150000, 0));
		pList.add(new Product("아이폰13", 1650000, 75));
		pList.add(new Product("갤럭시z폴드3", 1330000, 0));
		pList.add(new Product("아이폰12", 1380000, 45));

		for (Product product : pList) {
			if (checkStock.test(product)) {
				System.out.println(product.getpName()+"상품은 현재 재고가 있습니다.");
			} else {
				System.out.println(product.getpName()+"상품은 현재 재고가 없습니다.");
			}
		}
	}
}
