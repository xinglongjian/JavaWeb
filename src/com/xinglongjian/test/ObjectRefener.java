package com.xinglongjian.test;

/**
 * ����java���ݲ��������û��Ǵ�ֵ
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
	     * javaȷʵʹ�ö����������������ģ����еĶ�������������á����ǣ�java���򷽷����ݲ�����ʱ��
	     * �������ã�����ֵ��
	     * 
	     * java�����񴫵��κ���������һ����ͨ����ֵ���������ã������ζ�ţ�������������ʵ������ԭʼ���õ�
	     * һ������������Ҳ��ָ����ԭʼ���õĶ��������޸ĸ�������Ҳ�����޸�ָ��Ķ��󡣵��ǵ��Ѹ������������񸱱���ֵʱ�Ͳ�����Ч
	     * �ڷ������ⲿ�����������õ���ԭʼ���á�
	     */
	}
}
