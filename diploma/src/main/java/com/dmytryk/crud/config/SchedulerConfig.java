package com.dmytryk.crud.config;

import com.dmytryk.crud.entry.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
@RequiredArgsConstructor
public class SchedulerConfig {

  private final SimpMessagingTemplate template;

  @Scheduled(fixedDelay = 3000)
  public void sendMessages() {
    template.convertAndSend("/topic/socket", new UserResponse("Fixed Delay Scheduler"));
  }
}