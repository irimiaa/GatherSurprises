package GatherSurprises.GiveSurprises;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {

    public GiveSurpriseAndHug(String containter, int waitTime) {
        super(containter, waitTime);
    }

    @Override
    void giveWithPassion() {
        System.out.println("Warm wishes and a big hug!");
    }


}
