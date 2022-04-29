package GatherSurprises;

import GatherSurprises.Containers.FIFO;
import GatherSurprises.Containers.LIFO;
import GatherSurprises.Containers.RANDOM;

public class BagFactory implements IBagFactory {

    @Override
    public IBag makeBag(String type) {
        return switch (type) {
            case "RANDOM" -> new RANDOM();
            case "FIFO" -> new FIFO();
            case "LIFO" -> new LIFO();
            default -> null;
        };
    }
}
