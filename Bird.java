import java.time.LocalDate;

public class Bird extends Animal implements Flyable, Goable {
    private int wingQuantity;

    public Bird(String name, LocalDate birthDay, Illness illness, int wingQuantity) {
        super(name, birthDay, illness);
        this.wingQuantity = wingQuantity;
    }

    public Bird(){

    }

    public double fly() {
        return 53.4;
    }

    public double run() {
        return 13.4;
    }
}