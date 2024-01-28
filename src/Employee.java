import java.util.Date;

public class Employee {
    private String empId;
    private String FName;
    private String LName;
    private String minit;
    private int jobId;
    private int jobLvl;
    private String pubId;
    private Date hireDate;

    public Employee(String empId, String FName, String LName, String minit, int jobId, int jobLvl, String pubId, Date hireDate) {
        this.empId = empId;
        this.FName = FName;
        this.LName = LName;
        this.minit = minit;
        this.jobId = jobId;
        this.jobLvl = jobLvl;
        this.pubId = pubId;
        this.hireDate = hireDate;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getMinit() {
        return minit;
    }

    public void setMinit(String minit) {
        this.minit = minit;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public int getJobLvl() {
        return jobLvl;
    }

    public void setJobLvl(int jobLvl) {
        this.jobLvl = jobLvl;
    }

    public String getPubId() {
        return pubId;
    }

    public void setPubId(String pubId) {
        this.pubId = pubId;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
