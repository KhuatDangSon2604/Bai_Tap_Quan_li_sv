
package QLSV;


public class score {
    private Integer student_id;
    private Integer course_id;
    private Integer major_id;
    private float score;
    private String descp;

    public score(Integer student_id, Integer course_id, Integer major_id, float score, String descp) {
        this.student_id = student_id;
        this.course_id = course_id;
        this.major_id = major_id;
        this.score = score;
        this.descp = descp;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public Integer getMajor_id() {
        return major_id;
    }

    public String getDescp() {
        return descp;
    }

    public float getScore() {
        return score;
    }
    
    
}
