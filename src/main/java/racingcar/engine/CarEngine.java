package racingcar.engine;

import racingcar.common.ErrorMessage;

public class CarEngine extends Engine {

    private static final int OPERATE_FLAG = 4;
    private static final int MOVE_DISTANCE = 1;

    @Override
    public int operate(int input) {
        if (!inputValidatation(input)) {
            throw new IllegalArgumentException(ErrorMessage.OUT_OF_RANGE);
        }

        if (input >= OPERATE_FLAG) {
            return MOVE_DISTANCE;
        }

        return 0;
    }

    private boolean inputValidatation(int input) {
        if (input >= MIN_INPUT && input <= MAX_INPUT) {
            return true;
        }

        return false;
    }
}
