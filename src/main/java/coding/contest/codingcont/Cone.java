package coding.contest.codingcont;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cone {
    private List<Scoop> scoops = new ArrayList<>();
    private LocalDateTime orderTime;

    public Cone() {
        this.orderTime = LocalDateTime.now();
    }

    public boolean addScoop(Scoop scoop) {
        if (scoops.size() < 3) {
            scoops.add(scoop);
            return true;
        }
        return false;
    }

    public List<Scoop> getScoops() {
        return scoops;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public double getTotalPrice() {
        return scoops.stream().mapToDouble(Scoop::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Cone ordered on: " + orderTime.toString();
    }
}

}
