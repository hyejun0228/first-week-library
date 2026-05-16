package model;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (findBookById(book.getBookId()) != null) {
            System.out.println("이미 존재하는 도서 번호입니다.");
            return;
        }

        books.add(book);
        System.out.println("도서가 등록되었습니다.");
    }

    public void addMember(Member member) {
        if (findMemberById(member.getMemberId()) != null) {
            System.out.println("이미 존재하는 회원 번호입니다.");
            return;
        }

        members.add(member);
        System.out.println("회원이 등록되었습니다.");
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }

        for (Book book : books) {
            book.showBookInfo();
            System.out.println("----------------------");
        }
    }

    public void showAllMembers() {
        if (members.isEmpty()) {
            System.out.println("등록된 회원이 없습니다.");
            return;
        }

        for (Member member : members) {
            member.showMemberInfo();
            System.out.println("----------------------");
        }
    }

    public void borrowBook(String memberId, String bookId) {
        Member member = findMemberById(memberId);
        Book book = findBookById(bookId);

        if (member == null) {
            System.out.println("존재하지 않는 회원입니다.");
            return;
        }

        if (book == null) {
            System.out.println("존재하지 않는 도서입니다.");
            return;
        }

        if (book.isBorrowed()) {
            System.out.println("이미 대여 중인 도서입니다.");
            return;
        }

        if (!member.canBorrow(book)) {
            return;
        }

        member.addBorrowedBook(book);
        book.borrowBook();

        System.out.println("도서 대여가 완료되었습니다.");
    }

    public void returnBook(String memberId, String bookId) {
        Member member = findMemberById(memberId);
        Book book = findBookById(bookId);

        if (member == null) {
            System.out.println("존재하지 않는 회원입니다.");
            return;
        }

        if (book == null) {
            System.out.println("존재하지 않는 도서입니다.");
            return;
        }


        member.removeBorrowedBook(book);
        book.returnBook();

        System.out.println("도서 반납이 완료되었습니다.");
    }

    public Book findBookById(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }

        return null;
    }

    public Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }

        return null;
    }
}