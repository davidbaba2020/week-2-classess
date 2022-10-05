package resources;

import resources.examples.Grade;

public class Result {
    private Grade grade;
    private String saRemark;

    public Result(Grade grade, String saRemark) {
        this.grade = grade;
        this.saRemark = saRemark;
    }

    public Result() {
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getSaRemark() {
        return saRemark;
    }

    public void setSaRemark(String saRemark) {
        this.saRemark = saRemark;
    }

    @Override
    public String toString() {
        return "Result{" +
                "grade=" + grade +
                ", saRemark='" + saRemark + '\'' +
                '}';
    }
}
