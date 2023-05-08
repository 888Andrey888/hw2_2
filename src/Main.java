public class Main {
    public static void main(String[] args) {
        //Хотел использовать Scanner для ввода данных в case'х по типу
        //doctor = new Surgeon(scanner.nextLine(), doctorSpecialization, scanner.nextLine());
        //но счел это не нужным, так как цель задания не в этом
        
        Doctor[] doctors = {createObject("Педиатор", "Лобанов", DoctorSpecialization.PEDIATRICIAN, false,
                0, 5),
                createObject("Хирург", "Вася", DoctorSpecialization.SURGEON, true,
                        10, 2),
                createObject("Окулист", "Лизанька", DoctorSpecialization.OCULIST, true,
                        10, 3),
        createObject("Окулист", "Луизанька", DoctorSpecialization.OCULIST, false,
                0, 1)};

        for (int i = 0; i < doctors.length; i++) {
            doctors[i].print();
        }
    }

    public static Doctor createObject(String className, String doctorName, DoctorSpecialization doctorSpecialization, boolean canOperate,
                                      int amountOperations, int experience) {
        Doctor doctor;
        switch (className) {
            case "Хирург":
                doctor = new Surgeon(doctorName, doctorSpecialization, amountOperations);
                break;
            case "Окулист":
                doctor = new Oculist(doctorName, doctorSpecialization, experience, canOperate);
                break;
            default:
                doctor = new Pediatrician(doctorName, doctorSpecialization, experience);
        }
        return doctor;
    }
}