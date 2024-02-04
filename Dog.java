import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }

    public Dog(){

    }

    @Override
    public double run() {
        return 30.4;
    }
    @Override
    public double swim() {
        return 8.2;
    }
}
