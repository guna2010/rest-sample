package com.example.converter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuzzFizzController {

    @GetMapping("/getfizzbuzz/{data}")
    public ResponseEntity<String> getString(@PathVariable String data) {
        String res = "";
       // HH.main(null);
        HH h=new HH();
        h.TT();

        boolean flag3=false;
        boolean flag5=false;
        if (data != null) {

            Integer i = Integer.parseInt(data);
            if (i % 3 == 0) {
                res = "FIZZ";
                flag3 = true;

            }
            if (i % 5 == 0) {
                res = "BUZZ";
                flag5 = true;
            }
             if(flag5==true && flag3==true){
                res = "FIZZBUZZ";
            }
            else{
                res=data;
            }

        }






        return ResponseEntity.ok().body(res);
    }
}
