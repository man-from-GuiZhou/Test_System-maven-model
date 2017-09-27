package dao;

import domain.Question;

import java.util.ArrayList;

public interface QuestionDao {
    public Question findQuestionById(int id);
    public void addQuestion(Question question);
    public void removeQuestion(int id);
    public void updateQuestion(Question question);
    public ArrayList<? extends Question> getQuestionList(int lib_Id);
}
