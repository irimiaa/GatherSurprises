package GatherSurprises.Containers;

import GatherSurprises.IBag;
import GatherSurprises.ISurprise;

import java.util.Random;

public class RANDOM extends AbstractBag implements IBag {

    private static Random random = new Random();

    @Override
    public ISurprise takeOut() {
        int randomNum = random.nextInt(super.getSurprises().size());
        return super.getSurprises().remove(randomNum);
    }

}

