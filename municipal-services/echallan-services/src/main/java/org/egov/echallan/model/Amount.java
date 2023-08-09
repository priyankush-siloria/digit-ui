/*
 * eChallan System
 * ### API Specs For eChallan System ### 1. Generate the new challan. 2. Update the details of existing challan 3. Search the existing challan 4. Generate the demand and bill for the challan amount so that collection can be done in online and offline mode. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@egovernments.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.egov.echallan.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import org.egov.common.contract.response.ResponseInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.SafeHtml;

import javax.validation.constraints.Min;

/**
 * Capture the challan amount details
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-10T16:46:24.044+05:30[Asia/Calcutta]")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Amount {

  @JsonProperty("taxHeadCode")
  @SafeHtml
  private String taxHeadCode = null;

  @JsonProperty("amount")
  @Min(value = 0L, message = "The amount must be positive")
  private BigDecimal amount = null;
  public Amount taxHeadCode(String taxHeadCode) {
    this.taxHeadCode = taxHeadCode;
    return this;
  }

  

}
