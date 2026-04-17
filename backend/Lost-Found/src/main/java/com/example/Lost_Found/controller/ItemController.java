package com.example.Lost_Found.controller;

import com.example.Lost_Found.DTO.RequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/item")
@RequiredArgsConstructor   // 🔥 Lombok handles constructor injection
public class ItemController {

    private final ItemService itemService;

    @PostMapping
    public ResponseEntity<?> addItem(@RequestBody RequestDTO requestDTO) {
        return ResponseEntity.ok(itemService.addItem(requestDTO));
    }
}
