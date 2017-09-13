package domain;

public class Question_Lib {
	
	private int question_lib_id;//题库id
	private short testpage_type;//试卷类型
	private String testpage_job;//试卷对应工作职位
	
	public int getQuestion_lib_id() {
		return question_lib_id;
	}
	public void setQuestion_lib_id(int question_lib_id) {
		this.question_lib_id = question_lib_id;
	}
	public short getTestpage_type() {
		return testpage_type;
	}
	public void setTestpage_type(short testpage_type) {
		this.testpage_type = testpage_type;
	}
	public String getTestpage_job() {
		return testpage_job;
	}
	public void setTestpage_job(String testpage_job) {
		this.testpage_job = testpage_job;
	}
	
}
