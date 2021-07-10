public class Test {
//    private static final int DOG = 0; <- bad enumeration, don't do it this way
//    private static final int CAT = 0;
//    private static final int FOX = 0;

    public static void main(String[] args) {
        Animal animal = Animal.FOX;
        Season season = Season.WINTER;

        switch (animal) {
            case DOG:
            case CAT:
            case FOX:
                System.out.println(animal.getTranslation() + " " + animal.name() + " " + animal.ordinal());
                break;
        }

        // Object -> Enum -> season

        switch (season) {
            case WINTER:
            case AUTUMN:
            case SPRING:
            case SUMMER:
                System.out.println(season.getTemperature() + " " + season.name() + " " + season.ordinal());
                break;
        }
    }
}
