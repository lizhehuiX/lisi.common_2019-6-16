package com.lisi.common.utils;

import org.junit.Test;

/**
 * <br>
 * Title:TODO 类标题 <br>
 * Description:TODO 类功能描述 <br>
 * Author:李哲辉(1989773396@qq.com) <br>
 * Date:2019年6月15日
 */


public class RabdomUtilTest {

	@Test
	public void testGetRandomNuber() {
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(RabdomUtil.getRandomNuber(1, 10));
		}
	}

	/**
	 * 
	 * <br>
	 * Description:输出区间内~不重复的随机数 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月14日
	 */
	@Test
	public void testGetRandomNuber2() {

		System.out.println(RabdomUtil.getRandomNuber2(2, 10, 66));

	}



	/**
	 * <br>
	 * Title:TODO 类输出区间内~不重复的随机数 方法功能描述 <br>
	 * Description:TODO 类功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月15日
	 */
	@Test
	public void testGetRandomNuber3() {

		System.out.println(RabdomUtil.getRandomNuber3(2, 10, 66));

	}

	@Test
	public void testGetRandomStr() {

		for (int i = 0; i <= 10; i++) {
		System.out.println(RabdomUtil.getRandomStr());
		}
	}

	@Test
	public void testgetRandomStrs() {
		for (int i = 1; i <= 40; i++) {
			System.out.println(RabdomUtil.getRandomStrs(4));
		}
	}

}
