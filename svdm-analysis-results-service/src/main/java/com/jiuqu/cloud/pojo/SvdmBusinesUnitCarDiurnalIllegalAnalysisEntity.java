package com.jiuqu.cloud.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "svdm_busines_unit_car_diurnal_illegal_analysis", schema = "a", catalog = "")
public class SvdmBusinesUnitCarDiurnalIllegalAnalysisEntity {
    private int id;
    private Integer unitId;
    private Integer carId;
    private String carNumber;
    private BigDecimal accidentConstitutesCrimeAnalysis;
    private Integer accidentConstitutesCrimeNumber;
    private BigDecimal trafficCongestionIrregularitiesAnalysis;
    private Integer trafficCongestionIrregularitiesNumber;
    private BigDecimal useCounterfeitDriverLicenseAnalysis;
    private Integer useCounterfeitDriverLicenseNumber;
    private BigDecimal unlicensedDrivingAnalysis;
    private Integer unlicensedDrivingNumber;
    private BigDecimal fatigueDrivingAnalysis;
    private Integer fatigueDrivingNumber;
    private BigDecimal hitAndRunAnalysis;
    private Integer hitAndRunNumber;
    private BigDecimal overcrowdingAnalysis;
    private Integer overcrowdingNumber;
    private BigDecimal overloadingAnalysis;
    private Integer overloadingNumber;
    private BigDecimal overspeedDrivingAnalysis;
    private Integer overspeedDrivingNumber;
    private BigDecimal irregularitiesAnalysis;
    private Integer irregularitiesNumber;
    private BigDecimal irregularitiesDriverAnalysis;
    private Integer irregularitiesDriverNumber;
    private BigDecimal irregularitiesCarryingHumanLoadAnalysis;
    private Integer irregularitiesCarryingHumanLoadNumber;
    private BigDecimal drunkenDrivingAnalysis;
    private Integer drunkenDrivingNumber;
    private BigDecimal driverIrregularitiesAnalysis;
    private Integer driverIrregularitiesNumber;
    private BigDecimal drivingLicenseAbnormalDrivingAnalysis;
    private Integer drivingLicenseAbnormalDrivingNumber;
    private BigDecimal highSpeedOverspeedAnalysis;
    private Integer highSpeedOverspeedNumber;
    private BigDecimal highSpeedViolationAnalysis;
    private Integer highSpeedViolationNumber;
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
    @Column(name = "car_id")
    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    @Basic
    @Column(name = "car_number")
    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Basic
    @Column(name = "accident_constitutes_crime_analysis")
    public BigDecimal getAccidentConstitutesCrimeAnalysis() {
        return accidentConstitutesCrimeAnalysis;
    }

    public void setAccidentConstitutesCrimeAnalysis(BigDecimal accidentConstitutesCrimeAnalysis) {
        this.accidentConstitutesCrimeAnalysis = accidentConstitutesCrimeAnalysis;
    }

    @Basic
    @Column(name = "accident_constitutes_crime_number")
    public Integer getAccidentConstitutesCrimeNumber() {
        return accidentConstitutesCrimeNumber;
    }

    public void setAccidentConstitutesCrimeNumber(Integer accidentConstitutesCrimeNumber) {
        this.accidentConstitutesCrimeNumber = accidentConstitutesCrimeNumber;
    }

    @Basic
    @Column(name = "traffic_congestion_irregularities_analysis")
    public BigDecimal getTrafficCongestionIrregularitiesAnalysis() {
        return trafficCongestionIrregularitiesAnalysis;
    }

    public void setTrafficCongestionIrregularitiesAnalysis(BigDecimal trafficCongestionIrregularitiesAnalysis) {
        this.trafficCongestionIrregularitiesAnalysis = trafficCongestionIrregularitiesAnalysis;
    }

    @Basic
    @Column(name = "traffic_congestion_irregularities_number")
    public Integer getTrafficCongestionIrregularitiesNumber() {
        return trafficCongestionIrregularitiesNumber;
    }

    public void setTrafficCongestionIrregularitiesNumber(Integer trafficCongestionIrregularitiesNumber) {
        this.trafficCongestionIrregularitiesNumber = trafficCongestionIrregularitiesNumber;
    }

    @Basic
    @Column(name = "use_counterfeit_driver_license_analysis")
    public BigDecimal getUseCounterfeitDriverLicenseAnalysis() {
        return useCounterfeitDriverLicenseAnalysis;
    }

    public void setUseCounterfeitDriverLicenseAnalysis(BigDecimal useCounterfeitDriverLicenseAnalysis) {
        this.useCounterfeitDriverLicenseAnalysis = useCounterfeitDriverLicenseAnalysis;
    }

    @Basic
    @Column(name = "use_counterfeit_driver_license_number")
    public Integer getUseCounterfeitDriverLicenseNumber() {
        return useCounterfeitDriverLicenseNumber;
    }

    public void setUseCounterfeitDriverLicenseNumber(Integer useCounterfeitDriverLicenseNumber) {
        this.useCounterfeitDriverLicenseNumber = useCounterfeitDriverLicenseNumber;
    }

    @Basic
    @Column(name = "unlicensed_driving_analysis")
    public BigDecimal getUnlicensedDrivingAnalysis() {
        return unlicensedDrivingAnalysis;
    }

    public void setUnlicensedDrivingAnalysis(BigDecimal unlicensedDrivingAnalysis) {
        this.unlicensedDrivingAnalysis = unlicensedDrivingAnalysis;
    }

    @Basic
    @Column(name = "unlicensed_driving_number")
    public Integer getUnlicensedDrivingNumber() {
        return unlicensedDrivingNumber;
    }

    public void setUnlicensedDrivingNumber(Integer unlicensedDrivingNumber) {
        this.unlicensedDrivingNumber = unlicensedDrivingNumber;
    }

    @Basic
    @Column(name = "fatigue_driving_analysis")
    public BigDecimal getFatigueDrivingAnalysis() {
        return fatigueDrivingAnalysis;
    }

    public void setFatigueDrivingAnalysis(BigDecimal fatigueDrivingAnalysis) {
        this.fatigueDrivingAnalysis = fatigueDrivingAnalysis;
    }

    @Basic
    @Column(name = "fatigue_driving_number")
    public Integer getFatigueDrivingNumber() {
        return fatigueDrivingNumber;
    }

    public void setFatigueDrivingNumber(Integer fatigueDrivingNumber) {
        this.fatigueDrivingNumber = fatigueDrivingNumber;
    }

    @Basic
    @Column(name = "hit_and_run_analysis")
    public BigDecimal getHitAndRunAnalysis() {
        return hitAndRunAnalysis;
    }

    public void setHitAndRunAnalysis(BigDecimal hitAndRunAnalysis) {
        this.hitAndRunAnalysis = hitAndRunAnalysis;
    }

    @Basic
    @Column(name = "hit_and_run_number")
    public Integer getHitAndRunNumber() {
        return hitAndRunNumber;
    }

    public void setHitAndRunNumber(Integer hitAndRunNumber) {
        this.hitAndRunNumber = hitAndRunNumber;
    }

    @Basic
    @Column(name = "overcrowding_analysis")
    public BigDecimal getOvercrowdingAnalysis() {
        return overcrowdingAnalysis;
    }

    public void setOvercrowdingAnalysis(BigDecimal overcrowdingAnalysis) {
        this.overcrowdingAnalysis = overcrowdingAnalysis;
    }

    @Basic
    @Column(name = "overcrowding_number")
    public Integer getOvercrowdingNumber() {
        return overcrowdingNumber;
    }

    public void setOvercrowdingNumber(Integer overcrowdingNumber) {
        this.overcrowdingNumber = overcrowdingNumber;
    }

    @Basic
    @Column(name = "overloading_analysis")
    public BigDecimal getOverloadingAnalysis() {
        return overloadingAnalysis;
    }

    public void setOverloadingAnalysis(BigDecimal overloadingAnalysis) {
        this.overloadingAnalysis = overloadingAnalysis;
    }

    @Basic
    @Column(name = "overloading_number")
    public Integer getOverloadingNumber() {
        return overloadingNumber;
    }

    public void setOverloadingNumber(Integer overloadingNumber) {
        this.overloadingNumber = overloadingNumber;
    }

    @Basic
    @Column(name = "overspeed_driving_analysis")
    public BigDecimal getOverspeedDrivingAnalysis() {
        return overspeedDrivingAnalysis;
    }

    public void setOverspeedDrivingAnalysis(BigDecimal overspeedDrivingAnalysis) {
        this.overspeedDrivingAnalysis = overspeedDrivingAnalysis;
    }

    @Basic
    @Column(name = "overspeed_driving_number")
    public Integer getOverspeedDrivingNumber() {
        return overspeedDrivingNumber;
    }

    public void setOverspeedDrivingNumber(Integer overspeedDrivingNumber) {
        this.overspeedDrivingNumber = overspeedDrivingNumber;
    }

    @Basic
    @Column(name = "irregularities_analysis")
    public BigDecimal getIrregularitiesAnalysis() {
        return irregularitiesAnalysis;
    }

    public void setIrregularitiesAnalysis(BigDecimal irregularitiesAnalysis) {
        this.irregularitiesAnalysis = irregularitiesAnalysis;
    }

    @Basic
    @Column(name = "irregularities_number")
    public Integer getIrregularitiesNumber() {
        return irregularitiesNumber;
    }

    public void setIrregularitiesNumber(Integer irregularitiesNumber) {
        this.irregularitiesNumber = irregularitiesNumber;
    }

    @Basic
    @Column(name = "irregularities_driver_analysis")
    public BigDecimal getIrregularitiesDriverAnalysis() {
        return irregularitiesDriverAnalysis;
    }

    public void setIrregularitiesDriverAnalysis(BigDecimal irregularitiesDriverAnalysis) {
        this.irregularitiesDriverAnalysis = irregularitiesDriverAnalysis;
    }

    @Basic
    @Column(name = "irregularities_driver_number")
    public Integer getIrregularitiesDriverNumber() {
        return irregularitiesDriverNumber;
    }

    public void setIrregularitiesDriverNumber(Integer irregularitiesDriverNumber) {
        this.irregularitiesDriverNumber = irregularitiesDriverNumber;
    }

    @Basic
    @Column(name = "irregularities_carrying_human_load_analysis")
    public BigDecimal getIrregularitiesCarryingHumanLoadAnalysis() {
        return irregularitiesCarryingHumanLoadAnalysis;
    }

    public void setIrregularitiesCarryingHumanLoadAnalysis(BigDecimal irregularitiesCarryingHumanLoadAnalysis) {
        this.irregularitiesCarryingHumanLoadAnalysis = irregularitiesCarryingHumanLoadAnalysis;
    }

    @Basic
    @Column(name = "irregularities_carrying_human_load_number")
    public Integer getIrregularitiesCarryingHumanLoadNumber() {
        return irregularitiesCarryingHumanLoadNumber;
    }

    public void setIrregularitiesCarryingHumanLoadNumber(Integer irregularitiesCarryingHumanLoadNumber) {
        this.irregularitiesCarryingHumanLoadNumber = irregularitiesCarryingHumanLoadNumber;
    }

    @Basic
    @Column(name = "drunken_driving_analysis")
    public BigDecimal getDrunkenDrivingAnalysis() {
        return drunkenDrivingAnalysis;
    }

    public void setDrunkenDrivingAnalysis(BigDecimal drunkenDrivingAnalysis) {
        this.drunkenDrivingAnalysis = drunkenDrivingAnalysis;
    }

    @Basic
    @Column(name = "drunken_driving_number")
    public Integer getDrunkenDrivingNumber() {
        return drunkenDrivingNumber;
    }

    public void setDrunkenDrivingNumber(Integer drunkenDrivingNumber) {
        this.drunkenDrivingNumber = drunkenDrivingNumber;
    }

    @Basic
    @Column(name = "driver_irregularities_analysis")
    public BigDecimal getDriverIrregularitiesAnalysis() {
        return driverIrregularitiesAnalysis;
    }

    public void setDriverIrregularitiesAnalysis(BigDecimal driverIrregularitiesAnalysis) {
        this.driverIrregularitiesAnalysis = driverIrregularitiesAnalysis;
    }

    @Basic
    @Column(name = "driver_irregularities_number")
    public Integer getDriverIrregularitiesNumber() {
        return driverIrregularitiesNumber;
    }

    public void setDriverIrregularitiesNumber(Integer driverIrregularitiesNumber) {
        this.driverIrregularitiesNumber = driverIrregularitiesNumber;
    }

    @Basic
    @Column(name = "driving_license_abnormal_driving_analysis")
    public BigDecimal getDrivingLicenseAbnormalDrivingAnalysis() {
        return drivingLicenseAbnormalDrivingAnalysis;
    }

    public void setDrivingLicenseAbnormalDrivingAnalysis(BigDecimal drivingLicenseAbnormalDrivingAnalysis) {
        this.drivingLicenseAbnormalDrivingAnalysis = drivingLicenseAbnormalDrivingAnalysis;
    }

    @Basic
    @Column(name = "driving_license_abnormal_driving_number")
    public Integer getDrivingLicenseAbnormalDrivingNumber() {
        return drivingLicenseAbnormalDrivingNumber;
    }

    public void setDrivingLicenseAbnormalDrivingNumber(Integer drivingLicenseAbnormalDrivingNumber) {
        this.drivingLicenseAbnormalDrivingNumber = drivingLicenseAbnormalDrivingNumber;
    }

    @Basic
    @Column(name = "high_speed_overspeed_analysis")
    public BigDecimal getHighSpeedOverspeedAnalysis() {
        return highSpeedOverspeedAnalysis;
    }

    public void setHighSpeedOverspeedAnalysis(BigDecimal highSpeedOverspeedAnalysis) {
        this.highSpeedOverspeedAnalysis = highSpeedOverspeedAnalysis;
    }

    @Basic
    @Column(name = "high_speed_overspeed_number")
    public Integer getHighSpeedOverspeedNumber() {
        return highSpeedOverspeedNumber;
    }

    public void setHighSpeedOverspeedNumber(Integer highSpeedOverspeedNumber) {
        this.highSpeedOverspeedNumber = highSpeedOverspeedNumber;
    }

    @Basic
    @Column(name = "high_speed_violation_analysis")
    public BigDecimal getHighSpeedViolationAnalysis() {
        return highSpeedViolationAnalysis;
    }

    public void setHighSpeedViolationAnalysis(BigDecimal highSpeedViolationAnalysis) {
        this.highSpeedViolationAnalysis = highSpeedViolationAnalysis;
    }

    @Basic
    @Column(name = "high_speed_violation_number")
    public Integer getHighSpeedViolationNumber() {
        return highSpeedViolationNumber;
    }

    public void setHighSpeedViolationNumber(Integer highSpeedViolationNumber) {
        this.highSpeedViolationNumber = highSpeedViolationNumber;
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
        SvdmBusinesUnitCarDiurnalIllegalAnalysisEntity that = (SvdmBusinesUnitCarDiurnalIllegalAnalysisEntity) o;
        return id == that.id &&
                Objects.equals(unitId, that.unitId) &&
                Objects.equals(carId, that.carId) &&
                Objects.equals(carNumber, that.carNumber) &&
                Objects.equals(accidentConstitutesCrimeAnalysis, that.accidentConstitutesCrimeAnalysis) &&
                Objects.equals(accidentConstitutesCrimeNumber, that.accidentConstitutesCrimeNumber) &&
                Objects.equals(trafficCongestionIrregularitiesAnalysis, that.trafficCongestionIrregularitiesAnalysis) &&
                Objects.equals(trafficCongestionIrregularitiesNumber, that.trafficCongestionIrregularitiesNumber) &&
                Objects.equals(useCounterfeitDriverLicenseAnalysis, that.useCounterfeitDriverLicenseAnalysis) &&
                Objects.equals(useCounterfeitDriverLicenseNumber, that.useCounterfeitDriverLicenseNumber) &&
                Objects.equals(unlicensedDrivingAnalysis, that.unlicensedDrivingAnalysis) &&
                Objects.equals(unlicensedDrivingNumber, that.unlicensedDrivingNumber) &&
                Objects.equals(fatigueDrivingAnalysis, that.fatigueDrivingAnalysis) &&
                Objects.equals(fatigueDrivingNumber, that.fatigueDrivingNumber) &&
                Objects.equals(hitAndRunAnalysis, that.hitAndRunAnalysis) &&
                Objects.equals(hitAndRunNumber, that.hitAndRunNumber) &&
                Objects.equals(overcrowdingAnalysis, that.overcrowdingAnalysis) &&
                Objects.equals(overcrowdingNumber, that.overcrowdingNumber) &&
                Objects.equals(overloadingAnalysis, that.overloadingAnalysis) &&
                Objects.equals(overloadingNumber, that.overloadingNumber) &&
                Objects.equals(overspeedDrivingAnalysis, that.overspeedDrivingAnalysis) &&
                Objects.equals(overspeedDrivingNumber, that.overspeedDrivingNumber) &&
                Objects.equals(irregularitiesAnalysis, that.irregularitiesAnalysis) &&
                Objects.equals(irregularitiesNumber, that.irregularitiesNumber) &&
                Objects.equals(irregularitiesDriverAnalysis, that.irregularitiesDriverAnalysis) &&
                Objects.equals(irregularitiesDriverNumber, that.irregularitiesDriverNumber) &&
                Objects.equals(irregularitiesCarryingHumanLoadAnalysis, that.irregularitiesCarryingHumanLoadAnalysis) &&
                Objects.equals(irregularitiesCarryingHumanLoadNumber, that.irregularitiesCarryingHumanLoadNumber) &&
                Objects.equals(drunkenDrivingAnalysis, that.drunkenDrivingAnalysis) &&
                Objects.equals(drunkenDrivingNumber, that.drunkenDrivingNumber) &&
                Objects.equals(driverIrregularitiesAnalysis, that.driverIrregularitiesAnalysis) &&
                Objects.equals(driverIrregularitiesNumber, that.driverIrregularitiesNumber) &&
                Objects.equals(drivingLicenseAbnormalDrivingAnalysis, that.drivingLicenseAbnormalDrivingAnalysis) &&
                Objects.equals(drivingLicenseAbnormalDrivingNumber, that.drivingLicenseAbnormalDrivingNumber) &&
                Objects.equals(highSpeedOverspeedAnalysis, that.highSpeedOverspeedAnalysis) &&
                Objects.equals(highSpeedOverspeedNumber, that.highSpeedOverspeedNumber) &&
                Objects.equals(highSpeedViolationAnalysis, that.highSpeedViolationAnalysis) &&
                Objects.equals(highSpeedViolationNumber, that.highSpeedViolationNumber) &&
                Objects.equals(sendTime, that.sendTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, unitId, carId, carNumber, accidentConstitutesCrimeAnalysis, accidentConstitutesCrimeNumber, trafficCongestionIrregularitiesAnalysis, trafficCongestionIrregularitiesNumber, useCounterfeitDriverLicenseAnalysis, useCounterfeitDriverLicenseNumber, unlicensedDrivingAnalysis, unlicensedDrivingNumber, fatigueDrivingAnalysis, fatigueDrivingNumber, hitAndRunAnalysis, hitAndRunNumber, overcrowdingAnalysis, overcrowdingNumber, overloadingAnalysis, overloadingNumber, overspeedDrivingAnalysis, overspeedDrivingNumber, irregularitiesAnalysis, irregularitiesNumber, irregularitiesDriverAnalysis, irregularitiesDriverNumber, irregularitiesCarryingHumanLoadAnalysis, irregularitiesCarryingHumanLoadNumber, drunkenDrivingAnalysis, drunkenDrivingNumber, driverIrregularitiesAnalysis, driverIrregularitiesNumber, drivingLicenseAbnormalDrivingAnalysis, drivingLicenseAbnormalDrivingNumber, highSpeedOverspeedAnalysis, highSpeedOverspeedNumber, highSpeedViolationAnalysis, highSpeedViolationNumber, sendTime);
    }
}
