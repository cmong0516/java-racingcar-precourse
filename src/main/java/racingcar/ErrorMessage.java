package racingcar;

public enum ErrorMessage {
    CAR_NAME_LENGTH_OVER("[ERROR] 자동차 이름은 5글자를 넘을수 없습니다."),
    IS_NOT_NUMBER("[ERROR] 숫자만 입력 가능합니다."),
    IS_NOT_IN_RANGE("[ERROR] 1 이상의 숫자만 입력 가능합니다.");

    private String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
