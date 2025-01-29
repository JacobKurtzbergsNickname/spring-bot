package com.springbot.robotticelli.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springbot.robotticelli.models.Robot;
import com.springbot.robotticelli.repositories.RobotRepository;

@Service
public class RobotService {

  @Autowired
  private RobotRepository robotRepository;

  public RobotService(RobotRepository robotRepository) {
    this.robotRepository = robotRepository;
  }

  public List<Robot> getRobots() {
    return robotRepository.findAll();
  }

  public Robot createRobot(Robot robot) {
    robotRepository.save(robot);
    return robot;
  }
}
