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
        osoby.add(new Person("Jan", "Kowalski", "superfajny@mail.de"));
        osoby.add(new Person("Aleksander", "Nowak", "mail@gmail.com"));
        osoby.add(new Person("Helen", "Shaw", "shaw@test.com"));
        osoby.add(new Person("Madison", "Kitches", "Kleeberg@gmail.com"));
        osoby.add(new Person("Beau", "Stopford", "BeauStopford@gmail.com"));
        osoby.add(new Person("Zoe", "Earp", "ZoeEarp@gmail.com"));

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            request.setAttribute("personList", osoby);
            request.getRequestDispatcher("personList.jsp").forward(request, response);
        }
    }
}
