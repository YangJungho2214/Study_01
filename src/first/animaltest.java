package first;

public class animaltest {
    public static void main(String[] args) {
        // 각 클래스의 객체 생성
        cat cat = new cat(2, "cat", "white");
        dog dog = new dog(3, "dog", "black");
        human human = new human(39, "jung-ho", "korea");               

        // cat 테스트
        System.out.println("cat_test");
        cat.displayInfo(); // 예상 출력: "age: 2, kind: Siamese, color: White"
        cat.sound();   // 예상 출력: "Meowing"

        // dog 테스트
        System.out.println("dog_test");
        dog.displayInfo(); // 예상 출력: "age: 3, kind: Bulldog, color: Brown"
        dog.sound();   // 예상 출력: "Bow Wow"

        // human 테스트
        System.out.println("human_test");
        human.displayInfo(); // 예상 출력: "age: 25, kind: Homo sapiens, color: Fair"
        human.sound(); // 예상 출력: "Talking"
    }
}
