/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workerfile;

/**
 *
 * @author Julie Kegler
 */
public class Employee {
    Integer idNumber;
    String firstName;
    String lastName;
    String birthDate;
    String additionalInfo;
    
    public Employee() {
    Integer idNumber;
    firstName = null;
    lastName = null;
    birthDate = null;
    additionalInfo = null;
    }
    public Employee(String first, String last, String birth, String info, int num) {
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
