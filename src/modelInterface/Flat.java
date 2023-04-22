package modelInterface;

import java.util.Arrays;

public class Flat implements Liveable {
    private Family[] families;
    private String address;

    public Flat(Family[] families, String address) {
        this.families = families;
        this.address = address;
    }

    @Override
    public void live() {
        for (int i = 0; i < families.length; i++) {
            System.out.println("In flat lives: " + families[i]);
        }
        System.out.println("In flat live "+ families.length+" families\n");
    }

    @Override
    public void liveAddress() {
        for (int i = 0; i < families.length ; i++) {
            System.out.println(families[i]+"живет в квартире по адрес "+address);
        }


    }

    public Family[] getFamilies() {
        return families;
    }

    public void setFamilies(Family[] families) {
        this.families = families;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "families=" + Arrays.toString(families) +
                '}';
    }
}
