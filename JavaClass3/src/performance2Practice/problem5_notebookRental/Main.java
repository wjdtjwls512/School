package performance2Practice.problem5_notebookRental;

import java.util.Scanner;

// 문제 5: 학교 노트북 대여 관리
class Notebook {
    private int totalCount;
    private int rentalCount;

    public Notebook() {
        totalCount = 5;
        rentalCount = 0;
    }

    public void rentNotebook(int count) {
        if (count > 0 && count <= totalCount - rentalCount) {
            rentalCount += count;
        } else {
            System.out.println("노트북을 대여할 수 없습니다.");
        }
    }

    public void returnNotebook(int count) {
        if (count > 0 && count <= rentalCount) {
            rentalCount -= count;
        } else {
            System.out.println("노트북을 반납할 수 없습니다.");
        }
    }

    public void showInfo() {
        System.out.println("전체 노트북: " + totalCount + "대");
        System.out.println("대여 중: " + rentalCount + "대");
        System.out.println("남은 노트북: " + (totalCount - rentalCount) + "대");
    }
}

class NotebookManager {
    private Notebook notebook;

    private static NotebookManager instance = new NotebookManager();

    private NotebookManager() {
        notebook = new Notebook();
    }

    public static NotebookManager getInstance() {
        return instance;
    }

    public void rentNotebook(int count) {
        notebook.rentNotebook(count);
    }

    public void returnNotebook(int count) {
        notebook.returnNotebook(count);
    }

    public void showInfo() {
        notebook.showInfo();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotebookManager m = NotebookManager.getInstance();

        int rent = sc.nextInt();
        int back = sc.nextInt();

        m.rentNotebook(rent);
        m.returnNotebook(back);
        m.showInfo();
    }
}
