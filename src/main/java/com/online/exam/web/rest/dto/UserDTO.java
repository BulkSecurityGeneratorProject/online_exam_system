package com.online.exam.web.rest.dto;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

public class UserDTO {

    @Pattern(regexp = "^[a-z0-9]*$")
    @NotNull
    @Size(min = 1, max = 50)
    private String login;

    @Pattern(regexp = "^[a-zA-Z0-9]*$")
    @NotNull
    @Size(min = 1, max = 50)
    private String userNo;

    @NotNull
    @Size(min = 5, max = 100)
    private String password;

    private Integer gender;

    private Integer age;

    @Size(max = 15)
    private String phone;

    @Size(max = 50)
    private String classes;

    @Size(max = 150)
    private String avatarUrl;

    @Size(max = 500)
    private String description;

    @Size(max = 50)
    private String firstName;

    @Size(max = 50)
    private String lastName;

    @Email
    @Size(min = 5, max = 100)
    private String email;

    @Size(min = 2, max = 5)
    private String langKey;

    private Integer deleted;

    private List<String> roles;

    public UserDTO() {
    }

    public UserDTO(
        String login,
        String password,
        String firstName,
        String lastName,
        String email,
        String langKey,
        List<String> roles) {

        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.langKey = langKey;
        this.roles = roles;
    }

    public UserDTO(
        String login,
        String userNo,
        String password,
        Integer gender,
        Integer age,
        String phone,
        String classes,
        String avatarUrl,
        String description,
        String firstName,
        String lastName,
        String email,
        String langKey,
        List<String> roles) {

        this.login = login;
        this.userNo = userNo;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.classes = classes;
        this.avatarUrl = avatarUrl;
        this.description = description;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.langKey = langKey;
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public Integer getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getDeleted() {
		return deleted;
	}

	public String getClasses() {
        return classes;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getUserNo() {
        return userNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getLangKey() {
        return langKey;
    }

    public List<String> getRoles() {
        return roles;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
        "login='" + login + '\'' +
        ", userNo='" + userNo + '\'' +
        ", password='" + password + '\'' +
        ", gender='" + gender + '\'' +
        ", age='" + age + '\'' +
        ", phone='" + phone + '\'' +
        ", classes='" + classes + '\'' +
        ", avatarUrl='" + avatarUrl + '\'' +
        ", description='" + description + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", email='" + email + '\'' +
        ", deleted='" + deleted + '\'' +
        ", langKey='" + langKey + '\'' +
        ", roles=" + roles +
        '}';
    }
}
