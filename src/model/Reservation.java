package model;

public class Reservation {
	private Member member;
	private Book book;
	private boolean notified;

	public Reservation(Member member, Book book) {
		this.member = member;
		this.book = book;
		this.notified = false;
	}

	public Member getMember() {
		return member;
	}

	public Book getBook() {
		return book;
	}

	public boolean isNotified() {
		return notified;
	}

	public void notifyComplete() {
		this.notified = true;
	}
}