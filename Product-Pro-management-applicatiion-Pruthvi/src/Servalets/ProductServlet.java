package Servalets;

import Services.ProductService;
import Services.ProductServiceImplementaion;
import dto.ProductDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/productdata")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ProductName=req.getParameter("Productname");
        String type=req.getParameter("type");
        String IncomingPrice=req.getParameter("IncomingPrice");
        String SellingPrice=req.getParameter("SellingPrice");
        String MRP=req.getParameter("MRP");
        String Description=req.getParameter("Description");
        String Brand=req.getParameter("Brand");
        String Quantity=req.getParameter("Quantity");
        String Color=req.getParameter("color");
        String Weight=req.getParameter("Weight");
        String ManufDate=req.getParameter("ManufDate");
        String Warranty=req.getParameter("Warranty");
        String Returnpolicy=req.getParameter("ReturnPolicy");

        ProductDto productDto=new ProductDto();
        productDto.setProductName(ProductName);
        productDto.setType(type);
        productDto.setIncomingPrice(IncomingPrice);
        productDto.setSellingPrice(SellingPrice);
        productDto.setMrp(MRP);
        productDto.setDescription(Description);
        productDto.setBrand(Brand);
        productDto.setQuantity(Quantity);
        productDto.setColor(Color);
        productDto.setWeight(Weight);
        productDto.setManufDate(ManufDate);
        productDto.setWarranty(Warranty);
        productDto.setReturnPolicy(Returnpolicy);

        System.out.println("data is pushed to DTO"+productDto);
        ProductService productService=new ProductServiceImplementaion();
        boolean save=productService.save(productDto);

        if(save){
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("Productsuccess.jsp");
            req.setAttribute("message","form data saved successfully");
            req.setAttribute("productdto",productDto);

            requestDispatcher.forward(req,resp);
        }else{
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("Productfail.jsp");
            req.setAttribute("message","form data not saved successfully");
            requestDispatcher.forward(req,resp);
        }
    }
}
