package jobBoard.model;

public class Resume {
    private int resumeId;
    private String applicantName;
    private String skills;
    private String experience;

    public Resume(int resumeId, String applicantName, String skills, String experience) {
        this.resumeId = resumeId;
        this.applicantName = applicantName;
        this.skills = skills;
        this.experience = experience;
    }

    public int getResumeId() {
        return resumeId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getSkills() {
        return skills;
    }

    public String getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Resume [Resume ID: " + resumeId + ", Applicant: " + applicantName +
               ", Skills: " + skills + ", Experience: " + experience + "]";
    }
}
