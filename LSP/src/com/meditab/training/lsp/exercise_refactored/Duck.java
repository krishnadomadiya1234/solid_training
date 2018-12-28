package com.meditab.training.lsp.exercise;

public class Duck implements duck_quack_swim
{
	@override
    public void quack()
    {
        System.out.println("Quack...");
    }
	@override
    public void swim()
    {
        System.out.println("Swim...");
    }
}
