package GatherSurprises.Containers;

import GatherSurprises.IBag;
import GatherSurprises.ISurprise;

public class FIFO extends AbstractBag implements IBag {

    @Override
    public ISurprise takeOut() {
        return super.getSurprises().remove(0);
    }

}
