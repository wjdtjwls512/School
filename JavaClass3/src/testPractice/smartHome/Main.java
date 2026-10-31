package testPractice.smartHome;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * [스마트홈 기기 관리]
 * 기기 번호와 이름을 입력받아 스마트홈에 등록하고, 0 입력 시 등록을 끝낸 뒤 목록을 출력한다.
 * Device는 전원 상태를 false로 시작한다. SmartHome은 싱글턴이며 ArrayList로 여러 기기를
 * 관리하고, addDevice()와 showDevices()로 등록과 출력을 담당한다.
 */
// 스마트홈에 등록되는 기기 한 대의 번호·이름·전원 상태를 보관한다.
class Device {
    // 기기를 구별하는 번호를 저장한다.
    private int deviceId;
    // 기기의 이름을 저장한다.
    private String deviceName;
    // 기기의 전원 상태를 저장하며 기본값 false는 꺼짐을 뜻한다.
    private boolean power = false;

    // 생성자: 기기 번호와 이름을 저장한다. 전원은 필드 초기값에 따라 꺼진 상태다.
    public Device(int deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
    }

    // 객체가 가진 정보를 사용자가 읽을 수 있도록 출력한다.
    public void showInfo() {
        System.out.println("기기 번호: " + deviceId);
        System.out.println("기기 이름: " + deviceName);
        System.out.println("전원 상태: " + power);
    }
}

// 기기 목록을 한 곳에서 관리하는 싱글톤 클래스다.
class SmartHome {
    // 프로그램에서 공통으로 사용하는 SmartHome 객체를 가리킨다.
    private static SmartHome smartHome = new SmartHome();
    // 스마트홈에 등록된 Device 객체들을 순서대로 보관한다.
    private final ArrayList<Device> devices = new ArrayList<>();

    private SmartHome() { }

    // 공용 NotebookManager 객체를 반환한다.
    public static SmartHome getInstance() { return smartHome; }
    // 전달받은 기기 객체를 기기 목록 끝에 추가한다.
    public void addDevice(Device device) { devices.add(device); }

    // 목록의 모든 기기에 showInfo()를 호출해 등록 정보를 출력한다.
    public void showDevices() {
        System.out.println("==등록된 기기==");
        // 정해진 횟수만큼 반복하거나 배열/목록의 각 항목을 차례대로 처리한다.
        for (Device device : devices) {
            device.showInfo();
            System.out.println();
        }
    }
}

// 입력값을 받고 객체의 메서드를 호출해 문제의 흐름을 진행한다.
public class Main {
    // 프로그램이 시작되는 지점이다. 입력, 객체 생성, 메서드 호출 순으로 진행한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartHome smartHome = SmartHome.getInstance();
        int deviceNumber = sc.nextInt();
        sc.nextLine();
        String deviceName = sc.nextLine();

        // 사용자가 종료 값(기기 번호 0)을 입력할 때까지 기기를 계속 등록한다.
        while (deviceNumber != 0) {
            smartHome.addDevice(new Device(deviceNumber, deviceName));
            deviceNumber = sc.nextInt();
            sc.nextLine();
            deviceName = sc.nextLine();
        }
        smartHome.showDevices();
    }
}
