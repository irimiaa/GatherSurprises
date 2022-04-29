package GatherSurprises.Surprises;

import GatherSurprises.ISurprise;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise {

    private static final String[] names = {"Dave", "Carl", "Kevin","Stuart", "Jerry", "Tim", "Mark"};
    private static ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(names));
    private static int counter;
    private String minion;

    private MinionToy() {
        if (counter == arrayList.size())
            counter = 0;

        this.minion = arrayList.get(counter++);
    }

    public static MinionToy generate() {
        return new MinionToy();
    }

    @Override
    public void enjoy() {
        System.out.println("Enjoy Minion Toy!");
    }

    @Override
    public String toString() {
        return minion;
    }



}
