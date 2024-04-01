package com.mishchenkov.cashcard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashcards")
public class CashCardController {

    @GetMapping("/{requestedId}")
    public ResponseEntity<CashCard> findById(@PathVariable Long requestedId) {
        if (requestedId.equals(99L)) {
            CashCard result = new CashCard(99L, 123.45);
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.notFound().build();
    }

}
