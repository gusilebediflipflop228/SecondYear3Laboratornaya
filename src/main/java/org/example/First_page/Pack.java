package org.example.First_page;

import java.util.Objects;

public class Pack {
    private final String name;
    private final double weight;

    public Pack(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Pack{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pack pack = (Pack) o;
        return Double.compare(weight, pack.weight) == 0 && Objects.equals(name, pack.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}
