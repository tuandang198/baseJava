package com.example.wathchshopapi.global.utils;

public class ApiConstants {
    private ApiConstants() {
    }

    public static final String BASE_V1 = "/v1";

    public static class userController {
        private userController() {

        }
        public static final String BASE = "/user";
    }

    public static class playerController {
        private playerController() {

        }
        public static final String BASE = "/player";

        public static final String EXPORT_EXCEL = "/report-excel";

    }
}
