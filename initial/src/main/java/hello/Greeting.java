package hello;

public class Greeting {

    private final long id;
    private final String content;
    private final String msg;

    public Greeting(long id, String content, String msg) {
        this.id = id;
        this.content = content;
        this.msg = msg;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getMsg() {
        return msg;
    }
}