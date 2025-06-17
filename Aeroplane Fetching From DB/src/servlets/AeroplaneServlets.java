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
import java.util.Optional;

@WebServlet(urlPatterns ={"/flightinfo","/aeroplanedetails"})
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
            RequestDispatcher requestDispatcher= req.getRequestDispatcher("aeroplaneform.jsp");
            req.setAttribute("success","Data was valid and Saved Successfully");
            requestDispatcher.forward(req,resp);
        }
        else{
            RequestDispatcher requestDispatcher= req.getRequestDispatcher("aeroplaneform.jsp");
            req.setAttribute("aeroplanedto",aeroplaneDTO);
            req.setAttribute("failed","Data was Not Saved due to Error in input");
            req.setAttribute("errors",aeroplaneDTO.getErrors());
            requestDispatcher.forward(req,resp);

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String flightid=req.getParameter("flightid");
        if(flightid!=null){
            int id=Integer.parseInt(flightid);
            AeroplaneService aeroplaneService=new AeroplaneServiceImplimentation();
            Optional<AeroplaneDTO> optionalAeroplaneDTO=aeroplaneService.findbyid(id);
            if(optionalAeroplaneDTO.isPresent()){
                AeroplaneDTO aeroplaneDTO=optionalAeroplaneDTO.get();
                System.out.println("Aeroplane details found"+aeroplaneDTO);
                RequestDispatcher requestDispatcher=req.getRequestDispatcher("aeroplanedetails.jsp");
                req.setAttribute("fetched","Data was Fetched Successfully");
                req.setAttribute("aerodetails",aeroplaneDTO);
                requestDispatcher.forward(req,resp);

            }
            else{
                System.out.println("Aeroplane Details not found"+id);
                RequestDispatcher requestDispatcher=req.getRequestDispatcher("aeroplanedetails.jsp");
                req.setAttribute("notfetched","Data was Not found");
                requestDispatcher.forward(req,resp);

            }
        }


    }
}
