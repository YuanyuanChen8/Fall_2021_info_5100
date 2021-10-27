package Q1;

public class Psychiatrist{
    String moody;
    public void examine(Moody obj){
        System.out.println("How are you feeling today?");
        System.out.println(obj.getMood());
    };
    public void observe(Moody obj){
        obj.ExpressFeelings();
        moody=obj.toString();
    };
    public String toString(){
        return "Observation:"+ moody;

    };

}