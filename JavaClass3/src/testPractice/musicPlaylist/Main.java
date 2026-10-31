package testPractice.musicPlaylist;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * [음악 플레이리스트 관리]
 * 등록할 노래 수를 입력받고 제목과 가수를 저장한다. Song의 멤버 변수는 private이며,
 * 생성자와 노래 정보를 출력하는 showInfo()를 제공한다. Main은 ArrayList<Song>에
 * 입력받은 노래를 저장하고 향상된 for문으로 모든 노래와 전체 곡 수를 출력한다.
 */
// 플레이리스트에 담을 노래 한 곡의 제목과 가수를 보관한다.
class Song {
    // 노래 제목 또는 상영 영화 제목을 저장한다.
    private String title;
    // 노래를 부른 가수의 이름을 저장한다.
    private String artist;

    // 생성자: 노래 제목과 가수를 받아 한 곡의 정보를 준비한다.
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    // 객체가 가진 정보를 사용자가 읽을 수 있도록 출력한다.
    public void showInfo() { System.out.println(title + " - " + artist); }
}

// 입력값을 받고 객체의 메서드를 호출해 문제의 흐름을 진행한다.
public class Main {
    // 프로그램이 시작되는 지점이다. 입력, 객체 생성, 메서드 호출 순으로 진행한다.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Song> playlist = new ArrayList<>();
        int count = input.nextInt();

        // 정해진 횟수만큼 반복하거나 배열/목록의 각 항목을 차례대로 처리한다.
        for (int i = 0; i < count; i++) {
            String title = input.next();
            String artist = input.next();
            playlist.add(new Song(title, artist));
        }

        System.out.println("===나의 플레이리스트===");
        // 정해진 횟수만큼 반복하거나 배열/목록의 각 항목을 차례대로 처리한다.
        for (Song song : playlist) song.showInfo();
        System.out.println("총 " + playlist.size() + "곡");
    }
}
