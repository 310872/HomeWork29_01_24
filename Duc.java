import java.time.LocalDate;

public class Duc extends Animal implements Flyable, Swimable {
    private int wingQuantity;

    public Duc(String name, LocalDate birthDay, Illness illness, int wingQuantity) {
        super(name, birthDay, illness);
        this.wingQuantity = wingQuantity;
    }

    public Duc(){

    }

    public double swim() {
        return 10.5;
    }

    public double fly() {
        return 48.8;
    }
}
