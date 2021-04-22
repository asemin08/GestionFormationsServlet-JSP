package eu.ensup.gestionformation.servlet;

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
@WebServlet(urlPatterns = "/FormulaireInscriptionServlet", name="formulaire")
public class FormulaireInscriptionServlet extends HttpServlet {
    private static final long serialVersionUID = 1;

    public FormulaireInscriptionServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/formulaire_inscription.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        String email = req.getParameter("email");
        String login = req.getParameter("login");
        String password = req.getParameter("password");


        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<ul>");
        out.println("<li> nom : "+ nom + "</li>");
        out.println("<li> prenom : "+ prenom + "</li>");
        out.println("<li> email : "+ email + "</li>");
        out.println("<li> login : "+ login + "</li>");
        out.println("<li> password : "+ password + "</li>");
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
    }
}
