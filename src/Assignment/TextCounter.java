package Assignment;


public class TextCounter {

    private boolean Stopp;
    private int characterCount;
    private int rowCount;

    public TextCounter(){

        characterCount = 0;
        rowCount = 0;
    }

    public int getNumberOfCharacters() {
        return characterCount;
    }

    public int getNumberOfRows() {
        return rowCount;
    }

    public void addRows() {
        rowCount = rowCount + 1;
    }

    public void addCharacters(String Characters) {
        characterCount = characterCount + Characters.length();
    }

    public void endWord(String Stopped) {
       if (Stopped.equals("Stop")) {
           Stopp = false;
           //Signalera att vi sak stoppa
       } else {
           Stopp = true;
           //fortsätt som vanligt
       }
    }

    public boolean getEndWord() {
        return Stopp;
    }
}
