package resources;

public class Decadev {
    private Integer score;
    private  String name;

    public Decadev(Integer score, String name) {
        this.score = score;
        this.name = name;
    }

    public Decadev() {
    }

    public Integer getScore() {

        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Decadev{" +
                "score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
