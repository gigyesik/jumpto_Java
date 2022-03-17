import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int sum = 0;
    int avg(int[] data) {
        int cm = data.length;
        for (int i = 0; i < cm; i++) {
            sum += data[i];
        }
        return sum / cm;       
    }

    int getValue() {
        return this.value;
    }
}

public class practice_Q4 {
    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9};
        Calculator cal = new Calculator();
        int result = cal.avg(data);
        System.out.println(result);  // 5
    }
}    

