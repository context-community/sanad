package com.project.SubscriptionSystem.Repo;


import com.project.SubscriptionSystem.Model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface SubscriptionRepo extends JpaRepository<Subscription,Integer> {

    List<Subscription> findBymember_id(int memberId);

    @Query("select sum(s.amount) from Subscription s")
    BigDecimal getTotalAmount();


}
