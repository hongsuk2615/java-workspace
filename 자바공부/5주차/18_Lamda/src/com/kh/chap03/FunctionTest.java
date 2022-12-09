package com.kh.chap03;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import com.kh.model.vo.Product;

public class FunctionTest {
	/*
	 * Function 인터페이스의 특징 
	 * 1. 타입 변환 
	 * ex) 컬렉션에서 특정값만 뽑거나, 연산할때 사용됨.
	 * 
	 */

	public static void main(String[] args) {
		Product p = new Product("갤럭시플립", 1_350_000, 1000);

		// 1)Function<T, R> : T형을 인자로 받아 R형값을 리턴
		// Product 객체에서 가격에대한 정보만 빼기
		Function<Product, Integer> function;
		function = (product) -> {
			return product.getPrice();
		};
		System.out.println(function.apply(p));
		// 2) BiFunction<T,U,R> : T,U 두개를 인자로 받고 R형값을 리턴
		BiFunction<Integer, Integer, Double> biFunction;
		biFunction = (productPrice, stocks) -> {
			return (double) productPrice * stocks;
		};

		System.out.println("플립 1000개의 가격 : " + biFunction.apply(p.getPrice(), p.getStock()));

		// 그외
		// 3) xxxFunction<T> : XXX를 인자로 받아서 T형을 리턴
		// 4) xxxtoYYYFunction : xxx를 인자로 받아서 yyy를 리턴
		// 5) toXXXFunction<T> : T를 받아서 xxx를 리턴
		// 6) toXXXBiFunction<T,U> : T,U를 인자로 받아서 xxx를 리턴

		// 객체배열을 통한 람다식 실습.
		// 1)핸드폰 객체 배열 만들기
		ArrayList<Product> pList = new ArrayList<Product>();
		pList.add(new Product("갤럭시z플립4", 1350000, 51));
		pList.add(new Product("갤럭시폴드4", 1250000, 53));
		pList.add(new Product("아이폰14", 1150000, 85));
		pList.add(new Product("아이폰13", 1650000, 75));
		pList.add(new Product("갤럭시z폴드3", 1330000, 65));
		pList.add(new Product("아이폰12", 1380000, 45));
		// 2) 해당 상품들을 모두 팔게 되면 남는 이윤을 계산할 수 잇는 람다식 생성.
		// 이윤 계산 = > product 가격 * 재고 ; 인자 : Product객체인자, 리턴값 Integer
		ToIntFunction<Product> toIntFunction;
		toIntFunction = (product) -> product.getPrice() * product.getStock();
		printProduct(pList, toIntFunction);

	}

	// 3) 생성한 람다식 함수를 활용한 객체배열 관리용 일반 메서드 생성
	private static void printProduct(ArrayList<Product> pList, ToIntFunction<Product> toIntFunction) {
		int sum = 0;
		for (Product product : pList) {
			System.out.printf("%s상품의 현재 가격은 %d원이며, 모두 판매했을때 이윤은 %d입니다.\n",product.getpName(),product.getPrice(),toIntFunction.applyAsInt(product));
			sum += toIntFunction.applyAsInt(product);
		}
		System.out.println("총판매시 이윤은 " + sum + "원 입니다.");
	}

}
