public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("specify filename");
            System.exit(1);
        }
        Kwic kwic = new Kwic();
        kwic.input(args[0]);
        kwic.circularShift();
    }
}
