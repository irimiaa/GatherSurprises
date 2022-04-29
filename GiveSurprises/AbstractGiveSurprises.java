package GatherSurprises.GiveSurprises;

import GatherSurprises.BagFactory;
import GatherSurprises.IBag;
import GatherSurprises.ISurprise;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {

    private IBag bag;
    private int waitTime;

    public AbstractGiveSurprises(String containter, int waitTime) {
        BagFactory bagFactory = new BagFactory();
        this.bag = bagFactory.makeBag(containter);
        this.waitTime = waitTime;
    }

    public void put(ISurprise newSurprise) {
        bag.put(newSurprise);
    }

    public void put(IBag surprises) {
        this.bag.put(surprises);
    }

    public void give() {
        System.out.println(this.bag.takeOut());
        giveWithPassion();
    }

    public void giveAll() {
        while (!this.bag.isEmpty()) {
            try {
                TimeUnit.SECONDS.sleep(this.waitTime); // number of seconds to sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.bag.takeOut());
        }
        giveWithPassion();
    }

    public boolean isEmpty() {
        return this.bag.isEmpty();
    }

    @Override
    public String toString() {
        return this.bag.toString();
    }

    abstract void giveWithPassion();

}
