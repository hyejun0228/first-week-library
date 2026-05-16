import screen.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MemberRegisterScreen memberRegisterScreen = new MemberRegisterScreen();
        BookRegisterScreen bookRegisterScreen = new BookRegisterScreen();
        BookListScreen bookListScreen = new BookListScreen();
        MemberListScreen memberListScreen = new MemberListScreen();
        BookBorrowScreen bookBorrowScreen = new BookBorrowScreen();
        BookReturnScreen bookReturnScreen = new BookReturnScreen();

        while (true) {
            printMainMenu();

            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                memberRegisterScreen.show(scanner);
            } else if (menu == 2) {
                bookRegisterScreen.show(scanner);
            } else if (menu == 3) {
                bookListScreen.show(scanner);
            } else if (menu == 4) {
                memberListScreen.show(scanner);
            } else if (menu == 5) {
                bookBorrowScreen.show(scanner);
            } else if (menu == 6) {
                bookReturnScreen.show(scanner);
            } else if (menu == 7) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }

            System.out.println();
        }

        scanner.close();
    }

    public static void printMainMenu() {
        System.out.println("=================================");
        System.out.println("     도서관에 오신 것을 환영합니다");
        System.out.println("=================================");
        System.out.println("1. 회원 등록");
        System.out.println("2. 도서 등록");
        System.out.println("3. 전체 도서 조회");
        System.out.println("4. 전체 회원 조회");
        System.out.println("5. 도서 대여");
        System.out.println("6. 도서 반납");
        System.out.println("7. 종료");
        System.out.print("메뉴를 선택하세요: ");
    }
}