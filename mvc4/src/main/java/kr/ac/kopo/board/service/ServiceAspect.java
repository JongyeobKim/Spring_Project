package kr.ac.kopo.board.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {
	@Before("execution(* selectOne(long))")
	public void before() {
		System.out.println("selectOne Before! ***");
	}
}
