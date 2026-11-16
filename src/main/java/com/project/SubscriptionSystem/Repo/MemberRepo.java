package com.project.SubscriptionSystem.Repo;

import com.project.SubscriptionSystem.Model.Member;
import com.project.SubscriptionSystem.Model.Subscription;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepo extends JpaRepository<Member,Integer> {


}
