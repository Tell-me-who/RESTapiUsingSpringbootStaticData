package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiHome {
    @Autowired
    private HomeService homeService;

    // uri - http://localhost:8080/home-page

    @GetMapping("/home-page")
    public List<Home> getAllList(){
        return this.homeService.getList();
    }

    // uri - http://localhost:8080/single-list/CSE
    @RequestMapping("/single-list/{id}")
    public Home getDetailById(@PathVariable String id){
        return this.homeService.getDataById(id);
    }

    @PostMapping("/add")
    //@RequestMapping(value="/add",method = RequestMethod.POST)
    public Home addData(@RequestBody Home home){
        this.homeService.addDetail(home);
        return home;

    }

    @DeleteMapping("delete/{homeId}")
    public void deleteData(@PathVariable("homeId") String id){
        System.out.println(id);
    }

    @PutMapping("update/{id}")
    public Home updateRecord(@RequestBody Home home,@PathVariable String id){
        System.out.println(id);
        return home;
    }
}
