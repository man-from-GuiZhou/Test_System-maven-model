package service;

import domain.Question;

import java.util.ArrayList;
/*
题目操作接口
 */
public interface QuestionService {
    public void removeQuestion(int id);
    public Question findQuestionById(int id);
    public ArrayList<Question> findQuestionList(int lib_Id);
    /*
    这里针对题目类型采用可变参数，根据参数的数量可以让接口适应于不同的题目类型
     */
    public void addQuestion(int lib_Id,int question_Score,String...questionContent);
    public void updateQuestion(int lib_Id,int question_Score,String...questionContent);
}
