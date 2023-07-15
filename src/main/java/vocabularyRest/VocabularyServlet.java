package vocabularyRest;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class VocabularyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");

        printWriter.println("<p>" + "You can choose the word from the list: \n" + "</p>");
        for (Vocabulary v : Vocabulary.values()) {
            printWriter.println("<p>" + v.getTranslate() + "</p>");
        }
        printWriter.println("<p>" + "--------------------------------" + "</p>");
        String word = request.getParameter("word");
        printWriter.println("<p>" + "The translation of the " + "\"" + word + "\"" + " is " + Translation.getTranstale(word) + "</p>");
        printWriter.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}