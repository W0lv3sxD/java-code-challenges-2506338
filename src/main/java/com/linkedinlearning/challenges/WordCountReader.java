package com.linkedinlearning.challenges;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCountReader {
    int words;
    int characters;
    int charactersExcludingSpaces;

    public WordCountReader() {
    }

    public WordCountReader(int words, int characters, int charactersExcludingSpaces) {
        this.words = words;
        this.characters = characters;
        this.charactersExcludingSpaces = charactersExcludingSpaces;
    }

    public String readFile(String file) {
        Path path = Paths.get(file);
        try {
            String content = Files.readString(path);
            setWords(countWords(content));
            setCharacters(countCharacters(content));
            setCharactersExcludingSpaces(countCharactersWithoutSpaces(content));
            return content;
        } catch (IOException e) {
            System.out.println("Unable to find file");
            return null;
        }
    }

    private int countWords(String content) {
        String[] array = content.split("\\s+");
        return array.length;
    }

    private int countCharacters(String content) {
        return content.length() - 1;
    }

    private int countCharactersWithoutSpaces(String content) {
        int characterWithoutSpacesCounter = 0;

        for (int i = 0; i < content.length(); i++) {
            if (content.charAt(i) != ' ') {
                characterWithoutSpacesCounter++;
            }
        }
        return characterWithoutSpacesCounter - 1;
    }

    public int getWords() {
        return words;
    }

    public int getCharacters() {
        return characters;
    }

    public int getCharactersExcludingSpaces() {
        return charactersExcludingSpaces;
    }

    private void setWords(int words) {
        this.words = words;
    }

    private void setCharacters(int characters) {
        this.characters = characters;
    }

    private void setCharactersExcludingSpaces(int charactersExcludingSpaces) {
        this.charactersExcludingSpaces = charactersExcludingSpaces;
    }
}
