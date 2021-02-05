package transcript;

public class course {

    private String code;
    private String title;
    private int credit;
    private double mark;

    public course() {}

    public course(String code, String title, double mark) {
        this.code = code;
        this.title = title;
        this.mark = mark;
    }

    public course(String code, String title, int credit, double mark) {
        this.code = code;
        this.title = title;
        this.credit = credit;
        this.mark = mark;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getCredit() {
        return credit;
    }

    public double getMark() {
        return mark;
    }
}
