package com.yedam.access;

public class Applicatiion01 {

	public static void main(String[] args) {
		Access ac = new Access();
		ac.free = "public";
		ac.parent = "protected";
		ac.basic = "default";
//		ac.private = "privacy";
		
		ac.instead();

	}

}
