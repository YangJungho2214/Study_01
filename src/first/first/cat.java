package first;

//animal 클래스 상속
public class cat extends animal {
    //animal 클래스 호출하여 초기화
    public cat(int age, String kind, String color) {
        super(age, kind, color);
    }

    //cat의 소리 출력 매소드
    public void sound() {
        System.out.println("Meowing");
    } 
}