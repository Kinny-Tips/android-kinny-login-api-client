/**
 * Login API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.kinny.login.models;

import io.kinny.login.models.ApiError;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BaseResponse {
  
  @SerializedName("apiError")
  private ApiError apiError = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ApiError getApiError() {
    return apiError;
  }
  public void setApiError(ApiError apiError) {
    this.apiError = apiError;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseResponse baseResponse = (BaseResponse) o;
    return (this.apiError == null ? baseResponse.apiError == null : this.apiError.equals(baseResponse.apiError));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.apiError == null ? 0: this.apiError.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseResponse {\n");
    
    sb.append("  apiError: ").append(apiError).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
