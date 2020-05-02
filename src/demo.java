import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class demo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        String U = "lyn";
        String p = "123";

        if (U.equals(username) && p.equals(password)){
            System.out.println("OK");
            resp.getWriter().print("OK");
            Cookie key =new Cookie(
                    "key", "123456");
            key.setMaxAge(60*3);
            resp.addCookie(key);
        }else{
            System.out.println("NO");
            resp.getWriter().print("--");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
