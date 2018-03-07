import java.util.*;

public class Cluster extends NameValidator{
	String clusterName;
	List<HostSystem> systems;
	
	public Cluster() {
		
	}
	
	Cluster(ArrayList<HostSystem> systems){
		systems = new ArrayList<HostSystem>(systems);
	}
	
	public Cluster(String name){
		this.clusterName = name;
		systems = new ArrayList<HostSystem>();
		isNameAlphanumeric(clusterName);
	}
	
	public void isNameAlphanumeric(String name)  {
		try {
			super.isNameAlphanumeric(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void add(HostSystem system) {
		system.cluster.clusterName = this.clusterName;
		systems.add(system);
	}
	
	public void remove(HostSystem system) {
		system.cluster = null;
		systems.remove(system);
	}
	
}
