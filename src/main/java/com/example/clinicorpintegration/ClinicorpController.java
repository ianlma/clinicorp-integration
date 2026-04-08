package com.example.clinicorpintegration;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/clinicorp")
public class ClinicorpController {

    @PostMapping("/agendamento")
    public ResponseEntity<String> receberAgendamento(@RequestBody String dados) {
        System.out.println("Agendamento recebido: " + dados);
        return ResponseEntity.ok("Sucesso!");
    }
}