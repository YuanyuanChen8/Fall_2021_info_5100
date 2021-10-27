package Q1;

public class Sad extends Moody {

    @Override
    String getMood() {
        return "I feel sad Today";
    }

    @Override
    void ExpressFeelings() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob ‘");
    }

    @Override
    public void queryMood() { System.out.println("'I feel Sad today!'");

    }

    public String toString() {
        return "Subject cries a lot";
    }
}