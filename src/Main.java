import java.util.*;


public class Main {
	
	public List<Systems> deploy(List<Cluster> clusters, List<Systems> systems){
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
		
		List<Systems> result = new ArrayList<Systems>();
		for(s=i; s<systems.size();s++) {
			result.add(systems.get(s));
		}
		return result;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Main m = new Main();
		List<Systems> systems = new ArrayList<Systems>();
		
		Systems s = new Systems("System1");
		systems.add(s);
		s = new Systems("Sytem2");
		systems.add(s);
		s = new Systems("Sytem3");
		systems.add(s);
		s = new Systems("Sytem4");
		systems.add(s);
		s = new Systems("Sytem5");
		systems.add(s);
		
		s = new Systems("Sytem6");
		systems.add(s);
		s = new Systems("Sytem7");
		systems.add(s);
		s = new Systems("Sytem8");
		systems.add(s);
		s = new Systems("System9");
		systems.add(s);
		
		
		
		List<Cluster> clusters = new ArrayList<Cluster>();
		Cluster cluster = new Cluster();
		clusters.add(cluster);
		
		
		
		List<Systems> res = m.deploy(clusters, systems);
		for(Systems r : res) {
			System.out.println(r.toString());
		}
		
		
		
	}

}
