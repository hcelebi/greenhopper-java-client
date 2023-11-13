package io.github.hcelebi.greenhopper.domain.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class EstimationDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 8365689993726195686L;
    private Integer value;
    private String text;
}
