package Employe;

import java.time.LocalDate;

public class Employe {

    int id;
    String name;
    String lastname;
    LocalDate birthday;
    String address;
    int salaryPerMonth;
    int hiringYear;

    Employe(int id, String name, String lastname, LocalDate birthday, String address, int salaryPerMonth, int hiringYear) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.birthday = birthday;
        this.address = address;
        this.salaryPerMonth = salaryPerMonth;
        this.hiringYear = hiringYear;
    }

    String getFullname() {
        return name + " " + lastname;
    }

    boolean isLivingAtIvandry() {
        return address.toLowerCase().contains("ivandry");
    }

    int getYearlySalary() {
        return salaryPerMonth * 12;
    }

    int countYearSeniority() {
        return LocalDate.now().getYear() - hiringYear;
    }
}