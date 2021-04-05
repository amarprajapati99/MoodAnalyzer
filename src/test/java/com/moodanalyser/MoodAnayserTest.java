package com.moodanalyser;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class MoodAnayserTest {
    MoodAnalyAser moodAnalyAser = new MoodAnalyAser();
    @Test
    public  void givenMessgae_whenSad_shouldReturnSad(){
        String mood =  moodAnalyAser.analysisMood();
        Assert.assertEquals("sad" ,mood);

    }
    @Test
    public  void givenMessgae_whenSad_shouldReturnHappy(){
        String mood =  moodAnalyAser.analysisMood();
        Assert.assertEquals("happy" ,mood);

    }
}


