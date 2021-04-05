package com.moodanalyser;
/* @Description- Mood analysis test in this we check mood is happy or sad */
public class MoodAnalyAser {
    private String message;

    public String MoodAnalyAser(String message) {
        this.message = message;
        return  analysisMood();
    }
/* @Description - in this we can throw the exception and catch the exception */
    public String analysisMood() {
        try {
            if (message.contains("Sad"))
            return "sad";
            else
                return "happy";
        } catch (Exception e) {
            return "happy";

        }
    }

}
