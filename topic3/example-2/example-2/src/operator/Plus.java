package operator;

import interfaces.Operator;

public class Plus implements Operator {

    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
    
}
