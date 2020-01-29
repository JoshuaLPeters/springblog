package com.summonerswar.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @RequestMapping(path = "/add/{number}/and/{numberTwo}", method = RequestMethod.GET)
    @ResponseBody
    public String addTwo(@PathVariable int number, @PathVariable int numberTwo) {
        return number + " plus " + numberTwo + " is " + (number + numberTwo) + "!";
    }

    @RequestMapping(path = "/subtract/{number}/and/{numberTwo}", method = RequestMethod.GET)
    @ResponseBody
    public String subtractTwo(@PathVariable int number, @PathVariable int numberTwo){
        return number + " minus " + numberTwo + " is " + (number - numberTwo) + "!";
    }

    @RequestMapping(path = "/multiply/{number}/and/{numberTwo}", method = RequestMethod.GET)
    @ResponseBody
    public String multiplyTwo(@PathVariable int number, @PathVariable int numberTwo){
        return number + " times " + numberTwo + " is " + (number * numberTwo) + "!";
    }

    @RequestMapping(path = "/divide/{number}/and/{numberTwo}", method = RequestMethod.GET)
    @ResponseBody
    public String divideTwo(@PathVariable int number, @PathVariable int numberTwo){
        return number + " divided by " + numberTwo + " is " + (number / numberTwo) + "!";
    }


}
