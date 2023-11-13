package com.linkedinlearning.challenges;

public class WordWrapper {
    int zeilenlänge;

    public WordWrapper(int zeilenlänge) {
        this.zeilenlänge = zeilenlänge;
    }

    public String wrap(String text) {
        String[] wörter = text.split(" ");
        String newText = "";
        String currentLine = "";
        for (String wort : wörter) {
            if (currentLine.length() + wort.length() > zeilenlänge) {
                newText += currentLine.trim() + "\n";
                currentLine = "";
            }
            currentLine += wort + " ";
        }
        newText += currentLine.trim();
        return newText;
    }
}