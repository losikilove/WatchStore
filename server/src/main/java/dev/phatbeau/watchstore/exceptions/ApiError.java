package dev.phatbeau.watchstore.exceptions;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ApiError {
    private Integer errorCode;
    private String errorDescription;
    private Date date;
}
