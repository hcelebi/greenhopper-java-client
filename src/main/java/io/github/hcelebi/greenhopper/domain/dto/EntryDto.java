package io.github.hcelebi.greenhopper.domain.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class EntryDto implements Serializable {
    @Serial
    private static final long serialVersionUID = -3336008724127329984L;
    private String issueKey;
    private Integer value;
}
