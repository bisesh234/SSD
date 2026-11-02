package lab2;

/**
 * Interface defining word and letter counting operations for sentences.
 */
public interface Counter {

    /**
     * Counts the total number of words in a sentence.
     * 
     * @param sentence the input text to analyze
     * @return number of words present
     */
    int countWords(String sentence);

    /**
     * Counts the total number of alphabetic letters in a sentence.
     * 
     * @param sentence the input text to analyze
     * @return count of letters excluding spaces, digits, and punctuation
     */
    int countLetters(String sentence);

    /**
     * Calculates the total character length of a sentence, including spaces.
     * 
     * @param sentence the input text to analyze
     * @return length of the input sentence
     */
    int getLength(String sentence);
}