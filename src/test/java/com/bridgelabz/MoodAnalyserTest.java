package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
/**
 * Purpose - To perform mood analyser test cases
 * @author - Sakshi Shetty
 */
public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser = new MoodAnalyser();

    //Method to test if the mood is sad
    @Test
    public void whenTestedMood_ifIamInSadMood_shouldReturnSad() {
        String mood = moodAnalyser.analyseMood("I am in sad Mood");
        Assert.assertEquals("sad",mood);
    }

    //Method to test if the mood is happy
    @Test
    public void whenTestedMood_ifHappy_shouldReturnHappy() {
        String mood = moodAnalyser.analyseMood("Happy Days");
        Assert.assertEquals("Happy",mood);
    }

    //Method to test if the no mood is given
    @Test
    public void whenTestedMood_ifNotInAnyMood_shouldReturnHappy() {
        String mood = moodAnalyser.analyseMood("Iam in any mood");
        Assert.assertEquals("Happy",mood);
    }
    @Test
    public void whenTested_ifNull_shouldReturnHAPPY() {
        String mood = moodAnalyser.analyseMood(null);
        Assert.assertEquals("HAPPY",mood);
    }
}