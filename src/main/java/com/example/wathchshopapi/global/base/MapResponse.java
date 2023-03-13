package com.example.wathchshopapi.global.base;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Data
public class MapResponse {
    public  String status;
    public  String message;
    public  Object data;

    public MapResponse(String status,Object data) {
        this.status = status;
        this.data = data;
    }
//    public MapErrorResponse(String message,Object data) {
//        this.message = message;
//        this.data = data;
//    }
}
