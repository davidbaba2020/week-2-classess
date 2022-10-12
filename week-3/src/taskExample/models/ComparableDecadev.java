package taskExample.models;

import taskExample.enums.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparableDecadev extends Decadev implements Comparable<Decadev> {


    public ComparableDecadev() {
    }

    public ComparableDecadev(String name, Stack stack, Double stackBaseScore, Double agileBaseScore, Double algorithmBaseScore) {
        super(name, stack, stackBaseScore, agileBaseScore, algorithmBaseScore);
    }



    @Override
    public String toString() {
        return "Comparable Decadev {" + super.toString()+"}";
    }


    @Override
    public int compareTo(Decadev o) {
//        return this.getId() - o.getId();
        return (int) (o.averageScoreCalculate() - this.averageScoreCalculate());
    }


    private static List<ComparableDecadev> getAllDevsBaseOnComparableDefined() {
        List<ComparableDecadev> list = new ArrayList<>(Arrays.asList(

        ));
        return list;
    }
}
