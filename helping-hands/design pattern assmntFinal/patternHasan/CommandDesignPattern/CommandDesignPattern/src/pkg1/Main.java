package pkg1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.changeRadius(100);
		circle.transform(40, 60);
		circle.fillColor("red");
		
		System.out.println(circle);
		
		ICommand iCommand=new TransformCommand(circle, 20, 30);
		ICommand iCommand2=new FillColorCommand(circle, "orange");
		ICommand iCommand3=new ChangeRadiusCommand(circle, 200);
		
		
		Invoker2 invoker2=new Invoker2();
		invoker2.addExecute(iCommand);
		invoker2.addExecute(iCommand2);
		invoker2.addExecute(iCommand3);
		
		invoker2.execute();
		
		
		System.out.println(circle);
		
		
		invoker2.addUndo(iCommand3);
		invoker2.addUndo(iCommand2);
		invoker2.undo();
		
		System.out.println(circle);
		
		invoker2.addRedo(iCommand2);
		invoker2.addRedo(iCommand3);
		invoker2.redo();
		
		System.out.println(circle);
		
		
		
/*		
		Invoker invoker=new Invoker();
		invoker.execute(iCommand);
		invoker.execute(iCommand2);
		invoker.execute(iCommand3);
		
		System.out.println(circle);
		invoker.undo(iCommand);
		System.out.println(circle);
		invoker.undo(iCommand2);
		System.out.println(circle);
		invoker.undo(iCommand3);
		System.out.println(circle);
		
*/
		
		
		
		
		
		
		
	/*	System.out.println("Transform\n1.execution\n2.Undo\n0.exit\n");
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		
		while(choice!=0) {
			ICommand command;
			if(choice==1) {
				System.out.println("x = ");
				int a=scanner.nextInt();
				System.out.println("y = ");
				int b=scanner.nextInt();
				command=new TransformCommand(circle, a, b);
				command.execute();
			}
			else if(choice==2){
				.undo();
			}
		}
	*/
		
		
	}

}
