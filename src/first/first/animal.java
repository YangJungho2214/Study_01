package first;

public class animal {
    // 나이 변수 설정
    private int age;
    // 종류 변수 설정
    private String kind;
    // 색 변수 설정
    private String color;

    public animal(int age, String kind, String color) {
        // 나이 변수 초기화
        this.age = age;
        // 종류 변수 초기화
        this.kind = kind;
        // 색 변수 초기화
        this.color = color;
    }

    // sound 메소드 생성
    public void sound() {
        System.out.println("Sound");
    }

    // 출력
    public void displayInfo() {
        System.out.println("age: " + age);
        System.out.println("kind: " + kind);
        System.out.println("color: " + color);
    }
}
