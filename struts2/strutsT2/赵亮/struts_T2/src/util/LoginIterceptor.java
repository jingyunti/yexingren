package util;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginIterceptor extends MethodFilterInterceptor{
//过滤器  当没有登陆时，点击超链接时，跳转到登陆页面
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		String userName = ServletActionContext.getRequest().getParameter("userName");
		if(userName.length()<3){
			//回到登录页面
			return "red";
		}else{
			//放行
			return  invocation.invoke();
		}
	}

}
