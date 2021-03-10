package main;

import command.TransformCommand;
import invoker.Invoker;
import receiver.ReceiverCircle;

public class Test1 {
	public static void main(String[] args) {
		ReceiverCircle circle = new ReceiverCircle(2 , 3);
		System.out.println(circle.getCircleX() + " " + circle.getCircleY());
		
		Invoker invoker = new Invoker();
		invoker.addCommand(new TransformCommand(circle, 5, 6));
		invoker.executeAllCommand();
		
		System.out.println(circle.getCircleX() + " " + circle.getCircleY());
		invoker.undoAllCommand();
		System.out.println(circle.getCircleX() + " " + circle.getCircleY());
		
	}
}
