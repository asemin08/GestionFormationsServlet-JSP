package eu.ensup.gestionformation;

import javax.servlet.RequestDispatcher;
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
@WebServlet(urlPatterns = "/", name="formulaireAuthentification")
public class FormulaireAuthentificationServlet extends HttpServlet {
    private static final long serialVersionUID = 1;

    public FormulaireAuthentificationServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        traitement(req,resp);
//        req.getRequestDispatcher("/formulaire_authentification.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        traitement(req, resp);
    }

    protected void traitement(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        //Etape service

        //Reponse à l'utilisateur
        RequestDispatcher dispatcher;
        if(("test".equalsIgnoreCase(login))&&("test".equalsIgnoreCase(password))){
            dispatcher = req.getRequestDispatcher("/Accueil.jsp");
        }else{
            dispatcher = req.getRequestDispatcher("/formulaire_authentification.jsp");
        }
        dispatcher.forward(req, resp);
    }
}
