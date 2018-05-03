package com.jiuqu.cloud.entity.svdm;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author:jzh
 * @Description:SvdmBusinessUnit实体类
 * @Date: 19:17 2018/1/9/009
 */


@Entity
@Table(name = "svdm_business_unit" )
public class SvdmBusinessUnitEntity {
  private int id;
  private String unitName;
  private String unitAs;
  private String unitCode;
  private String unitAddress;
  private String unitPostCode;
  private String unitType;
  private String unitParentUnit;
  private String unitTransportScope;
  private String unitCorporateName;
  private String unitCorporatePhone;
  private String unitContactPersonName;
  private String unitContactPersonPhone;
  private String unitSafeModeSummary;
  private String isCreateMonitorPlatform;
  private String isExclusiveParking;
  private String isExclusiveTrainingVenues;
  private String jurisdictionUnit;
  private String jurisdictionPolice;
  private Date jurisdictionStartTime;
  private Integer passengerCarNumber; 
  private Integer busNumber;
  private Integer dangerousCarNumber;
  private Integer freightCarNumber;
  private Integer othersCarNumber;
  private Integer freightCarDriverNumber;
  private Integer busDriverNumber;
  private Integer dangerousCarDriverNumber;
  private Integer passengerCarDriverNumber;
  private Integer othersCarDriverNumber;
  private String transportCarOperation;
  private String transportSecurityRisks;
  private String remark;
  private Date createTime;
  private Integer createUserId;
  private String createUserName;
  private Integer createDepartmentId;
  private String createDepartmentName;
  private Integer modifyUserId;
  private String modifyUserName;
  private Integer modifyDepartmentId;
  private String modifyDepartmentName;
  private Date modifyTime;
  private Integer isVerify;
  private String unitPermitNumber;
  private String province;
  private String city;
  private String district;
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
  @Basic
  @Column(name = "unit_name")
  public String getUnitName() {
    return unitName;
  }

  public void setUnitName(String unitName) {
    this.unitName = unitName;
  }
  @Basic
  @Column(name = "unit_as")
  public String getUnitAs() {
    return unitAs;
  }

  public void setUnitAs(String unitAs) {
    this.unitAs = unitAs;
  }
  @Basic
  @Column(name = "unit_code")
  public String getUnitCode() {
    return unitCode;
  }

  public void setUnitCode(String unitCode) {
    this.unitCode = unitCode;
  }
  @Basic
  @Column(name = "unit_address")
  public String getUnitAddress() {
    return unitAddress;
  }

  public void setUnitAddress(String unitAddress) {
    this.unitAddress = unitAddress;
  }
  @Basic
  @Column(name = "unit_post_code")
  public String getUnitPostCode() {
    return unitPostCode;
  }

  public void setUnitPostCode(String unitPostCode) {
    this.unitPostCode = unitPostCode;
  }
  @Basic
  @Column(name = "unit_type")
  public String getUnitType() {
    return unitType;
  }

  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }
  @Basic
  @Column(name = "unit_parent_unit")
  public String getUnitParentUnit() {
    return unitParentUnit;
  }

  public void setUnitParentUnit(String unitParentUnit) {
    this.unitParentUnit = unitParentUnit;
  }
  @Basic
  @Column(name = "unit_transport_scope")
  public String getUnitTransportScope() {
    return unitTransportScope;
  }

  public void setUnitTransportScope(String unitTransportScope) {
    this.unitTransportScope = unitTransportScope;
  }

  @Basic
  @Column(name = "unit_corporate_name")
  public String getUnitCorporateName() {
    return unitCorporateName;
  }

  public void setUnitCorporateName(String unitCorporateName) {
    this.unitCorporateName = unitCorporateName;
  }
  @Basic
  @Column(name = "unit_corporate_phone")
  public String getUnitCorporatePhone() {
    return unitCorporatePhone;
  }

  public void setUnitCorporatePhone(String unitCorporatePhone) {
    this.unitCorporatePhone = unitCorporatePhone;
  }
  @Basic
  @Column(name = "unit_contact_person_name")
  public String getUnitContactPersonName() {
    return unitContactPersonName;
  }

  public void setUnitContactPersonName(String unitContactPersonName) {
    this.unitContactPersonName = unitContactPersonName;
  }
  @Basic
  @Column(name = "unit_contact_person_phone")
  public String getUnitContactPersonPhone() {
    return unitContactPersonPhone;
  }

  public void setUnitContactPersonPhone(String unitContactPersonPhone) {
    this.unitContactPersonPhone = unitContactPersonPhone;
  }
  @Basic
  @Column(name = "unit_safe_mode_summary")
  public String getUnitSafeModeSummary() {
    return unitSafeModeSummary;
  }

  public void setUnitSafeModeSummary(String unitSafeModeSummary) {
    this.unitSafeModeSummary = unitSafeModeSummary;
  }
  @Basic
  @Column(name = "is_create_monitor_platform")
  public String getIsCreateMonitorPlatform() {
    return isCreateMonitorPlatform;
  }

  public void setIsCreateMonitorPlatform(String isCreateMonitorPlatform) {
    this.isCreateMonitorPlatform = isCreateMonitorPlatform;
  }
  @Basic
  @Column(name = "is_exclusive_parking")
  public String getIsExclusiveParking() {
    return isExclusiveParking;
  }

  public void setIsExclusiveParking(String isExclusiveParking) {
    this.isExclusiveParking = isExclusiveParking;
  }
  @Basic
  @Column(name = "is_exclusive_training_venues")
  public String getIsExclusiveTrainingVenues() {
    return isExclusiveTrainingVenues;
  }

  public void setIsExclusiveTrainingVenues(String isExclusiveTrainingVenues) {
    this.isExclusiveTrainingVenues = isExclusiveTrainingVenues;
  }
  @Basic
  @Column(name = "jurisdiction_unit")
  public String getJurisdictionUnit() {
    return jurisdictionUnit;
  }

  public void setJurisdictionUnit(String jurisdictionUnit) {
    this.jurisdictionUnit = jurisdictionUnit;
  }
  @Basic
  @Column(name = "jurisdiction_police")
  public String getJurisdictionPolice() {
    return jurisdictionPolice;
  }

  public void setJurisdictionPolice(String jurisdictionPolice) {
    this.jurisdictionPolice = jurisdictionPolice;
  }
  @Basic
  @Column(name = "jurisdiction_start_time")
  public Date getJurisdictionStartTime() {
    return jurisdictionStartTime;
  }

  public void setJurisdictionStartTime(Date jurisdictionStartTime) {
    this.jurisdictionStartTime = jurisdictionStartTime;
  }
  @Basic
  @Column(name = "passenger_car_number")
  public Integer getPassengerCarNumber() {
    return passengerCarNumber;
  }

  public void setPassengerCarNumber(Integer passengerCarNumber) {
    this.passengerCarNumber = passengerCarNumber;
  }
  @Basic
  @Column(name = "bus_number")
  public Integer getBusNumber() {
    return busNumber;
  }

  public void setBusNumber(Integer busNumber) {
    this.busNumber = busNumber;
  }
  @Basic
  @Column(name = "dangerous_car_number")
  public Integer getDangerousCarNumber() {
    return dangerousCarNumber;
  }

  public void setDangerousCarNumber(Integer dangerousCarNumber) {
    this.dangerousCarNumber = dangerousCarNumber;
  }
  @Basic
  @Column(name = "freight_car_number")
  public Integer getFreightCarNumber() {
    return freightCarNumber;
  }

  public void setFreightCarNumber(Integer freightCarNumber) {
    this.freightCarNumber = freightCarNumber;
  }
  @Basic
  @Column(name = "others_car_number")
  public Integer getOthersCarNumber() {
    return othersCarNumber;
  }

  public void setOthersCarNumber(Integer othersCarNumber) {
    this.othersCarNumber = othersCarNumber;
  }
  @Basic
  @Column(name = "freight_car_driver_number")
  public Integer getFreightCarDriverNumber() {
    return freightCarDriverNumber;
  }

  public void setFreightCarDriverNumber(Integer freightCarDriverNumber) {
    this.freightCarDriverNumber = freightCarDriverNumber;
  }
  @Basic
  @Column(name = "bus_driver_number")
  public Integer getBusDriverNumber() {
    return busDriverNumber;
  }

  public void setBusDriverNumber(Integer busDriverNumber) {
    this.busDriverNumber = busDriverNumber;
  }
  @Basic
  @Column(name = "dangerous_car_driver_number")
  public Integer getDangerousCarDriverNumber() {
    return dangerousCarDriverNumber;
  }

  public void setDangerousCarDriverNumber(Integer dangerousCarDriverNumber) {
    this.dangerousCarDriverNumber = dangerousCarDriverNumber;
  }
  @Basic
  @Column(name = "passenger_car_driver_number")
  public Integer getPassengerCarDriverNumber() {
    return passengerCarDriverNumber;
  }

  public void setPassengerCarDriverNumber(Integer passengerCarDriverNumber) {
    this.passengerCarDriverNumber = passengerCarDriverNumber;
  }
  @Basic
  @Column(name = "others_car_driver_number")
  public Integer getOthersCarDriverNumber() {
    return othersCarDriverNumber;
  }

  public void setOthersCarDriverNumber(Integer othersCarDriverNumber) {
    this.othersCarDriverNumber = othersCarDriverNumber;
  }
  @Basic
  @Column(name = "transport_car_operation")
  public String getTransportCarOperation() {
    return transportCarOperation;
  }

  public void setTransportCarOperation(String transportCarOperation) {
    this.transportCarOperation = transportCarOperation;
  }
  @Basic
  @Column(name = "transport_security_risks")
  public String getTransportSecurityRisks() {
    return transportSecurityRisks;
  }

  public void setTransportSecurityRisks(String transportSecurityRisks) {
    this.transportSecurityRisks = transportSecurityRisks;
  }
  @Basic
  @Column(name = "remark")
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }
  @Basic
  @Column(name = "create_time")
  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
  @Basic
  @Column(name = "create_user_id")
  public Integer getCreateUserId() {
    return createUserId;
  }

  public void setCreateUserId(Integer createUserId) {
    this.createUserId = createUserId;
  }
  @Basic
  @Column(name = "create_user_name")
  public String getCreateUserName() {
    return createUserName;
  }

  public void setCreateUserName(String createUserName) {
    this.createUserName = createUserName;
  }
  @Basic
  @Column(name = "create_department_id")
  public Integer getCreateDepartmentId() {
    return createDepartmentId;
  }

  public void setCreateDepartmentId(Integer createDepartmentId) {
    this.createDepartmentId = createDepartmentId;
  }
  @Basic
  @Column(name = "create_department_name")
  public String getCreateDepartmentName() {
    return createDepartmentName;
  }

  public void setCreateDepartmentName(String createDepartmentName) {
    this.createDepartmentName = createDepartmentName;
  }
  @Basic
  @Column(name = "modify_user_id")
  public Integer getModifyUserId() {
    return modifyUserId;
  }

  public void setModifyUserId(Integer modifyUserId) {
    this.modifyUserId = modifyUserId;
  }
  @Basic
  @Column(name = "modify_user_name")
  public String getModifyUserName() {
    return modifyUserName;
  }

  public void setModifyUserName(String modifyUserName) {
    this.modifyUserName = modifyUserName;
  }
  @Basic
  @Column(name = "modify_department_id")
  public Integer getModifyDepartmentId() {
    return modifyDepartmentId;
  }

  public void setModifyDepartmentId(Integer modifyDepartmentId) {
    this.modifyDepartmentId = modifyDepartmentId;
  }
  @Basic
  @Column(name = "modify_department_name")
  public String getModifyDepartmentName() {
    return modifyDepartmentName;
  }

  public void setModifyDepartmentName(String modifyDepartmentName) {
    this.modifyDepartmentName = modifyDepartmentName;
  }
  @Basic
  @Column(name = "modify_time")
  public Date getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(Date modifyTime) {
    this.modifyTime = modifyTime;
  }
  @Basic
  @Column(name = "is_verify")
  public Integer getIsVerify() {
    return isVerify;
  }

  public void setIsVerify(Integer isVerify) {
    this.isVerify = isVerify;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    SvdmBusinessUnitEntity that = (SvdmBusinessUnitEntity) o;

    if (id != that.id) return false;
    if (unitName != null ? !unitName.equals(that.unitName) : that.unitName != null) return false;
    if (unitCode != null ? !unitCode.equals(that.unitCode) : that.unitCode != null) return false;
    if (unitAddress != null ? !unitAddress.equals(that.unitAddress) : that.unitAddress != null) return false;
    if (unitPostCode != null ? !unitPostCode.equals(that.unitPostCode) : that.unitPostCode != null) return false;
    if (unitType != null ? !unitType.equals(that.unitType) : that.unitType != null) return false;
    if (unitAs != null ? !unitAs.equals(that.unitAs) : that.unitAs != null) return false;
    if (unitPermitNumber != null ? !unitPermitNumber.equals(that.unitPermitNumber) : that.unitPermitNumber != null) return false;
    if (province != null ? !province.equals(that.province) : that.province != null) return false;
    if (city != null ? !city.equals(that.city) : that.city != null) return false;
    if (district != null ? !district.equals(that.district) : that.district != null) return false;
    if (unitParentUnit != null ? !unitParentUnit.equals(that.unitParentUnit) : that.unitParentUnit != null) return false;
    if (unitTransportScope != null ? !unitTransportScope.equals(that.unitTransportScope) : that.unitTransportScope != null) return false;
    if (unitSafeModeSummary != null ? !unitSafeModeSummary.equals(that.unitSafeModeSummary) : that.unitSafeModeSummary != null) return false;
    if (isCreateMonitorPlatform != null ? !isCreateMonitorPlatform.equals(that.isCreateMonitorPlatform) : that.isCreateMonitorPlatform != null) return false;
    if (isExclusiveParking != null ? !isExclusiveParking.equals(that.isExclusiveParking) : that.isExclusiveParking != null) return false;
    if (isExclusiveTrainingVenues != null ? !isExclusiveTrainingVenues.equals(that.isExclusiveTrainingVenues) : that.isExclusiveTrainingVenues != null) return false;
    if (jurisdictionUnit != null ? !jurisdictionUnit.equals(that.jurisdictionUnit) : that.jurisdictionUnit != null) return false;
    if (jurisdictionPolice != null ? !jurisdictionPolice.equals(that.jurisdictionPolice) : that.jurisdictionPolice != null) return false;
    if (jurisdictionStartTime != null ? !jurisdictionStartTime.equals(that.jurisdictionStartTime) : that.jurisdictionStartTime != null) return false;
    if (passengerCarNumber != null ? !passengerCarNumber.equals(that.passengerCarNumber) : that.passengerCarNumber != null) return false;
    if (busNumber != null ? !busNumber.equals(that.busNumber) : that.busNumber != null) return false;
    if (dangerousCarNumber != null ? !dangerousCarNumber.equals(that.dangerousCarNumber) : that.dangerousCarNumber != null) return false;
    if (freightCarNumber != null ? !freightCarNumber.equals(that.freightCarNumber) : that.freightCarNumber != null) return false;
    if (othersCarNumber != null ? !othersCarNumber.equals(that.othersCarNumber) : that.othersCarNumber != null) return false;
    if (freightCarDriverNumber != null ? !freightCarDriverNumber.equals(that.freightCarDriverNumber) : that.freightCarDriverNumber != null) return false;
    if (busDriverNumber != null ? !busDriverNumber.equals(that.busDriverNumber) : that.busDriverNumber != null) return false;
    if (dangerousCarDriverNumber != null ? !dangerousCarDriverNumber.equals(that.dangerousCarDriverNumber) : that.dangerousCarDriverNumber != null) return false;
    if (passengerCarDriverNumber != null ? !passengerCarDriverNumber.equals(that.passengerCarDriverNumber) : that.passengerCarDriverNumber != null) return false;
    if (othersCarDriverNumber != null ? !othersCarDriverNumber.equals(that.othersCarDriverNumber) : that.othersCarDriverNumber != null) return false;
    if (transportCarOperation != null ? !transportCarOperation.equals(that.transportCarOperation) : that.transportCarOperation != null) return false;
    if (transportSecurityRisks != null ? !transportSecurityRisks.equals(that.transportSecurityRisks) : that.transportSecurityRisks != null) return false;
    if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
    if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
    if (createUserId != null ? !createUserId.equals(that.createUserId) : that.createUserId != null) return false;
    if (createUserName != null ? !createUserName.equals(that.createUserName) : that.createUserName != null) return false;
    if (createDepartmentId != null ? !createDepartmentId.equals(that.createDepartmentId) : that.createDepartmentId != null) return false;
    if (createDepartmentName != null ? !createDepartmentName.equals(that.createDepartmentName) : that.createDepartmentName != null) return false;
    if (modifyUserId != null ? !modifyUserId.equals(that.modifyUserId) : that.modifyUserId != null) return false;
    if (modifyUserName != null ? !modifyUserName.equals(that.modifyUserName) : that.modifyUserName != null) return false;
    if (modifyDepartmentId != null ? !modifyDepartmentId.equals(that.modifyDepartmentId) : that.modifyDepartmentId != null) return false;
    if (modifyDepartmentName != null ? !modifyDepartmentName.equals(that.modifyDepartmentName) : that.modifyDepartmentName != null) return false;
    if (modifyTime != null ? !modifyTime.equals(that.modifyTime) : that.modifyTime != null) return false;
    if (unitCorporateName != null ? !unitCorporateName.equals(that.unitCorporateName) : that.unitCorporateName != null) return false;
    if (unitCorporatePhone != null ? !unitCorporatePhone.equals(that.unitCorporatePhone) : that.unitCorporatePhone != null) return false;
    if (unitContactPersonName != null ? !unitContactPersonName.equals(that.unitContactPersonName) : that.unitContactPersonName != null) return false;
    if (unitContactPersonPhone != null ? !unitContactPersonPhone.equals(that.unitContactPersonPhone) : that.unitContactPersonPhone != null) return false;
    if (isVerify != null ? !isVerify.equals(that.isVerify) : that.isVerify != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (unitName != null ? unitName.hashCode() : 0);
    result = 31 * result + (unitCode != null ? unitCode.hashCode() : 0);
    result = 31 * result + (unitAddress != null ? unitAddress.hashCode() : 0);
    result = 31 * result + (unitPostCode != null ? unitPostCode.hashCode() : 0);
    result = 31 * result + (unitType != null ? unitType.hashCode() : 0);
    result = 31 * result + (unitAs != null ? unitAs.hashCode() : 0);
    result = 31 * result + (unitPermitNumber != null ? unitPermitNumber.hashCode() : 0);
    result = 31 * result + (province != null ? province.hashCode() : 0);
    result = 31 * result + (city != null ? city.hashCode() : 0);
    result = 31 * result + (district != null ? district.hashCode() : 0);
    result = 31 * result + (unitParentUnit != null ? unitParentUnit.hashCode() : 0);
    result = 31 * result + (unitTransportScope != null ? unitTransportScope.hashCode() : 0);
    result = 31 * result + (unitSafeModeSummary != null ? unitSafeModeSummary.hashCode() : 0);
    result = 31 * result + (isCreateMonitorPlatform != null ? isCreateMonitorPlatform.hashCode() : 0);
    result = 31 * result + (isExclusiveParking != null ? isExclusiveParking.hashCode() : 0);
    result = 31 * result + (isExclusiveTrainingVenues != null ? isExclusiveTrainingVenues.hashCode() : 0);
    result = 31 * result + (jurisdictionUnit != null ? jurisdictionUnit.hashCode() : 0);
    result = 31 * result + (jurisdictionPolice != null ? jurisdictionPolice.hashCode() : 0);
    result = 31 * result + (jurisdictionStartTime != null ? jurisdictionStartTime.hashCode() : 0);
    result = 31 * result + (passengerCarNumber != null ? passengerCarNumber.hashCode() : 0);
    result = 31 * result + (busNumber != null ? busNumber.hashCode() : 0);
    result = 31 * result + (dangerousCarNumber != null ? dangerousCarNumber.hashCode() : 0);
    result = 31 * result + (freightCarNumber != null ? freightCarNumber.hashCode() : 0);
    result = 31 * result + (othersCarNumber != null ? othersCarNumber.hashCode() : 0);
    result = 31 * result + (freightCarDriverNumber != null ? freightCarDriverNumber.hashCode() : 0);
    result = 31 * result + (busDriverNumber != null ? busDriverNumber.hashCode() : 0);
    result = 31 * result + (dangerousCarDriverNumber != null ? dangerousCarDriverNumber.hashCode() : 0);
    result = 31 * result + (passengerCarDriverNumber != null ? passengerCarDriverNumber.hashCode() : 0);
    result = 31 * result + (othersCarDriverNumber != null ? othersCarDriverNumber.hashCode() : 0);
    result = 31 * result + (transportCarOperation != null ? transportCarOperation.hashCode() : 0);
    result = 31 * result + (transportSecurityRisks != null ? transportSecurityRisks.hashCode() : 0);
    result = 31 * result + (remark != null ? remark.hashCode() : 0);
    result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
    result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
    result = 31 * result + (createUserName != null ? createUserName.hashCode() : 0);
    result = 31 * result + (createDepartmentId != null ? createDepartmentId.hashCode() : 0);
    result = 31 * result + (createDepartmentName != null ? createDepartmentName.hashCode() : 0);
    result = 31 * result + (modifyUserId != null ? modifyUserId.hashCode() : 0);
    result = 31 * result + (modifyUserName != null ? modifyUserName.hashCode() : 0);
    result = 31 * result + (modifyDepartmentId != null ? modifyDepartmentId.hashCode() : 0);
    result = 31 * result + (modifyDepartmentName != null ? modifyDepartmentName.hashCode() : 0);
    result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
    result = 31 * result + (unitCorporateName != null ? unitCorporateName.hashCode() : 0);
    result = 31 * result + (unitCorporatePhone != null ? unitCorporatePhone.hashCode() : 0);
    result = 31 * result + (unitContactPersonName != null ? unitContactPersonName.hashCode() : 0);
    result = 31 * result + (unitContactPersonPhone != null ? unitContactPersonPhone.hashCode() : 0);
    result = 31 * result + (isVerify != null ? isVerify.hashCode() : 0);
    return result;
  }

  @Basic
  @Column(name = "unit_permit_number")
  public String getUnitPermitNumber() {
    return unitPermitNumber;
  }

  public void setUnitPermitNumber(String unitPermitNumber) {
    this.unitPermitNumber = unitPermitNumber;
  }
  @Basic
  @Column(name = "province")
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }
  @Basic
  @Column(name = "city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
  @Basic
  @Column(name = "district")
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }
}