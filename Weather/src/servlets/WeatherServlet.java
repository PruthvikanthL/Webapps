package servlets;

import dto.WeatherDTO;
import service.WeatherService;
import service.WeatherServiceImplimentation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/weather")
public class WeatherServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String placename=req.getParameter("placename");
        String Weather=req.getParameter("Weather");
        String mintemp=req.getParameter("mintemp");
        String maxtemp=req.getParameter("maxtemp");
        String cloudy=req.getParameter("cloudy");
        String raining=req.getParameter("raining");
        String raininmm=req.getParameter("raininmm");
        String humidity=req.getParameter("humidity");
        String windspeed=req.getParameter("windspeed");
        String sunrise=req.getParameter("sunrise");
        String sunset=req.getParameter("sunset");
        String moonrise=req.getParameter("moonrise");
        String moonset=req.getParameter("moonset");
        String rainstart=req.getParameter("rainstart");
        String rainend=req.getParameter("rainend");
        String precipitation=req.getParameter("precipitation");
        WeatherDTO weatherDTO=new WeatherDTO();
        weatherDTO.setPlacename(placename);
        weatherDTO.setWeather(Weather);
        weatherDTO.setMintemp(mintemp);
        weatherDTO.setMaxtemp(maxtemp);
        weatherDTO.setCloudy(cloudy);
        weatherDTO.setRaining(raining);
        weatherDTO.setRaininmm(raininmm);
        weatherDTO.setHumidity(humidity);
        weatherDTO.setWindspeed(windspeed);
        weatherDTO.setSunrise(sunrise);
        weatherDTO.setSunset(sunset);
        weatherDTO.setMoonrise(moonrise);
        weatherDTO.setMoonset(moonset);
        weatherDTO.setRainstart(rainstart);
        weatherDTO.setRainend(rainend);
        weatherDTO.setPrecipitation(precipitation);
        System.out.println("Data was Fetched and pushed to DTO"+weatherDTO);
        WeatherService weatherService=new WeatherServiceImplimentation();
        boolean save=weatherService.validate(weatherDTO);
        if(save==true){
            RequestDispatcher requestDispatcher= req.getRequestDispatcher("weathersuccess.jsp");
            req.setAttribute("message","data was saved successfully");
            requestDispatcher.forward(req,resp);
        }
        else{
            RequestDispatcher requestDispatcher= req.getRequestDispatcher("weatherfailed.jsp");
            req.setAttribute("message","data was Not saved successfully");
            requestDispatcher.forward(req,resp);
        }

    }
}
