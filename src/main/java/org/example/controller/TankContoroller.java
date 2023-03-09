package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.domain.Tank;
import org.example.service.impl.TanksServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TankContoroller {


    private final TanksServiceImpl tanksService;

    @GetMapping("/")
    public List<Tank> tankList() {
        return tanksService.listAll();
    }
}
