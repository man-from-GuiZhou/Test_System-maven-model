package dao.impl;

import dao.QuestionDao;
import domain.Question;
import domain.Subjective_question;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Subjective_QuestionDao implements QuestionDao {

    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;

    @Override
    public Question findQuestionById(int id) {
        return null;
    }

    @Override
    public void addQuestion(Question question) {

    }

    @Override
    public void removeQuestion(int id) {

    }

    @Override
    public void updateQuestion(Question question) {

    }

    @Override
    public ArrayList<? extends Question> getQuestionList(int lib_Id) {
        String sql = "select * from subjective_question" ;
        conn= JDBCUtils.getConnection();
        ArrayList<Subjective_question> subjective_questions = new ArrayList<Subjective_question>();
        try {
            conn= JDBCUtils.getConnection();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Subjective_question tempQuestion = new Subjective_question();
            while(rs.next()){
                tempQuestion.setQuestion_id(rs.getInt(1));
                tempQuestion.setQuestion_lib_id(rs.getInt(2));
                tempQuestion.setQuestion_content(rs.getString(3));
                tempQuestion.setQuestion_answer(rs.getString(4));
                tempQuestion.setQuestion_score(rs.getInt(5));
                subjective_questions.add(tempQuestion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return subjective_questions;
    }
}
