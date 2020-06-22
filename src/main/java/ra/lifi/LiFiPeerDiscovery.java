package ra.lifi;

import ra.util.tasks.TaskRunner;

public class LiFiPeerDiscovery extends NetworkTask {

    public LiFiPeerDiscovery(TaskRunner taskRunner, LiFi sensor) {
        super(LiFiPeerDiscovery.class.getName(), taskRunner, sensor);
    }

    @Override
    public Boolean execute() {
        return null;
    }
}
