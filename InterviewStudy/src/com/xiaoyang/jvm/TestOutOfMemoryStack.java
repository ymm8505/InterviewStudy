package com.xiaoyang.jvm;

public class TestOutOfMemoryStack {
  /*
    Exception in thread "main" java.lang.StackOverflowError
	at com.xiaoyang.jvm.TestOutMemoryHeap.test(TestOutMemoryHeap.java:10)
	ʵ��˼·��Ƕ��ѭ�����ã�����Jvmջ�ĵ������
  */
	public void test(){
		this.test();
	}
	public static void main(String[] args) {
		new TestOutOfMemoryStack().test();
	}
}
