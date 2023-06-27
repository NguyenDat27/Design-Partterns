package com.hcmute.springboot.behavioralpatterns.memento.Controller;

import com.hcmute.springboot.behavioralpatterns.memento.CareTaker.CareTaker;
import com.hcmute.springboot.behavioralpatterns.memento.Originator.Player;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/memento")
public class MementoController {
    @GetMapping
    public ResponseEntity getMemento() throws InterruptedException {
        // player has completed level 1
        Player player = new Player();
        player.setLevel(1);
        player.setScore(100);
        player.setHealth("100%");
        System.out.println("----------- Player info after completing level 1 ---------------------");
        player.DisplayPlayerInfo();
        // when player completes any level then create checkpoint for that level.
        CareTaker careTaker = new CareTaker();
        careTaker.LevelMarker = player.CreateMarker(player);


        // sleep is only added to show some delay..
        Thread.sleep(2000);
        player.setLevel(2);
        player.setScore(130);
        player.setHealth("80%");
        System.out.println("--------------- Player info in level 2 --------------------------------");
        player.DisplayPlayerInfo();

        // if players loses all the lifeline then restore the game from level 1
        player.RestoreLevel(careTaker.LevelMarker);
        System.out.println("------------- Player info after restoring level 1 data ----------------");
        player.DisplayPlayerInfo();

        return ResponseEntity.noContent().build();
    }

}
