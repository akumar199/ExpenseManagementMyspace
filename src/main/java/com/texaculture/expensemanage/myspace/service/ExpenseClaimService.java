package com.texaculture.expensemanage.myspace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.texaculture.expensemanage.myspace.entity.ExpenseClaim;
import com.texaculture.expensemanage.myspace.reprository.ExpenseClaimRepository;

@Service
public class ExpenseClaimService {
	@Autowired
    private ExpenseClaimRepository expenseClaimRepository;

    public List<ExpenseClaim> getAllExpenseClaims() {
        return expenseClaimRepository.findAll();
    }

    public Optional<ExpenseClaim> getExpenseClaimById(Long id) {
        return expenseClaimRepository.findById(id);
    }

    public ExpenseClaim saveExpenseClaim(ExpenseClaim expenseClaim) {
        return expenseClaimRepository.save(expenseClaim);
    }

    public void deleteExpenseClaimById(Long id) {
        expenseClaimRepository.deleteById(id);
    }
    public ExpenseClaim createExpenseClaim(ExpenseClaim expenseClaim) {
        return expenseClaimRepository.save(expenseClaim);
    }
    public ExpenseClaim updateExpenseClaim(Long id, ExpenseClaim expenseClaim) {
        ExpenseClaim updatedExpenseClaim = expenseClaimRepository.findById(id).orElse(null);
        if (updatedExpenseClaim != null) {
            updatedExpenseClaim.setClaimType(expenseClaim.getClaimType());
            updatedExpenseClaim.setClaimAmount(expenseClaim.getClaimAmount());
            updatedExpenseClaim.setDateOfExpense(expenseClaim.getDateOfExpense());
            updatedExpenseClaim.setClaimMonth(expenseClaim.getClaimMonth());
            updatedExpenseClaim.setClaimYear(expenseClaim.getClaimYear());
            expenseClaimRepository.save(updatedExpenseClaim);
        }
        return updatedExpenseClaim;
    }

}
