package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HomeService {
    private List<Home> details = new ArrayList<Home>(
            Arrays.asList(
                    new Home("CSE","Computer Science Enginnering", "All Computer Software related"),
                    new Home("IT","Information Technology", "All AI related")
            )
    );

    public List<Home> getList(){
        return details;
    }

    public Home getDataById(String id){
        Home myList = null;
        myList = details.stream().filter(ob ->ob.getId().equals(id)).findFirst().get();
        return myList;
    }
    public void addDetail(Home home){
        details.add(home);
    }
}
