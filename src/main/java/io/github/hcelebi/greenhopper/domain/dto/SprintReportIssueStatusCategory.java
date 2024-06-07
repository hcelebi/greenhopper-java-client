package io.github.hcelebi.greenhopper.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class SprintReportIssueStatusCategory implements Serializable {
    private int id;
    private String key;
    private String colorName;
}
