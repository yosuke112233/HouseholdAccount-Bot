/**
 *
 */
package com.example.common;

import lombok.Data;

/**
 * @author vvggh
 *
 */
@Data
public class Status {

	public Status () {};

	private String STA_00 = "00";

	private String STA_01 = "01";

	private String CONTEXT = "0"; //ステータス

	public String ITEM = "";

	public String DATE = "";

	public String MONEY = "";

	public String SUB = "";

}
