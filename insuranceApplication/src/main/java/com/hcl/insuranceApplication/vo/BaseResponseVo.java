package com.hcl.insuranceApplication.vo;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BaseResponseVo
{
  private StatusVo status;
  public StatusVo getStatus() { return this.status; }
  public void setStatus(StatusVo status) { this.status = status; }
}
