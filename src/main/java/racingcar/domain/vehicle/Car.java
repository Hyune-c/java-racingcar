package racingcar.domain.vehicle;

import racingcar.domain.engine.Engine;

public class Car {

    private final Engine engine;
    private final Name name;

    private Distance distance;

    public Car(Engine engine, String name, Distance distance) {
        this.engine = engine;
        this.name = new Name(name);
        this.distance = distance;
    }

    public void drive(int number) {
        int moveDistance = engine.operate(number);
        distance = distance.move(moveDistance);
    }

    public String getName() {
        return name.getName();
    }

    public int getDistance() {
        return distance.getValue();
    }
}
