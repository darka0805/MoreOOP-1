package lotr;
import kick.KnightStrategy;
import java.util.Random;

public class King extends Character{
    public King() {
        super(new Random().nextInt(15 - 5 + 1) + 2, new Random().nextInt(15 - 5 + 1) + 2,  new KnightStrategy());
    }
}