package com.yedam.inter;

public interface Remotcontrol extends Searchable{
	//상수 -> static final 생략
	public int MAX_VOLLUME = 10;
	public static final int MIN_VOLLUME = 0;
	//추상 메소드 -> abstract
	public void turnOn();
	public abstract void turnOff();
	public void setVolume (int volume);
//	void search(String url);      ->Searchable의 기능 사용가능
	

}
