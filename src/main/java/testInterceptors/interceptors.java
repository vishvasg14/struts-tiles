package testInterceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class interceptors implements Interceptor {
    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date :"+simpleDateFormat.format(new Date()));
        return actionInvocation.invoke();
    }
}
