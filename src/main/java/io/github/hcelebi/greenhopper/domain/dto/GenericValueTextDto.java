package io.github.hcelebi.greenhopper.domain.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class GenericValueTextDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 7798749486927160598L;
    private Integer value;
    private String text;
}
