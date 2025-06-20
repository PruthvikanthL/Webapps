package com.djmangement.application.servlet;

import com.djmangement.application.dto.DJDto;
import com.djmangement.application.repository.DjRepository;
import com.djmangement.application.service.DJService;
import com.djmangement.application.service.DJServiceImplimentation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns ={"/regform","/searchById"})
public class DjFromServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=req.getParameter("userName");
        String userNumber=req.getParameter("userNumber");
        String userEmail=req.getParameter("userEmail");
        String eventName=req.getParameter("eventName");
        String location=req.getParameter("location");
        String eventDate=req.getParameter("eventDate");
        String eventTime=req.getParameter("eventTime");
        String note=req.getParameter("note");
        DJDto djDto=new DJDto();
        djDto.setUserName(userName);
        djDto.setUserNumber(userNumber);
        djDto.setUserEmail(userEmail);
        djDto.setEventName(eventName);
        djDto.setLocation(location);
        djDto.setEventDate(eventDate);
        djDto.setEventTime(eventTime);
        djDto.setNote(note);
        System.out.println("The Data From Feilds to DTO"+djDto);
        DJService djService=new DJServiceImplimentation();
        boolean save=djService.save(djDto);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("DJForm.jsp");
        if(save==true){
            req.setAttribute("success","Data was Saved Successfully");
            requestDispatcher.forward(req,resp);
        }
        else{
            req.setAttribute("fail","Data was Not Saved");
            req.setAttribute("dto",djDto);
            requestDispatcher.forward(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("bookingId");
        if (id != null && !id.isEmpty()) {
               int bookingId = Integer.parseInt(id);
                System.out.println("Running the Get By id");
                DJService djService = new DJServiceImplimentation();
                Optional<DJDto> optionaldto = djService.findbyid(bookingId);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("Findevent.jsp");
           if(optionaldto.isPresent()){
               DJDto djDto=optionaldto.get();
               System.out.println("The data Fetched form the Database is"+djDto);
               req.setAttribute("fetched","Data was Found");
               req.setAttribute("data",djDto);
               requestDispatcher.forward(req,resp);
           }
           else{
               req.setAttribute("notfetched","Data was Not Found");
               requestDispatcher.forward(req,resp);
           }

        }

    }
}
