package GatherSurprises.Surprises;

import GatherSurprises.ISurprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FortuneCookie implements ISurprise {

    private static final String[] messages = {
            "A friend asks only for your time not your money.",
            "Your high-minded principles spell success.",
            "Hard work pays off in the future, laziness pays off now.",
            "Change can hurt, but it leads a path to something better.",
            "If you refuse to accept anything but the best, you very often get it.",
            "A smile is your passport into the hearts of others.",
            "Enjoy the good luck a companion brings you.",
            "People are naturally attracted to you.",
            "You learn from your mistakes... You will learn a lot today.",
            "Today it's up to you to create the peacefulness you long for.",
            "Hidden in a valley beside an open stream- This will be the type of place where you will find your dream.",
            "A dream you have will come true.",
            "Land is always on the mind of a flying bird.",
            "A chance meeting opens new doors to success and friendship.",
            "Be on the lookout for coming events; They cast their shadows beforehand.",
            "The man or woman you desire feels the same about you.",
            "A good way to keep healthy is to eat more Chinese food.",
            "If you have something good in your life, don't let it go!",
            "Meeting adversity well is the source of your strength.",
            "Your shoes will make you happy today.",
            "What ever you're goal is in life, embrace it visualize it, and for it will be yours.",
    };
    private static final Random random = new Random();
    private static ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(messages));
    private String surpriseMessage;

    private FortuneCookie(String message) {
        this.surpriseMessage = message;
    }

    public String getSurpriseMessage() {
        return this.surpriseMessage;
    }

    @Override
    public void enjoy() {
        System.out.println("Enjoy cookies!");
    }


    public static FortuneCookie generate() {
        return new FortuneCookie(arrayList.get(randomNumber()));
    }

    private static int randomNumber() {
        return random.nextInt(arrayList.size());
    }

    @Override
    public String toString() {
        return this.surpriseMessage;
    }

}
