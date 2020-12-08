package ra.lifi;

import ra.util.tasks.BaseTask;
import ra.util.tasks.TaskRunner;

public class LiFiPeerDiscovery extends BaseTask {

    private LiFiService service;

    public LiFiPeerDiscovery(TaskRunner taskRunner, LiFiService service) {
        super(LiFiPeerDiscovery.class.getName(), taskRunner);
        this.service = service;
    }

    @Override
    public Boolean execute() {
        return null;
    }
}
