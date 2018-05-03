package com.jiuqu.cloud.pojo.svdm;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "svdm_busines_unit_car_diurnal_illegal_analysis_handling_opinions", schema = "2018svdm", catalog = "")
public class SvdmBusinesUnitCarDiurnalIllegalAnalysisHandlingOpinionsEntity {
    private int id;
    private Integer analysisId;
    private String handlingOpinions;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "analysis_id")
    public Integer getAnalysisId() {
        return analysisId;
    }

    public void setAnalysisId(Integer analysisId) {
        this.analysisId = analysisId;
    }

    @Basic
    @Column(name = "handling_opinions")
    public String getHandlingOpinions() {
        return handlingOpinions;
    }

    public void setHandlingOpinions(String handlingOpinions) {
        this.handlingOpinions = handlingOpinions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SvdmBusinesUnitCarDiurnalIllegalAnalysisHandlingOpinionsEntity that = (SvdmBusinesUnitCarDiurnalIllegalAnalysisHandlingOpinionsEntity) o;
        return id == that.id &&
                Objects.equals(analysisId, that.analysisId) &&
                Objects.equals(handlingOpinions, that.handlingOpinions);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, analysisId, handlingOpinions);
    }
}
