package starter;

import visualization.Visualization;
import model.CellularAutomat;

 
public class Program {

	static int Width = 80;
	static int Height = 25;

	public static void main(String[] args) {
		System.out.println("run");
		CellularAutomat a = new CellularAutomat(Width, Height);
		Visualization v = Visualization.getVisualization();

		int test = 0;

		try {
			int i = 0;
			while(a.getCountObject() != 0) {
				System.out.println("step: " + i);
				v.toReflect(a);
				a.step(v);
				
				Thread.sleep(250);				
				/*
				if(test++ == 100){
					System.out.println("SERIALIZTION");
					interaction.Serialization.save(a, ".\\tmp\\cellular.ser");
					System.out.println("END");
				break;
				}
				*/
				i++;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
