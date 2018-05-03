package com.jiuqu.cloud.entity.svdm;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;


/**
 * @Author:jzh
 * @Description:SvdmBusinessUnit实体类
 * @Date: 19:17 2018/1/9/009
 */

@Entity
@Table(name = "svdm_business_unit_car")
public class SvdmBusinessUnitCarEntity {
    private int id;
    private Integer unitId;
    private String codeType;
    private String carLicensePlate;
    private String carOwner;
    private String carType;
    private String useNature;
    private String catStatus;
    private Date testValidTime;
    private Date scrappedTime;
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
    private byte[] carLicenseImg;
    private Integer isVerify;
    private byte[] carLicensePic;
    private String carFrameNo;
    private Double evaluationValue;
    private String otherEvaluationValue;
    private String transportationCapacity;
    private String transportType;
    private String carBrand;
    private String displacement;
    private Date homeDate;
    private String travelKilometers;
    private Integer axleNumber;
    private String gearBox;
    private String realLoad;
    private String transportMode;
    private String itemType;
    private String carEngineMark;
    private String color;
    private Long roadTransport;
    private String vehicleLevel;
    private Integer transportOrganization;
    private String licenseNumber;
    private Date initialDate;
    private String carBuy;
    private Date nextAnnualInspectionDate;
    private Date dateOfIssue;
    private Date dateOfRegistration;
    private Date yearRegistratioDate;
    private String industryCategory;
    private String brandModel;
    private Double tonnage;
    private String engineNumber;
    private String driversPhone;
    private String fuelType;
    private Integer wheelbase;
    private Integer carLength;
    private Integer carWidth;
    private Integer carHeight;
    private Integer seat;
    private Date vehicleDate;
    private Date settleDate;
    private String fileNumber;
    private Date thisAnnualInspectionDate;
    private String runState;



    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

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
    @Column(name = "unit_id")
    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    @Basic
    @Column(name = "code_type")
    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    @Basic
    @Column(name = "car_license_plate")
    public String getCarLicensePlate() {
        return carLicensePlate;
    }

    public void setCarLicensePlate(String carLicensePlate) {
        this.carLicensePlate = carLicensePlate;
    }

    @Basic
    @Column(name = "car_owner")
    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    @Basic
    @Column(name = "car_type")
    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Basic
    @Column(name = "use_nature")
    public String getUseNature() {
        return useNature;
    }

    public void setUseNature(String useNature) {
        this.useNature = useNature;
    }

    @Basic
    @Column(name = "cat_status")
    public String getCatStatus() {
        return catStatus;
    }

    public void setCatStatus(String catStatus) {
        this.catStatus = catStatus;
    }

    @Basic
    @Column(name = "test_valid_time")
    public Date getTestValidTime() {
        return testValidTime;
    }

    public void setTestValidTime(Date testValidTime) {
        this.testValidTime = testValidTime;
    }

    @Basic
    @Column(name = "scrapped_time")
    public Date getScrappedTime() {
        return scrappedTime;
    }

    public void setScrappedTime(Date scrappedTime) {
        this.scrappedTime = scrappedTime;
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
    @Column(name = "car_license_img")
    public byte[] getCarLicenseImg() {
        return carLicenseImg;
    }

    public void setCarLicenseImg(byte[] carLicenseImg) {
        this.carLicenseImg = carLicenseImg;
    }

    @Basic
    @Column(name = "is_verify")
    public Integer getIsVerify() {
        return isVerify;
    }

    public void setIsVerify(Integer isVerify) {
        this.isVerify = isVerify;
    }

    @Basic
    @Column(name = "car_license_pic")
    public byte[] getCarLicensePic() {
        return carLicensePic;
    }

    public void setCarLicensePic(byte[] carLicensePic) {
        this.carLicensePic = carLicensePic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SvdmBusinessUnitCarEntity that = (SvdmBusinessUnitCarEntity) o;

        if (id != that.id) return false;
        if (unitId != null ? !unitId.equals(that.unitId) : that.unitId != null) return false;
        if (codeType != null ? !codeType.equals(that.codeType) : that.codeType != null) return false;
        if (carLicensePlate != null ? !carLicensePlate.equals(that.carLicensePlate) : that.carLicensePlate != null)
            return false;
        if (carOwner != null ? !carOwner.equals(that.carOwner) : that.carOwner != null) return false;
        if (carType != null ? !carType.equals(that.carType) : that.carType != null) return false;
        if (useNature != null ? !useNature.equals(that.useNature) : that.useNature != null) return false;
        if (catStatus != null ? !catStatus.equals(that.catStatus) : that.catStatus != null) return false;
        if (testValidTime != null ? !testValidTime.equals(that.testValidTime) : that.testValidTime != null)
            return false;
        if (scrappedTime != null ? !scrappedTime.equals(that.scrappedTime) : that.scrappedTime != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (createUserId != null ? !createUserId.equals(that.createUserId) : that.createUserId != null) return false;
        if (createUserName != null ? !createUserName.equals(that.createUserName) : that.createUserName != null)
            return false;
        if (createDepartmentId != null ? !createDepartmentId.equals(that.createDepartmentId) : that.createDepartmentId != null)
            return false;
        if (createDepartmentName != null ? !createDepartmentName.equals(that.createDepartmentName) : that.createDepartmentName != null)
            return false;
        if (modifyUserId != null ? !modifyUserId.equals(that.modifyUserId) : that.modifyUserId != null) return false;
        if (modifyUserName != null ? !modifyUserName.equals(that.modifyUserName) : that.modifyUserName != null)
            return false;
        if (modifyDepartmentId != null ? !modifyDepartmentId.equals(that.modifyDepartmentId) : that.modifyDepartmentId != null)
            return false;
        if (modifyDepartmentName != null ? !modifyDepartmentName.equals(that.modifyDepartmentName) : that.modifyDepartmentName != null)
            return false;
        if (modifyTime != null ? !modifyTime.equals(that.modifyTime) : that.modifyTime != null) return false;
        if (!Arrays.equals(carLicenseImg, that.carLicenseImg)) return false;
        if (isVerify != null ? !isVerify.equals(that.isVerify) : that.isVerify != null) return false;
        if (!Arrays.equals(carLicensePic, that.carLicensePic)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (unitId != null ? unitId.hashCode() : 0);
        result = 31 * result + (codeType != null ? codeType.hashCode() : 0);
        result = 31 * result + (carLicensePlate != null ? carLicensePlate.hashCode() : 0);
        result = 31 * result + (carOwner != null ? carOwner.hashCode() : 0);
        result = 31 * result + (carType != null ? carType.hashCode() : 0);
        result = 31 * result + (useNature != null ? useNature.hashCode() : 0);
        result = 31 * result + (catStatus != null ? catStatus.hashCode() : 0);
        result = 31 * result + (testValidTime != null ? testValidTime.hashCode() : 0);
        result = 31 * result + (scrappedTime != null ? scrappedTime.hashCode() : 0);
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
        result = 31 * result + Arrays.hashCode(carLicenseImg);
        result = 31 * result + (isVerify != null ? isVerify.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(carLicensePic);
        return result;
    }

    @Basic
    @Column(name = "car_frame_no")
    public String getCarFrameNo() {
        return carFrameNo;
    }

    public void setCarFrameNo(String carFrameNo) {
        this.carFrameNo = carFrameNo;
    }

    @Basic
    @Column(name = "evaluation_value")
    public Double getEvaluationValue() {
        return evaluationValue;
    }

    public void setEvaluationValue(Double evaluationValue) {
        this.evaluationValue = evaluationValue;
    }

    @Basic
    @Column(name = "other_evaluation_value")
    public String getOtherEvaluationValue() {
        return otherEvaluationValue;
    }

    public void setOtherEvaluationValue(String otherEvaluationValue) {
        this.otherEvaluationValue = otherEvaluationValue;
    }

    @Basic
    @Column(name = "transportation_capacity")
    public String getTransportationCapacity() {
        return transportationCapacity;
    }

    public void setTransportationCapacity(String transportationCapacity) {
        this.transportationCapacity = transportationCapacity;
    }

    @Basic
    @Column(name = "transport_type")
    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    @Basic
    @Column(name = "car_brand")
    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Basic
    @Column(name = "displacement")
    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    @Basic
    @Column(name = "home_date")
    public Date getHomeDate() {
        return homeDate;
    }

    public void setHomeDate(Date homeDate) {
        this.homeDate = homeDate;
    }

    @Basic
    @Column(name = "travel_kilometers")
    public String getTravelKilometers() {
        return travelKilometers;
    }

    public void setTravelKilometers(String travelKilometers) {
        this.travelKilometers = travelKilometers;
    }

    @Basic
    @Column(name = "axle_number")
    public Integer getAxleNumber() {
        return axleNumber;
    }

    public void setAxleNumber(Integer axleNumber) {
        this.axleNumber = axleNumber;
    }

    @Basic
    @Column(name = "gear_box")
    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    @Basic
    @Column(name = "real_load")
    public String getRealLoad() {
        return realLoad;
    }

    public void setRealLoad(String realLoad) {
        this.realLoad = realLoad;
    }

    @Basic
    @Column(name = "transport_mode")
    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    @Basic
    @Column(name = "item_type")
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Basic
    @Column(name = "car_engine_mark")
    public String getCarEngineMark() {
        return carEngineMark;
    }

    public void setCarEngineMark(String carEngineMark) {
        this.carEngineMark = carEngineMark;
    }

    @Basic
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "road_transport")
    public Long getRoadTransport() {
        return roadTransport;
    }

    public void setRoadTransport(Long roadTransport) {
        this.roadTransport = roadTransport;
    }

    @Basic
    @Column(name = "vehicle_level")
    public String getVehicleLevel() {
        return vehicleLevel;
    }

    public void setVehicleLevel(String vehicleLevel) {
        this.vehicleLevel = vehicleLevel;
    }

    @Basic
    @Column(name = "transport_organization")
    public Integer getTransportOrganization() {
        return transportOrganization;
    }

    public void setTransportOrganization(Integer transportOrganization) {
        this.transportOrganization = transportOrganization;
    }

    @Basic
    @Column(name = "license_number")
    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Basic
    @Column(name = "initial_date")
    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    @Basic
    @Column(name = "car_buy")
    public String getCarBuy() {
        return carBuy;
    }

    public void setCarBuy(String carBuy) {
        this.carBuy = carBuy;
    }

    @Basic
    @Column(name = "next_annual_inspection_date")
    public Date getNextAnnualInspectionDate() {
        return nextAnnualInspectionDate;
    }

    public void setNextAnnualInspectionDate(Date nextAnnualInspectionDate) {
        this.nextAnnualInspectionDate = nextAnnualInspectionDate;
    }

    @Basic
    @Column(name = "date_of_issue")
    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    @Basic
    @Column(name = "date_of_registration")
    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    @Basic
    @Column(name = "year_registratio_date")
    public Date getYearRegistratioDate() {
        return yearRegistratioDate;
    }

    public void setYearRegistratioDate(Date yearRegistratioDate) {
        this.yearRegistratioDate = yearRegistratioDate;
    }

    @Basic
    @Column(name = "industry_category")
    public String getIndustryCategory() {
        return industryCategory;
    }

    public void setIndustryCategory(String industryCategory) {
        this.industryCategory = industryCategory;
    }

    @Basic
    @Column(name = "brand_model")
    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    @Basic
    @Column(name = "tonnage")
    public Double getTonnage() {
        return tonnage;
    }

    public void setTonnage(Double tonnage) {
        this.tonnage = tonnage;
    }

    @Basic
    @Column(name = "engine_number")
    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    @Basic
    @Column(name = "drivers_phone")
    public String getDriversPhone() {
        return driversPhone;
    }

    public void setDriversPhone(String driversPhone) {
        this.driversPhone = driversPhone;
    }

    @Basic
    @Column(name = "fuel_type")
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Basic
    @Column(name = "wheelbase")
    public Integer getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(Integer wheelbase) {
        this.wheelbase = wheelbase;
    }

    @Basic
    @Column(name = "car_length")
    public Integer getCarLength() {
        return carLength;
    }

    public void setCarLength(Integer carLength) {
        this.carLength = carLength;
    }

    @Basic
    @Column(name = "car_width")
    public Integer getCarWidth() {
        return carWidth;
    }

    public void setCarWidth(Integer carWidth) {
        this.carWidth = carWidth;
    }

    @Basic
    @Column(name = "car_height")
    public Integer getCarHeight() {
        return carHeight;
    }

    public void setCarHeight(Integer carHeight) {
        this.carHeight = carHeight;
    }

    @Basic
    @Column(name = "seat")
    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    @Basic
    @Column(name = "vehicle_date")
    public Date getVehicleDate() {
        return vehicleDate;
    }

    public void setVehicleDate(Date vehicleDate) {
        this.vehicleDate = vehicleDate;
    }

    @Basic
    @Column(name = "settle_date")
    public Date getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(Date settleDate) {
        this.settleDate = settleDate;
    }

    @Basic
    @Column(name = "file_number")
    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    @Basic
    @Column(name = "this_annual_inspection_date")
    public Date getThisAnnualInspectionDate() {
        return thisAnnualInspectionDate;
    }

    public void setThisAnnualInspectionDate(Date thisAnnualInspectionDate) {
        this.thisAnnualInspectionDate = thisAnnualInspectionDate;
    }

    @Basic
    @Column(name = "run_state")
    public String getRunState() {
        return runState;
    }

    public void setRunState(String runState) {
        this.runState = runState;
    }
}