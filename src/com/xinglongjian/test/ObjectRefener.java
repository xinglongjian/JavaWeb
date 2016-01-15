package com.xinglongjian.test;

/**
 * 测试java传递参数是引用还是传值
 * @author 80101355
 *
 */
public class ObjectRefener {

	public void testString(String test){
		test="test";
	}
	
	public void testStringBuffer(StringBuffer sb){
		sb.append("test");
	}
	
	public void testInteger(Integer i){
		i=10;
	}
	public void testStringBuffer(StringBuffer sb1,StringBuffer sb2){
		sb1.append("test");
		sb2=sb1;
		System.out.println("sb2="+sb2);//test
	}
	
	public static void main(String[] args) {
		
		ObjectRefener or=new ObjectRefener();
		
		StringBuffer sb1=new StringBuffer("");
		StringBuffer sb2=new StringBuffer("");
		or.testStringBuffer(sb1,sb2);
		System.out.println("sb1="+sb1);//sb1=test
		System.out.println("sb2="+sb2);//sb2=
		
		String str=new String();
		or.testString(str);
		System.out.println(str);
		
		Integer i=new Integer(1);
		or.testInteger(i);
		System.out.println(i);//1
		
		//http://www.importnew.com/3559.html#comment-483615
	    /**
	     * java确实使用对象的引用来做计算的，所有的对象变量都是引用。但是，java在向方法传递参数的时候
	     * 不是引用，而是值。
	     * 
	     * java仅仅像传递任何其他参数一样，通过传值来传递引用，这就意味着，传向函数的引用实际上是原始引用的
	     * 一个副本。副本也是指向了原始引用的对象，所有修改副本本身，也就是修改指向的对象。但是当把副本对其他对像副本赋值时就不会生效
	     * 在方法体外部，其他对象用的是原始引用。
	     */
	}
}
