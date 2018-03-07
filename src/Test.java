import java.util.*;

public class Test {
	Main m =new Main();
	
	public List<Systems> createSystems(int number) {
		List<Systems> systems = new ArrayList<>();
		
		for(int i=0;i<number;i++) {
			try {
				Systems system = new Systems("System_"+i);
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
			Cluster cluster = new Cluster();
			clusters.add(cluster);
		}
		return clusters;
	}
	
	public void testDeploy() {
		List<Systems> systems = createSystems(7);
		List<Cluster> clusters = createCluster(1);
		
		System.out.print("1 Cluster and 7 Systems - "+m.deploy(clusters, systems).size()+" Systems cannot be deployed on cluster");
		
		
		System.out.println();
		
		clusters = createCluster(2);
		System.out.print("2 Cluster and 7 Systems - " + m.deploy(clusters, systems).size() +" Systems cannot be deployed on cluster");
		System.out.print(m.deploy(clusters, systems).size() ==  0);
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t  = new Test();
		
		System.out.println("Test.java");
		t.testDeploy();
	}

}
