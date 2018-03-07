
public class Systems {
	
	String hostName;
	Cluster cluster;
	
	public Systems() {
		
	}
	
	public Systems(String hostName) throws Exception{
		this.hostName = hostName;
		if(!checkHostName()) { 
			throw new Exception("HostName "+ this.hostName +" must be alphanumeric");
		}
	}
	
	public boolean checkHostName() {
		if(hostName.matches("^[a-zA-Z][a-zA-z0-9]*$")) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		return "System hostName=" + hostName + ", cluster=" + cluster ;
	}

	public void set(Cluster cluster) {
		this.cluster = cluster;
	}
	
	public void unset() {
		this.cluster = null;
	}

}
