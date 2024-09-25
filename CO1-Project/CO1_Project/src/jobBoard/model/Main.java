package jobBoard;

import jobBoard.model.Application;
import jobBoard.model.JobPosting;
import jobBoard.model.Resume;
import jobBoard.model.Validation;

public class Main {
    public static void main(String[] args) {
        // Creating job postings
        JobPosting job1 = new JobPosting(1, "Tech Corp", "Software Developer", "Develop and maintain software", true);
        JobPosting job2 = new JobPosting(2, "Business Inc", "Project Manager", "Manage multiple projects", false);

        // Validate job postings
        if (Validation.validateJobPosting(job1)) {
            System.out.println("Job 1 is valid: " + job1);
        } else {
            System.out.println("Job 1 is invalid.");
        }

        if (Validation.validateJobPosting(job2)) {
            System.out.println("Job 2 is valid: " + job2);
        } else {
            System.out.println("Job 2 is invalid.");
        }

        // Creating resumes
        Resume resume1 = new Resume(1, "Alice", "Java, Spring Boot", "5 years in software development");
        Resume resume2 = new Resume(2, "Bob", "", "3 years in project management");

        // Validate resumes
        if (Validation.validateResume(resume1)) {
            System.out.println("Resume 1 is valid: " + resume1);
        } else {
            System.out.println("Resume 1 is invalid.");
        }

        if (Validation.validateResume(resume2)) {
            System.out.println("Resume 2 is valid: " + resume2);
        } else {
            System.out.println("Resume 2 is invalid.");
        }

        // Creating applications
        Application application1 = new Application(1, "Alice", "Software Developer", resume1);
        Application application2 = new Application(2, "Bob", "Project Manager", resume2);

        // Validate applications
        if (Validation.validateApplication(application1)) {
            System.out.println("Application 1 is valid: " + application1);
        } else {
            System.out.println("Application 1 is invalid.");
        }

        if (Validation.validateApplication(application2)) {
            System.out.println("Application 2 is valid: " + application2);
        } else {
            System.out.println("Application 2 is invalid.");
        }
    }
}
