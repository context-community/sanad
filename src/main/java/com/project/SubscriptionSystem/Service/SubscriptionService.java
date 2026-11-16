package com.project.SubscriptionSystem.Service;


import com.project.SubscriptionSystem.Model.Member;
import com.project.SubscriptionSystem.Model.Subscription;
import com.project.SubscriptionSystem.Repo.SubscriptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

@Service
public class SubscriptionService {

    @Autowired
    SubscriptionRepo repo;

    @Autowired
    MemberService service;


    public List<Subscription> getMemberSubscriptions(int memberId) {

        return repo.findBymember_id(memberId);

    }

    public Subscription addSubscription(Subscription subscription, MultipartFile imageFile, int memberId) throws IOException {

        Member member = service.getMember(memberId);
        subscription.setMember(member);

        subscription.setImageName(imageFile.getOriginalFilename());
        subscription.setImageType(imageFile.getContentType());
        subscription.setImageData(imageFile.getBytes());

        return repo.save(subscription);

    }

    public BigDecimal getsubscriptionsAmount() {

        return repo.getTotalAmount();


    }

    public long getAllSubscription() {

        return repo.count();
    }
}
