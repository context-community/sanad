package com.project.SubscriptionSystem.Controller;


import com.project.SubscriptionSystem.Model.Member;
import com.project.SubscriptionSystem.Model.Subscription;
import com.project.SubscriptionSystem.Service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.List;

@CrossOrigin
@RestController
public class SubscriptionController {

    @Autowired
    SubscriptionService service;

    @GetMapping("/subscriptions/totalAmount")
    public BigDecimal getsubscriptionsAmount(){
        return service.getsubscriptionsAmount();
    }

    @GetMapping("subscriptions/count")
    public long getAllSubscription(){
        return service.getAllSubscription();
    }


    @GetMapping("/members/{memberId}/Subscription")
    public List<Subscription> getMemberSubscriptions(@PathVariable int memberId){

        return service.getMemberSubscriptions(memberId);

    }


    @PostMapping("/subscription")
    public ResponseEntity<?> addSubscription(@RequestPart Subscription subscription, @RequestPart MultipartFile imageFile, @RequestParam int memberId){

        try {
            Subscription subscription1 = service.addSubscription(subscription, imageFile,memberId);
            return new ResponseEntity<>(subscription, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


}
