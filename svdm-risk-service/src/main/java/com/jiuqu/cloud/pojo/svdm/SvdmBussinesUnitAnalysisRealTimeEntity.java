package com.jiuqu.cloud.pojo.svdm;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "svdm_bussines_unit_analysis_real_time", schema = "svdm", catalog = "")
public class SvdmBussinesUnitAnalysisRealTimeEntity {
    private int id;
    private Integer unitId;
    private String unitName;
    private BigDecimal driverAnalysis;
    private BigDecimal speedingEarlyWarningAnalysis;
    private Integer speedingEarlyWarningNumber;
    private BigDecimal fatigueDrivingEarlyWarningAnalysis;
    private Integer fatigueDrivingEarlyWarningNumber;
    private BigDecimal earlyWarningAnalysis;
    private Integer earlyWarningNumber;
    private BigDecimal terminalEquipmentFailureEarlyWarningAnalysis;
    private Integer terminalEquipmentFailureEarlyWarningNumber;
    private BigDecimal abnormalityOfDrivingTimeEarlyWarningAnalysis;
    private Integer abnormalityOfDrivingTimeEarlyWarningNumber;
    private BigDecimal timeoutParkingEarlyWarningAnalysis;
    private Integer timeoutParkingEarlyWarningNumber;
    private BigDecimal abnormalRouteEarlyWarningAnalysis;
    private Integer abnormalRouteEarlyWarningNumber;
    private BigDecimal routeDeviationEarlyWarningAnalysis;
    private Integer routeDeviationEarlyWarningNumber;
    private BigDecimal vehicleAnomalyEarlyWarningAnalysis;
    private Integer vehicleAnomalyEarlyWarningNumber;
    private BigDecimal illegalVehicleDrivingEarlyWarningAnalysis;
    private Integer illegalVehicleDrivingEarlyWarningNumber;
    private BigDecimal vehicleConditionsAnalysis;
    private BigDecimal dynamicSystemAnalysis;
    private BigDecimal brakingSystemAnalysis;
    private BigDecimal driveSystemAnalysis;
    private BigDecimal steeringSystemAnalysis;
    private BigDecimal roadConditionAnalysis;
    private BigDecimal averageElevationAnalysis;
    private BigDecimal roadCurvatureAnalysis;
    private BigDecimal roadSlopeAnalysis;
    private BigDecimal routeEfficiencyAnalysis;
    private BigDecimal weatherConditionAnalysis;
    private BigDecimal weatherDataAnalysis;
    private String wickedTravelTime;
    private BigDecimal managementSituationAnalysis;
    private BigDecimal vehicleManagementAnalysis;
    private BigDecimal personnelManagementAnalysis;
    private BigDecimal transportationManagementAnalysis;
    private BigDecimal securityManagementAnalysis;
    private BigDecimal raiCount;
    private String riskGrade;
    private String riskLevel;
    private String riskHints;
    private Timestamp sendTime;

    @Id
    @Column(name = "id")
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
    @Column(name = "unit_name")
    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Basic
    @Column(name = "driver_analysis")
    public BigDecimal getDriverAnalysis() {
        return driverAnalysis;
    }

    public void setDriverAnalysis(BigDecimal driverAnalysis) {
        this.driverAnalysis = driverAnalysis;
    }

    @Basic
    @Column(name = "speeding_early_warning_analysis")
    public BigDecimal getSpeedingEarlyWarningAnalysis() {
        return speedingEarlyWarningAnalysis;
    }

    public void setSpeedingEarlyWarningAnalysis(BigDecimal speedingEarlyWarningAnalysis) {
        this.speedingEarlyWarningAnalysis = speedingEarlyWarningAnalysis;
    }

    @Basic
    @Column(name = "speeding_early_warning _number")
    public Integer getSpeedingEarlyWarningNumber() {
        return speedingEarlyWarningNumber;
    }

    public void setSpeedingEarlyWarningNumber(Integer speedingEarlyWarningNumber) {
        this.speedingEarlyWarningNumber = speedingEarlyWarningNumber;
    }

    @Basic
    @Column(name = "fatigue_driving_early_warning_analysis")
    public BigDecimal getFatigueDrivingEarlyWarningAnalysis() {
        return fatigueDrivingEarlyWarningAnalysis;
    }

    public void setFatigueDrivingEarlyWarningAnalysis(BigDecimal fatigueDrivingEarlyWarningAnalysis) {
        this.fatigueDrivingEarlyWarningAnalysis = fatigueDrivingEarlyWarningAnalysis;
    }

    @Basic
    @Column(name = "fatigue_driving_ early_warning_number")
    public Integer getFatigueDrivingEarlyWarningNumber() {
        return fatigueDrivingEarlyWarningNumber;
    }

    public void setFatigueDrivingEarlyWarningNumber(Integer fatigueDrivingEarlyWarningNumber) {
        this.fatigueDrivingEarlyWarningNumber = fatigueDrivingEarlyWarningNumber;
    }

    @Basic
    @Column(name = "early_warning_analysis")
    public BigDecimal getEarlyWarningAnalysis() {
        return earlyWarningAnalysis;
    }

    public void setEarlyWarningAnalysis(BigDecimal earlyWarningAnalysis) {
        this.earlyWarningAnalysis = earlyWarningAnalysis;
    }

    @Basic
    @Column(name = "early_warning_number")
    public Integer getEarlyWarningNumber() {
        return earlyWarningNumber;
    }

    public void setEarlyWarningNumber(Integer earlyWarningNumber) {
        this.earlyWarningNumber = earlyWarningNumber;
    }

    @Basic
    @Column(name = "terminal_equipment_failure_early_warning_analysis")
    public BigDecimal getTerminalEquipmentFailureEarlyWarningAnalysis() {
        return terminalEquipmentFailureEarlyWarningAnalysis;
    }

    public void setTerminalEquipmentFailureEarlyWarningAnalysis(BigDecimal terminalEquipmentFailureEarlyWarningAnalysis) {
        this.terminalEquipmentFailureEarlyWarningAnalysis = terminalEquipmentFailureEarlyWarningAnalysis;
    }

    @Basic
    @Column(name = "terminal_equipment_failure_early_warning_number")
    public Integer getTerminalEquipmentFailureEarlyWarningNumber() {
        return terminalEquipmentFailureEarlyWarningNumber;
    }

    public void setTerminalEquipmentFailureEarlyWarningNumber(Integer terminalEquipmentFailureEarlyWarningNumber) {
        this.terminalEquipmentFailureEarlyWarningNumber = terminalEquipmentFailureEarlyWarningNumber;
    }

    @Basic
    @Column(name = "abnormality_of_driving_time_early_warning_analysis")
    public BigDecimal getAbnormalityOfDrivingTimeEarlyWarningAnalysis() {
        return abnormalityOfDrivingTimeEarlyWarningAnalysis;
    }

    public void setAbnormalityOfDrivingTimeEarlyWarningAnalysis(BigDecimal abnormalityOfDrivingTimeEarlyWarningAnalysis) {
        this.abnormalityOfDrivingTimeEarlyWarningAnalysis = abnormalityOfDrivingTimeEarlyWarningAnalysis;
    }

    @Basic
    @Column(name = "abnormality_of_driving_time_early_warning_number")
    public Integer getAbnormalityOfDrivingTimeEarlyWarningNumber() {
        return abnormalityOfDrivingTimeEarlyWarningNumber;
    }

    public void setAbnormalityOfDrivingTimeEarlyWarningNumber(Integer abnormalityOfDrivingTimeEarlyWarningNumber) {
        this.abnormalityOfDrivingTimeEarlyWarningNumber = abnormalityOfDrivingTimeEarlyWarningNumber;
    }

    @Basic
    @Column(name = "timeout_parking_early_warning_analysis")
    public BigDecimal getTimeoutParkingEarlyWarningAnalysis() {
        return timeoutParkingEarlyWarningAnalysis;
    }

    public void setTimeoutParkingEarlyWarningAnalysis(BigDecimal timeoutParkingEarlyWarningAnalysis) {
        this.timeoutParkingEarlyWarningAnalysis = timeoutParkingEarlyWarningAnalysis;
    }

    @Basic
    @Column(name = "timeout_parking_early_warning_number")
    public Integer getTimeoutParkingEarlyWarningNumber() {
        return timeoutParkingEarlyWarningNumber;
    }

    public void setTimeoutParkingEarlyWarningNumber(Integer timeoutParkingEarlyWarningNumber) {
        this.timeoutParkingEarlyWarningNumber = timeoutParkingEarlyWarningNumber;
    }

    @Basic
    @Column(name = "abnormal_route_early_warning_analysis")
    public BigDecimal getAbnormalRouteEarlyWarningAnalysis() {
        return abnormalRouteEarlyWarningAnalysis;
    }

    public void setAbnormalRouteEarlyWarningAnalysis(BigDecimal abnormalRouteEarlyWarningAnalysis) {
        this.abnormalRouteEarlyWarningAnalysis = abnormalRouteEarlyWarningAnalysis;
    }

    @Basic
    @Column(name = "abnormal_route_early_warning_number")
    public Integer getAbnormalRouteEarlyWarningNumber() {
        return abnormalRouteEarlyWarningNumber;
    }

    public void setAbnormalRouteEarlyWarningNumber(Integer abnormalRouteEarlyWarningNumber) {
        this.abnormalRouteEarlyWarningNumber = abnormalRouteEarlyWarningNumber;
    }

    @Basic
    @Column(name = "route_deviation_early_warning_analysis")
    public BigDecimal getRouteDeviationEarlyWarningAnalysis() {
        return routeDeviationEarlyWarningAnalysis;
    }

    public void setRouteDeviationEarlyWarningAnalysis(BigDecimal routeDeviationEarlyWarningAnalysis) {
        this.routeDeviationEarlyWarningAnalysis = routeDeviationEarlyWarningAnalysis;
    }

    @Basic
    @Column(name = "route_deviation_early_warning_number")
    public Integer getRouteDeviationEarlyWarningNumber() {
        return routeDeviationEarlyWarningNumber;
    }

    public void setRouteDeviationEarlyWarningNumber(Integer routeDeviationEarlyWarningNumber) {
        this.routeDeviationEarlyWarningNumber = routeDeviationEarlyWarningNumber;
    }

    @Basic
    @Column(name = "vehicle_anomaly_early_warning_analysis")
    public BigDecimal getVehicleAnomalyEarlyWarningAnalysis() {
        return vehicleAnomalyEarlyWarningAnalysis;
    }

    public void setVehicleAnomalyEarlyWarningAnalysis(BigDecimal vehicleAnomalyEarlyWarningAnalysis) {
        this.vehicleAnomalyEarlyWarningAnalysis = vehicleAnomalyEarlyWarningAnalysis;
    }

    @Basic
    @Column(name = "vehicle_anomaly_early_warning_number")
    public Integer getVehicleAnomalyEarlyWarningNumber() {
        return vehicleAnomalyEarlyWarningNumber;
    }

    public void setVehicleAnomalyEarlyWarningNumber(Integer vehicleAnomalyEarlyWarningNumber) {
        this.vehicleAnomalyEarlyWarningNumber = vehicleAnomalyEarlyWarningNumber;
    }

    @Basic
    @Column(name = "illegal_vehicle_driving_early_warning_analysis")
    public BigDecimal getIllegalVehicleDrivingEarlyWarningAnalysis() {
        return illegalVehicleDrivingEarlyWarningAnalysis;
    }

    public void setIllegalVehicleDrivingEarlyWarningAnalysis(BigDecimal illegalVehicleDrivingEarlyWarningAnalysis) {
        this.illegalVehicleDrivingEarlyWarningAnalysis = illegalVehicleDrivingEarlyWarningAnalysis;
    }

    @Basic
    @Column(name = "illegal_vehicle_driving_early_warning_number")
    public Integer getIllegalVehicleDrivingEarlyWarningNumber() {
        return illegalVehicleDrivingEarlyWarningNumber;
    }

    public void setIllegalVehicleDrivingEarlyWarningNumber(Integer illegalVehicleDrivingEarlyWarningNumber) {
        this.illegalVehicleDrivingEarlyWarningNumber = illegalVehicleDrivingEarlyWarningNumber;
    }

    @Basic
    @Column(name = "vehicle_conditions_analysis")
    public BigDecimal getVehicleConditionsAnalysis() {
        return vehicleConditionsAnalysis;
    }

    public void setVehicleConditionsAnalysis(BigDecimal vehicleConditionsAnalysis) {
        this.vehicleConditionsAnalysis = vehicleConditionsAnalysis;
    }

    @Basic
    @Column(name = "dynamic_system_analysis")
    public BigDecimal getDynamicSystemAnalysis() {
        return dynamicSystemAnalysis;
    }

    public void setDynamicSystemAnalysis(BigDecimal dynamicSystemAnalysis) {
        this.dynamicSystemAnalysis = dynamicSystemAnalysis;
    }

    @Basic
    @Column(name = "braking_system_analysis")
    public BigDecimal getBrakingSystemAnalysis() {
        return brakingSystemAnalysis;
    }

    public void setBrakingSystemAnalysis(BigDecimal brakingSystemAnalysis) {
        this.brakingSystemAnalysis = brakingSystemAnalysis;
    }

    @Basic
    @Column(name = "drive_system_analysis")
    public BigDecimal getDriveSystemAnalysis() {
        return driveSystemAnalysis;
    }

    public void setDriveSystemAnalysis(BigDecimal driveSystemAnalysis) {
        this.driveSystemAnalysis = driveSystemAnalysis;
    }

    @Basic
    @Column(name = "steering_system_analysis")
    public BigDecimal getSteeringSystemAnalysis() {
        return steeringSystemAnalysis;
    }

    public void setSteeringSystemAnalysis(BigDecimal steeringSystemAnalysis) {
        this.steeringSystemAnalysis = steeringSystemAnalysis;
    }

    @Basic
    @Column(name = "road_condition_analysis")
    public BigDecimal getRoadConditionAnalysis() {
        return roadConditionAnalysis;
    }

    public void setRoadConditionAnalysis(BigDecimal roadConditionAnalysis) {
        this.roadConditionAnalysis = roadConditionAnalysis;
    }

    @Basic
    @Column(name = "average_elevation_analysis")
    public BigDecimal getAverageElevationAnalysis() {
        return averageElevationAnalysis;
    }

    public void setAverageElevationAnalysis(BigDecimal averageElevationAnalysis) {
        this.averageElevationAnalysis = averageElevationAnalysis;
    }

    @Basic
    @Column(name = "road_curvature_analysis")
    public BigDecimal getRoadCurvatureAnalysis() {
        return roadCurvatureAnalysis;
    }

    public void setRoadCurvatureAnalysis(BigDecimal roadCurvatureAnalysis) {
        this.roadCurvatureAnalysis = roadCurvatureAnalysis;
    }

    @Basic
    @Column(name = "road_slope_analysis")
    public BigDecimal getRoadSlopeAnalysis() {
        return roadSlopeAnalysis;
    }

    public void setRoadSlopeAnalysis(BigDecimal roadSlopeAnalysis) {
        this.roadSlopeAnalysis = roadSlopeAnalysis;
    }

    @Basic
    @Column(name = "route_efficiency_analysis")
    public BigDecimal getRouteEfficiencyAnalysis() {
        return routeEfficiencyAnalysis;
    }

    public void setRouteEfficiencyAnalysis(BigDecimal routeEfficiencyAnalysis) {
        this.routeEfficiencyAnalysis = routeEfficiencyAnalysis;
    }

    @Basic
    @Column(name = "weather_condition_analysis")
    public BigDecimal getWeatherConditionAnalysis() {
        return weatherConditionAnalysis;
    }

    public void setWeatherConditionAnalysis(BigDecimal weatherConditionAnalysis) {
        this.weatherConditionAnalysis = weatherConditionAnalysis;
    }

    @Basic
    @Column(name = "weather_data_analysis")
    public BigDecimal getWeatherDataAnalysis() {
        return weatherDataAnalysis;
    }

    public void setWeatherDataAnalysis(BigDecimal weatherDataAnalysis) {
        this.weatherDataAnalysis = weatherDataAnalysis;
    }

    @Basic
    @Column(name = "wicked_travel_time")
    public String getWickedTravelTime() {
        return wickedTravelTime;
    }

    public void setWickedTravelTime(String wickedTravelTime) {
        this.wickedTravelTime = wickedTravelTime;
    }

    @Basic
    @Column(name = "management_situation_analysis")
    public BigDecimal getManagementSituationAnalysis() {
        return managementSituationAnalysis;
    }

    public void setManagementSituationAnalysis(BigDecimal managementSituationAnalysis) {
        this.managementSituationAnalysis = managementSituationAnalysis;
    }

    @Basic
    @Column(name = "vehicle_management_analysis")
    public BigDecimal getVehicleManagementAnalysis() {
        return vehicleManagementAnalysis;
    }

    public void setVehicleManagementAnalysis(BigDecimal vehicleManagementAnalysis) {
        this.vehicleManagementAnalysis = vehicleManagementAnalysis;
    }

    @Basic
    @Column(name = "personnel_management_analysis")
    public BigDecimal getPersonnelManagementAnalysis() {
        return personnelManagementAnalysis;
    }

    public void setPersonnelManagementAnalysis(BigDecimal personnelManagementAnalysis) {
        this.personnelManagementAnalysis = personnelManagementAnalysis;
    }

    @Basic
    @Column(name = "transportation_management_analysis")
    public BigDecimal getTransportationManagementAnalysis() {
        return transportationManagementAnalysis;
    }

    public void setTransportationManagementAnalysis(BigDecimal transportationManagementAnalysis) {
        this.transportationManagementAnalysis = transportationManagementAnalysis;
    }

    @Basic
    @Column(name = "security_management_analysis")
    public BigDecimal getSecurityManagementAnalysis() {
        return securityManagementAnalysis;
    }

    public void setSecurityManagementAnalysis(BigDecimal securityManagementAnalysis) {
        this.securityManagementAnalysis = securityManagementAnalysis;
    }

    @Basic
    @Column(name = "rai_count")
    public BigDecimal getRaiCount() {
        return raiCount;
    }

    public void setRaiCount(BigDecimal raiCount) {
        this.raiCount = raiCount;
    }

    @Basic
    @Column(name = "risk_grade")
    public String getRiskGrade() {
        return riskGrade;
    }

    public void setRiskGrade(String riskGrade) {
        this.riskGrade = riskGrade;
    }

    @Basic
    @Column(name = "risk_level")
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    @Basic
    @Column(name = "risk_hints")
    public String getRiskHints() {
        return riskHints;
    }

    public void setRiskHints(String riskHints) {
        this.riskHints = riskHints;
    }

    @Basic
    @Column(name = "send_time")
    public Timestamp getSendTime() {
        return sendTime;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SvdmBussinesUnitAnalysisRealTimeEntity that = (SvdmBussinesUnitAnalysisRealTimeEntity) o;
        return id == that.id &&
                Objects.equals(unitId, that.unitId) &&
                Objects.equals(unitName, that.unitName) &&
                Objects.equals(driverAnalysis, that.driverAnalysis) &&
                Objects.equals(speedingEarlyWarningAnalysis, that.speedingEarlyWarningAnalysis) &&
                Objects.equals(speedingEarlyWarningNumber, that.speedingEarlyWarningNumber) &&
                Objects.equals(fatigueDrivingEarlyWarningAnalysis, that.fatigueDrivingEarlyWarningAnalysis) &&
                Objects.equals(fatigueDrivingEarlyWarningNumber, that.fatigueDrivingEarlyWarningNumber) &&
                Objects.equals(earlyWarningAnalysis, that.earlyWarningAnalysis) &&
                Objects.equals(earlyWarningNumber, that.earlyWarningNumber) &&
                Objects.equals(terminalEquipmentFailureEarlyWarningAnalysis, that.terminalEquipmentFailureEarlyWarningAnalysis) &&
                Objects.equals(terminalEquipmentFailureEarlyWarningNumber, that.terminalEquipmentFailureEarlyWarningNumber) &&
                Objects.equals(abnormalityOfDrivingTimeEarlyWarningAnalysis, that.abnormalityOfDrivingTimeEarlyWarningAnalysis) &&
                Objects.equals(abnormalityOfDrivingTimeEarlyWarningNumber, that.abnormalityOfDrivingTimeEarlyWarningNumber) &&
                Objects.equals(timeoutParkingEarlyWarningAnalysis, that.timeoutParkingEarlyWarningAnalysis) &&
                Objects.equals(timeoutParkingEarlyWarningNumber, that.timeoutParkingEarlyWarningNumber) &&
                Objects.equals(abnormalRouteEarlyWarningAnalysis, that.abnormalRouteEarlyWarningAnalysis) &&
                Objects.equals(abnormalRouteEarlyWarningNumber, that.abnormalRouteEarlyWarningNumber) &&
                Objects.equals(routeDeviationEarlyWarningAnalysis, that.routeDeviationEarlyWarningAnalysis) &&
                Objects.equals(routeDeviationEarlyWarningNumber, that.routeDeviationEarlyWarningNumber) &&
                Objects.equals(vehicleAnomalyEarlyWarningAnalysis, that.vehicleAnomalyEarlyWarningAnalysis) &&
                Objects.equals(vehicleAnomalyEarlyWarningNumber, that.vehicleAnomalyEarlyWarningNumber) &&
                Objects.equals(illegalVehicleDrivingEarlyWarningAnalysis, that.illegalVehicleDrivingEarlyWarningAnalysis) &&
                Objects.equals(illegalVehicleDrivingEarlyWarningNumber, that.illegalVehicleDrivingEarlyWarningNumber) &&
                Objects.equals(vehicleConditionsAnalysis, that.vehicleConditionsAnalysis) &&
                Objects.equals(dynamicSystemAnalysis, that.dynamicSystemAnalysis) &&
                Objects.equals(brakingSystemAnalysis, that.brakingSystemAnalysis) &&
                Objects.equals(driveSystemAnalysis, that.driveSystemAnalysis) &&
                Objects.equals(steeringSystemAnalysis, that.steeringSystemAnalysis) &&
                Objects.equals(roadConditionAnalysis, that.roadConditionAnalysis) &&
                Objects.equals(averageElevationAnalysis, that.averageElevationAnalysis) &&
                Objects.equals(roadCurvatureAnalysis, that.roadCurvatureAnalysis) &&
                Objects.equals(roadSlopeAnalysis, that.roadSlopeAnalysis) &&
                Objects.equals(routeEfficiencyAnalysis, that.routeEfficiencyAnalysis) &&
                Objects.equals(weatherConditionAnalysis, that.weatherConditionAnalysis) &&
                Objects.equals(weatherDataAnalysis, that.weatherDataAnalysis) &&
                Objects.equals(wickedTravelTime, that.wickedTravelTime) &&
                Objects.equals(managementSituationAnalysis, that.managementSituationAnalysis) &&
                Objects.equals(vehicleManagementAnalysis, that.vehicleManagementAnalysis) &&
                Objects.equals(personnelManagementAnalysis, that.personnelManagementAnalysis) &&
                Objects.equals(transportationManagementAnalysis, that.transportationManagementAnalysis) &&
                Objects.equals(securityManagementAnalysis, that.securityManagementAnalysis) &&
                Objects.equals(raiCount, that.raiCount) &&
                Objects.equals(riskGrade, that.riskGrade) &&
                Objects.equals(riskLevel, that.riskLevel) &&
                Objects.equals(riskHints, that.riskHints) &&
                Objects.equals(sendTime, that.sendTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, unitId, unitName, driverAnalysis, speedingEarlyWarningAnalysis, speedingEarlyWarningNumber, fatigueDrivingEarlyWarningAnalysis, fatigueDrivingEarlyWarningNumber, earlyWarningAnalysis, earlyWarningNumber, terminalEquipmentFailureEarlyWarningAnalysis, terminalEquipmentFailureEarlyWarningNumber, abnormalityOfDrivingTimeEarlyWarningAnalysis, abnormalityOfDrivingTimeEarlyWarningNumber, timeoutParkingEarlyWarningAnalysis, timeoutParkingEarlyWarningNumber, abnormalRouteEarlyWarningAnalysis, abnormalRouteEarlyWarningNumber, routeDeviationEarlyWarningAnalysis, routeDeviationEarlyWarningNumber, vehicleAnomalyEarlyWarningAnalysis, vehicleAnomalyEarlyWarningNumber, illegalVehicleDrivingEarlyWarningAnalysis, illegalVehicleDrivingEarlyWarningNumber, vehicleConditionsAnalysis, dynamicSystemAnalysis, brakingSystemAnalysis, driveSystemAnalysis, steeringSystemAnalysis, roadConditionAnalysis, averageElevationAnalysis, roadCurvatureAnalysis, roadSlopeAnalysis, routeEfficiencyAnalysis, weatherConditionAnalysis, weatherDataAnalysis, wickedTravelTime, managementSituationAnalysis, vehicleManagementAnalysis, personnelManagementAnalysis, transportationManagementAnalysis, securityManagementAnalysis, raiCount, riskGrade, riskLevel, riskHints, sendTime);
    }

    @Override
    public String toString() {
        return "SvdmBussinesUnitAnalysisRealTimeEntity{" +
                "id=" + id +
                ", unitId=" + unitId +
                ", unitName='" + unitName + '\'' +
                ", driverAnalysis=" + driverAnalysis +
                ", speedingEarlyWarningAnalysis=" + speedingEarlyWarningAnalysis +
                ", speedingEarlyWarningNumber=" + speedingEarlyWarningNumber +
                ", fatigueDrivingEarlyWarningAnalysis=" + fatigueDrivingEarlyWarningAnalysis +
                ", fatigueDrivingEarlyWarningNumber=" + fatigueDrivingEarlyWarningNumber +
                ", earlyWarningAnalysis=" + earlyWarningAnalysis +
                ", earlyWarningNumber=" + earlyWarningNumber +
                ", terminalEquipmentFailureEarlyWarningAnalysis=" + terminalEquipmentFailureEarlyWarningAnalysis +
                ", terminalEquipmentFailureEarlyWarningNumber=" + terminalEquipmentFailureEarlyWarningNumber +
                ", abnormalityOfDrivingTimeEarlyWarningAnalysis=" + abnormalityOfDrivingTimeEarlyWarningAnalysis +
                ", abnormalityOfDrivingTimeEarlyWarningNumber=" + abnormalityOfDrivingTimeEarlyWarningNumber +
                ", timeoutParkingEarlyWarningAnalysis=" + timeoutParkingEarlyWarningAnalysis +
                ", timeoutParkingEarlyWarningNumber=" + timeoutParkingEarlyWarningNumber +
                ", abnormalRouteEarlyWarningAnalysis=" + abnormalRouteEarlyWarningAnalysis +
                ", abnormalRouteEarlyWarningNumber=" + abnormalRouteEarlyWarningNumber +
                ", routeDeviationEarlyWarningAnalysis=" + routeDeviationEarlyWarningAnalysis +
                ", routeDeviationEarlyWarningNumber=" + routeDeviationEarlyWarningNumber +
                ", vehicleAnomalyEarlyWarningAnalysis=" + vehicleAnomalyEarlyWarningAnalysis +
                ", vehicleAnomalyEarlyWarningNumber=" + vehicleAnomalyEarlyWarningNumber +
                ", illegalVehicleDrivingEarlyWarningAnalysis=" + illegalVehicleDrivingEarlyWarningAnalysis +
                ", illegalVehicleDrivingEarlyWarningNumber=" + illegalVehicleDrivingEarlyWarningNumber +
                ", vehicleConditionsAnalysis=" + vehicleConditionsAnalysis +
                ", dynamicSystemAnalysis=" + dynamicSystemAnalysis +
                ", brakingSystemAnalysis=" + brakingSystemAnalysis +
                ", driveSystemAnalysis=" + driveSystemAnalysis +
                ", steeringSystemAnalysis=" + steeringSystemAnalysis +
                ", roadConditionAnalysis=" + roadConditionAnalysis +
                ", averageElevationAnalysis=" + averageElevationAnalysis +
                ", roadCurvatureAnalysis=" + roadCurvatureAnalysis +
                ", roadSlopeAnalysis=" + roadSlopeAnalysis +
                ", routeEfficiencyAnalysis=" + routeEfficiencyAnalysis +
                ", weatherConditionAnalysis=" + weatherConditionAnalysis +
                ", weatherDataAnalysis=" + weatherDataAnalysis +
                ", wickedTravelTime='" + wickedTravelTime + '\'' +
                ", managementSituationAnalysis=" + managementSituationAnalysis +
                ", vehicleManagementAnalysis=" + vehicleManagementAnalysis +
                ", personnelManagementAnalysis=" + personnelManagementAnalysis +
                ", transportationManagementAnalysis=" + transportationManagementAnalysis +
                ", securityManagementAnalysis=" + securityManagementAnalysis +
                ", raiCount=" + raiCount +
                ", riskGrade='" + riskGrade + '\'' +
                ", riskLevel='" + riskLevel + '\'' +
                ", riskHints='" + riskHints + '\'' +
                ", sendTime=" + sendTime +
                '}';
    }
}
