import java.util.*;


public class Main {
	
	public List<HostSystem> deploy(List<Cluster> clusters, List<HostSystem> systems){
		int s=0,c=0, i=0;
		
		for(c=0; c<clusters.size();c++) {
			Cluster cluster = clusters.get(c);
			for(s=i;s<i+5;s++) {
				if(s >= systems.size()) {
					break;
				}
				systems.get(s).set(cluster);
				cluster.add(systems.get(s));
			}
			i=s;
		}
		
		List<HostSystem> result = new ArrayList<HostSystem>();
		for(s=i; s<systems.size();s++) {
			result.add(systems.get(s));
		}
		return result;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Main m = new Main();
		List<HostSystem> systems = new ArrayList<HostSystem>();
		
		HostSystem s = new HostSystem("System1");
		systems.add(s);
		s = new HostSystem("Sytem2");
		systems.add(s);
		s = new HostSystem("Sytem3");
		systems.add(s);	
		
		List<Cluster> clusters = new ArrayList<Cluster>();
		Cluster cluster = new Cluster("cluster1");
		clusters.add(cluster);
		
		
		
		List<HostSystem> res = m.deploy(clusters, systems);
		
		for(HostSystem r : res) {
			System.out.println(r.toString());
		}
		
		for(Cluster c :  clusters) {
			HostSystem system = c.systems.get(0);
			c.remove(systems.get(0));
			System.out.println(system.toString());
			
		}
		
	}

}
