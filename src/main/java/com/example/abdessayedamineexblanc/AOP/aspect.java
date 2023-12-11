package com.example.abdessayedamineexblanc.AOP;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class aspect {
    @Before("execution(* com.example.abdessayedamineexblanc.Controllers.ExamenController.ajouter*(..))")
    public void afte(JoinPoint JoinPoint) {
        log.info("");}

    }

