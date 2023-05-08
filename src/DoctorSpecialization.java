public enum DoctorSpecialization {
    PEDIATRICIAN("Педиатор"),
    SURGEON("Хирург"),
    OCULIST("Окулист");

    private String specialization;

    DoctorSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}
