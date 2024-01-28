public class RoySched {
    private String titleId;
    private int loRange;
    private int hiRange;
    private int royalty;

    public RoySched(String titleId, int loRange, int hiRange, int royalty) {
        this.titleId = titleId;
        this.loRange = loRange;
        this.hiRange = hiRange;
        this.royalty = royalty;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public int getLoRange() {
        return loRange;
    }

    public void setLoRange(int loRange) {
        this.loRange = loRange;
    }

    public int getHiRange() {
        return hiRange;
    }

    public void setHiRange(int hiRange) {
        this.hiRange = hiRange;
    }

    public int getRoyalty() {
        return royalty;
    }

    public void setRoyalty(int royalty) {
        this.royalty = royalty;
    }
}
