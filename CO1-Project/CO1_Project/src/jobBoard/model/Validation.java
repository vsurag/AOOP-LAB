package jobBoard.model;

public class Validation {
    public static boolean validateJobPosting(JobPosting jobPosting) {
        if (jobPosting.getTitle().isEmpty() || jobPosting.getDescription().isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean validateApplication(Application application) {
        if (application.getApplicantName().isEmpty() || application.getJobTitle().isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean validateResume(Resume resume) {
        if (resume.getApplicantName().isEmpty() || resume.getSkills().isEmpty()) {
            return false;
        }
        return true;
    }
}
