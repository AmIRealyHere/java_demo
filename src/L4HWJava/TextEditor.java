package L4HWJava;

public class TextEditor {
    public StringBuilder text;
    public TextEditor() {
        text = new StringBuilder();
    }

    public void addText(String newText) {
        text.append(newText);
    }

    public void printCurrentText() {
        System.out.println("Current Text: " + text.toString());
    }
}