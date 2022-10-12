package taskExample.models;

import taskExample.enums.REMARK;
import taskExample.enums.Stack;

public class Result {
    private String DevName;
    private String saName;
    private Stack devStack;
    private REMARK remark;
    private String stackBaseScore;
    private String agileBaseScore;
    private String algorithmBaseScore;
    private String totalScore;
    private String averageScore;

    public Result() {
    }

    public Result(String devName, String saName, Stack devStack, REMARK remark, String stackBaseScore,
                  String agileBaseScore, String algorithmBaseScore, String totalScore, String averageScore) {
        DevName = devName;
        this.saName = saName;
        this.devStack = devStack;
        this.remark = remark;
        this.stackBaseScore = stackBaseScore;
        this.agileBaseScore = agileBaseScore;
        this.algorithmBaseScore = algorithmBaseScore;
        this.totalScore = totalScore;
        this.averageScore = averageScore;
    }

    public String getDevName() {
        return DevName;
    }

    public void setDevName(String devName) {
        DevName = devName;
    }

    public String getSaName() {
        return saName;
    }

    public void setSaName(String saName) {
        this.saName = saName;
    }

    public Stack getDevStack() {
        return devStack;
    }

    public void setDevStack(Stack devStack) {
        this.devStack = devStack;
    }

    public REMARK getRemark() {
        return remark;
    }

    public void setRemark(REMARK remark) {
        this.remark = remark;
    }

    public String getStackBaseScore() {
        return stackBaseScore;
    }

    public void setStackBaseScore(String stackBaseScore) {
        this.stackBaseScore = stackBaseScore;
    }

    public String getAgileBaseScore() {
        return agileBaseScore;
    }

    public void setAgileBaseScore(String agileBaseScore) {
        this.agileBaseScore = agileBaseScore;
    }

    public String getAlgorithmBaseScore() {
        return algorithmBaseScore;
    }

    public void setAlgorithmBaseScore(String algorithmBaseScore) {
        this.algorithmBaseScore = algorithmBaseScore;
    }

    public String getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(String totalScore) {
        this.totalScore = totalScore;
    }

    public String getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(String averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return  '\n'+
                "<<<<<<<<<<<<oooo  "+DevName+" Result oooo>>>>>>>>>>>>>>>" +'\n'+
                "  DevName:         " + DevName + '\n' +
                "  SAName:          " + saName + '\n' +
                "  Stack:           " + devStack +'\n'+
                "  Stack Score:     " + stackBaseScore +'\n'+
                "  Agile Score:     " + agileBaseScore +'\n'+
                "  Algorithm Score: " + algorithmBaseScore +'\n'+
                "  Total Score:     "+ totalScore +'\n'+
                "  Average Score:   " + averageScore +'\n'+
                "  remark:          " + remark +'\n'+
                "<<<<<<<<<<<<oooo  "+devStack+" STACK oooo>>>>>>>>>>>>>>>";
    }
}
