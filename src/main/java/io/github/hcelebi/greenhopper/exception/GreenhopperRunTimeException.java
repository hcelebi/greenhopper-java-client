package io.github.hcelebi.greenhopper.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serial;

@Getter
@AllArgsConstructor
public class GreenhopperRunTimeException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = -3829641624015437540L;

    public GreenhopperRunTimeException(String message) {
        super(message);
    }
}
