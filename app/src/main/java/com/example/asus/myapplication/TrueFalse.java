package com.example.asus.myapplication;

/**
 * Created by asus on 04.12.2016.
 */

public class TrueFalse {
    private String QuestionText;
    private Boolean isTrue;

    public TrueFalse(String questionText, Boolean isTrue) {
        QuestionText = questionText;
        this.isTrue = isTrue;
    }

    public String getQuestionText() {
        return QuestionText;
    }

    public Boolean getTrue() {
        return isTrue;
    }

   // public void setQuestionText(String questionText) {
   //     QuestionText = questionText;
   // }

   // public void setTrue(Boolean aTrue) {
    //    isTrue = aTrue;
   // }
}