package week1.day1;

public class Mobile {
	public void sendMessage() {
		System.out.println("Send The Message");
	}
	public void shareDocument() {
		System.out.println("Share The Document");
	}
	public void makeCall() {
		System.out.println("Make The Call");
	}
	public void switchOnLight() {
		System.out.println("Switch On Light");
	}
	public void switchOnWifi() {
		System.out.println("Switch On Wifi");
	}
	public void playGame() {
		System.out.println("Play The Game");
	}
	public void openCamera() {
		System.out.println("Open Camera and Take a Pic");
	}
	public void recordAudio() {
		System.out.println("Record The Audio");
	}
	public static void main(String[] args) {
		Mobile vivo=new Mobile();
		vivo.sendMessage();
		vivo.shareDocument();
		vivo.makeCall();
		vivo.switchOnLight();
		vivo.switchOnWifi();
		vivo.playGame();
		vivo.openCamera();
		vivo.recordAudio();
		
	}

}
