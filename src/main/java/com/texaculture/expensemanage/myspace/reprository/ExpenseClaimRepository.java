package com.texaculture.expensemanage.myspace.reprository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.texaculture.expensemanage.myspace.entity.ExpenseClaim;

@Repository
public interface ExpenseClaimRepository extends JpaRepository<ExpenseClaim, Long> { 

}

