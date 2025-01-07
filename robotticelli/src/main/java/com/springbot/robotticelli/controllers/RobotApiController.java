package com.springbot.robotticelli.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springbot.robotticelli.models.Robot;
import com.springbot.robotticelli.services.RobotService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Kirby, Chabby
 */
@RestController
@RequestMapping("/api")
public class RobotApiController {

  private final RobotService robotService;

  public RobotApiController(RobotService robotService) {
    this.robotService = robotService;
  }

  @GetMapping("/robots")
  public Map<String, String> getRobotsFromApi() {
    Map<String, String> robots = new HashMap<>();
    List<Robot> robotEntities = robotService.getRobots();
    robots.put("robots", robotEntities.toString());
    return robots;
  }
}
