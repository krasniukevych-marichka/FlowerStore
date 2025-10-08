package flower.store;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Store {
    private List<Flower> store = new ArrayList<>();
    
    public void addFlower(Flower flower) {
        store.add(flower);
    }

    public List<Flower> search(Flower flower) {
        List<Flower> result = new ArrayList<>();
        for (Flower flow: store) {
            if (matches(flower, flow)) {
                result.add(flow);
            }
        }
        return result;
    }

    private boolean matches(Flower firstFlower, Flower secondFlower) {
        if (firstFlower.getFlowerType() != null && firstFlower.getFlowerType() != secondFlower.getFlowerType()) {
            return false;
        }
        if (firstFlower.getColor() != null && firstFlower.getColor() != secondFlower.getColor()) {
            return false;
        }
        if (firstFlower.getSepalLength() != 0 && firstFlower.getSepalLength() != secondFlower.getSepalLength()) {
            return false;
        }
        if (firstFlower.getPrice() != 0 && firstFlower.getPrice() != secondFlower.getPrice()) {
            return false;
        }
        return true;
    }
}
