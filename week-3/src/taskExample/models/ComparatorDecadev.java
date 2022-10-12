package taskExample.models;

import taskExample.enums.Stack;

import java.util.Comparator;

public class ComparatorDecadev extends Decadev implements Comparator<Decadev> {


    public ComparatorDecadev() {
    }

    public ComparatorDecadev(String name, Stack stack, Double stackBaseScore, Double agileBaseScore, Double algorithmBaseScore) {
        super(name, stack, stackBaseScore, agileBaseScore, algorithmBaseScore);
    }



    @Override
    public String toString() {
        return "Comparable Decadev {" + super.toString()+"}";
    }


    @Override
    public int compare(Decadev o1, Decadev o2) {
//        return o1.getName().compareTo(o2.getName());
//        return o1.getId().compareTo(o2.getId());
//        return o1.generateGrade().compareTo(o2.generateGrade());
//        return o1.totalScoreCalculate().compareTo(o2.totalScoreCalculate());
//        return o1.getStackBaseScore().compareTo(o2.getStackBaseScore());
//        return o1.getAgileBaseScore().compareTo(o2.getAgileBaseScore());
        return o1.averageScoreCalculate().compareTo(o2.averageScoreCalculate());
    }
}
