class Calculator {
    Integer value = 0;

    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}


public class practice_Q6 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(3);  
        System.out.println(cal.getValue());
    }
}