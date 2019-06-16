package com.lisi.common.utils;

import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

import com.lisi.common.bean.Student;

public class StringUtilsTest {

	static Scanner sc = new Scanner(System.in);
	/**
	 * 
	 * <br>
	 * Description:①判断源字符串是否有值，空引号(空白字符串) 也算没值方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月15日
	 */
	@Test
	public void testGetIsN() {
		String string = sc.nextLine();
		if (StringUtils.getIsN(string)) {
			System.out.println("你输入的不是空：" + string);
		} else {
			System.out.println("空的");
		}

	}

	/**
	 * 
	 * <br>
	 * Description:①判断源字符串是否有值，空引号(空白字符串) 也算没值方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月15日
	 */
	@Test
	public void testGetIsN2() {
		String string = sc.nextLine();
		if (StringUtils.getIsN2(string)) {
			System.out.println("你输入的不是空：" + string);
		} else {
			System.out.println("空的");
		}

	}

	/**
	 * <br>
	 * Description:TODO 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月15日
	 */
	@Test
	public void GenerateChineseWord() {
		System.out.println(StringUtils.GenerateChineseWord(6));
	}

	@Test
	public void GenerateChineseWord2() {
		System.out.println(StringUtils.GenerateChineseWord2());
	}

	@Test
	public void GetSname() {
		for (int i = 0; i < 100; i++) {

		System.out.println(StringUtils.GetSname());
		}
	}

	@Test
	public void GetStudent() {
		for (int i = 0; i < 100; i++) {
			Student s = new Student(StringUtils.GetSname(), RabdomUtil.getRandomNuber(1, 99),
					StringUtils.GenerateChineseWord(60), new Date());
			System.out.println(s);
		}
	}

	@Test
	public void aa() {
		String str1 = "";
		for (int i = 0; i < 100; i++) {
			char str = (char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1)));
			str1 += str;
		}
		//String ss = new String(str1, "gb2312");
		System.out.println(str1);
	}

}
