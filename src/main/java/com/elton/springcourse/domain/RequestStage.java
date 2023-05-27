package com.elton.springcourse.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class RequestStage {
    private Long Id;
    private String description;
    private Date realizationDate;
    private RequestStage state;
    private Request request;
    private User user;

}
