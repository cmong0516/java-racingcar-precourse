package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행

        RacingGame racingGame = new RacingGame();
        Output output = new Output();

        String carNamesInput = racingGame.requestCarNamesInput();
        List<Car> carList = racingGame.makeCarList(carNamesInput);
        int tryCountInput = racingGame.requestTryCountInput();
        racingGame.makeAndPrintResult(tryCountInput,carList);
        List<String> winnerList = racingGame.findWinner(racingGame.findMaxLocation(carList), carList);
        output.printWinnerMessage(winnerList);
    }
}
