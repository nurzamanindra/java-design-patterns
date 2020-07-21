package com.design.state;

import com.design.state.interfaces.HumanContext;
import com.design.state.interfaces.State;
import com.design.state.object.Human;
import com.design.state.state.Running;
import com.design.state.state.Walking;


public class App 
{
    public static void main( String[] args )
    {
    	State running = new Running();
    	State walking = new Walking();
    	Human human = new Human();
    	HumanContext humanContext = new HumanContext();
    	
    	humanContext.setState(running);
    	humanContext.doAction(human);
    	
    	humanContext.setState(walking);
    	humanContext.doAction(human);
    	
    }
}
