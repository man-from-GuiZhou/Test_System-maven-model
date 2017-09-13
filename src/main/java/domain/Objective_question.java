package domain;

public class Objective_question {
	
	private int question_id;//题目id
	private int question_lib_id;//题库id
	private String question_content;//题目内容
	private String answer_a;//选项a，下列同
	private String answer_b;
	private String answer_c;
	private String answer_d;
	private char question_answer;//题目答案
	private int question_score;//题目分数
	
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
	public String getQuestion_content() {
		return question_content;
	}
	public void setQuestion_content(String question_content) {
		this.question_content = question_content;
	}
	public String getAnswer_a() {
		return answer_a;
	}
	public void setAnswer_a(String answer_a) {
		this.answer_a = answer_a;
	}
	public String getAnswer_b() {
		return answer_b;
	}
	public void setAnswer_b(String answer_b) {
		this.answer_b = answer_b;
	}
	public String getAnswer_c() {
		return answer_c;
	}
	public void setAnswer_c(String answer_c) {
		this.answer_c = answer_c;
	}
	public String getAnswer_d() {
		return answer_d;
	}
	public void setAnswer_d(String answer_d) {
		this.answer_d = answer_d;
	}
	public char getQuestion_answer() {
		return question_answer;
	}
	public void setQuestion_answer(char question_answer) {
		this.question_answer = question_answer;
	}
	public int getQuestion_score() {
		return question_score;
	}
	public void setQuestion_score(int question_score) {
		this.question_score = question_score;
	}
}
