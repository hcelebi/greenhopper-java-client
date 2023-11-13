package io.github.hcelebi.greenhopper.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SprintReportDto implements Serializable {
    @Serial
    private static final long serialVersionUID = -4436406563409665368L;
    private SprintReportContents contents;
    private SprintDto sprint;
}
