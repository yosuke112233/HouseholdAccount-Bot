/**
 *
 */
package com.example.common;

/**
 *
 * メッセージクラス
 * @author vvggh
 *
 */
public class LineMessage {

	private LineMessage () {};

	public static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static final String MSG_01 = "収入ですか？" + LINE_SEPARATOR + "出費ですか？";

	public static final String MSG_02 = "項目を選択してください！";

	public static final String MSG_03 = "何日ですか？";

	public static final String MSG_04 = "金額を教えてください！";

	public static final String MSG_05 = "これでいい？？" + LineMessage.LINE_SEPARATOR
			+ "【日付】{0}"+ LineMessage.LINE_SEPARATOR
			+ "【項目】{1}"+ LineMessage.LINE_SEPARATOR
			+ "【金額】{2}"+ LineMessage.LINE_SEPARATOR;

	public static final String MSG_06 = "登録完了しました！";

	public static final String MSG_07 = "何かメモする？";

	public static final String MSG_08 = "YES";

	public static final String MSG_09 = "NO";
}
