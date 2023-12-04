package io.github.hcelebi.greenhopper.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.hcelebi.greenhopper.serializer.CustomDateTimeDeserializer;
import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SprintDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 4055915231421802746L;
    private Integer id;
    private Integer sequence;
    private String name;
    private String state;
    private Integer linkedPagesCount;
    private String goal;
    private Integer sprintVersion;
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    private DateTime isoStartDate;
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    private DateTime isoEndDate;
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    private DateTime isoCompleteDate;
}