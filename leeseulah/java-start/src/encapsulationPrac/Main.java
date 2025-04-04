package encapsulationPrac;

class Animal {
    private String name;
    private int leg;

    public Animal(String name, int leg) {
        this.name = name;
        this.leg = leg;
    }

    public String getName() {
        return name;
    }

    public int getLeg() {
        return leg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeg(int leg) {
        if(validateLeg(leg))
            this.leg = leg;
    }

    private boolean validateLeg(int leg) {
        return leg > 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("강아지", 2);
        System.out.println(animal.getName());
        System.out.println(animal.getLeg());

        animal.setLeg(4);
        System.out.println(animal.getLeg());
    }
}
