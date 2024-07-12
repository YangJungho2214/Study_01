package first;

//animal 클래스 상속
public class human extends animal {
    //animal 클래스 호출하여 초기화
    public human(int age, String kind, String color) {
        super(age, kind, color);
    }

    //human의 소리 출력 매소드
    public void sound() {
        System.out.println("Talking");
    } 
}