public class Surgeon extends Doctor {
    private int amountOperations;

    public Surgeon(String name, DoctorSpecialization doctorSpecialization, int amountOperations) {
        super(name, doctorSpecialization);
        this.amountOperations = amountOperations;
    }

    @Override
    public void print() {
        System.out.println(super.getName() + " Специализация: " + super.getDoctorSpecialization().getSpecialization() + " Количество операция: " + amountOperations);
    }
}
