package expanseservelet;

import dto.ExpanseDto;
import service.Expanseservice;
import service.Expanseserviceimplementaion;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns ="/expanse")
public class ExpanseServelet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String contactnumber=req.getParameter("contactnumber");
        String email=req.getParameter("email");
        String salary=req.getParameter("salary");
        String transport=req.getParameter("transport");
        String transportcost=req.getParameter("transportcost");
        String stay=req.getParameter("stay");
        String staycost=req.getParameter("staycost");
        String location=req.getParameter("location");

        ExpanseDto expanseDto=new ExpanseDto();
        expanseDto.setName(name);
        expanseDto.setContactnumber(contactnumber);
        expanseDto.setEmail(email);
        expanseDto.setSalary(salary);
        expanseDto.setTransport(transport);
        expanseDto.setTransportcost(transportcost);
        expanseDto.setStay(stay);
        expanseDto.setStaycost(staycost);
        expanseDto.setLocation(location);

        System.out.println("Details is pushed"+expanseDto);

        Expanseservice expanseservice=new Expanseserviceimplementaion();
        boolean save=expanseservice.save(expanseDto);
        if(save){
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("expansesuccess.jsp");
            req.setAttribute("message","Your Data saved Successfully");
            req.setAttribute("expansedto",expanseDto);
            requestDispatcher.forward(req,resp);
        }
        else{
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("");
            req.setAttribute("message","Your Data not saved Successfully");
            requestDispatcher.forward(req,resp);
        }

    }
}
