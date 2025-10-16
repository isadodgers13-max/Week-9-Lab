package com.example.polls;

import java.util.ArrayList;
import java.util.List;

public class Poll {
    private int id;
    private String question;
    private boolean singleChoice;
    private List<String> answers = new ArrayList<>();

    public Poll(int id, String question, boolean singleChoice) {
        this.id = id;
        this.question = question;
        this.singleChoice = singleChoice;
    }

    public int getId() { return id; }
    public String getQuestion() { return question; }
    public boolean isSingleChoice() { return singleChoice; }
    public List<String> getAnswers() { return answers; }

    public void addAnswer(String answer) {
        answers.add(answer);
    }
}
