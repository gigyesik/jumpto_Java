import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
public class practice_question {
    public static void main(String[] args) {
        // Q1
        int korean = 80;
        int english = 75;
        int math = 55;
        int aver = (korean + english + math) / 3;
        System.out.println(aver); // 70

        // Q2
        System.out.println(13%2); // 1

        // Q3
        String hong = "881120-1068234";
        String birth = hong.substring(0, 6);
        String remain = hong.substring(7, 14);
        System.out.println(birth); // 881120
        System.out.println(remain); // 1068234

        // Q4
        String pin = "881120-1068234";
        System.out.println(pin.charAt(7)); // 1

        // Q5
        String a = "a:b:c:d";
        System.out.println(a.replace(":", "#")); // a#b#c#d

        // Q6
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        myList.sort(Comparator.naturalOrder());
        System.out.println(myList); // [1, 2, 3, 4, 5]

        // Q7
        ArrayList<String> myList2 = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ", myList2);
        System.out.println(result); // Life is too short

        // Q8
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        grade.remove("B");
        System.out.println(grade); // {A=90, C=70}

        // Q9
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5));
        HashSet<Integer> result2 = new HashSet<>(numbers);
        System.out.println(result2); // [1,2,3,4,5]
    }
*/
        // Q10


public class practice_question {
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };
    static void printCoffeePrice(CoffeeType type) {
        HashMap<CoffeeType, Integer> pricemap = new HashMap<>();
        pricemap.put(CoffeeType.AMERICANO, 3000);
        pricemap.put(CoffeeType.ICE_AMERICANO, 4000);
        pricemap.put(CoffeeType.CAFE_LATTE, 5000);
        int price = pricemap.get(type);
        System.out.println(String.format("price is %d", price));
    }

    public static void main(String[] args) {
        printCoffeePrice(CoffeeType.AMERICANO);
        // printCoffeePrice(99);
    }
}


    

