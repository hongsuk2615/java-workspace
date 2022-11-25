package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

//다형성 적용전 클래스
public class ElectronicController1 {
	
	//용산 전자상가에 새로 차린 가게
	
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	//현재 용산 전자상가에 데스크탑을 납품하는 메서드
	public void insert(Desktop desk) {
//		desk = new Desktop("삼성","데탑",900000,"Geforce 1070");	
		this.desk = desk;
	}
	
	//노트북을 납품하는 메서드	
	public void insert(NoteBook note) {
		this.note = note;		
	}
	
	//태블릿을 납품하는 메서드	
	public void insert(Tablet tab) {
		this.tab = tab;
	}
	
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	
}
