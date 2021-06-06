package cookiesproj;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieExample  extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             PrintWriter out = response.getWriter();
              if(request.getParameter("id").equals("elon") && request.getParameter("pwd").equals("101")){
            
                response.setContentType("text/html;charset=UTF-8");
                                 out.println("<html>");
                                 out.println("<head>");
                                 out.println("<title>Servlet use Cookies</title>");            
                                 out.println("</head>");
                                 out.println("<body>");
                                 out.println("<h1>Welcome Cookie</h1>");
                                 out.println("<a href='Cookie2'>Click here</a>");
                                 out.println("</body>");
                                 out.println("</html>");
             Cookie ck=new Cookie("cookie1",request.getParameter("id"));
            response.addCookie(ck);
            
            }else{
            
            RequestDispatcher r=request.getRequestDispatcher("index.html");
            r.include(request, response);
            out.println("Incorrect ID or Password");
            }
        }
    }