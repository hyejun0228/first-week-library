package model;

import java.util.ArrayList;

public class Member extends Person {
    protected String memberId;
    protected ArrayList<Book> borrowedBooks;
    protected int maxBorrowLimit;

    public Member(String memberId, String name, String phoneNumber, int maxBorrowLimit) {
        super(name, phoneNumber);
        this.memberId = memberId;
        this.maxBorrowLimit = maxBorrowLimit;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public boolean checkBorrowLimit() {
        return borrowedBooks.size() < maxBorrowLimit;
    }

    public boolean canBorrow(Book book) {

        if (!checkBorrowLimit()) {
            System.out.println("대여 가능 권수를 초과했습니다.");
            return false;
        }

        return true;
    }

    public void addBorrowedBook(Book book) {
        borrowedBooks.add(book);
    }

    public void removeBorrowedBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void showMemberInfo() {
        System.out.println("회원 번호: " + memberId);
        System.out.println("이름: " + name);
        System.out.println("전화번호: " + phoneNumber);
        System.out.println("현재 대여 권수: " + borrowedBooks.size());
        System.out.println("최대 대여 가능 권수: " + maxBorrowLimit);
    }

    public boolean isBorrowed(Book book) {
        return borrowedBooks.contains(book);
    }
}