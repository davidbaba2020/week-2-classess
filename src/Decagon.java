import resources.Decadev;
import resources.Result;
import resources.examples.Grade;

import java.util.List;

public class Decagon {
    private List<Decadev> allDevs;
    private List<Staff> staffs;

    public Decagon(List<Decadev> allDevs, List<Staff> staffs) {
        this.allDevs = allDevs;
        this.staffs = staffs;
    }

    public Decagon() {
    }

    public List<Decadev> getAllDevs() {
        return allDevs;
    }

    public void setAllDevs(List<Decadev> allDevs) {
        this.allDevs = allDevs;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }

    public Result weeklyTask(Decadev decadev) {

        String msg = "";
            Result result = new Result();
        if(decadev.getScore() >= 60) {
            msg = "You passed";
            result.setGrade(Grade.A);
            result.setSaRemark(msg);
        } else {
            msg = "Sorry you have to give it a try again";
            result.setGrade(Grade.F);
            result.setSaRemark(msg);
        }
        return result;
    }


    @Override
    public String toString() {
        return "Decagon{" +
                "allDevs=" + allDevs +
                ", staffs=" + staffs +
                '}';
    }
}
