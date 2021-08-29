package com.bridgelabz;
/**
 * Purpose - To implement mood analyser program by handling custom exceptions
 * @author - Sakshi Shetty
 * @version - 16.0
 * @since - 2021-08-29
 */
public class MoodAnalyser {
    public static String analyseMood(String message) {
        if (message.contains("sad"))
            return "sad";
        else
            return "Happy";
    }
}

