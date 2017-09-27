package serviceImpl;

import dao.QuestionDao;
import domain.Question;
import service.QuestionService;

import java.util.ArrayList;

public class QuestionServiceImpl implements QuestionService {

    private QuestionDao qd;

    private void daoInit(){
        //this.qd = Class.forName()
    }

    @Override
    public void removeQuestion(int id) {
        qd.removeQuestion(id);
    }

    @Override
    public Question findQuestionById(int id) {
        return qd.findQuestionById(id);
    }

    @Override
    public ArrayList<? extends Question> findQuestionList(int lib_Id) {
        return null;
    }

    @Override
    public void addQuestion(int lib_Id, int question_Score, String... questionContent) {

    }

    @Override
    public void updateQuestion(int lib_Id, int question_Score, String... questionContent) {

    }
}
