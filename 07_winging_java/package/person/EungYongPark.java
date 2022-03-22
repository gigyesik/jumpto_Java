package house.person; // different package

import house.HousePark;

public class EungYongPark extends HousePark { // inherit
    public static void main(String[] args) {
        EungYongPark eyp = new EungYongPark();
        System.out.println(eyp.lastname); // park
    }
}
