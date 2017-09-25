package domain;

public class question {

    private int question_id;//题目id
    private int question_lib_id;//题库id
    private int question_score;//题目分数
    private String question_content;//题目内容

    public String getQuestion_content() {
        return question_content;
    }

    public void setQuestion_content(String question_content) {
        this.question_content = question_content;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public int getQuestion_lib_id() {
        return question_lib_id;
    }

    public void setQuestion_lib_id(int question_lib_id) {
        this.question_lib_id = question_lib_id;
    }

    public int getQuestion_score() {
        return question_score;
    }

    public void setQuestion_score(int question_score) {
        this.question_score = question_score;
    }
}
