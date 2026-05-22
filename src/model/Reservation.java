package model;

public class Reservation {
	private Member member;
	private Book book;
	private boolean bookNotification;

	public Member getMember() {
		return member;
	}

	public Book getBook() {
		return book;
	}

	public boolean isBookNotification() {
		return bookNotification;
	}

	public void setBookNotification() {
		bookNotification = true;
	}


}
