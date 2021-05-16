package za.ac.cput.ADP3Assignment2;

import java.util.Objects;

//Author: Marchello Carolus 218234457
//Description: I used this class for my Set and Map test cases

public class ShoeBrands {

    private String brandName;
    private int id;

    //constuctor
    public ShoeBrands(String brandName, int id) {
        this.brandName = brandName;
        this.id = id;
    }

    //Getters
    public String getBrandName() {
        return brandName;
    }

    public int getId() {
        return id;
    }

    //Setters
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ShoeBrands{" +
                "brandName='" + brandName + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoeBrands that = (ShoeBrands) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
