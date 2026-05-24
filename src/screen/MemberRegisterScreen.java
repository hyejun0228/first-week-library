package screen;

import java.util.Scanner;

import model.AdultMember;
import model.ChildMember;
import model.Library;

public class MemberRegisterScreen {
    public void show(Scanner scanner, Library library) {
        System.out.println("=================================");
        System.out.println("           회원 등록 화면");
        System.out.println("=================================");

        System.out.println("1. 어린이 회원");
        System.out.println("2. 어른 회원");
        System.out.println("회원 종류룰 선택하세요: ");

        String memberTypeString = scanner.nextLine();
        int memberType = Integer.parseInt(memberTypeString);

        System.out.print("회원 번호: 나중에 자동으로 바꾸자..");
        String memberId = scanner.nextLine();
        if (library.findMemberById(memberId) != null) {
            System.out.println("이미 존재하는 회원 번호입니다.");
            System.out.println("회원 등록을 취소합니다.");
            return;
        }

        System.out.print("회원 이름: ");
        String name = scanner.nextLine();

        System.out.print("전화 번호: ");
        String phoneNumber = scanner.nextLine();

        if (memberType == 1) {
            System.out.print("보호자 이름: ");
            String guardianName = scanner.nextLine();
            ChildMember childMember = new ChildMember(memberId, name, phoneNumber, guardianName);
            library.addMember(childMember);

            System.out.println("=================================");
            System.out.println(".       어린이 회원 등록 완료");
            System.out.println("=================================");
            System.out.println("이름: " + name);
            System.out.println("전화번호: " + phoneNumber);
            System.out.println("보호자 이름: " + guardianName);

        } else if (memberType == 2) {
            AdultMember adultMember = new AdultMember(memberId, name, phoneNumber);
            library.addMember(adultMember);
            System.out.println("=================================");
            System.out.println(".        성인 회원 등록 완료");
            System.out.println("=================================");
            System.out.println("이름: " + name);
            System.out.println("전화번호: " + phoneNumber);

        } else {
            System.out.println("잘못된 회원 종류입니다.");
        }

        System.out.println();
        System.out.println("메인 화면으로 돌아갑니다.");
    }


}
