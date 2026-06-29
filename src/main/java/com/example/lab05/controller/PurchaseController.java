package com.example.lab05.controller;

import com.example.lab05.dto.PurchaseRequest;
import com.example.lab05.model.mongo.PurchaseReceipt;
import com.example.lab05.service.PurchaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/55-21247/purchases")
public class PurchaseController {

    private final PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @PostMapping
    public ResponseEntity<PurchaseReceipt> purchase(@RequestBody PurchaseRequest request) {
        PurchaseReceipt receipt = purchaseService.executePurchase(request);
        return ResponseEntity.ok(receipt);
    }

    @GetMapping("/person/{personName}")
    public ResponseEntity<List<PurchaseReceipt>> getPurchasesByPerson(@PathVariable String personName) {
        List<PurchaseReceipt> receipts = purchaseService.getPurchasesByPerson(personName);
        return ResponseEntity.ok(receipts);
    }
}
