package test.exemple;

public class Main {
    public static void main(String[] args) {
//        int first = 15;
//        int second = 21;

//        System.out.println(TestExample.sum(first, second));
//        TestExample.positiveSumTest();


        int result = TestExample.sum(15, 21);
        int expected = 36;

        TestExample.asserNumberEquals(result, expected);
    }
}
