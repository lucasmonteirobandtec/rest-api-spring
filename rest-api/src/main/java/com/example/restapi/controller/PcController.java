package com.example.restapi.controller;

import com.example.restapi.domain.*;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
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

    @GetMapping("/show/computador")
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

    @PutMapping("/update/component/cpu")
    public void updateCpu(@RequestBody CPU cpu) {
        int i = 0;
        for (Componente c : lista){
            if (c instanceof CPU){
                lista.set(i, cpu);
            }
            i++;
        }
    }

    @PutMapping("/update/component/gpu")
    public void updateGpu(@RequestBody GPU gpu) {
        int i = 0;
        for (Componente c : lista){
            if (c instanceof GPU){
                lista.set(i, gpu);
            }
            i++;
        }
    }

    @PutMapping("/update/component/ram")
    public void updateRam(@RequestBody RAM ram) {
        int i = 0;
        for (Componente c : lista){
            if (c instanceof RAM){
                lista.set(i, ram);
            }
            i++;
        }
    }

    @PutMapping("/update/component/disk")
    public void updateDisk(@RequestBody Armazenamento disk) {
        int i = 0;
        for (Componente c : lista){
            if (c instanceof Armazenamento){
                lista.set(i, disk);
            }
            i++;
        }
    }

    @PutMapping("/update/component/motherboard")
    public void updateMb(@RequestBody PlacaMae mb) {
        int i = 0;
        for (Componente c : lista){
            if (c instanceof PlacaMae){
                lista.set(i, mb);
            }
            i++;
        }
    }

    @PutMapping("/update/component/powersupply")
    public void updatePs(@RequestBody Fonte ps) {
        int i = 0;
        for (Componente c : lista){
            if (c instanceof Fonte){
                lista.set(i, ps);
            }
            i++;
        }
    }

//    Delete

    @DeleteMapping("/delete/component/{x}")
    public void deleteComp(@PathVariable Integer x) {
        lista.remove(x-1);
    }


//    EU ACABEI FAZENDO CREATE E UPDATE, POIS NAO ENTENDI, PERDAO PROFESSOR
}
