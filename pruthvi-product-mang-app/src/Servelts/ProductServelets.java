package Servelts;

import Dto.ProductDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/product")
public class ProductServelets extends HttpServlet {
    public ProductServelets(){
        System.out.println("Running ProductServelets started by Tomcat");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dopost method in Productservelts");
        String name=req.getParameter("name");
        String type=req.getParameter("type");
        String incomingprice=req.getParameter("incomingPrice");
        String sellingPrice=req.getParameter("sellingPrice");
        String mrp=req.getParameter("mrp");
        String description=req.getParameter("description");
        String brand=req.getParameter("brand");
        String quantity=req.getParameter("quantity");
        String color=req.getParameter("color");
        String weight=req.getParameter("weight");
        String manufDate=req.getParameter("manufDate");
        String warranty=req.getParameter("warranty");
        String returnPolicy=req.getParameter("returnPolicy");

        ProductDto productDto=new ProductDto();
        productDto.setName(name);
        productDto.setType(type);
        productDto.setIncomingprice(incomingprice);
        productDto.setSellingprice(sellingPrice);
        productDto.setMRP(mrp);
        productDto.setDescription(description);
        productDto.setBrand(brand);
        productDto.setQuality(quantity);
        productDto.setColor(color);
        productDto.setWeight(weight);
        productDto.setManufdate(manufDate);
        productDto.setWarranty(warranty);
        productDto.setReturnpolicy(returnPolicy);

        RequestDispatcher requestDispatcher;
        if (true) {
            requestDispatcher = req.getRequestDispatcher("ProductSucess.jsp");
            req.setAttribute("productDto", productDto);
        } else {
            requestDispatcher = req.getRequestDispatcher("product.jsp");
            req.setAttribute("message", "Form is not saved");
        }
        requestDispatcher.forward(req, resp);

    }
}
