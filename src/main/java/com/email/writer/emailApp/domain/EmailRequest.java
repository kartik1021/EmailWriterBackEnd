package com.email.writer.emailApp.domain;

import lombok.*;


@Getter
@Setter
public class EmailRequest {
    private String emailContent;
    private String tone;
}
