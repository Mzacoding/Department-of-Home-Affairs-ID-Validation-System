package com.Identification;

import com.Identificationhandler.IdentificationHandler;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IdentificationChecker extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String IdNo = request.getParameter("idNo");

        IdentificationHandler checkId = new IdentificationHandler();

        boolean isValid = checkId.isValidId(IdNo);

        getOutcome(isValid);

        request.setAttribute("idStatus", getOutcome(isValid));

        request.setAttribute("IdNo", IdNo);

        RequestDispatcher disp = request.getRequestDispatcher("/DisplayIdResult.jsp");
        disp.forward(request, response);

    }

    private String getOutcome(boolean valid) {

        if (valid) {
            return "Valid South African ID";
        }
        return "Not Valid South African ID";
    }

}
 
