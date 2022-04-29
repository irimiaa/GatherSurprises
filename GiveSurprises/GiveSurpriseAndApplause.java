package GatherSurprises.GiveSurprises;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises {

    public GiveSurpriseAndApplause(String containter, int waitTime) {
        super(containter, waitTime);
    }

    @Override
    void giveWithPassion() {
        System.out.println("Loud applause to you… For it is in giving that we receive.");
    }
}
