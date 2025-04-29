package coding.contest.codingcont;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cone {
    private final LocalDate date;
    private final List<Scoop> scoops = new ArrayList<>();

    public Cone() {
        this.date = LocalDate.now();
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

    public LocalDate getDate() {
        return date;
    }

    public double getTotalGrossPrice() {
        return scoops.stream().mapToDouble(Scoop::getGrossPrice).sum();
    }

    @Override
    public String toString() {
        return "Cone (" + date + ")";
    }
}
