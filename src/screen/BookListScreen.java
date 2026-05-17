package screen;

import model.Library;

public class BookListScreen {
    public void show(Library library) {
        System.out.println("=================================");
        System.out.println("          전체 도서 조회 화면");
        System.out.println("=================================");

        library.showAllBooks();

        System.out.println();
        System.out.println("메인 화면으로 돌아갑니다.");
    }
}