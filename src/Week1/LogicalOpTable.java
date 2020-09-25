package Week1;

public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true;
        q = true;
        System.out.print(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p) + "\n");

        p = true;
        q = false;
        System.out.print(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p) + "\n");

        p = false;
        q = true;
        System.out.print(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p) + "\n");

        p = false;
        q = false;
        System.out.print(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p) + "\n");
    }
}
