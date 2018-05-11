package com.example.roqa7hmed.design;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import  com.example.roqa7hmed.design.QuizContract.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RoQ A7hmed on 24/04/2018.
 */

public class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MyAwesomeQuiz.db";
    private static final int DATABASE_VERSION = 2;

    private SQLiteDatabase db;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE2 = "CREATE TABLE " +
                QuizContract.QuestionsTable2.TABLE_NAME2 + " ( " +
                QuizContract.QuestionsTable2._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable2.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable2.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable2.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable2.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable2.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE3 = "CREATE TABLE " +
                QuizContract.QuestionsTable3.TABLE_NAME3 + " ( " +
                QuizContract.QuestionsTable3._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable3.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable3.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable3.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable3.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable3.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE4 = "CREATE TABLE " +
                QuizContract.QuestionsTable4.TABLE_NAME4 + " ( " +
                QuizContract.QuestionsTable4._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable4.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable4.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable4.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable4.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable4.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE5 = "CREATE TABLE " +
                QuizContract.QuestionsTable5.TABLE_NAME5 + " ( " +
                QuizContract.QuestionsTable5._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable5.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable5.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable5.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable5.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable5.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE2);
        fillQuestionsTable2();
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE3);
        fillQuestionsTable3();
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE4);
        fillQuestionsTable4();
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE5);
        fillQuestionsTable5();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + QuizContract.QuestionsTable2.TABLE_NAME2);
        db.execSQL("DROP TABLE IF EXISTS " + QuizContract.QuestionsTable3.TABLE_NAME3);
        db.execSQL("DROP TABLE IF EXISTS " + QuizContract.QuestionsTable4.TABLE_NAME4);
        db.execSQL("DROP TABLE IF EXISTS " + QuizContract.QuestionsTable5.TABLE_NAME5);
        onCreate(db);
    }

    //insert in database
    private void fillQuestionsTable() {
        Question q1 = new Question("Choose the word most similar to\n( Trustworthy ):", "Reliable", "Relevant", "Resolute", 1);
        addQuestion(q1);
        Question q2 = new Question("Mary, who is sixteen years old,\nis four times as old as her brother. How old will Mary be when she is twice as old as her brother?", "23", "24 ", " 25 ", 2);
        addQuestion(q2);
        Question q3 = new Question("Morning dew is an example of which portion of the water cycle ? ", "Transpiration", "Evaporation", "Condensation", 3);
        addQuestion(q3);
        Question q4 = new Question("If you rearrange the letters\n( CIFAIPC ) you would have the name of a(n):", "City", "Country", "Ocean", 3);
        addQuestion(q4);
        Question q5 = new Question("Choose the number that is\n1/4 of 1/2 of 1/5 of 200", "1", "5", "2", 2);
        addQuestion(q5);
    }

    private void fillQuestionsTable2() {
        //level2
        Question q6 = new Question("At a conference, 12 members shook hands with each other before & after the meeting. How many total number of hand shakes occurred?", "100", "132", "145", 2);
        addQuestion2(q6);
        Question q7 = new Question("The day after the day after tomorrow is four days before Monday. What day is it today?", "Monday", "Friday ", "Thursday ", 1);
        addQuestion2(q7);
        Question q8 = new Question("6121135 is to flame as 21215120 is to ", "voice", "bloat", "castle", 2);
        addQuestion2(q8);
        Question q9 = new Question("Forest is to tree as tree is to ?", "plant", "leaf", "branch", 2);
        addQuestion2(q9);
        Question q10 = new Question("Acids are found in many common chemicals, including foods.\nAcids taste :", "Sour", "Sweet", "Salty", 1);
        addQuestion2(q10);
    }
    private void fillQuestionsTable3() {
        //level3
        Question q11 = new Question("The preserved remains of once-living organisms are called :", "Fossils", "Mitochondria", "Geodes", 1);
        addQuestion3(q11);
        Question q12 = new Question("Bacteria cells have four parts : 1- the cell wall , 2- ribosomes , 3- cell membrane ", "Nucleus", "Chromosomes ", " Vacuoles ", 2);
        addQuestion3(q12);
        Question q13 = new Question("A virtual image always appears ? ", "Upside down", "Upright", "Larger", 2);
        addQuestion3(q13);
        Question q14 = new Question("Secondary waves can't travel through ?", "Plasmas", "Gases", "Liquids", 3);
        addQuestion3(q14);
        Question q15 = new Question("Under blue light, a tomato will look ?", "Red", "Blue", "Black", 3);
        addQuestion3(q15);
    }
    private void fillQuestionsTable4() {
        //level4
        Question q16 = new Question("The buildup of charges on an object is known as ?", "Static Electricity", "Static Discharge", "Positive Charge", 1);
        addQuestion4(q16);
        Question q17 = new Question("What was the launch  date of Apollo 11", "June 16 1970", "June 16 1969 ", " July 16 1969 ", 3);
        addQuestion4(q17);
        Question q18 = new Question("In what year was Windows 3.1x first sold?", "1992", "1993", "1994", 1);
        addQuestion4(q18);
        Question q19 = new Question("What is sciophobia the fear of", "Shadows", "Society", "Dark", 1);
        addQuestion4(q19);
        Question q20 = new Question("How many sides does a Heptagon have ?", "11", "5", "7", 3);
        addQuestion4(q20);
    }
    private void fillQuestionsTable5() {
        //level5
        Question q21 = new Question("What year did the Ford Model T begin production ?", "1894", "1904", "1908", 3);
        addQuestion5(q21);
        Question q22 = new Question("What is the national currency of China?", "Peso", "Krone ", " Yuan ", 3);
        addQuestion5(q22);
        Question q23 = new Question("What is the largest country in the world ? ", "Russia", "India", "China", 1);
        addQuestion5(q23);
        Question q24 = new Question("What is the plural of octopus", "Octopuses", "Octopa", "Octopi", 3);
        addQuestion5(q24);
        Question q25 = new Question("What is the real value of x in the equation log2(24)-log2(3) = log5(x)", "125", "186", "137", 1);
        addQuestion5(q25);
    }
    //insert new table in database
    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuizContract.QuestionsTable.TABLE_NAME, null, cv);
    }
    private void addQuestion2(Question question) {
        //table 2
        ContentValues cv2 = new ContentValues();
        cv2.put(QuizContract.QuestionsTable2.COLUMN_QUESTION, question.getQuestion());
        cv2.put(QuizContract.QuestionsTable2.COLUMN_OPTION1, question.getOption1());
        cv2.put(QuizContract.QuestionsTable2.COLUMN_OPTION2, question.getOption2());
        cv2.put(QuizContract.QuestionsTable2.COLUMN_OPTION3, question.getOption3());
        cv2.put(QuizContract.QuestionsTable2.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuizContract.QuestionsTable2.TABLE_NAME2, null, cv2);
    }
    private void addQuestion3(Question question) {

        //table 3
        ContentValues cv3 = new ContentValues();
        cv3.put(QuizContract.QuestionsTable3.COLUMN_QUESTION, question.getQuestion());
        cv3.put(QuizContract.QuestionsTable3.COLUMN_OPTION1, question.getOption1());
        cv3.put(QuizContract.QuestionsTable3.COLUMN_OPTION2, question.getOption2());
        cv3.put(QuizContract.QuestionsTable3.COLUMN_OPTION3, question.getOption3());
        cv3.put(QuizContract.QuestionsTable3.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuizContract.QuestionsTable3.TABLE_NAME3, null, cv3);
    }
    private void addQuestion4(Question question) {
        //table 4
        ContentValues cv4 = new ContentValues();
        cv4.put(QuizContract.QuestionsTable4.COLUMN_QUESTION, question.getQuestion());
        cv4.put(QuizContract.QuestionsTable4.COLUMN_OPTION1, question.getOption1());
        cv4.put(QuizContract.QuestionsTable4.COLUMN_OPTION2, question.getOption2());
        cv4.put(QuizContract.QuestionsTable4.COLUMN_OPTION3, question.getOption3());
        cv4.put(QuizContract.QuestionsTable4.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuizContract.QuestionsTable4.TABLE_NAME4, null, cv4);
    }
        //table 5
        private void addQuestion5(Question question) {
        ContentValues cv5 = new ContentValues();
        cv5.put(QuizContract.QuestionsTable5.COLUMN_QUESTION, question.getQuestion());
        cv5.put(QuizContract.QuestionsTable5.COLUMN_OPTION1, question.getOption1());
        cv5.put(QuizContract.QuestionsTable5.COLUMN_OPTION2, question.getOption2());
        cv5.put(QuizContract.QuestionsTable5.COLUMN_OPTION3, question.getOption3());
        cv5.put(QuizContract.QuestionsTable5.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuizContract.QuestionsTable5.TABLE_NAME5, null, cv5);
    }

    public List<Question> getAllQuestions() {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<Question> getAllQuestions2() {
        List<Question> questionList2 = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuizContract.QuestionsTable2.TABLE_NAME2, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuizContract.QuestionsTable2.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuizContract.QuestionsTable2.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuizContract.QuestionsTable2.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuizContract.QuestionsTable2.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuizContract.QuestionsTable2.COLUMN_ANSWER_NR)));
                questionList2.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList2;
    }
    public List<Question> getAllQuestions3() {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuizContract.QuestionsTable3.TABLE_NAME3, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuizContract.QuestionsTable3.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuizContract.QuestionsTable3.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuizContract.QuestionsTable3.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuizContract.QuestionsTable3.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuizContract.QuestionsTable3.COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
    public List<Question> getAllQuestions4() {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuizContract.QuestionsTable4.TABLE_NAME4, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuizContract.QuestionsTable4.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuizContract.QuestionsTable4.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuizContract.QuestionsTable4.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuizContract.QuestionsTable4.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuizContract.QuestionsTable4.COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
    public List<Question> getAllQuestions5() {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuizContract.QuestionsTable5.TABLE_NAME5, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuizContract.QuestionsTable5.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuizContract.QuestionsTable5.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuizContract.QuestionsTable5.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuizContract.QuestionsTable5.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuizContract.QuestionsTable5.COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}
