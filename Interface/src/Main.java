interface Role {
    public void greet();
    public void move();
    public int getSpeed();
}
interface Hero extends Role {
    public void attack();
}
class Zeus implements Hero {
    private final String name = "Zeus";
    @Override
    public void attack() {
        System.out.println(name + ": Attack!");
    }
    @Override
    public void greet() {
        System.out.println(name + ": Hi!");
    }
    @Override
    public void move() {
        System.out.println(name + ": Move!");
    }
    @Override
    public int getSpeed() {
        return 10;
    }
}
class Athena implements Hero {
    private final String name = "Athena";
    @Override
    public void attack() {
        System.out.println(name + ": Attack!!!");
    }
    @Override
    public void greet() {
        System.out.println(name + ": Hi!!!");
    }
    @Override
    public void move() {
        System.out.println(name + ": Move!!!");
    }
    @Override
    public int getSpeed() {
        return 10;
    }
}

/**
 * @author KAR1SEVEN
 */
public class Main {
    public static void main(String[] args) {
        Hero[] heros = {new Zeus(), new Athena()};
        for (Hero hero: heros) {
            hero.greet();
        }
    }
}
