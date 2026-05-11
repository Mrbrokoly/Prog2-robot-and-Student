package Employe;

import java.time.LocalDate;

public class EmployeTest {
    public static void main(String[] args) {

        Employe emp1 = new Employe(1, "Rakoto", "Jean", LocalDate.of(1990, 3, 12), "Lot 12, Ivandry, Antananarivo", 800_000, 2018);
        Employe emp2 = new Employe(2, "Rasoa", "Marie", LocalDate.of(1985, 7, 25), "Rue des Fleurs, Analakely, Antananarivo", 1_200_000, 2015);
        Employe emp3 = new Employe(3, "Andry", "Patrick", LocalDate.of(1995, 11, 8), "Villa 5, Ivandry, Antananarivo", 650_000, 2022);
        Employe emp4 = new Employe(4, "Voahirana", "Céline", LocalDate.of(1988, 1, 30), "Ambohijatovo, Antananarivo", 950_000, 2010);

        Employe[] employes = { emp1, emp2, emp3, emp4 };

        System.out.println("=".repeat(55));
        System.out.printf("%-20s %-15s %-10s %-10s%n", "Nom complet", "Ivandry ?", "Salaire/an", "Ancienneté");
        System.out.println("=".repeat(55));

        for (Employe e : employes) {
            System.out.printf("%-20s %-15s %-10d %-10d%n",
                    e.getFullname(),
                    e.isLivingAtIvandry() ? "✅ Oui" : "❌ Non",
                    e.getYearlySalary(),
                    e.countYearSeniority()
            );
        }

        System.out.println("=".repeat(55));

        // Departement
        Departement dept = new Departement(1, "Informatique");
        dept.ajouterEmploye(emp1);
        dept.ajouterEmploye(emp2);
        dept.ajouterEmploye(emp3);
        dept.sommeSalaires();

        System.out.println();

        dept.supprimerEmploye(emp2);
        dept.supprimerEmploye(emp4);
        dept.sommeSalaires();
    }
}