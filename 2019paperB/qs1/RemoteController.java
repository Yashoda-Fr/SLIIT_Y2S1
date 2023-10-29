package qs1;

public class RemoteController {
	int Switch;
    ISensor ISensor [];
    IMotionTracker IMotionTracker[];
	
    
    public RemoteController(int switch1, ISensor[] iSensor, IMotionTracker[] iMotionTracker) {
		super();
		Switch = switch1;
		ISensor = iSensor;
		IMotionTracker = iMotionTracker;
	}
     

}
