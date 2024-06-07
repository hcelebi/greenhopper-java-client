package io.github.hcelebi.greenhopper.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class SprintReportIssueEpicField implements Serializable {
    private String id;
    private String label;
    private boolean editable;
    private String renderer;
    private int issueId;
    private String summary;
    private String epicKey;
    private String epicColor;
    private String color;
    private String text;
    private String issueTypeId;
    private String issueTypeIconUrl;
    private boolean canRemoveEpic;
}
