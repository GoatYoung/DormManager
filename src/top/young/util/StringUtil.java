package top.young.util;

public class StringUtil {
	/**
	 * �ж��ַ����Ƿ�Ϊ��
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if(str==null || "".equals(str.trim())){
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * �ж��ַ����Ƿ�ǿ�
	 */
	public static boolean isNotEmpty(String str) {
		if(str==null || "".equals(str.trim())){
			return false;
		}else {
			return true;
		}
	}
}
