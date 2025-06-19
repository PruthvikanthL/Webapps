package servlets;

import dto.CarLoginDTO;
import service.CarService;
import service.CarServiceImplimentation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/login")
public class CarLoginServlet extends HttpServlet {
    CarService carService=new CarServiceImplimentation();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName =req.getParameter("userName");
        String userEmail=req.getParameter("userEmail");
        String userPassword=req.getParameter("userPassword");
        CarLoginDTO carLoginDTO=new CarLoginDTO();
        carLoginDTO.setUserName(userName);
        carLoginDTO.setUserEmail(userEmail);
        carLoginDTO.setUserPassword(userPassword);
        System.out.println("Fields data pushed to DTO is "+carLoginDTO);
        boolean save= carService.save(carLoginDTO);
        if(save==true){
            req.setAttribute("result","Logged in successfully");
        }
        else{
            req.setAttribute("result", "not Logged in successfully");
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
        resp.setContentType("text/html");
        req.setAttribute("result","Successfully logged in");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarService carService1=new CarServiceImplimentation();
        CarLoginDTO[] loginDtos = carService1.findAll();
        RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
        resp.setContentType("text/html");
        req.setAttribute("loginDtos",loginDtos);
        dispatcher.forward(req,resp);
    }
}
