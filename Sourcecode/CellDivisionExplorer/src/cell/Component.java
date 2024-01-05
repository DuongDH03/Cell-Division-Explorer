package cell;

public class Component {
	private String componentName;
	private String componentFunction;
	
	public Component(String componentName, String componentFunction) {
		super();
		this.componentName = componentName;
		this.componentFunction = componentFunction;
	}
	
	public String getComponentName() {
		return this.componentName;		
	}
	
	public String getComponentFunction() {
		return this.componentFunction;
	}
	
}
