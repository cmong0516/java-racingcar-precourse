package racingcar;

import java.util.List;

public class Output {
    private final String CAR_LOCATION_POINTER = "-";
    private final String FINAL_WINNER = "최종 우승자 : ";
    private final String WINNER_SEPERATOR = ",";

    public void printRequestCarList() {
        System.out.println(GameMessage.INPUT_CAR_NAMES.getMessage());
    }

    public void printRequestTryCount() {
        System.out.println(GameMessage.INPUT_TRY_COUNT.getMessage());
    }

    public void printCarLocation(String carName,int position) {
        System.out.println(carName+" : "+CAR_LOCATION_POINTER.repeat(position));
    }

    public void printResultMessage() {
        System.out.println(GameMessage.GAME_RESULT);
    }

    public void printWinnerMessage(List<String> winner) {
        StringBuilder sb = new StringBuilder();
        sb.append(FINAL_WINNER);
        for (int i = 0; i < winner.size(); i++) {
            sb.append(winner.get(i));
            if (winner.size() - 1 > i) {
                sb.append(WINNER_SEPERATOR);
            }
        }

        System.out.println(sb);
    }

}
