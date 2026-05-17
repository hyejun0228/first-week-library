package screen;

import model.Library;

public class MemberListScreen {
    public void show(Library library) {
        System.out.println("=================================");
        System.out.println("          전체 회원 조회 화면");
        System.out.println("=================================");

        library.showAllMembers();

        System.out.println();
        System.out.println("메인 화면으로 돌아갑니다.");
    }
}