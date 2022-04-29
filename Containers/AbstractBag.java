package GatherSurprises.Containers;

import GatherSurprises.IBag;
import GatherSurprises.ISurprise;
import java.util.ArrayList;


public abstract class AbstractBag implements IBag {

    private ArrayList<ISurprise> surprises = new ArrayList<>();

    public ArrayList<ISurprise> getSurprises() {
        return this.surprises;
    }

    @Override
    public void put(ISurprise newSurprise) {
        this.surprises.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while (!bagOfSurprises.isEmpty()) {
            put(bagOfSurprises.takeOut());
        }
    }

    @Override
    public boolean isEmpty() {
        return this.surprises.isEmpty();
    }

    @Override
    public int size() {
        return this.surprises.size();
    }

    @Override
    public String toString() {
        return this.surprises.toString();
    }


    @Override
    public abstract ISurprise takeOut();

}
