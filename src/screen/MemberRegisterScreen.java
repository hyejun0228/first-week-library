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

        int memberType;
        while (true){
            System.out.println("1. 어린이 회원");
            System.out.println("2. 어른 회원");
            System.out.println("회원 종류룰 선택하세요: ");

            String memberTypeString = scanner.nextLine();
            memberType = Integer.parseInt(memberTypeString);

            try {
                if (memberType == 1 || memberType == 2) break;

                System.out.println("1 또는 2만 입력해주세요.");
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해주세요.");
            }
        }

        String memberId = library.createMemberId();
        System.out.print("회원 번호: 나중에 자동으로 바꾸자..");

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

        } else {
            AdultMember adultMember = new AdultMember(memberId, name, phoneNumber);
            library.addMember(adultMember);
            System.out.println("=================================");
            System.out.println(".        성인 회원 등록 완료");
            System.out.println("=================================");
            System.out.println("이름: " + name);
            System.out.println("전화번호: " + phoneNumber);

        }
        System.out.println();
        System.out.println("메인 화면으로 돌아갑니다.");
    }


}
