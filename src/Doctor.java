public abstract class Doctor implements Printable {
    private String name;
    private DoctorSpecialization doctorSpecialization;

    public Doctor(String name, DoctorSpecialization doctorSpecialization) {
        this.name = name;
        this.doctorSpecialization = doctorSpecialization;
    }

    public String getName() {
        return name;
    }

    public DoctorSpecialization getDoctorSpecialization() {
        return doctorSpecialization;
    }
}
