package modelInterface;

import java.util.Arrays;

public class Dormitory implements Liveable{
    private Family[] families;
    private String address;

    public Dormitory(Family[] families, String address) {
        this.families = families;
        this.address = address;
    }

    public Dormitory(Family[] families) {
        this.families = families;
    }

    public Family[] getFamilies() {
        return families;
    }

    public void setFamilies(Family[] families) {
        this.families = families;
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "families=" + Arrays.toString(families) +
                '}';
    }

    @Override
    public void live() {
        for (int i = 0; i < families.length; i++) {
            System.out.println(families[i]);
        }
        System.out.println("In dormitory live " + families.length+ " families\n");



    }

    @Override
    public void liveAddress() {
        for (int i = 0; i < families.length; i++) {
            System.out.println(families[i]+" живет в общежитие по адрес " +address);

        }

    }
}
