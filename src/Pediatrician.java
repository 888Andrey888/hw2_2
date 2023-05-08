public class Pediatrician extends Doctor{
    private int experience;

    public Pediatrician(String name, DoctorSpecialization doctorSpecialization, int experience) {
        super(name, doctorSpecialization);
        this.experience = experience;
    }

    @Override
    public void print() {
        System.out.println(super.getName() + " Специализация: " + super.getDoctorSpecialization().getSpecialization() + " Стаж: " + experience);
    }
}
