package baseball.view;

public class OutputView {
    private final static String ERROR = "[ERROR]%s";

    public void printStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printNumberPrompt() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void printEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void printError(String message) {
        System.out.println(ERROR.formatted(message));
    }

}
