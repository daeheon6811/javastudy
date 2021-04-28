package tv;

public class TV {

	private int channel; // 1~255
	private int volume; // 0 ~ 100
	private boolean power;

	
	public TV(int channel, int volume, boolean power) {
	
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void power(boolean on) {

	}

	public void channel(boolean up) {

	}
	public void channel(int channel) {

	}
	

	public void volume(boolean up) {

	}
	public void volume(int channel) {

	}



	public void getChaanel() {

	}

	public void getVolume() {

	}
	public void status() {
		System.out.println("TV[power=on, channel="+channel+"volume ="+volume);
	}

}
