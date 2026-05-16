package model;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean isBorrowed;
    private boolean isAdultOnly;

    public Book(String bookId, String title, String author, boolean isAdultOnly){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAdultOnly = isAdultOnly;
        this.isBorrowed = false;
    }

    public void borrowBook(){
        isBorrowed = true;
    }

    public void returnBook(){
        isBorrowed = false;
    }

    public void showBookInfo() {
        System.out.println("도서 번호: " + bookId);
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("대여 여부: " + (isBorrowed ? "대여 중" : "대여 가능"));
        System.out.println("성인 전용 여부: " + (isAdultOnly ? "성인 전용" : "전체 이용 가능"));
    }

    public String getBookId(){
        return bookId;
    }

    public boolean isBorrowed(){
        return isBorrowed;
    }

    public boolean isAdultOnly(){
        return isAdultOnly;
    }

}
