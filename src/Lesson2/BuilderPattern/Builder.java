package Lesson2.BuilderPattern;

// 2.1 Написать паттерн Builder

public class Builder {

    Bicycle bicycle = new Bicycle.BikeBuilder("Scott", "Cyclocross", "M")
            .doBikeHaveMultipleGears(true)
            .doBikeHaveSuspention(false).build();

}
