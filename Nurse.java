public class Nurse extends Personal {

    public Nurse(String name, String speciality, int birthYear) {
        super(name, speciality,birthYear);
    }

       public void doProcedure() {
       System.out.println("Сделан укол");
    }
}