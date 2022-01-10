package ro.fasttrackit.curs13.homework.cars;

public record Range(int min, int max) {
    public boolean matches(int km) {
        return km >= min && km < max;
    }
}
