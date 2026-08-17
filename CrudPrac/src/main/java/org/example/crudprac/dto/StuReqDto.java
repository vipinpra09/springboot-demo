package org.example.crudprac.dto;

import jakarta.validation.constraints.NotBlank;

public class StuReqDto {
    @NotBlank(message = "FirstName can't be empty")
    private String firstName;

    @NotBlank(message = "FirstName can't be empty")
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {

    }

}
