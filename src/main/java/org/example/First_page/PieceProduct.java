package org.example.First_page;

public class PieceProduct extends Product {
    private final double weight;
    public PieceProduct(String name, String description, double weight) {
        super(name, description);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
