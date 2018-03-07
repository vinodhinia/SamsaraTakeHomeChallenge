import java.util.*;

public class Cluster {
	List<Systems> systems;
	
	public Cluster(){
		systems = new ArrayList<Systems>();
	}
	
	Cluster(ArrayList<Systems> systems){
		systems = new ArrayList<Systems>(systems);
	}
	
	public void add(Systems system) {
		systems.add(system);
	}
	
	public void remove(Systems system) {
		systems.remove(system);
	}
	
}
