package com.interceptor.util;

import java.util.Iterator;
import java.util.Map;

import javax.swing.text.AbstractDocument.Content;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.opensymphony.xwork2.util.ValueStack;

// MethodFilterInterceptor 对粗度更细的方法进行拦截
public class MyInterDemo4 extends MethodFilterInterceptor {

	protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" execute action running ");
		
		return actionInvocation.invoke();
	}


}
