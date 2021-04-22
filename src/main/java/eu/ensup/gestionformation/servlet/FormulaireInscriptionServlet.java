package eu.ensup.gestionformation.servlet;

import eu.ensup.gestionformation.metier.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

        //Etape service
        User user = new User(login, password);
        HttpSession maSession = req.getSession();

        maSession.setAttribute("nom",nom);
        maSession.setAttribute("prenom", prenom);
        maSession.setAttribute("email", email);
        maSession.setAttribute("login", login);
        maSession.setAttribute("password", password);

        //redirection vers page jsp
        RequestDispatcher dispatcher = null;
        dispatcher = req.getRequestDispatcher("/demoEL.jsp");
        dispatcher.forward(req,resp);

    }
}
