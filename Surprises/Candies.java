package GatherSurprises.Surprises;

import GatherSurprises.ISurprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise {

    private static Random random = new Random();
    private static final String[] bomboane = {"chocolate", "jelly", "fruits", "vanilla"};
    private static ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(bomboane));
    private int candiesNo;
    private String candy;

    private Candies(int candyIndex, int candiesNo) {
        this.candy = arrayList.get(candyIndex);
        this.candiesNo = candiesNo;
    }

    public static Candies generate() {
        return new Candies(randomNumber(arrayList.size()), randomNumber(10) + 1);
    }

    private static int randomNumber(int limit) {
        return random.nextInt(limit);
    }

    @Override
    public void enjoy() {
        System.out.println("Enjoy candies!");
    }

    @Override
    public String toString() {
        return String.format("%s - %d", this.candy, this.candiesNo);
    }

}
