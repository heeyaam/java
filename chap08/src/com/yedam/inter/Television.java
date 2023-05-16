package com.yedam.inter;

public class Television implements Remotcontrol, Searchable{

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > Remotcontrol.MAX_VOLLUME) {
			this.volume = Remotcontrol.MAX_VOLLUME;
		}else if(volume < Remotcontrol.MIN_VOLLUME) {
			this.volume = Remotcontrol.MIN_VOLLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 :" + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url +"을 검색합니다");
		
	}

}
