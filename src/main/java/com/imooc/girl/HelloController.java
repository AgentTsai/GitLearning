package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.ResponseBody;


//@Controller
//@ResponseBody
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
//    @RequestMapping(value = "/say",method = RequestMethod.POST)
//    @RequestMapping(value = "/say")
//    @RequestMapping(value = "/say",method = RequestMethod.GET)
//    @RequestMapping(value = "/say/{id}",method = RequestMethod.GET)
//    @RequestMapping(value = "/{id}/say",method = RequestMethod.GET)
//    @RequestMapping(value = "/say",method = RequestMethod.GET)
    @GetMapping(value = "/say")

//    public String say(@PathVariable("id") Integer id){
//    public String say(@RequestParam("id") Integer Myid){
        public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer Myid){
//       return girlProperties.getCupSize();
//        return "index";
        return "id:" + Myid;
    }
}
