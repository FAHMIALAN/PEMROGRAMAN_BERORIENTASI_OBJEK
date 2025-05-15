
class Enemy {
    String name;
    int hp;
    int attackPoint;

    public Enemy(String name, int hp, int attackPoint) {
        this.name = name;
        this.hp = hp;
        this.attackPoint = attackPoint;
    }

    public void attack() {
        System.out.println(name + " attacks with " + attackPoint + " points.");
    }
}

class Zombie extends Enemy {
    public Zombie(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    public void walk() {
        System.out.println(name + " walks slowly.");
    }
}

class Pocong extends Enemy {
    public Pocong(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    public void jump() {
        System.out.println(name + " jumps high.");
    }
}

class Burung extends Enemy {
    public Burung(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    public void fly() {
        System.out.println(name + " flies in the sky.");
    }

    public void walk() {
        System.out.println(name + " walks quickly.");
    }

    public void jump() {
        System.out.println(name + " jumps from tree to tree.");
    }
}

// Test class
public class TestInheritance_mod9 {
    public static void main(String[] args) {
        Zombie zombie = new Zombie("Zombie", 100, 10);
        Pocong pocong = new Pocong("Pocong", 120, 15);
        Burung burung = new Burung("Burung", 80, 5);

        System.out.println("Testing Zombie:");
        zombie.attack();
        zombie.walk();

        System.out.println("\nTesting Pocong:");
        pocong.attack();
        pocong.jump();

        System.out.println("\nTesting Burung:");
        burung.attack();
        burung.fly();
        burung.walk();
        burung.jump();
    }
}
