
package counter;

/**
 * WordProcessor implementation of the Counter interface.
 */
public class WordProcessor implements Counter {

    // Encapsulated fallback text
    private String text = "";

    /**
     * Gets the stored fallback text.
     *
     * @return the stored text
     */
    public String getText() {
        return this.text;
    }

    /**
     * Updates the stored fallback text.
     *
     * @param text the new fallback text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Counts the number of words in a sentence.
     *
     * @param sentence the input sentence
     * @return the number of words
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
     * Counts alphabetic letters in a sentence.
     *
     * @param sentence the input sentence
     * @return the number of alphabetic letters
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
     * Gets the total character length of a sentence.
     *
     * @param sentence the input sentence
     * @return the total character length
     */
    @Override
    public int getLength(String sentence) {
        if (sentence == null) {
            sentence = this.text;
        }

        return sentence.length();
    }
}
