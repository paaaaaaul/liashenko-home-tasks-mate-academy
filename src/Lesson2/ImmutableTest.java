//package Lesson2;
//
//// 2.4 Создать immutable класс
//
//import java.util.HashMap;
//
//public final class ImmutableTest {
//    private final String carType;
//    private final String carModel;
//    private final int yearOfaCar;
//    private final HashMap<String, String> carMap;
//
//
//    public String getCarType() {
//        return carType;
//    }
//
//    public String getCarModel() {
//        return carModel;
//    }
//
//    public int getYear() {
//        return yearOfaCar;
//    }
//
//    public ImmutableTest(String carModel, String carType, int yearOfaCar) {
//        System.out.println("Here are types of cares and models");
//        this.carType = carType;
//        this.carModel = carModel;
//        this.yearOfaCar = yearOfaCar;
//    }
//
//    public static void main(String[] args) {
//        HashMap<String, String> carMap = new HashMap<String, String>();
//        carMap.put("Opel", "Pickup");
//        carMap.put("Nissan", "Sedan");
//
//
//    }
//}
