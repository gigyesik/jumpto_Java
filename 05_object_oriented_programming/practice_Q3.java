class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    boolean isOdd() {
        if (this.value % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    int getValue() {
        return this.value;
    }
}

public class practice_Q3 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(50);
        System.out.println(cal.isOdd()); // false
        cal.add(1);
        System.out.println(cal.isOdd()); // true
    }
}
