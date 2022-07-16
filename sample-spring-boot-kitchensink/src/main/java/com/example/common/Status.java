/**
 *
 */
package com.example.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author vvggh
 *
 */
public class Status {

	private String CONTEXT = "00"; //ステータス

	private String ITEM = "";

	private String DATE = "";

	private String MONEY = "";

	private String SUB = "";

	public  static final String STA_00 = "00";

	public  static final String STA_01 = "01";

	public  static final String STA_02 = "02";

	public  static final String STA_03 = "03";

	public  static final String STA_04 = "04";

	public  static final String STA_05 = "05";

	public  static final String STA_06 = "06";

	public  static final String STA_07 = "07";

	public  static final String STA_08 = "08";

	public  static final String STA_09 = "09";

	public  static final String STA_10 = "10";

	public  static final String STA_11 = "11";

	public  static final String STA_12 = "12";

	public  static final String STA_13 = "13";

	public  static final String STA_14 = "14";

	public  static final String STA_15 = "15";

	public  static final String STA_97 = "97";

	public  static final String STA_99 = "99";




	/*
	 * ステータスと会話のマッピング
	 */

	static List<String> textList_STA_00 = new ArrayList<>(Arrays.asList(
								Item.ITM_000,
								Item.ITM_001
								));

	static List<String> textList_STA_01 = new ArrayList<>(Arrays.asList(
			Item.ITM_002,
			Item.ITM_003
			));

	static List<String> textList_STA_02 = new ArrayList<>(Arrays.asList(
			Item.ITM_01,
			Item.ITM_02,
			Item.ITM_03,
			Item.ITM_04
			));

    private static final Map<String, List<String>> statusMap;
    static {
        Map<String, List<String>> map = new HashMap<>();
        map.put(STA_00, textList_STA_00);
        map.put(STA_01, textList_STA_01);
        map.put(STA_02, textList_STA_02);
        statusMap = Collections.unmodifiableMap(map);
    }

    /**
     * ステータスに対する会話ができているか判別
     * @param context
     * @param text
     * @return
     */
    public boolean isContextToText(String context, String text) {

    	return statusMap.get(context).contains(text)? true : false;
    }

}
