/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this
 * license Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.springbot.robotticelli.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.springbot.robotticelli.models.Robot;
import com.springbot.robotticelli.services.RobotService;


/**
 *
 * @author Kirby, Chabby
 */
@Controller
public class RobotController {

  @Autowired
  private RobotService robotService;

  @GetMapping("/robots")
  public String getRobots(Model model) {
    model.addAttribute("message", "Robot List");
    List<Robot> robots = robotService.getRobots();
    model.addAttribute("robots", robots);
    return "robots";
  }
}
