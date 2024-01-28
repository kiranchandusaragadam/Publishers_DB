public class TitleAuthor {
    private String auId;
    private String titleId;
    private int auOrd;
    private int royaltyPer;

    public TitleAuthor(String auId, String titleId, int auOrd, int royaltyPer) {
        this.auId = auId;
        this.titleId = titleId;
        this.auOrd = auOrd;
        this.royaltyPer = royaltyPer;
    }

    public String getAuId() {
        return auId;
    }

    public void setAuId(String auId) {
        this.auId = auId;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public int getAuOrd() {
        return auOrd;
    }

    public void setAuOrd(int auOrd) {
        this.auOrd = auOrd;
    }

    public int getRoyaltyPer() {
        return royaltyPer;
    }

    public void setRoyaltyPer(int royaltyPer) {
        this.royaltyPer = royaltyPer;
    }
}
