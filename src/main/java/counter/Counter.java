package counter;


/**
 * Step 1: Counter interface contract.
 * An interface defines a set of operations that classes must provide.
 * Methods declared in an interface have no body and are implicitly public and abstract.
 */
public interface Counter {


    /**
     * Counts the number of words in the given sentence.
     *
     * @param sentence the input string to analyze
     * @return the number of words in the sentence
     */
    int countWords(String sentence);


    /**
     * Counts the alphabetic letters in the given sentence,
     * ignoring spaces, digits and punctuation.
     *
     * @param sentence the input string to analyze
     * @return the total number of alphabetic letters
     */
    int countLetters(String sentence);


    /**
     * Returns the total character length of the given sentence,
     * including spaces.
     *
     * @param sentence the input string to analyze
     * @return the total number of characters in the sentence
     */
    int getLength(String sentence);


}