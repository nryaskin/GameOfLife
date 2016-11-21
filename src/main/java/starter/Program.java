package starter;

import visualization.Visualization;
import model.CellularAutomat;

 
public class Program {

	static int Width = 80;
	static int Height = 25;

	public static void main(String[] args) {

		//interaction.UserConfigurationBuilder conf = new interaction.UserConfigurationBuilder("testing_config.txt");
		//conf.generate();

		System.out.println("run");
		CellularAutomat a = new CellularAutomat(Width, Height);
		Visualization v = Visualization.getVisualization();



		try {
			int i = 0;
			while(a.getCountObject() != 0) {
				System.out.println("step: " + i);
				v.toReflect(a);
				a.step(v);
				
				Thread.sleep(250);

				i++;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
