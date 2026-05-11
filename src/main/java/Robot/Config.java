package Robot;

public class Config {

    int x;
    int y;
    String direction;

    String[] directions = {"N", "E", "S", "W"};

    Config(int x, int y, String direction) {
        this.x         = x;
        this.y         = y;
        this.direction = direction;
    }

    void avancer() {
        if (direction.equals("N")) y += 1;
        if (direction.equals("S")) y -= 1;
        if (direction.equals("E")) x += 1;
        if (direction.equals("W")) x -= 1;
    }

    void tournerDroite() {
        int index = 0;
        for (int i = 0; i < directions.length; i++) {
            if (directions[i].equals(direction)) {
                index = i;
            }
        }
        direction = directions[(index + 1) % 4];
    }

    void afficherPosition() {
        System.out.println("Position : (" + x + ", " + y + ")  Direction : " + direction);
    }
}
