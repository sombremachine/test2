import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String firstName;
    private String secondName;
    private String lastName;
    private Date birthDate;
    private String phone;
    private String email;
    private String goal;
    private String workExperience;
    private String education;
    private String additionalEducation;
    private String skills;
    private String codeSample;

    public User(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getAdditionalEducation() {
        return additionalEducation;
    }

    public void setAdditionalEducation(String additionalEducation) {
        this.additionalEducation = additionalEducation;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getCodeSample() {
        return codeSample;
    }

    public void setCodeSample(String codeSample) {
        this.codeSample = codeSample;
    }
}
