package taskExample.models;

import taskExample.Services.SAInterface;
import taskExample.enums.REMARK;
import taskExample.enums.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SARATING implements SAInterface {
    private String sAName;
    private Stack stack;

    public SARATING() {
    }

    public SARATING(String sAName, Stack stack) {
        this.sAName = sAName;
        this.stack = stack;
    }

    public String getsAName() {
        return sAName;
    }

    public void setsAName(String sAName) {
        this.sAName = sAName;
    }

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }


    @Override
    public String toString() {
        return "SARATING[" +
                "sAName:= '" + sAName + '\'' +
                ", stack:= " + stack +
                ']';
    }

    @Override
    public Result generateDevResult(Decadev dev) {
        Result result = new Result();
            result.setDevName(dev.getName());
            result.setSaName(this.sAName);
            result.setDevStack(dev.getStack());
            result.setAgileBaseScore(String.valueOf(dev.getAgileBaseScore()));
            result.setStackBaseScore(String.valueOf(dev.getStackBaseScore()));
            result.setAlgorithmBaseScore(String.valueOf(dev.getAlgorithmBaseScore()));
            result.setTotalScore(String.valueOf(dev.totalScoreCalculate()));
            result.setAverageScore(String.valueOf(dev.averageScoreCalculate()));
            result.setRemark(dev.getRemark());
        return result;
    }

    @Override
    public List<Result> generateDevsResults(List<Decadev> allDevs) {

            List<Result> allDevResult;
        if(allDevs instanceof LinkedList<Decadev>) {
            allDevResult = new LinkedList<>();
        } else {
            allDevResult = new ArrayList<>();
        }
        for (Decadev dev : allDevs) {
            allDevResult.add(generateDevResult(dev));
//            Result result = new Result();
//            result.setDevName(dev.getName());
//            result.setSaName(this.sAName);
//            result.setDevStack(dev.getStack());
//            result.setAgileBaseScore(String.valueOf(dev.getAgileBaseScore()));
//            result.setStackBaseScore(String.valueOf(dev.getStackBaseScore()));
//            result.setAlgorithmBaseScore(String.valueOf(dev.getAlgorithmBaseScore()));
//            result.setTotalScore(String.valueOf(dev.totalScoreCalculate()));
//            result.setAverageScore(String.valueOf(dev.averageScoreCalculate()));
//            result.setRemark(dev.getRemark());
//            allDevResult.add(result);
        }

        return allDevResult;
    }
}
