package com.xiaoyang.jvm;

public class TestOutOfMemoryStack {
  /*
    Exception in thread "main" java.lang.StackOverflowError
	at com.xiaoyang.jvm.TestOutMemoryHeap.test(TestOutMemoryHeap.java:10)
	实现思路是嵌套循环调用，超出Jvm栈的调用深度
  */
	public void test(){
		this.test();
	}
	public static void main(String[] args) {
		new TestOutOfMemoryStack().test();
	}
}
