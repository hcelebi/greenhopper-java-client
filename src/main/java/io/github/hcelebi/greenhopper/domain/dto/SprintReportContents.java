package io.github.hcelebi.greenhopper.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SprintReportContents implements Serializable {
    @Serial
    private static final long serialVersionUID = -5174794604933802897L;
    private GenericValueTextDto completedIssuesInitialEstimateSum;
    private GenericValueTextDto completedIssuesEstimateSum;
    private GenericValueTextDto issuesNotCompletedInitialEstimateSum;
    private GenericValueTextDto issuesNotCompletedEstimateSum;
    private List<SprintReportIssue> completedIssues;
    private List<SprintReportIssue> issuesNotCompletedInCurrentSprint;
}
