/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.afifpermana.buku.services.controller;

import com.afifpermana.buku.services.entity.Buku;
import com.afifpermana.buku.services.service.BukuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Apip
 */
@RestController
@RequestMapping("/buku")
public class BukuController {
    @Autowired
    private BukuService bukuService;
    
    @PostMapping("/")
    public Buku saveBuku(@RequestBody Buku buku){
        return bukuService.saveBuku(buku);
    }
 
    @GetMapping("/{id}")
    public Buku findBukuById(@PathVariable("id") Long bukuId){
        return bukuService.findBukuById(bukuId);
    }
    
}
