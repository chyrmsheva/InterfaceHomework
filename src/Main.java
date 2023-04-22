import modelInterface.Dormitory;
import modelInterface.Family;
import modelInterface.Flat;
import modelInterface.Hotel;

public class Main {
    public static void main(String[] args) {
        Family[] families = new Family[]{new Family("Chyrmashevy"),new Family("Mamatbekovy")};
        Flat flat = new Flat(families,"Улица Совхозная");
        flat.live();
        flat.liveAddress();

        System.out.println("---------------------------------------------------------------------");

        Family[]families1 = {new Family("Johnsons")};
        Dormitory dormitory = new Dormitory(families1,"Улица Новороссийкая");
        dormitory.live();
        dormitory.liveAddress();

        System.out.println("-----------------------------------------------------------------------");

        Family[]families2 = {new Family("Mullers"),new Family("Turgenevy")};
        Hotel hotel = new Hotel(families2,"Улица Лермантова");
        hotel.live();
        hotel.liveAddress();




    }
}

//       Bread bread = new Bread();
//       bread.baked();
//       Pie pie = new Pie();
//       pie.baked();
//       Bun bun = new Bun();
//       bun.baked();
//
//    }

//        Shark shark = new Shark();
//        Shark shark1 = new Shark();
//        Shark shark2 = new Shark();
//        Shark shark3 = new Shark();
//        Shark shark4 = new Shark();
//
//
//        Duck duck = new Duck();
//        Duck duck1 = new Duck();
//        Duck duck2 = new Duck();
//        Duck duck3 = new Duck();
//        Duck duck4 = new Duck();
//
//        Turtle turtle = new Turtle();
//        Turtle turtle1 = new Turtle();
//        Turtle turtle2 = new Turtle();
//        Turtle turtle3 = new Turtle();
//        Turtle turtle4 = new Turtle();
//
//        Swimable[] swimables = new Swimable[]{shark,shark,shark1,shark2,shark3,shark4,duck,duck1,duck2,duck3,duck4,turtle,turtle1,turtle2,turtle3,turtle4};
//
//        Swimable[] oceanirum = new Swimable[]{
//                new Duck(),
//                new Duck(),
//                new Duck(),
//                new Duck(),
//                new Duck(),
//                new Shark(),
//                new Shark(),
//                new Shark(),
//                new Shark(),
//                new Shark(),
//                new Turtle(),
//                new Turtle(),
//                new Turtle(),
//                new Turtle(),
//                new Turtle(),
//        };














