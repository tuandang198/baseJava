package com.example.wathchshopapi.global.utils;

import com.example.wathchshopapi.global.exception.ResourceExistedException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.lang.Nullable;
//import com.google.zxing.BarcodeFormat;
//import com.google.zxing.EncodeHintType;
//import com.google.zxing.MultiFormatWriter;
//import com.google.zxing.WriterException;
//import com.google.zxing.client.j2se.MatrixToImageWriter;
//import com.google.zxing.common.BitMatrix;
//import etc.bca.c08.dkx.global.exception.ResourceExistedException;
//
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
import java.sql.Clob;
import java.sql.SQLException;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class StringUtils {

    public static final String PERCENT = "%";

    public static final String COMMA = ",";

    public static final String DOT = ".";

    private StringUtils() {
    }

    public static String objectToJson(Object o) throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(o);
    }

    public static Clob strToClob(String str) throws SQLException {
        return new javax.sql.rowset.serial.SerialClob(str.toCharArray());
    }

    public static boolean isNullOrBlank(String str) {
        return str == null || str.isBlank();
    }

//    public static boolean isNumeric(String str) {
//        return org.apache.commons.lang.StringUtils.isNumeric(str);
//    }

    public static String trimObject(Object e) {
        if (e != null) {
            return e.toString().trim();
        }
        return null;
    }

    public static String getUpFirstStr(String s){
        if(s==null){
            return "";
        }
        String[] splitS = s.split(" ");
        String newVl = "";
        for(int i = 0; i < splitS.length; i++){
            String strChar = splitS[i].trim();
            if(strChar.length()>0){
                strChar = strChar.substring(0, 1).toUpperCase() + strChar.substring(1);
                newVl += strChar + " ";
            }
        }
        return newVl;
    }

    public static String removeSpecCharPlase(String a){
        if(a==null){
            return null;
        }
        if (a.contains(".")) {
            String sub1 = a.substring(a.indexOf(".") + 1, a.length());
            //          sub1 = sub1.substring(0, 3) + sub1.substring(4, 6);
            String sub2 = a.substring(0, a.indexOf("."));
            a = sub2 + sub1;
        }

        String[] split2 = a.split("-");
        a = "";
        for (int i = 0; i < split2.length; i++) {
            a += split2[i];
        }
        a = a.toUpperCase().trim();
        return a;
    }

    public static String convertInt2String(String n, int totalNumber) {
        StringBuilder addZero = new StringBuilder();
        if (n.length() <= totalNumber) {
            addZero.append("0".repeat(Math.max(0, totalNumber - n.length())));
            addZero.append(n);
        }
        return addZero.toString();
    }

    public static String removeAccent(String text) {
        String temp = Normalizer.normalize(text, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        temp = pattern.matcher(temp).replaceAll("");
        return temp.replace("đ", "d");
    }

    public static <T> void isSizeListEmpty(List<T> tList, String resourceName) {
        if (!tList.isEmpty()) {
            throw new ResourceExistedException(resourceName);
        }
    }

    public static String formatDate(Date date) {
        return new SimpleDateFormat("dd-MM-yyyy").format(date);
    }

    public static String formatDateODb(Date date) {
        return new SimpleDateFormat("dd-MMM-yy").format(date);
    }

    public static String formatTime2FileName(Date date) {
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }

    public static String formatDate2FileName(Date date) {
        return new SimpleDateFormat("HH_mm_ss_SSSS").format(date);
    }

    //    public static byte[] genQrCodeBase64String(String content, String format, int width, int height) throws WriterException, IOException {
//        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
//        Map hints = new HashMap();
//        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
//        hints.put(EncodeHintType.MARGIN, 2);
//        BitMatrix bitMatrix = multiFormatWriter.encode(content, BarcodeFormat.QR_CODE, width, height, hints);
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//        MatrixToImageWriter.writeToStream(bitMatrix, format, bos);
//        return bos.toByteArray();
////          return new String(Base64.encodeBase64(bos.toByteArray()), "utf-8");
//    }
    public static String formatSp(String spName, @Nullable Object... args) {
        StringBuilder callProc = new StringBuilder();
        StringBuilder commaBuilder = new StringBuilder();
        callProc.append("CALL ").append(spName).append("(");
        if (args != null && args.length!=0) {
            String comma = commaBuilder.append(",?".repeat(args.length)).substring(1);
            callProc.append(comma);
        }
        callProc.append(");");
        return callProc.toString();
    }
}
