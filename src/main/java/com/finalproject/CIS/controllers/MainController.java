//references
//https://www.w3schools.com/howto/howto_css_vertical_menu.asp

package com.finalproject.CIS.controllers;
import com.finalproject.CIS.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;
import java.util.UUID;

@Controller
public class MainController {
    @Autowired
    customerRepo customerRepo;
    @Autowired
    productRepo productRepo;
    @Autowired
    employeeRepo employeeRepo;
    @Autowired
    transactionRepo transactionRepo;

    @RequestMapping("/")
    public ModelAndView doHome() {
        ModelAndView mv = new ModelAndView("index");


        return mv;
    }

    @RequestMapping("/product")
    public ModelAndView product() {
        ModelAndView mv = new ModelAndView("product");
        mv.addObject("productlist", productRepo.findAll());

        return mv;
    }
    @RequestMapping("/customer")
    public ModelAndView customer() {
        ModelAndView mv = new ModelAndView("customer");
        mv.addObject("customerlist", customerRepo.findAll());

        return mv;
    }
    @RequestMapping("/employee")
    public ModelAndView employee() {
        ModelAndView mv = new ModelAndView("employee");
        mv.addObject("employeelist", employeeRepo.findAll());

        return mv;
    }
    @RequestMapping("/transaction")
    public ModelAndView transaction() {
        ModelAndView mv = new ModelAndView("transaction");
        mv.addObject("transactionlist", transactionRepo.findAll());
        return mv;
    }

    @RequestMapping(value = "/saveproduct", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam("productid") String productid, @RequestParam("product") String product, @RequestParam("quantity") int quantity,@RequestParam("cost") double cost){
        ModelAndView mv = new ModelAndView("redirect:/product");
        product productStoring ;
        if(!productid.isEmpty())
        {
            Optional<product> users = productRepo.findById(productid);
            productStoring = users.get();
        }
        else
        {
            productStoring = new product();
            productStoring.setProductID(UUID.randomUUID().toString());
        }
        productStoring.setProduct(product);
        productStoring.setQuantity(quantity);
        productStoring.setCost(cost);
        productRepo.save(productStoring);
        mv.addObject("productlist", productRepo.findAll());
        return mv;
    }
    @RequestMapping(value = "/savecustomer", method = RequestMethod.POST)
    public ModelAndView saveCustomer(@RequestParam("customerid") String customerid, @RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname){
        ModelAndView mv = new ModelAndView("redirect:/customer");
        customer customerStoring ;
        if(!customerid.isEmpty())
        {
            Optional<customer> users = customerRepo.findById(customerid);
            customerStoring = users.get();
        }
        else
        {
            customerStoring = new customer();
            customerStoring.setCustomerID(UUID.randomUUID().toString());
        }
        customerStoring.setFirstName(firstname);
        customerStoring.setLastName(lastname);

        customerRepo.save(customerStoring);
        mv.addObject("customerlist", customerRepo.findAll());
        return mv;
    }

    @RequestMapping(value = "/saveemployee", method = RequestMethod.POST)
    public ModelAndView saveEmployee(@RequestParam("employeeid") String employeeid, @RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname){
        ModelAndView mv = new ModelAndView("redirect:/employee");
        employee employeeStoring ;
        if(!employeeid.isEmpty())
        {
            Optional<employee> users = employeeRepo.findById(employeeid);
            employeeStoring = users.get();
        }
        else
        {
            employeeStoring = new employee();
            employeeStoring.setEmployeeID(UUID.randomUUID().toString());
        }
        employeeStoring.setfirstname(firstname);
        employeeStoring.setlastname(lastname);

        employeeRepo.save(employeeStoring);
        mv.addObject("employeelist", employeeRepo.findAll());
        return mv;
    }

    @RequestMapping( value = "/deleteProduct/{productid}", method = RequestMethod.GET)
    public ModelAndView deleteProduct(@PathVariable("productid") String productid){
        ModelAndView mv = new ModelAndView("redirect:/product");
        productRepo.deleteById(productid);
        return mv;
    }
    @RequestMapping( value = "/deleteCustomer/{customerid}", method = RequestMethod.GET)
    public ModelAndView deleteCustomer(@PathVariable("customerid") String customerid){
        ModelAndView mv = new ModelAndView("redirect:/customer");
        customerRepo.deleteById(customerid);
        return mv;
    }

    @RequestMapping( value = "/deleteEmployee/{employeeid}", method = RequestMethod.GET)
    public ModelAndView deleteEmployee(@PathVariable("employeeid") String employeeid){
        ModelAndView mv = new ModelAndView("redirect:/employee");
        employeeRepo.deleteById(employeeid);
        return mv;
    }
    @RequestMapping( value = "/deleteTransaction/{transactionid}", method = RequestMethod.GET)
    public ModelAndView deleteTransaction(@PathVariable("transactionid") String transactionid){
        ModelAndView mv = new ModelAndView("redirect:/transaction");
        transactionRepo.deleteById(transactionid);
        return mv;
    }


    @RequestMapping( value = "/editCustomer/{customerid}", method = RequestMethod.GET)
    public ModelAndView editcustomer(@PathVariable("customerid") String customerid){
        ModelAndView mv = new ModelAndView("editcustomer");
        Optional<customer> person = customerRepo.findById(customerid);
        customer personToMap = person.get();
        mv.addObject("selectedItem", personToMap);
        return mv;
    }
    @RequestMapping( value = "/editEmployee/{employeeid}", method = RequestMethod.GET)
    public ModelAndView editemployee(@PathVariable("employeeid") String employeeid){
        ModelAndView mv = new ModelAndView("editemployee");
        Optional<employee> person = employeeRepo.findById(employeeid);
        employee personToMap = person.get();
        mv.addObject("selectedItem", personToMap);
        return mv;
    }
    @RequestMapping( value = "/editProduct/{productid}", method = RequestMethod.GET)
    public ModelAndView editproduct(@PathVariable("productid") String productid){
        ModelAndView mv = new ModelAndView("editproduct");
        Optional<product> person = productRepo.findById(productid);
        product personToMap = person.get();
        mv.addObject("selectedItem", personToMap);
        return mv;
    }

}
