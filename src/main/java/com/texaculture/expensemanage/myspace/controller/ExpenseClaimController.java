package com.texaculture.expensemanage.myspace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.texaculture.expensemanage.myspace.entity.ExpenseClaim;
import com.texaculture.expensemanage.myspace.service.ExpenseClaimService;

@RestController
@RequestMapping("/expense-claims")
public class ExpenseClaimController {
	@Autowired
    private ExpenseClaimService expenseClaimService;

    @PostMapping
    public ResponseEntity<ExpenseClaim> createExpenseClaim(@RequestBody ExpenseClaim expenseClaim) {
        ExpenseClaim createdExpenseClaim = expenseClaimService.createExpenseClaim(expenseClaim);
        return new ResponseEntity<>(createdExpenseClaim, HttpStatus.CREATED);
    }

	/*
	 * @GetMapping("/{id}") public ResponseEntity<ExpenseClaim>
	 * getExpenseClaimById(@PathVariable Long id) { ExpenseClaim expenseClaim =
	 * expenseClaimService.getExpenseClaimById(id); return new
	 * ResponseEntity<>(expenseClaim, HttpStatus.OK); }
	 */

	/*
	 * @PutMapping("/{id}") public ResponseEntity<ExpenseClaim>
	 * updateExpenseClaim(@PathVariable Long id, @RequestBody ExpenseClaim
	 * expenseClaim) { ExpenseClaim updatedExpenseClaim =
	 * expenseClaimService.updateExpenseClaim(id, expenseClaim); return new
	 * ResponseEntity<>(updatedExpenseClaim, HttpStatus.OK); }
	 */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExpenseClaim(@PathVariable Long id) {
        expenseClaimService.deleteExpenseClaimById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
