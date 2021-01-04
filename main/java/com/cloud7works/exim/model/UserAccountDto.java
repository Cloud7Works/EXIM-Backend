package com.cloud7works.exim.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;


/**
 * UserAccountDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-01T19:16:31.836Z[GMT]")


public class UserAccountDto   {
  @JsonProperty("userAccountId")
  private Long userAccountId = null;

  @JsonProperty("userName")
  private String userName = null;

  public UserAccountDto userAccountId(Long userAccountId) {
    this.userAccountId = userAccountId;
    return this;
  }

  /**
   * Get userAccountId
   * @return userAccountId
   **/
    public Long getUserAccountId() {
    return userAccountId;
  }

  public void setUserAccountId(Long userAccountId) {
    this.userAccountId = userAccountId;
  }

  public UserAccountDto userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
   **/
    public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccountDto userAccountDto = (UserAccountDto) o;
    return Objects.equals(this.userAccountId, userAccountDto.userAccountId) &&
        Objects.equals(this.userName, userAccountDto.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAccountId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccountDto {\n");
    
    sb.append("    userAccountId: ").append(toIndentedString(userAccountId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
