package first;

//animal 클래스 상속
public class dog extends animal {
    //animal 클래스 호출하여 초기화
    public dog(int age, String kind, String color) {
        super(age, kind, color);
    }

    //dog의 소리 출력 매소드
    public void sound() {
        System.out.println("Bow Wow");
    } 
}