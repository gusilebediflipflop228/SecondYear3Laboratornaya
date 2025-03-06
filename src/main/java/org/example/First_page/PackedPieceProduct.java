package org.example.First_page;


import org.example.First_page.Iface.Weightable;

import java.util.Objects;

public class PackedPieceProduct extends PieceProduct implements Weightable {
    private final int quantity;
    private final Pack pack;

    public PackedPieceProduct(PieceProduct pieceGoods, int quantity, Pack pack) {
        super(pieceGoods.getName(), pieceGoods.getDescription(), pieceGoods.getWeight());
        this.quantity = quantity;
        this.pack = pack;
    }

    @Override
    public String toString() {
        return "PackedPieceProduct{" +
                "quantity=" + quantity +
                ", pack=" + pack +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PackedPieceProduct that = (PackedPieceProduct) o;
        return quantity == that.quantity && Objects.equals(pack, that.pack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, pack);
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public double getNetWeight() {
        return quantity * this.getWeight();
    }

    @Override
    public double getGrossWeight() {
        return quantity * this.getWeight() + this.pack.getWeight();
    }
}
