public class GuGu {

    /*
    public static void main(String[] args) {
        int n = 2; // ok
        
        System.out.println(n*1);
        System.out.println(n*2);
        System.out.println(n*3);
        // n = "123" // error
    }
    */
    /*
    public void dan(int n) { // input n, output void(nothing)
        System.out.println(n * 1);
        System.out.println(n * 2);
        System.out.println(n * 3);
    }
    
    public static void main(String[] args) { // static : not create object
        int n = 3;
        GuGu gugu = new GuGu();
        gugu.dan(n);
    }
    */

    public void dan(int n) {
        for(int i = 1; i<10;i++) {
            System.out.println(n * i);
        }
    }
    public static void main(String[] args) {
        GuGu gugu = new GuGu();
        for(int i= 2; i < 10; i++)
    {
        gugu.dan(i);
    }
    }
}
