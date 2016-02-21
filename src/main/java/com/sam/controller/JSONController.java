package com.sam.controller;

import com.sam.beans.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by leo on 21/02/2016.
 */

@Controller
public class JSONController {
//
//    @RequestMapping(value="/json/{name}",method = RequestMethod.GET)
//    public @ResponseBody Shop getShopInJSON(@PathVariable String name){
//        Shop shop = new Shop();
//        shop.setName(name);
//        shop.setStaffName("mksong");
//        return shop;
//    }

    @RequestMapping(value="/json",method = RequestMethod.GET)
    public @ResponseBody Shop getProducts(HttpServletRequest request, HttpServletResponse response){
        Shop shop = new Shop();
        shop.setName("xxxx");
        return shop;
    }
}