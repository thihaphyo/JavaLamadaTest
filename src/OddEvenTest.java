interface OddEven {

    boolean isEven(int num);
}

public class OddEvenTest {

    public static void main(String[] args) {

        OddEven oddEven;
        oddEven = (n) -> (n%2) == 0;

        if (oddEven.isEven(10)){
            System.out.println(10 + " is Even!");
        }else{
            System.out.println(10 + " is not Even!");
        }

    }
}
