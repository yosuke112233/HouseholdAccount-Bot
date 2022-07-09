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
    public static String readContext(String userId) {
        return PseudoSession.statusMap.get(userId).getCONTEXT();
    }

    public static String readItem(String userId) {
        return PseudoSession.statusMap.get(userId).getITEM();
    }

    public static String readDate(String userId) {
        return PseudoSession.statusMap.get(userId).getDATE();
    }

    public static String readMoney(String userId) {
        return PseudoSession.statusMap.get(userId).getMONEY();
    }

    public static String readSub(String userId) {
        return PseudoSession.statusMap.get(userId).getSUB();
    }

    /*
     * 各項目の更新
     */
    public static void updateContext(String userId, String context) {
        Status newStatus = PseudoSession.statusMap.get(userId);
        newStatus.setCONTEXT(context);
        PseudoSession.statusMap.put(userId, newStatus);
    }

    public static void updateItem(String userId, String item) {
        Status newStatus = PseudoSession.statusMap.get(userId);
        newStatus.setITEM(item);
        PseudoSession.statusMap.put(userId, newStatus);
    }

    public static void updateDate(String userId, String date) {
        Status newStatus = PseudoSession.statusMap.get(userId);
        newStatus.setDATE(date);
        PseudoSession.statusMap.put(userId, newStatus);
    }

    public static void updateMoney(String userId, String money) {
        Status newStatus = PseudoSession.statusMap.get(userId);
        newStatus.setMONEY(money);
        PseudoSession.statusMap.put(userId, newStatus);
    }

    public static void updateSub(String userId, String sub) {
        Status newStatus = PseudoSession.statusMap.get(userId);
        newStatus.setSUB(sub);
        PseudoSession.statusMap.put(userId, newStatus);
    }

}