package com.cloud7works.exim.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * UserAccountRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-01T19:16:31.836Z[GMT]")


public class UserAccountRequest   {
  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("challengeQuestion")
  private String challengeQuestion = null;

  @JsonProperty("challangeAnswer")
  private String challangeAnswer = null;

  public UserAccountRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
   **/
    @NotNull
    public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserAccountRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
    @NotNull
    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserAccountRequest challengeQuestion(String challengeQuestion) {
    this.challengeQuestion = challengeQuestion;
    return this;
  }

  /**
   * Get challengeQuestion
   * @return challengeQuestion
   **/
    @NotNull
    public String getChallengeQuestion() {
    return challengeQuestion;
  }

  public void setChallengeQuestion(String challengeQuestion) {
    this.challengeQuestion = challengeQuestion;
  }

  public UserAccountRequest challangeAnswer(String challangeAnswer) {
    this.challangeAnswer = challangeAnswer;
    return this;
  }

  /**
   * Get challangeAnswer
   * @return challangeAnswer
   **/
    @NotNull
    public String getChallangeAnswer() {
    return challangeAnswer;
  }

  public void setChallangeAnswer(String challangeAnswer) {
    this.challangeAnswer = challangeAnswer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccountRequest userAccountRequest = (UserAccountRequest) o;
    return Objects.equals(this.userName, userAccountRequest.userName) &&
        Objects.equals(this.password, userAccountRequest.password) &&
        Objects.equals(this.challengeQuestion, userAccountRequest.challengeQuestion) &&
        Objects.equals(this.challangeAnswer, userAccountRequest.challangeAnswer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, password, challengeQuestion, challangeAnswer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccountRequest {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    challengeQuestion: ").append(toIndentedString(challengeQuestion)).append("\n");
    sb.append("    challangeAnswer: ").append(toIndentedString(challangeAnswer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
