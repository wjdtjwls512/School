package performance2.problem5_notebookRental;

import java.util.Scanner;

/*
 * [학교 노트북 대여 관리]
 * 노트북 총 5대의 대여/반납 현황을 Notebook에서 관리한다.
 * NotebookManager는 싱글톤으로 만들고 Notebook 객체를 하나만 보유한다.
 * 대여 수량과 반납 수량을 입력받아 처리한 뒤 전체/대여 중/남은 수량을 출력한다.
 */
// 전체 노트북 수와 대여 중인 수를 관리한다.
class Notebook {
    // 학교에서 보유한 전체 노트북 수를 저장한다.
    private int totalCount;
    // 현재 대여 중인 노트북 수를 저장한다.
    private int rentalCount;

    // 생성자: 전체 노트북은 5대, 대여 중인 수는 0대로 초기화한다.
    public Notebook() {
        totalCount = 5;
        rentalCount = 0;
    }

    // 남은 노트북 수 이내의 양수만 대여 처리한다.
    public void rentNotebook(int count) {
        // 전체 수에서 이미 빌려 간 수를 빼면 지금 빌려줄 수 있는 수가 된다.
        int availableCount = totalCount - rentalCount;
        // 먼저 조건을 확인해 허용되는 경우와 처리할 수 없는 경우를 나눈다.
        if (count > 0 && count <= availableCount) {
            // 빌려준 수량만큼 대여 중 수량을 늘린다.
            rentalCount += count;
        } else {
            System.out.println("노트북을 대여할 수 없습니다.");
        }
    }

    // 현재 대여 중인 수 이내의 양수만 반납 처리한다.
    public void returnNotebook(int count) {
        // 먼저 조건을 확인해 허용되는 경우와 처리할 수 없는 경우를 나눈다.
        if (count > 0 && count <= rentalCount) {
            // 돌려받은 수량만큼 대여 중 수량을 줄인다.
            rentalCount -= count;
        } else {
            System.out.println("노트북을 반납할 수 없습니다.");
        }
    }

    // 객체가 가진 정보를 사용자가 읽을 수 있도록 출력한다.
    public void showInfo() {
        System.out.println("==노트북 대여 현황==");
        System.out.println("전체 노트북: " + totalCount + "대");
        System.out.println("대여 중: " + rentalCount + "대");
        System.out.println("남은 노트북: " + (totalCount - rentalCount) + "대");
    }
}

// Notebook 객체 하나를 통해 노트북 대여 현황을 관리한다.
class NotebookManager {
    // 프로그램 전체에서 공유하는 NotebookManager 객체를 가리킨다.
    // 클래스가 처음 사용될 때 관리 객체를 하나 만들고 모두가 이 객체를 함께 사용한다.
    private static NotebookManager instance = new NotebookManager();
    // 대여 수량을 실제로 관리하는 Notebook 객체를 보관한다.
    private Notebook notebook;

    // private 생성자라 다른 클래스에서 new NotebookManager()를 호출할 수 없다.
    // 관리자 객체가 만들어질 때 실제 대여 수량을 관리할 Notebook도 하나 만든다.
    private NotebookManager() {
        notebook = new Notebook();
    }

    // 공용 NotebookManager 객체를 반환한다.
    public static NotebookManager getInstance() {
        // 새 객체를 만들지 않고 이미 존재하는 하나의 관리 객체를 돌려준다.
        return instance;
    }

    // 남은 노트북 수 이내의 양수만 대여 처리한다.
    public void rentNotebook(int count) {
        notebook.rentNotebook(count);
    }

    // 현재 대여 중인 수 이내의 양수만 반납 처리한다.
    public void returnNotebook(int count) {
        notebook.returnNotebook(count);
    }

    // 객체가 가진 정보를 사용자가 읽을 수 있도록 출력한다.
    public void showInfo() {
        notebook.showInfo();
    }
}

// 입력값을 받고 객체의 메서드를 호출해 문제의 흐름을 진행한다.
public class Main {
    // 프로그램이 시작되는 지점이다. 입력, 객체 생성, 메서드 호출 순으로 진행한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 싱글톤에서 유일한 관리자 객체를 받아 이후 모든 작업에 사용한다.
        NotebookManager m = NotebookManager.getInstance();

        // 입력 순서는 대여할 수량, 반납할 수량이다.
        int rent = sc.nextInt();
        int back = sc.nextInt();

        m.rentNotebook(rent);
        m.returnNotebook(back);
        m.showInfo();
    }
}
