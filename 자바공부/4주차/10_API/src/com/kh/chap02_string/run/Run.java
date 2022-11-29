package com.kh.chap02_string.run;

import com.kh.chap02_string.controller.A_StringPoolTest;
import com.kh.chap02_string.controller.B_StringMethodTest;
import com.kh.chap02_string.controller.C_StringTokenizerTest;
import com.kh.chap02_string.controller.D_StringBufferAndBuilder;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_StringPoolTest aspt = new A_StringPoolTest();
//		aspt.method1();
//		aspt.method2();
//		aspt.method3();
		
		B_StringMethodTest bsmt = new B_StringMethodTest();
//		bsmt.method();
		C_StringTokenizerTest cstt = new C_StringTokenizerTest();
//		cstt.method();
		D_StringBufferAndBuilder dsbab = new D_StringBufferAndBuilder();
		dsbab.method();
	}

}
