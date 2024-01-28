public class PubInfo {
    private String pubId;
    private String image;
    private String prInfo;

    public PubInfo(String pubId, String image, String prInfo) {
        this.pubId = pubId;
        this.image = image;
        this.prInfo = prInfo;
    }

    public String getPubId() {
        return pubId;
    }

    public void setPubId(String pubId) {
        this.pubId = pubId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrInfo() {
        return prInfo;
    }

    public void setPrInfo(String prInfo) {
        this.prInfo = prInfo;
    }
}
