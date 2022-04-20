package lesson4;

public class Cow implements TakeAction{


    @Override
    public void makeSound(String sound) {
        System.out.println("Mu-mu-mu");
    }

    @Override
    public void makeAMove(String move) {
        System.out.println("cok-cok-cok");
    }


}
