package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return new Operation<Integer>() {
            @Override
            public List<Integer> apply(List<Integer> arg) {
                List<Integer> temp = new ArrayList<>();
                for (Integer num : arg) {
                    temp.add(num / divider);
                }
                return temp;
            }

        };
    }
}
