package com.springbot.robotticelli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springbot.robotticelli.models.Robot;

@Repository
public interface RobotRepository extends JpaRepository<Robot, Long> {
}
