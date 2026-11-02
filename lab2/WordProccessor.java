package lab2;

/**
 * Implementation of the Counter interface with fall-back text support.
 */
public class WordProccessor implements Counter {

    private String text;

    public WordProccessor() {
        this.text = "";
    }

    public WordProccessor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * Helper method to determine which text string to evaluate.
     * Uses fall-back 'text' attribute if passed parameter is null.
     */
    private String resolveText(String sentence) {
        return (sentence != null) ? sentence : this.text;
    }

    @Override
    public int countWords(String sentence) {
        String target = resolveText(sentence);
        if (target == null || target.trim().isEmpty()) {
            return 0;
        }
        String[] words = target.trim().split("\\s+");
        return words.length;
    }

    @Override
    public int countLetters(String sentence) {
        String target = resolveText(sentence);
        if (target == null) {
            return 0;
        }
        int letters = 0;
        for (int i = 0; i < target.length(); i++) {
            if (Character.isLetter(target.charAt(i))) {
                letters++;
            }
        }
        return letters;
    }

    @Override
    public int getLength(String sentence) {
        String target = resolveText(sentence);
        return (target != null) ? target.length() : 0;
    }
}