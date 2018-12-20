/*
 * @auhor Raheem Hampton
 * @version 12/20/2018
 */
package workerfile;

/**
 *
 * @author Julie Kegler
 */
public class Manager {
    
    Integer idNumber;
    String firstName;
    String lastName;
    String birthDate;
    String additionalInfo;
    
    public Manager() {
    Integer idNumber = 0;
    firstName = null;
    lastName = null;
    birthDate = null;
    additionalInfo = null;
    }
    public Manager(String first, String last, String birth, String info, int num) {
    Integer idNum = num;
    firstName = first;
    lastName = last;
    birthDate = birth;
    additionalInfo = info;
    }
    
    public void setIDNumber(Integer num) {
        idNumber = num;
    }
    public void setFirstName(String firstN) {
        firstName = firstN;
    }
    public void setLastName(String lastN) {
        lastName = lastN;
    }
    public void setBirthDate(String birthD) {
        birthDate = birthD;
    }
    public void setAdditionalInfo(String addInfo) {
        additionalInfo = addInfo;
    }
    
    public Integer getIDNumber() {
        return idNumber;
    }
    public String getFistName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public String getAdditionalInfo() {
        return additionalInfo;
    }
    @Override 
    public String toString() {
        return 
        "First Name: " + firstName + "\n" +
        "Last Name: " + lastName + "\n" +
        "Birth Date: " + birthDate + "\n" +
        "Additional Info: " + additionalInfo;
    }
}
