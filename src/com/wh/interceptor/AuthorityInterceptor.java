package com.wh.interceptor;

import java.util.Map;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.wh.entity.Admin;
import com.wh.entity.Users;

public class AuthorityInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// ȡ�������Action��
        String name = invocation.getInvocationContext().getName();
        if (name.equals("validateLogin")) {
            // ����û����¼����ʹ֮ͨ��
            return invocation.invoke();
        } else {
            // ȡ��Session
            ActionContext ac = invocation.getInvocationContext();
            Map session = (Map)ac.get(ServletActionContext.SESSION);
            if (session == null) {
                // ���SessionΪ�գ������û���½
                return "login";
            } else {
            	Users users = (Users)session.get("users");
                if (users == null) {
                	Admin admin=(Admin)session.get("admin");
                	if(admin==null){
                		// Session��Ϊ�գ���Session��û���û���Ϣ�� �����û���½
                		return "login";
                	}else{
                		// ������½������
                        return invocation.invoke();
                	}                	
                    
                } else {
                    // �û���½������
                    return invocation.invoke();
                }
            }
        }

	}

}