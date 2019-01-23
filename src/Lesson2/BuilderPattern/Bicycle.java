package Lesson2.BuilderPattern;

public class Bicycle {
    private String bikeCompany;
    private String bikeType;
    private String bikeSize;

    private boolean haveSuspention;
    private boolean haveMultipleGears;

    public Bicycle(BikeBuilder bikeBuilder) {
        this.bikeCompany = bikeBuilder.bikeCompany;
        this.bikeType = bikeBuilder.bikeType;
        this.bikeSize = bikeBuilder.bikeSize;
        this.haveSuspention = bikeBuilder.haveSuspention;
        this.haveMultipleGears = bikeBuilder.haveMultipleGears;
    }

    public String getBikeCompany() {
        return bikeCompany;
    }

    public String getBikeType() {
        return bikeType;
    }

    public String getBikeSize() {
        return bikeSize;
    }

    public boolean isHaveSuspention() {
        return haveSuspention;
    }

    public boolean isHaveMultipleGears() {
        return haveMultipleGears;
    }

    public static class BikeBuilder{
        private String bikeCompany;
        private String bikeType;
        private String bikeSize;

        private boolean haveSuspention;
        private boolean haveMultipleGears;

        public BikeBuilder(String bikeCompany, String bikeType, String bikeSize) {
            this.bikeCompany = bikeCompany;
            this.bikeType = bikeType;
            this.bikeSize = bikeSize;
        }

        public BikeBuilder doBikeHaveSuspention(boolean haveSuspention) {
            this.haveSuspention = haveSuspention;
            return this;
        }

        public BikeBuilder doBikeHaveMultipleGears(boolean haveMultipleGears) {
            this.haveMultipleGears = haveMultipleGears;
            return this;
        }

        public Bicycle build(){
            return new Bicycle(this);
        }
    }


}
