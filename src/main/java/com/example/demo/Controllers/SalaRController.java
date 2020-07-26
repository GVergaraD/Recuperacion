package com.example.demo.Controllers;

import com.example.demo.Models.SalaR;
import com.example.demo.Services.SalaRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
//esto mapea la app en requests URL->HTTP
@RestController
//localhost:puerto/api/salar
@RequestMapping("/api/salar")
public class SalaRController {

    @Autowired
    @Qualifier("ServicioSalaR")
    SalaRService salarService;

    @PostMapping("")
    public ResponseEntity<SalaR> addSalaR (@RequestBody SalaR salar) {
    	//
    	SalaR salar1 = salarService.saveOrUpdateSalaR(salar);
    	return new ResponseEntity<SalaR>(salar1,HttpStatus.CREATED);
    }
    @GetMapping("")
    public List<SalaR> getSalasR(){
    	return salarService.listAll();
    }

    //@GetMapping("")
}
