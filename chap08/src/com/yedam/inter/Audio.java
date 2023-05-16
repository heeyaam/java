package com.yedam.inter;

public class Audio implements Remotcontrol {

	private int volume;
	@Override
	public void turnOn() {
		
		System.out.println("Aodio를 켭니다");

	}

	@Override
	public void turnOff() {
	System.out.println("Aodio를 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		if(volume >Remotcontrol.MAX_VOLLUME) {
			this.volume = Remotcontrol.MAX_VOLLUME;
		}else if(volume <Remotcontrol.MIN_VOLLUME){
			this.volume = Remotcontrol.MIN_VOLLUME;
		}System.out.println("Audio 볼륨은 " +volume);
		

	}

	@Override
	public void search(String url) {
		
		
	}

}
