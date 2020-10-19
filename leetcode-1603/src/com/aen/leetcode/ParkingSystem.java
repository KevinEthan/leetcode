package com.aen.leetcode;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Title: {@link com.aen.leetcode}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@126.com
 * @date 20-10-19 下午4:48
 */
public class ParkingSystem {
    private Map<Integer, Integer> map = new HashMap<>();

    private int big;
    private int medium;
    private int small;


    public ParkingSystem(int big, int medium, int small) {
//        map.put(1, big);
//        map.put(2, medium);
//        map.put(3, small);
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (big > 0) {
                    --big;
                    return true;
                }
                break;
            case 2:
                if (medium > 0) {
                    --medium;
                    return true;
                }
                break;
            case 3:
                if (small > 0) {
                    --small;
                    return true;
                }
                break;
        }
        return false;
    }

//    public boolean addCar(int carType) {
//        Integer integer = map.get(carType);
//        if (integer > 0) {
//            map.put(carType, integer-1);
//            return true;
//        }
//        return false;
//    }


}
