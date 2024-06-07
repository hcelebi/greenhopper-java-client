package io.github.hcelebi.greenhopper.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SprintReportIssue implements Serializable {
    private int id;
    private String key;
    private boolean hidden;
    private int parentId;
    private String parentKey;
    private String typeName;
    private String typeId;
    private int typeHierarchyLevel;
    private String summary;
    private String typeUrl;
    private String priorityUrl;
    private String priorityName;
    private String priorityId;
    private boolean done;
    private String assignee;
    private String assigneeKey;
    private String assigneeAccountId;
    private String assigneeName;
    private String avatarUrl;
    private boolean hasCustomUserAvatar;
    private boolean flagged;
    private String epic;
    private SprintReportIssueEpicField epicField;
    private SprintReportIssueEstimateStatistic currentEstimateStatistic;
    private boolean estimateStatisticRequired;
    private SprintReportIssueEstimateStatistic estimateStatistic;
    private String statusId;
    private String statusName;
    private String statusUrl;
    private SprintReportIssueStatus status;
    private int projectId;
    private int linkedPagesCount;
    private List<Integer> sprintIds;
    private long updatedAt;
}
