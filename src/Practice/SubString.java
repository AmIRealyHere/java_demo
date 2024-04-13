package Practice;

public class SubString {
    public static void main(String[] args) {
        String orgstr = "Java is a heart of Internet.";

        String substr = orgstr.substring(7, 28);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
