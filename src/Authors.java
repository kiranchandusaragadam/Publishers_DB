public class Authors {
    private String auId;
    private String auFName;
    private String auLName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private int contract;

    public Authors(String auId, String auFName, String auLName, String phone, String address, String city, String state, String zip, int contract) {
        this.auId = auId;
        this.auFName = auFName;
        this.auLName = auLName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.contract = contract;
    }

    public String getAuId() {
        return auId;
    }

    public void setAuId(String auId) {
        this.auId = auId;
    }

    public String getAuFName() {
        return auFName;
    }

    public void setAuFName(String auFName) {
        this.auFName = auFName;
    }

    public String getAuLName() {
        return auLName;
    }

    public void setAuLName(String auLName) {
        this.auLName = auLName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getContract() {
        return contract;
    }

    public void setContract(int contract) {
        this.contract = contract;
    }
}
