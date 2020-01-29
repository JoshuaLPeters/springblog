//package com.summonerswar.springblog.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class RollDiceController {
//
//    @GetMapping("/roll-dice")
//    public String diceRoll(){
//        return "roll-dice";
//    }
//
//    @PostMapping("/roll-dice")
//    public String diceRolled(@RequestParam(name = "guess") String guess, Model model) {
//        model.addAttribute("guess", "Your guess is " + guess + "!");
//        return "roll-dice";
//    }
//}
