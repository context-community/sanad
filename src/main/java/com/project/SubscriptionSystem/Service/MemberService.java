package com.project.SubscriptionSystem.Service;

import com.project.SubscriptionSystem.Model.Member;
import com.project.SubscriptionSystem.Model.Subscription;
import com.project.SubscriptionSystem.Repo.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.net.ssl.HttpsURLConnection;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    MemberRepo repo;


    public Member addMember(Member member) {

        return repo.save(member);

    }

    public Member getMember(int memberId) {

        return repo.findById(memberId).orElse(null);
    }

    public List<Member> addMembers() {

        return repo.findAll();
    }


    public long getCountOfMembers() {

        return repo.count();

    }
}
