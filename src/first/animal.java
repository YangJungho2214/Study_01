package first;

public class animal {
    //변수 설정
    private int age;
    private String kind;
    private String color;

    public animal(int age, String kind, String color) {
        //초기화
        this.age = age;
        this.kind = kind;
        this.color = color;
    }

    //sound 메소드 생성
    public void sound() {
        System.out.println("Sound");
    }
}
