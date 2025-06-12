package servlets;

import dto.AeroplaneDTO;
import service.AeroplaneService;
import service.AeroplaneServiceImplimentation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns ="/flightinfo")
public class AeroplaneServlets extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String flightName=req.getParameter("flightName");
        String flightNumber=req.getParameter("flightNumber");
        String source=req.getParameter("source");
        String destination=req.getParameter("destination");
        String isDomestic=req.getParameter("isDomestic");
        String departureDate=req.getParameter("departureDate");
        String arrivalTime=req.getParameter("arrivalTime");
        AeroplaneDTO aeroplaneDTO=new AeroplaneDTO();
        aeroplaneDTO.setFlightName(flightName);
        aeroplaneDTO.setFlightNumber(flightNumber);
        aeroplaneDTO.setSource(source);
        aeroplaneDTO.setDestination(destination);
        aeroplaneDTO.setIsDomestic(isDomestic);
        aeroplaneDTO.setDepartureDate(departureDate);
        aeroplaneDTO.setArrivalTime(arrivalTime);
        System.out.println("Data was taken from the UI"+aeroplaneDTO);
        AeroplaneService aeroplaneService=new AeroplaneServiceImplimentation();
        boolean save=aeroplaneService.save(aeroplaneDTO);
        if(save!=false){
            RequestDispatcher requestDispatcher= req.getRequestDispatcher("aeroplanesuccess.jsp");
            requestDispatcher.forward(req,resp);
        }
        else{
            RequestDispatcher requestDispatcher= req.getRequestDispatcher("aerofailed.jsp");
            requestDispatcher.forward(req,resp);
        }
    }
}
