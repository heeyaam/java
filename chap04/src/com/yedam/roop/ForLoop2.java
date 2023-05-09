package com.yedam.roop;

import java.util.Iterator;

public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//중첩 for 문
//		for() {
//			forLoop(){
//				
//			}
//		}
		
		//2단 ~9단 출력
		for(int k=2; k<=9; k++){
		for(int i=1; i<=9; i++) {
			System.out.println(k +"*" + i+ "=" +(k*i));
		}}
		
		
		//*
		//**
		//***
		//****
		//*****
		
		for(int i=1; i<=5; i++){
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5; i>=1; i--){
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
		
		
		
		}

}
