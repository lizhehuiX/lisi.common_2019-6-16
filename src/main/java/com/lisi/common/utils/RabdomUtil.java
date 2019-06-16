package com.lisi.common.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RabdomUtil {

	// 获取最小最大区间的随机数
	public static int getRandomNuber(Integer min, Integer max) {
		int c = (int) (min + (Math.random()) * (max - min + 1));
		return c;

	}
	// 获取最小最大区间的随机数-不重复
	public static Set<Integer> getRandomNuber2(Integer min, Integer max, int a) {

		Set<Integer> set = new HashSet<Integer>();
		while (set.size() != a && set.size() < max - min + 1) {
			Random r = new Random();
			// Integer d = (int) (min + (Math.random()) * (max - min + 1));
			// int i = r.nextInt((max - min + 1)+min);
			set.add(r.nextInt(max - min + 1) + min);
		 }
		return set;
	}

	public static List getRandomNuber3(Integer min, Integer max, int a) {

		List list = new ArrayList<>();// 集合创建一个List集合
		while (list.size() != a && list.size() < max - min + 1) {// 循环次数在max-min之间并且不能大于要循环的次数
			Random r = new Random();// 写一个Random对象
			int nextInt = r.nextInt(max - min + 1) + min;// 先将随机数放在一个对象内
			for (int i = 0; i <= list.size(); i++) {// 循环判断这个元素是否已经存在集合内
				if (!list.contains(nextInt)) {// 判断是否存在
					list.add(nextInt);//
				}
			}
		}
		return list;
	}

	// 获取一个1-9，a-z之间的随机字符
	public static char getRandomStr() {
		String str = "123456789qwertyuioplkjhgfdsazxcvbnm";
		int i = getRandomNuber(0, str.length() - 1);
		return str.charAt(i);

	}

	// ④ 返回参数指定个数的随机字符串(应用场景如：验证码)
	public static String getRandomStrs(int a) {
		String ss = "";
		String str = "123456789qazwsxedcrfvtgbyhnujmikolpQAZWSXEDCRFVTGBYHNUJMIKOLP";
		while (ss.length() < a) {
			int i=getRandomNuber(0, str.length()-1);

			ss += str.charAt(i);

		}
		return ss;
	}
}
