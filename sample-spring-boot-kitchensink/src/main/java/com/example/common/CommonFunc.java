/**
 *
 */
package com.example.common;

import java.util.Objects;

/**
 * 共通関数クラス
 * @author vvggh
 *
 */
public class CommonFunc {

	/**
	 * Equalクラス(Null回避)
	 * @param arg 比較元
	 * @param target 比較相手
	 * @return true: 比較結果が同一の場合, false: 比較結果が異なる場合または、argの内容がNullの場合
	 */
	public static boolean isEqual(Object arg, Object target) {

		if (isNULL(arg)) {
			return false;
		}

		return arg.equals(target);
	}

	/**
	 * Nullチェック関数
	 * @param arg 対象
	 * @return true NULLの場合: false: NULL以外の場合
	 */
	public static boolean isNULL(Object arg) {
		return Objects.isNull(arg)?   true :  false;
	}

}
