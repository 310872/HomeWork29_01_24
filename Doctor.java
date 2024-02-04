
public class Doctor extends Personal {

    private boolean nurse;

    public Doctor(String name, String speciality, int birthYear, boolean nurse) {
        super(name, speciality, birthYear);
        this.nurse = nurse;
    }

    public void doDiagnose() {
        System.out.println("Поставлен диагноз: " + animal.getIllness());
    }
}
