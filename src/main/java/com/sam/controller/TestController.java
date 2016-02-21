package com.sam.controller;

import com.sam.beans.Product;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leo on 21/02/2016.
 */
@Controller
@Scope("prototype")
@RequestMapping("/products")
public class TestController {

    @RequestMapping(value="/list",method = RequestMethod.GET)
    public String getProducts(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("name","helloworld");
        return "products/list";
    }

//    http://localhost:8080/sshdemo/products/info/10000
    @RequestMapping(value="/info/{proId}",method = RequestMethod.GET)
    public String getProductInfo(@PathVariable("proId") String proId,HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("name",proId);
        return "products/list";
    }

    @RequestMapping(value="/info",method = RequestMethod.POST)
    public String insertProduct(Product pro, HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("name",pro.getPid()+"____"+pro.getPname());
        return "products/list";
    }

    @RequestMapping(value="/info",method = RequestMethod.PUT)
    public ModelAndView updateProduct(@RequestBody Product pro, HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> map1 = new HashMap<String,Object>();
        map1.put("pid",pro.getPid());
        ModelAndView mav = new ModelAndView("products/list",map1);
        return mav;
    }

}
