package com.example.wathchshopapi.global.base;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@RequiredArgsConstructor
public class BaseMessages {

    private final MessageSource messageSource;

    public static final String LOCALE_DEFAULT = "vi";

    // trạng thái log
    public static final String LOG_THUC_HIEN = "1";
    public static final String LOG_API = "2";
    public static final String LOG_DATA = "3";
    public static final String LOG_ERROR = "4";

    public static final String EXPORT_EXCEL = "xuất excel ";
    public static final String IMPORT_EXCEL = "nhập excel ";
    public static final String XEM_CHI_TIET = "xem chi tiết ";
    public static final String CHINH_SUA = "chỉnh sửa ";
    public static final String THEM_MOI = "thêm mới ";
    public static final String XOA = "xóa ";


    public String getMessage(String key, Locale locale) {
        if (locale == null) {
            locale = new Locale(LOCALE_DEFAULT);
        }

        try {
            return this.messageSource.getMessage(key, null, locale);
        } catch (NoSuchMessageException var4) {
            return key;
        }
    }

    public String getMessage(String key) {
        return this.getMessage(key, LocaleContextHolder.getLocale());
    }


    public static class coSoSanXuat {
        private coSoSanXuat() {
        }
        public static final String HEADER_REPORT_EXCEL = "default.cososanxuat.header";
        public static final String SHEET_NAME = "default.cososanxuat.sheetname";
        public static final String FILE_NAME = "default.cososanxuat.filename";
        public static final String FILE_NAME_TEMPLATE = "default.cososanxuat.filenametempalte";

        public static final String CO_SO_SAN_XUAT = "danh mục cơ sở sản xuất biển";


    }
    public static class suDungHeThong {
        private suDungHeThong() {
        }

        public static final String HEADER_REPORT_EXCEL = "default.sudunghethong.header";
        public static final String SHEET_NAME = "default.sudunghethong.sheetname";
        public static final String FILE_NAME = "default.sudunghethong.filename";

    }
    public static class xeTamDungDangKy {
        private xeTamDungDangKy() {
        }

        public static final String HEADER_IMPORT_EXCEL = "default.xetamdungdangky.header";
        public static final String SHEET_NAME = "default.xetamdungdangky.sheetname";
        public static final String FILE_NAME_TEMPLATE = "default.xetamdungdangky.filename";


    }
    public static class maKhuKinhTe {
        private maKhuKinhTe() {
        }

        public static final String HEADER_REPORT_EXCEL = "default.makhukinhte.header";
        public static final String SHEET_NAME = "default.makhukinhte.sheetname";
        public static final String FILE_NAME = "default.makhukinhte.filename";
        public static final String MA_KHU_KINH_TE = "danh mục mã khu kinh tế";

    }
    public static class quanLySeriChu {
        private quanLySeriChu() {
        }

        public static final String HEADER_REPORT_EXCEL = "default.quanlyserichu.header";
        public static final String SHEET_NAME = "default.quanlyserichu.sheetname";
        public static final String FILE_NAME = "default.quanlyserichu.filename";

        public static final String QUAN_LY_SR_CHU = "danh mục quản lí seri chữ";

    }

    public static class quanLyBienSo {
        private quanLyBienSo() {
        }

        public static final String TAO_DAY_TIEP_THEO = "Tạo dãy biển tiếp theo";
        public static final String TAO_CA_DAY_BIEN = "tạo cả dãy biển";
        public static final String XOA_DAY_BIEN = "Xóa dãy biển";
        public static final String XEM_CHI_TIET_DAY_BIEN = "Xem chi tiết dãy biển";
        public static final String DANH_DAU_BIEN_SO = "đánh dấu biển số";
        public static final String GUI_DAY_BIEN_DAU_GIA = "gửi dãy biển đấu giá";

        public static final String QUAN_LY_BIEN_SO = "quản lý biển số";

    }

    public static class capBienDiemDk {
        private capBienDiemDk() {
        }
        public static final String THEM_MOI_CAP_BIEN_DDK = "Thêm mới cấp biển cho điểm đăng ký";
        public static final String XOA_DAY_BIEN_CAP_DDK = "Xóa dãy biển cấp cho điểm đăng ký";
        public static final String CAP_NHAT_DAY_BIEN_DDK = "Chỉnh sửa dãy biển cấp cho điểm đăng ký";
    }

    public static class player {
        private player() {
        }

        public static final String HEADER_REPORT_EXCEL = "default.player.header";
        public static final String SHEET_NAME = "default.player.sheetname";
        public static final String FILE_NAME = "default.player.filename";
    }

}
