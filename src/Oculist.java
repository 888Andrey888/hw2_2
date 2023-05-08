public class Oculist extends Doctor{

    private int experience;
    private boolean canOperate;

    public Oculist(String name, DoctorSpecialization doctorSpecialization, int experience, boolean canOperate) {
        super(name, doctorSpecialization);
        this.experience = experience;
        this.canOperate = canOperate;
    }

    @Override
    public void print() {
        System.out.println(super.getName() + " Специализация: " + super.getDoctorSpecialization().getSpecialization() + " Стаж: " + experience +
                ((canOperate) ? " Может проводить операции" : " Операции не проводит"));
    }
}
