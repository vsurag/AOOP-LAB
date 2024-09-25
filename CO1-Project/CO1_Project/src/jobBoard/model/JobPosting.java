package jobBoard.model;

public class JobPosting {
    private int jobId;
    private String company;
    private String title;
    private String description;
    private boolean isActive;

    public JobPosting(int jobId, String company, String title, String description, boolean isActive) {
        this.jobId = jobId;
        this.company = company;
        this.title = title;
        this.description = description;
        this.isActive = isActive;
    }

    public int getJobId() {
        return jobId;
    }

    public String getCompany() {
        return company;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "JobPosting [Job ID: " + jobId + ", Company: " + company + ", Title: " + title + 
               ", Description: " + description + ", Active: " + isActive + "]";
    }
}
