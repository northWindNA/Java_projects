public enum Season {
    WINTER(-40), AUTUMN(15), SPRING(25), SUMMER(45);

    private final int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
