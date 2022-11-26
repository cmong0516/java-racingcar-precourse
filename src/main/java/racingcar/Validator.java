package racingcar;

import java.util.regex.Pattern;

public class Validator {
    private static final Pattern NUMBER_PATTERN = Pattern.compile("^[0-9]+$");


    public void validCarNameLength(String carListInput) {
        String[] split = carListInput.split(",");
        for (String s : split) {
            if (s.length() > 5) {
                throw new IllegalArgumentException(ErrorMessage.CAR_NAME_LENGTH_OVER.getErrorMessage());
            }
        }
    }

    public void validTryCountIsNum(String tryCount) {
        if (!NUMBER_PATTERN.matcher(tryCount).matches()) {
            throw new IllegalArgumentException(ErrorMessage.IS_NOT_NUMBER.getErrorMessage());
        }
    }

    public void validTryCountRange(String tryCount) {
        int intTryCount = Integer.parseInt(tryCount);

        if (intTryCount < 1) {
            throw new IllegalArgumentException(ErrorMessage.IS_NOT_IN_RANGE.getErrorMessage());
        }
    }
}
