public class Datatype_Number {
    public static void main(String[] args) {
        int age = 10;
        long countOfStar = 9874827384822349L;
        float pi = 3.14F;
        double morePi = 3.1415926546897;
        double d1 = 123.4;
        double d2 = 1.234e2;

        int octal = 023; // 19
        int hex = 0xC; // 12

        int a = 10;
        int b = 5;
        System.out.println(a+b); // 15
        System.out.println(a-b); // 5
        System.out.println(a*b); // 50
        System.out.println(a/b); // 2

        System.out.println(7 % 3); // 1
        System.out.println(3 % 7); // 3

        int i = 0;
        int j = 10;
        i++;
        j--;
        System.out.println(i); // 1
        System.out.println(j); // 9

        int ii = 0;
        System.out.println(ii++); // 0
        System.out.println(ii); // 1

        int iii = 0;
        System.out.println(++iii); // 1
        System.out.println(iii); // 1
    }
}
