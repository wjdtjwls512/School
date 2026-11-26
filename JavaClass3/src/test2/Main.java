package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Boss> it = new ArrayList<>();
    static ArrayList<Boss> service = new ArrayList<>();
    static ArrayList<Boss> business = new ArrayList<>();

    public static void main(String[] args) {
        addCompanies();
        System.out.println("1. 보스 모드  2. 커스터머 모드");
        int mode = readInt("선택: ", 1, 2);
        if (mode == 1) bossMode();
        else customerMode();
    }

    static void addCompanies() {
        it.add(new ItBoss("AI 컴퍼니", 4, 4800, 5, "인공지능"));
        it.add(new ItBoss("클라우드 컴퍼니", 5, 6200, 4, "클라우드"));
        it.add(new ItBoss("웹 컴퍼니", 2, 3600, 3, "웹개발"));
        it.add(new ItBoss("보안 컴퍼니", 4, 5500, 4, "정보보안"));
        it.add(new ItBoss("앱 컴퍼니", 3, 4100, 2, "모바일앱"));
        service.add(new ServiceBoss("카페 컴퍼니", 2, 3200, 4, "카페"));
        service.add(new ServiceBoss("호텔 컴퍼니", 3, 3800, 5, "호텔"));
        service.add(new ServiceBoss("여행 컴퍼니", 3, 4000, 4, "여행"));
        service.add(new ServiceBoss("교육 컴퍼니", 4, 4500, 5, "교육"));
        service.add(new ServiceBoss("배달 컴퍼니", 2, 3400, 3, "배달"));
        business.add(new PublicBoss("은행 컴퍼니", 4, 5000, 5, "금융"));
        business.add(new PublicBoss("무역 컴퍼니", 3, 4600, 4, "무역"));
        business.add(new PublicBoss("회계 컴퍼니", 4, 4800, 4, "회계"));
        business.add(new PublicBoss("공공 컴퍼니", 3, 4200, 5, "행정"));
        business.add(new PublicBoss("유통 컴퍼니", 2, 3900, 3, "유통"));
    }

    static void bossMode() {
        String name = readText("회사 이름: ");
        int salary = readInt("연봉(만원): ", 1, 1000000);
        int benefits = readInt("복지 수준(1~5): ", 1, 5);
        int skill = readInt("요구 기술 수준(1~5): ", 1, 5);
        int type = readInt("회사 분야 (1.IT 2.서비스 3.비즈니스): ", 1, 3);
        String category = readText("직무 유형: ");
        if (type == 1) it.add(new ItBoss(name, skill, salary, benefits, category));
        else if (type == 2) service.add(new ServiceBoss(name, skill, salary, benefits, category));
        else business.add(new PublicBoss(name, skill, salary, benefits, category));
        System.out.println("회사가 등록되었습니다.");
    }

    static void customerMode() {
        Customer c = new Customer();
        c.setCustomerName(readText("이름: "));
        c.setWantedSalary(readInt("희망 연봉(만원): ", 1, 1000000));
        c.setBenefits(readInt("희망 복지(1~5): ", 1, 5));
        c.setSkill(readInt("기술 수준(1~5): ", 1, 5));
        int type = readInt("희망 분야 (1.IT 2.서비스 3.비즈니스): ", 1, 3);
        ArrayList<Boss> list = it;
        if (type == 2) list = service;
        else if (type == 3) list = business;

        boolean possible = false;
        for (Boss b : list) if (c.getSkill() >= b.getWantedSkill()) possible = true;
        if (possible) new JobMatch(c, list).showTheBestBoss();
        else System.out.println("조건에 맞는 회사가 없습니다.");
    }

    static String readText(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    static int readInt(String message, int min, int max) {
        while (true) {
            System.out.print(message);
            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                sc.nextLine();
                if (value >= min && value <= max) return value;
            } else sc.nextLine();
            System.out.println("" + min + "부터 " + max + " 사이의 숫자를 입력하세요.");
        }
    }
}
