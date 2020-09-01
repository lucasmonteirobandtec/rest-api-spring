package com.example.restapi.controller;

import com.example.restapi.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pc")
public class PcController {

    List<Componente> lista = new ArrayList<>();


//    CREATE
    @PostMapping("/add/component/cpu")
    public void addCPU (@RequestBody CPU cpu) {
        lista.add(cpu);
    }

    @PostMapping("/add/component/gpu")
    public void addCPU (@RequestBody GPU gpu) {
        lista.add(gpu);
    }

    @PostMapping("/add/component/ram")
    public void addRAM (@RequestBody RAM ram) {
        lista.add(ram);
    }

    @PostMapping("/add/component/disk")
    public void addDisk (@RequestBody Armazenamento disk) {
        lista.add(disk);
    }

    @PostMapping("/add/component/motherboard")
    public void addMb (@RequestBody PlacaMae mb) {
        lista.add(mb);
    }

    @PostMapping("/add/component/powersupply")
    public void addPs (@RequestBody PlacaMae ps) {
        lista.add(ps);
    }

//    RECOVER

    @GetMapping("/show/component/{x}")
    public Componente getComp(@PathVariable Integer x){
        return lista.get(x - 1);
    }

    @GetMapping("/show/components")
    public List<Componente> getLista() {
        return lista;
    }

    @GetMapping("/show/final")
    public String calcTotal() {
        Double total = 0.0;
        for (Componente c : lista ){
            total += c.calcularTaxa();
        }
        return String.format("Você vai pagar ao todo: R$ %.2f", total);
    }

//    UPDATE

}
