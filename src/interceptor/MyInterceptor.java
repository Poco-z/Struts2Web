package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;



public class MyInterceptor implements Interceptor {


    @Override
    public void destroy() {

    }
    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {


        System.out.println("action执行前拦截器");
        final String res = actionInvocation.invoke();
        System.out.println();
        return res;

    }
}
