package com.poo.todolist.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
public class CommandLine  implements CommandLineRunner{
    
    @Override
    public void run(String... args) throws Exception{
        System.out.println(Arrays.asList(args));
    }
}

