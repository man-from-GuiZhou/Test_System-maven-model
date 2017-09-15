package domain;

public class Question_Lib {
	
	private int question_lib_id;//题库id
	private String testpage_type;//题库类型
	private String testpage_job;//题库对应工作职位
	private int question_num;//题库题目数量
	
	public int getQuestion_num() {
		return question_num; 
	}
	public void setQuestion_num(int question_num) {
		this.question_num = question_num;
	}
	public int getQuestion_lib_id() {
		return question_lib_id;
	}
	public void setQuestion_lib_id(int question_lib_id) {
		this.question_lib_id = question_lib_id;
	}
	public String getTestpage_type() {
		return testpage_type;
	}
	public void setTestpage_type(String testpage_type) {
		this.testpage_type = testpage_type;
	}
	public String getTestpage_job() {
		return testpage_job;
	}
	public void setTestpage_job(String testpage_job) {
		this.testpage_job = testpage_job;
	}
	
}
