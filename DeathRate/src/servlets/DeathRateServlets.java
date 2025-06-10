package servlets;

import deathratedto.DeathRateDTO;
import service.DeathRateService;
import service.DeathRateServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns ="/death")
public class DeathRateServlets extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name=req.getParameter("name");
       String death=req.getParameter("death");
       String date=req.getParameter("date");
       String location=req.getParameter("location");
        DeathRateDTO deathRateDTO=new DeathRateDTO();
        deathRateDTO.setName(name);
        deathRateDTO.setDeath(death);
        deathRateDTO.setDate(date);
        deathRateDTO.setLocation(location);
        System.out.println("Data was pushed to DTO"+deathRateDTO);
        DeathRateService deathRateService=new DeathRateServiceImpl();
        boolean save=deathRateService.save(deathRateDTO);
        if(save){
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("");
            req.setAttribute("message","Data was Saved Successfully");
            requestDispatcher.forward(req,resp);
        }
        else{
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("");
            req.setAttribute("message","Data was not Saved Successfully");
            requestDispatcher.forward(req,resp);
        }

    }
}
