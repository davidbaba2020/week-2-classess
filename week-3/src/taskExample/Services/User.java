package taskExample.Services;

public class User implements Comparable<User> {

        private Integer score;

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        @Override
        public int compareTo(User o) {
            return this.getScore() - o.getScore();
        }

    @Override
    public String toString() {
        return "User{" +
                "score=" + score +
                '}';
    }
}