package Q1;

public class Happy extends Moody {

    @Override
    String getMood() {
        return "I feel happy Today";
    }

    @Override
    void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");

    }

    @Override
    public void queryMood() {
        System.out.println( "I feel Happy today!!");
    }

    public String toString() {
        return "Subject laughs a lot";
    }
}