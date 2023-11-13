package io.github.hcelebi.greenhopper.domain.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
public class VelocityStatEntryDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 2438053373635347764L;
    private EstimationDto estimated;
    private EstimationDto completed;
    private List<String> allConsideredIssueKeys;
    private List<EntryDto> estimatedEntries;
    private List<EntryDto> completedEntries;
}
