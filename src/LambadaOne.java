interface MyNumber{

    double getValue();
}

public class LambadaOne {

    public static void main(String[] args) {

        MyNumber myNumber;

        myNumber = () -> 12.45;

        System.out.println("A Fixed Value :" + myNumber);

        myNumber = () ->  Math.random() * 100;

        System.out.println("Random Value is :" + myNumber);
    }
}
