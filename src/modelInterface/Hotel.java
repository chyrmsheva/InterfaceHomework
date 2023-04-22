package modelInterface;

import java.util.Arrays;

public class Hotel implements Liveable {
    private Family[] families;
    private String address;


    public Hotel(Family[] families, String address) {
        this.families = families;
        this.address = address;
    }

    @Override
    public void live() {
        for (int i = 0; i < families.length; i++) {
            System.out.println(families[i]);
        }
        System.out.println("In hotel live " + families.length + " families\n");


    }

    @Override
    public void liveAddress() {
        for (int i = 0; i < families.length; i++) {
            System.out.println(families[i] + " живет в отеле по адресу " + address);
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
        return "Hotel{" +
                "families=" + Arrays.toString(families) +
                '}';
    }
}
