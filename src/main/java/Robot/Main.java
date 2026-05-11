package Robot;
;

public class Main {

    public static void main(String[] args) {

        Config r1 = new Config(0, 0, "N");
        r1.avancer();
        System.out.print("Test 1 - avancer Nord     : ");
        r1.afficherPosition();

        Config r2 = new Config(0, 0, "S");
        r2.avancer();
        System.out.print("Test 2 - avancer Sud      : ");
        r2.afficherPosition();

        Config r3 = new Config(0, 0, "E");
        r3.avancer();
        System.out.print("Test 3 - avancer Est      : ");
        r3.afficherPosition();

        Config r4 = new Config(0, 0, "W");
        r4.avancer();
        System.out.print("Test 4 - avancer Ouest    : ");
        r4.afficherPosition();

        Config r5 = new Config(0, 0, "N");
        r5.tournerDroite();
        System.out.print("Test 5 - tourner N -> E   : ");
        r5.afficherPosition();

        Config r6 = new Config(0, 0, "W");
        r6.tournerDroite();
        System.out.print("Test 6 - tourner W -> N   : ");
        r6.afficherPosition();

        Config r7 = new Config(0, 0, "N");
        r7.avancer();
        r7.tournerDroite();
        r7.avancer();
        System.out.print("Test 7 - sequence         : ");
        r7.afficherPosition();

        Config r8 = new Config(0, 0, "N");
        for (int i = 0; i < 4; i++) {
            r8.avancer();
            r8.tournerDroite();
        }
        System.out.print("Test 8 - carré complet    : ");
        r8.afficherPosition();

        Config r9 = new Config(-3, -3, "S");
        r9.avancer();
        r9.avancer();
        System.out.print("Test 9 - coords negatives : ");
        r9.afficherPosition();
    }
}
