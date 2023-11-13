package io.github.hcelebi.greenhopper.domain.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
public class VelocityDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 2687621281092691900L;
    private List<SprintDto> sprints;
    private Map<String, VelocityStatEntryDto> velocityStatEntries;
}
