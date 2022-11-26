package racingcar;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    Output output = new Output();
    Input input = new Input();
    Validator validator = new Validator();

    public List<Car> makeCarList(String carListInput) {
        List<Car> carList = new ArrayList<>();
        String[] split = carListInput.split(",");

        for (String s : split) {
            carList.add(new Car(s));
        }

        return carList;
    }

    public int makeRandomNumber() {
        return pickNumberInRange(0, 9);
    }

    public void moveCars(List<Car> carList) {
        for (Car car : carList) {
            moveCar(car);
            output.printCarLocation(car.getName(), car.getPosition());
        }
    }

    public void moveCar(Car car) {
        if (canMove()) {
            car.moveCar();
        }
    }

    public int findMaxLocation(List<Car> carList) {
        int max = 0;
        for (Car car : carList) {
            if (max < car.getPosition()) {
                max = car.getPosition();
            }
        }

        return max;
    }

    public List<String> findWinner(int maxLocation, List<Car> carList) {
        List<String> winnerList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getPosition() == maxLocation) {
                winnerList.add(car.getName());
            }
        }

        return winnerList;
    }

    public boolean canMove() {
        int makeRandomNumber = makeRandomNumber();
        if (makeRandomNumber >= 4) {
            return true;
        }
        return false;
    }

    public String requestCarNamesInput() {

        String carNamesInput = "";
        while (true) {
            output.printRequestCarList();
            try {
                carNamesInput = input.carNamesInput();
                validator.validCarNameLength(carNamesInput);
                break;
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());

            }

        }
        return carNamesInput;
    }

    public int requestTryCountInput() {

        String tryCount = "";

        while (true) {
            output.printRequestTryCount();
            try {
                tryCount = input.tryCountInput();
                validator.validTryCountIsNum(tryCount);
                validator.validTryCountRange(tryCount);
                break;
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }

        return Integer.parseInt(tryCount);
    }

    public void makeAndPrintResult(int tryCountInput, List<Car> carList) {
        output.printResultMessage();
        for (int i = 0; i <tryCountInput ; i++) {
            moveCars(carList);
            System.out.println();
        }
    }

}
