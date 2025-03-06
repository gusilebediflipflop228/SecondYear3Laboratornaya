package org.example.First_page;


import org.example.First_page.Iface.Weightable;

import java.util.Arrays;
import java.util.Objects;

public class Consignment {
    private final String description;
    private final Weightable[] weightables;
    private final String name;

    public Consignment(String description, Weightable[] weightables) {
        this.description = description;
        this.weightables = weightables;
        this.name = "default";
    }
    public Consignment(String description, Weightable[] weightables, String name) {
        this.description = description;
        this.weightables = weightables;
        this.name = name;
    }

    public Weightable[] getWeightables() {
        return weightables;
    }

    public double getWeight(){
        double weight = 0;
        for (Weightable obj : weightables) {
            weight += obj.getGrossWeight();
        }
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Consignment that = (Consignment) o;
        return Objects.equals(description, that.description) && Objects.deepEquals(weightables, that.weightables) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, Arrays.hashCode(weightables), name);
    }

    @Override
    public String toString() {
        return "Consignment{" +
                "description='" + description + '\'' +
                ", weightables=" + Arrays.toString(weightables) +
                ", name='" + name + '\'' +
                '}';
    }
}
