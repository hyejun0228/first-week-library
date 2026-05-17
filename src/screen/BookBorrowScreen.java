package screen;

import model.Library;

import java.util.Scanner;

public class BookBorrowScreen {
    public void show(Scanner scanner, Library library) {
        System.out.println("=================================");
        System.out.println("           도서 대여 화면");
        System.out.println("=================================");

        System.out.print("회원 번호: ");
        String memberId = scanner.nextLine();

        System.out.print("도서 번호: ");
        String bookId = scanner.nextLine();

        library.borrowBook(memberId, bookId);

        System.out.println();
        System.out.println("메인 화면으로 돌아갑니다.");
    }
}