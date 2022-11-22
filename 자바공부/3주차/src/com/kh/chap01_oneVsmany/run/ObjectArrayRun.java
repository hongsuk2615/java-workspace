package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectArrayRun {
	
	public static void main(String[] args) {
		
		Book[] arr = new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("저자 : ");
			String author = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			arr[i] = new Book(title, author, price, publisher);
			
		}
		//전체도서를 출력
		for(int i = 0 ; i<arr.length;i++) {
			System.out.println(arr[i].information());
		}
		
	}

}
