package Practice;
public class HWTable {

    public static void main(String[] args) {
        printAndTable();
        printOrTable();
        printNotTable();
    }

    private static void printAndTable() {
        System.out.println("AND Operator Table:");
        System.out.println("P\t|\tQ\t|\tP AND Q");
        System.out.println("---\t|\t---\t|\t---");
        printLine(0, 0);
        printLine(0, 1);
        printLine(1, 0);
        printLine(1, 1);
        System.out.println();
    }

    private static void printOrTable() {
        System.out.println("OR Operator Table:");
        System.out.println("P\t|\tQ\t|\tP OR Q");
        System.out.println("----|\t----|\t-----");
        printLine(0, 0);
        printLine(0, 1);
        printLine(1, 0);
        printLine(1, 1);
        System.out.println();
    }
    private static void printNotTable() {
        System.out.println("NOT Operator Table:");
        System.out.println("P\t|\tNOT P");
        System.out.println("---\t|\t---");
        printNotLine(0);
        printNotLine(1);
        System.out.println();
    }

    private static void printLine(int p, int q) {
        System.out.println(p + "\t|\t" + q + "\t|\t" + (p & q));
        System.out.println("---\t|----\t|\t---");
    }

    private static void printNotLine(int p) {
        System.out.println(p + "\t|\t" + (p == 0 ? 1 : 0));
        System.out.println("---\t|\t---");
    }
}
