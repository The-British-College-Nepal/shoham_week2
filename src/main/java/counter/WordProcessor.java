package counter;

/**
 * WordProcessor implementation of the Counter interface.
 */
public class WordProcessor implements Counter {

    // Step 3: Encapsulated fallback state
    private String text = "";

    /**
     * Gets the stored text.
     *
     * @return the stored text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the stored text.
     *
     * @param text the text to store
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Counts the number of words in the given sentence.
     * Words are separated by single spaces.
     * If sentence is null, uses the stored text.
     *
     * @param sentence input string to analyse
     * @return number of words
     */
    @Override
    public int countWords(String sentence) {
        if (sentence == null) {
            sentence = this.text;
        }

        if (sentence.isEmpty()) {
            return 0;
        }

        return sentence.split(" ").length;
    }

    /**
     * Counts alphabetic letters only, ignoring spaces, punctuation, and digits.
     * If sentence is null, uses the stored text.
     *
     * @param sentence input string to analyse
     * @return count of alphabetic letters
     */
    @Override
    public int countLetters(String sentence) {
        if (sentence == null) {
            sentence = this.text;
        }

        int letters = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            }
        }

        return letters;
    }

    /**
     * Returns the total character length of the sentence, including spaces.
     * If sentence is null, uses the stored text.
     *
     * @param sentence input string to analyse
     * @return total length
     */
    @Override
    public int getLength(String sentence) {
        if (sentence == null) {
            sentence = this.text;
        }

        return sentence.length();
    }
}