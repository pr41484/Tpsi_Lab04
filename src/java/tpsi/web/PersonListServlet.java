package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tpsi.web.Person;

@WebServlet(name = "PersonListServlet", urlPatterns = {"/personList"})
public class PersonListServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Person> osoby = new ArrayList<>();
        osoby.add(new Person("Jan", "Kowalski", "jak.kow.wp.pl"));
        osoby.add(new Person("Marek", "Nowak", "marnow@wp.pl"));
        osoby.add(new Person("James", "Bond", "JB@JB.JB"));
        osoby.add(new Person("Jadzka", "Jadzkowska", "jadziuszka@gmail.com"));
        osoby.add(new Person("Bob", "Marley", "reggaenonstop@gmail.com"));
        osoby.add(new Person("Staszek", "Stachu", "grozny@wp.pl"));

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            request.setAttribute("personList", osoby);
            request.getRequestDispatcher("personList.jsp").forward(request, response);
        }
    }
}
