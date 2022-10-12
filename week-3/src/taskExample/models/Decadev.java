package taskExample.models;

import taskExample.enums.REMARK;
import taskExample.enums.Stack;

public class Decadev {
    private static Integer idCount =0;
    private Integer id = this.setId();
    private String name;
    private Stack stack;
    private Double StackBaseScore;
    private Double agileBaseScore;
    private Double algorithmBaseScore;
    private REMARK remark;

    public Decadev() {
    }

    public Decadev(String name, Stack stack, Double stackBaseScore,
                   Double agileBaseScore, Double algorithmBaseScore) {
        this.name = name;
        this.stack = stack;
        StackBaseScore = stackBaseScore;
        this.agileBaseScore = agileBaseScore;
        this.algorithmBaseScore = algorithmBaseScore;
    }

    public Double averageScoreCalculate() {
        return (this.getAgileBaseScore()+this.getAlgorithmBaseScore()+this.getStackBaseScore())/3.0;
    }

    public Double totalScoreCalculate() {
        return (this.getAgileBaseScore()+this.getAlgorithmBaseScore()+this.getStackBaseScore());
    }

    public REMARK generateGrade() {
        Double aveScore = averageScoreCalculate();
        if(aveScore>=90.1 && aveScore<100.00) {
            this.remark = REMARK.EXCELLENT;
        } else if(aveScore>=70.1 && aveScore<90.00) {
            this.remark = REMARK.GOOD;
        } else if(aveScore>=60.1 && aveScore<70.00) {
            this.remark = REMARK.AVERAGE;
        } else if(aveScore>=0.00 && aveScore<=60.00) {
            this.remark = REMARK.POOR;
        } else {
            this.remark = REMARK.WRONGSCORE;
        }
        return this.remark;
    }

    public Integer getId() {
        return id;
    }

    public int setId() {
        return this.id = idCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }

    public Double getStackBaseScore() {
        return StackBaseScore;
    }

    public void setStackBaseScore(Double stackBaseScore) {
        StackBaseScore = stackBaseScore;
    }

    public Double getAgileBaseScore() {
        return agileBaseScore;
    }

    public void setAgileBaseScore(Double agileBaseScore) {
        this.agileBaseScore = agileBaseScore;
    }

    public Double getAlgorithmBaseScore() {
        return algorithmBaseScore;
    }

    public void setAlgorithmBaseScore(Double algorithmBaseScore) {
        this.algorithmBaseScore = algorithmBaseScore;
    }

    public REMARK getRemark() {
        return remark;
    }





    @Override
    public String toString() {
        return "Decadev (" +
                "Id:= " + id +
                ", Name:= '" + name + '\'' +
                ", Stack:= " + stack +
                ", Stack Score:= " + StackBaseScore +
                ", Agile Score:= " + agileBaseScore +
                ", Algorithm Score:= " + algorithmBaseScore +
                ", Grade:= " + this.generateGrade() +
                ", Total Score:= "+Math.floor(this.totalScoreCalculate())+
                ", Average Score:= "+Math.floor(this.averageScoreCalculate())+
                ')';
    }
}
