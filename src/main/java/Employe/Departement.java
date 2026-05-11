package Employe;

import java.util.ArrayList;

public class Departement {

    int id;
    String nomDeDepartement;
    ArrayList<Employe> listeEmploye;

    Departement(int id, String nomDeDepartement) {
        this.id = id;
        this.nomDeDepartement = nomDeDepartement;
        this.listeEmploye = new ArrayList<>();
    }

    void ajouterEmploye(Employe employe) {
        listeEmploye.add(employe);
        System.out.println(employe.getFullname() + " a été ajouté au département " + nomDeDepartement);
    }

    void supprimerEmploye(Employe employe) {
        if (listeEmploye.contains(employe)) {
            listeEmploye.remove(employe);
            System.out.println(employe.getFullname() + " a été retiré du département " + nomDeDepartement);
        } else {
            System.out.println(employe.getFullname() + " n'appartient pas au département " + nomDeDepartement);
        }
    }

    int sommeSalaires() {
        int total = 0;
        for (Employe employe : listeEmploye) {
            total += employe.salaryPerMonth;
        }
        System.out.println("Masse salariale du département " + nomDeDepartement + " : " + total);
        return total;
    }
}