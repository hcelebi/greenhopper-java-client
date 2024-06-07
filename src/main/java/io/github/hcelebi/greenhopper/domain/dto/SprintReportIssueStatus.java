package io.github.hcelebi.greenhopper.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class SprintReportIssueStatus implements Serializable {
    private String id;
    private String name;
    private String description;
    private String iconUrl;
    private SprintReportIssueStatusCategory statusCategory;
}
