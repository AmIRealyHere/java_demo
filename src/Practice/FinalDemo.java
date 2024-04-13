package Practice;

public class FinalDemo {
    public static void main(String[] args) {
        ErrorMessage err = new ErrorMessage();

        System.out.println(err.getErrorMessage(err.OUTERR));
        System.out.println(err.getErrorMessage(err.DISKERR));
        System.out.println(err.getErrorMessage(err.INERR));
        System.out.println(err.getErrorMessage(err.INDEXERR));
    }
}
