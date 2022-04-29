package GatherSurprises.Containers;


import GatherSurprises.IBag;
import GatherSurprises.ISurprise;

public class LIFO extends AbstractBag implements IBag {

    @Override
    public ISurprise takeOut() {
        return super.getSurprises().remove(super.getSurprises().size() - 1);
    }

}
