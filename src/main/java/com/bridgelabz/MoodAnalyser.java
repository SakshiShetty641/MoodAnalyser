package com.bridgelabz;
/**
 * Purpose - To implement mood analyser program by handling custom exceptions
 * @author - Sakshi Shetty
 * @version - 16.0
 * @since - 2021-08-29
 */
public class MoodAnalyser {
    enum s
    {
        S1
    }
    public static String analyseMood(String message) throws MoodAnalysisExceptions {
        try {
            if (message.contains("sad"))
                return "sad";
            else
                return "Happy";
        } catch (NullPointerException e) {
            throw new MoodAnalysisExceptions("Invalid Message");
        }
    }
    }


