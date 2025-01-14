package interface_adapter.get_quote;

public class QuoteState {

    private String author;
    private String content;

    public QuoteState(String author, String content) {
        this.author = author;
        this.content = content;
    }
    public String getAuthor() {
        return author;
    }
    public String getContent() {
        return content;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
