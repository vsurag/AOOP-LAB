package jobBoard.model;

public class Application {
    private int applicationId;
    private String applicantName;
    private String jobTitle;
    private Resume resume;

    public Application(int applicationId, String applicantName, String jobTitle, Resume resume) {
        this.applicationId = applicationId;
        this.applicantName = applicantName;
        this.jobTitle = jobTitle;
        this.resume = resume;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Resume getResume() {
        return resume;
    }

    @Override
    public String toString() {
        return "Application [Application ID: " + applicationId + ", Applicant: " + applicantName +
               ", Job Title: " + jobTitle + ", Resume: " + resume + "]";
    }
}
