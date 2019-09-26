package me.study.springwebmvc;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init(ServletConfig config) throws ServletException { //초기 구동시 실행된다. warmup을 위해 처음 모든 uri를 호출하는것도 방법
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
