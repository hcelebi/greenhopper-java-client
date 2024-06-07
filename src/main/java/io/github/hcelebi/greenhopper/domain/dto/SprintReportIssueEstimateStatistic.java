package io.github.hcelebi.greenhopper.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class SprintReportIssueEstimateStatistic implements Serializable {
    private String statFieldId;
    private SprintReportIssueStatFieldValue statFieldValue;
}
