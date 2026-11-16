package com.project.SubscriptionSystem.Controller;


import com.project.SubscriptionSystem.Model.Member;
import com.project.SubscriptionSystem.Model.Subscription;
import com.project.SubscriptionSystem.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MemberController {

    @Autowired
    MemberService service;


    @GetMapping("/member/{memberId}")
    public ResponseEntity<Member> getMember(@PathVariable int memberId){

        Member member = service.getMember(memberId);

        if(member != null){
            return ResponseEntity.ok(member);
//            return new ResponseEntity<>(member,HttpStatus.OK);
        }else {
            return ResponseEntity.notFound().build();
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/members")
    public List<Member> getMembers(){
        return service.addMembers();
    }


    @GetMapping("/members/count")
    public long getCountOfMembers(){
        return service.getCountOfMembers();
    }

    @PostMapping("/member")
    public ResponseEntity<?> addMember(@RequestBody Member member){

        Member member1 = service.addMember(member);
        if(member1 != null)
            return new ResponseEntity(member1,HttpStatus.CREATED);
        else
            return new ResponseEntity(HttpStatus.NOT_FOUND);

    }

}
