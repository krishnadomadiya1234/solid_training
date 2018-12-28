package com.meditab.training.lsp.exercise;

public class ElectronicDuck impements duck_on_off,duck_quack_swim
{
    private boolean _on = false;
	@override
    public void quack()
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
    }
	@override
    public void swim()
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new RuntimeException("Can't swim when off");
        }
    }
	@override
    public void turnOn()
    {
        _on = true;
    }
	@override
    public void turnOff()
    {
        _on = false;
    }
}
