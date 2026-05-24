package screen;

import java.util.Scanner;

import model.Book;
import model.Library;

public class BookRegisterScreen {
    public void show(Scanner scanner, Library library) {
        System.out.println("=================================");
        System.out.println("           도서 등록 화면");
        System.out.println("=================================");

        System.out.println("책 번호: 나중에 자동으로..");
        String bookId = scanner.nextLine();

        System.out.println("책 이름: ");
        String title = scanner.nextLine();

        System.out.println("작가 이름: ");
        String author = scanner.nextLine();

        System.out.println("성인용 책 인가요?");
        System.out.println("1. 네");
        System.out.println("2. 아니요");
        String isAdultOnlyString = scanner.nextLine();
        int isAdultOnly = Integer.parseInt(isAdultOnlyString);

        if (isAdultOnly == 1) {
            Book book = new Book(bookId, title, author, true);
            library.addBook(book);
        }else{
            Book book = new Book(bookId, title, author, false);
            library.addBook(book);
        }

        System.out.println("=================================");
        System.out.println(".          책 등록 완료");
        System.out.println("=================================");
        System.out.println("책 번호: " + bookId);
        System.out.println("책 이름: " + title);
        System.out.println("작가 이름: " + author);

        System.out.println();
        System.out.println("메인 화면으로 돌아갑니다.");
    }
}
