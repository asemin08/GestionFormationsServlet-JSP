package eu.ensup.gestionformation;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Allan
 */
@WebServlet("/MaServlet")
public class MaServlet extends HttpServlet {
    private static final long serialVersionUID = 1;

    public MaServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><tilte>Liste de formations</title></head>");
        out.println("<body>Liste des formation: java, WEBSERVice </body>");
        out.println("<html>");
        out.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
