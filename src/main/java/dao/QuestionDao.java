package dao;

import domain.Question;

import java.util.ArrayList;

public interface QuestionDao {
    public Question findQuestionById(int id);
    public void addQuestion(Question question);
    public void removeQuestion(Question question);
    public void updateQuestion(Question question);
    public ArrayList<Question> getQuestionList(int lib_Id);
}
