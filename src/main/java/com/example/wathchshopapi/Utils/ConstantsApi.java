package com.example.wathchshopapi.Utils;

public interface ConstantsApi {
    String BASE = "/watch-shop";
    String SYSTEM_PARAM = BASE + "/system-parameters";
    String ORDER = BASE + "/order";
    String COMPANY_INFO = BASE + "/company-info";

    interface function {
        String ADD = "/add";
        String UPDATE = "/update";
        String DELETE = "/delete";
        String GET_ALL = "/all";
    }
}
