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
@WebServlet(urlPatterns = "/FormulaireAuthentificationServlet", name="formulaireAuthentification")
public class FormulaireAuthentificationServlet extends HttpServlet {
    private static final long serialVersionUID = 1;

    public FormulaireAuthentificationServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/formulaire_authentification.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");


        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<ul>");
        out.println("<li> login : "+ login + "</li>");
        out.println("<li> password : "+ password + "</li>");
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
    }
}
