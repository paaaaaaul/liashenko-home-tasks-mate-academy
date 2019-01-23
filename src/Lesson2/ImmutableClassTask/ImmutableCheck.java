package Lesson2.ImmutableClassTask;

public class ImmutableCheck {

    public static void main(String[] args) {
        Age age = new Age();
        age.setDay(1);
        age.setMonth(11);
        age.setYear(1219);

        ImmutableGirl girl = new ImmutableGirl(1, "Dina", age);

        System.out.println("Dina before modification: " + girl.getAge().getYear());
        girl.getAge().setYear(1993);
        System.out.println("Dina before modification: " + girl.getAge().getYear());
    }

}
