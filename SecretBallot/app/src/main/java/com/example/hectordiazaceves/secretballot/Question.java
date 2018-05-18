package com.example.hectordiazaceves.secretballot;

public class Question {

    //Private variables

    private String sQuestion;
    private String[] sArrOptions;


    //Constructors

    public Question(){

        this.sQuestion = "";
        this.sArrOptions = new String[]{""};
    }

    public Question(String s, String[] sArr){
        this.sQuestion = s;
        this.sArrOptions = sArr;
    }

    public String getQuestion(){
        return sQuestion;
    }

    public void setQuestion(String s){
        sQuestion = s;
    }

    public void setOptions(String[] options){

        this.sArrOptions = options;

    }

    public String[] getOptions(){

        return sArrOptions;

    }




}
