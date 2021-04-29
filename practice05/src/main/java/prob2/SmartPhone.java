package prob2;

public class SmartPhone extends MusicPhone {

	public void execute(String function) {

		if (function.equals("앱")) {
			playApp();
		} else {
			super.execute(function);
		}

	}

	private void playApp() {
		System.out.print("앱실행");
	}

}
