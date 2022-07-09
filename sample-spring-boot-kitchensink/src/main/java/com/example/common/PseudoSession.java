/**
 *
 */
package com.example.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 疑似的なセッションクラス
 * @author vvggh
 *
 */
public class PseudoSession {

    private static Map<String,Status> statusMap = new HashMap<>();

    /*
     *  ステータス管理
     */
    public static Status getStatus(String userId) {
        return PseudoSession.statusMap.get(userId);
    }

    public static void putStatus(String userId, Status status) {
        PseudoSession.statusMap.put(userId, status);
    }

    /*
     * 各項目の読み取り
     */
    public static String readITEM(String userId) {
        return PseudoSession.statusMap.get(userId).getITEM();
    }

    public static String readDATE(String userId) {
        return PseudoSession.statusMap.get(userId).getDATE();
    }

    public static String readMONEY(String userId) {
        return PseudoSession.statusMap.get(userId).getMONEY();
    }

    public static String readSUB(String userId) {
        return PseudoSession.statusMap.get(userId).getSUB();
    }

    /*
     * 各項目の更新
     */
    public static void updateITEM(String userId, String item) {
        Status newStatus = PseudoSession.statusMap.get(userId);
        newStatus.setITEM(item);
        PseudoSession.statusMap.put(userId, newStatus);
    }

    public static void updateDate(String userId, String date) {
        Status newStatus = PseudoSession.statusMap.get(userId);
        newStatus.setDATE(date);
        PseudoSession.statusMap.put(userId, newStatus);
    }

    public static void updateMONEY(String userId, String money) {
        Status newStatus = PseudoSession.statusMap.get(userId);
        newStatus.setMONEY(money);
        PseudoSession.statusMap.put(userId, newStatus);
    }

    public static void updateSUB(String userId, String sub) {
        Status newStatus = PseudoSession.statusMap.get(userId);
        newStatus.setSUB(sub);
        PseudoSession.statusMap.put(userId, newStatus);
    }

}