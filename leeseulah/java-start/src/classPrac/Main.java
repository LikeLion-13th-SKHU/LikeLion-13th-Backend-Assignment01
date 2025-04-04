package classPrac;

class Animal {
    String name;
    int leg;
}

public class Main {
    public static void main(String[] args) {    // psvm
        Animal animal1;
        animal1 = new Animal();
        animal1.name = "강아지";
        animal1.leg = 4;
        
        Animal animal2 = new Animal();
        animal2.name = "고양이";
        animal2.leg = 4;

        Animal[] animals = new Animal[2];
        animals[0] = animal1;
        animals[1] = animal2;

        System.out.println(animals[0].name + "의 다리 수는 " + animals[0].leg);  // sout
        System.out.println(animals[1].name + "의 다리 수는 " + animals[1].leg);
    }
}   // 실행 : ctrl + shift + f10
