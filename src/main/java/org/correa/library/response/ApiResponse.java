package org.correa.library.response;

import lombok.Data;

@Data
public class ApiResponse {

    private String mensagem;
    private Object dados;
}
