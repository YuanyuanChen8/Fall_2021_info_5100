package Q1;

public class Main {
    public static void main(String[] args) {
        Psychiatrist psy = new Psychiatrist();
        Sad sadObj = new Sad();
        Happy hapObj = new Happy();

        psy.examine(hapObj);

        System.out.println();
        psy.observe(hapObj);
        String ob1 = psy.toString();
        System.out.println(ob1);

        System.out.println();

        psy.examine(sadObj);
        System.out.println();
        psy.observe(sadObj);
        String ob2 = psy.toString();
        System.out.println(ob2);
    }
}