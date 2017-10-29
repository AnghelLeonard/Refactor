package helpers;

public final class ComputeEnduranceAlgorithm {

    private ComputeEnduranceAlgorithm() {
        throw new AssertionError();
    }

    public static int basicEndurance(int delta) {
        return 2 * delta;
    }

    public static int hardEndurance(int delta) {
        return 5 * delta;
    }

    public static int factorEndurance(int delta) {
        return 3 * delta;
    }

}
