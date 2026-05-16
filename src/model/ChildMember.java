package model;

public class ChildMember extends Member{
    private String guardianName;

    public ChildMember(String memberId, String name, String phoneNumber, String guardianName) {
        super(memberId, name, phoneNumber, 3);
        this.guardianName = guardianName;
    }

    @Override
    public boolean canBorrow(Book book) {
        if (book.isAdultOnly()) {
            System.out.println("어린이 회원은 성인 전용 도서를 대여할 수 없습니다.");
            return false;
        }

        return super.canBorrow(book);
    }

    @Override
    public void showMemberInfo() {
        super.showMemberInfo();
        System.out.println("회원 유형: 어린이 회원");
        System.out.println("보호자 이름: " + guardianName);
    }
}
