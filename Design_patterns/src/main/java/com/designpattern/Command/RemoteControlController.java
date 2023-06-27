package com.example.design_patter.Command;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoteControlController {
    private final RemoteControl remoteControl;

    public RemoteControlController() {
        // Tạo bộ điều khiển từ xa và thêm các lệnh vào
        remoteControl = new RemoteControl();
        Light light = new Light();
        remoteControl.addCommand(new LightOnCommand(light));
        remoteControl.addCommand(new LightOffCommand(light));
    }

    @PostMapping("/commands")
    public ResponseEntity<String> executeCommands() {
        remoteControl.executeCommands();
        return ResponseEntity.ok("Các lệnh đã được thực thi");
    }
}