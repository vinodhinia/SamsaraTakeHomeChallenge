import java.util.*;

public class Test {
	Main m =new Main();
	
	
	public List<HostSystem> createSystems(int number) {
		List<HostSystem> systems = new ArrayList<>();
		
		for(int i=0;i<number;i++) {
			try {
				HostSystem system = new HostSystem("System_"+i);
				systems.add(system);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return systems;
	}
	
	
	public List<Cluster> createCluster(int number){
		List<Cluster> clusters = new ArrayList<Cluster>();
		
		for(int i=0;i<number;i++) {
			Cluster cluster = new Cluster("Cluster_"+i);
			clusters.add(cluster);
		}
		return clusters;
	}
	
	public void testDeploy() {
		List<HostSystem> systems = createSystems(7);
		List<Cluster> clusters = createCluster(1);
		
		System.out.println("1 Cluster and 7 Systems");
		assert(m.deploy(clusters, systems).size() == 2);
		
		clusters = createCluster(2);
		System.out.println("2 Cluster and 7 Systems");
		
		assert(m.deploy(clusters, systems).size() ==  0);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t  = new Test();
		
		System.out.println("Test.java");
		t.testDeploy();
	}

}
