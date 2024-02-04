public abstract class Personal {
    protected String name;
    protected String speciality;
    protected int birthYear;

    public Personal(String name, String speciality, int birthYear) {
        this.name = name;
        this.speciality = speciality;
        this.birthYear = birthYear;
    }

    public String getTypePersonal() {
        return this.getClass().getSimpleName();
    }

    public String toString() {
        return String.format("Сотрудник: %s, %s, %d", this.getTypePersonal(), name, speciality, birthYear);
    }
}
