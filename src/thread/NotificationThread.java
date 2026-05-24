package thread;

import model.Library;

public class NotificationThread extends Thread{
	private Library library;
	private boolean running = true;

	public NotificationThread(Library library) {
		this.library = library;
	}

	@Override
	public void run() {
		while (running) {
			library.checkReservationNotifications();

			try {
				Thread.sleep(3000);
			}catch (InterruptedException e){
				break;
			}
		}
	}

	public void stopThread(){
		running = false;
	}
}
