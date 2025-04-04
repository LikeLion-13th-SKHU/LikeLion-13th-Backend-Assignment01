package interfacePrac;

interface Animal {
    void sound();   // 추상  메서드
    void move();    // 추상 메서드ㅡ
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    public void move() {
        System.out.println("강아지가 뛰어요.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.move();
    }
}
