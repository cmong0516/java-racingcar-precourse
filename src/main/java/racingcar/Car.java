package racingcar;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현

    public int moveCar() {
        this.position += 1;
        return this.position;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
