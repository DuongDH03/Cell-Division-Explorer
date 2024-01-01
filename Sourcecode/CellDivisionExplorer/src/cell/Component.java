package cell;

public class Component {
	public String componentName;
	public String componentFunction;
	
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
