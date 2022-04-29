package GatherSurprises;

import GatherSurprises.Surprises.Candies;
import GatherSurprises.Surprises.FortuneCookie;
import GatherSurprises.Surprises.MinionToy;

import java.util.Random;

public final class GatherSurprises {

    private static Random random = new Random();

    private GatherSurprises() {};

    public static ISurprise gather() {

        switch (random.nextInt(3)) {
            case 0:
                return FortuneCookie.generate();
            case 1:
                return Candies.generate();
            case 2:
                return MinionToy.generate();
            default:
                return null;
        }
    }

    public static ISurprise[] gather(int n) {
        ISurprise[] surprises = new ISurprise[n];
        for (int i = 0; i < n; i++) {
            surprises[i] = gather();
        }
        return surprises;
    }
}
