package com.example;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.action.SessionAware;

import java.util.Map;

public class CustomSession extends ActionSupport {
    private static final Map<String, Object> session = ActionContext.getContext().getSession();

//    private  Map<String, Object> session;

    public String execute() {

        //set session name
        session.put("userName", "testUser");

        //get session stored name
        String name= (String)session.get("userName");
        System.out.println(name);
        return SUCCESS;
    }


}
