package coding.contest.codingcont;

public class Scoop {
    private final Flavor flavor;

    public Scoop(Flavor flavor) {
        this.flavor = flavor;
    }

    public Flavor getFlavor() {
        return flavor;
    }

    public double getGrossPrice() {
        return flavor.getGrossPrice();
    }

    @Override
    public String toString() {
        return flavor.getName() + " (€" + String.format("%.2f", getGrossPrice()) + ")";
    }
},
