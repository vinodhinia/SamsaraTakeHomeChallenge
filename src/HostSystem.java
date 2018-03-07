
public class HostSystem extends NameValidator{
	/* Class is named as HostSystem instead of System as 'System' is a keyword in JAVA */
	
	String hostName;
	Cluster cluster;
	
	public HostSystem() {
		
	}
	
	public HostSystem(String hostName) throws Exception{
		this.hostName = hostName;
		isNameAlphanumeric(hostName);
	}
	
	public void isNameAlphanumeric(String name) throws Exception {
		super.isNameAlphanumeric(name);
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
