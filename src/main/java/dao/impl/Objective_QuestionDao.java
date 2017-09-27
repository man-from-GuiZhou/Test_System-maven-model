package dao.impl;

import dao.QuestionDao;
import domain.Objective_question;
import domain.Question;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Objective_QuestionDao implements QuestionDao {

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
        String sql = "select * from objective_question";
        ArrayList<Objective_question> questions = new ArrayList<Objective_question>();
        try {
            conn= JDBCUtils.getConnection();
            pst = conn.prepareStatement(sql);
            rs=pst.executeQuery();
            int count = 0;
            Objective_question tempObjective = new Objective_question();
            while(rs.next()){
            tempObjective.setQuestion_id(rs.getInt(1));
            tempObjective.setQuestion_lib_id(rs.getInt(2));
            tempObjective.setQuestion_content(rs.getString(3));
            tempObjective.setAnswer_a(rs.getString(4));
            tempObjective.setAnswer_b(rs.getString(5));
            tempObjective.setAnswer_c(rs.getString(6));
            tempObjective.setAnswer_d(rs.getString(7));
            tempObjective.setQuestion_answer(rs.getString(8).toCharArray()[0]);
            questions.add(tempObjective);
            }
            JDBCUtils.release(conn,pst,rs);
            return questions;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
