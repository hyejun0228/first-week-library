package model;

public class AdultMember extends Member {
    public AdultMember(String memberId, String name, String phoneNumber) {
        super(memberId, name, phoneNumber, 5);
    }

    @Override
    public void showMemberInfo() {
        super.showMemberInfo();
        System.out.println("회원 유형: 성인 회원");
    }
}