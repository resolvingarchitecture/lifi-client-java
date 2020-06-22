package ra.lifi;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class LiFiSession extends BaseSession {

    private static final Logger LOG = Logger.getLogger(LiFiSession.class.getName());

    private List<LiFiSessionListener> sessionListeners = new ArrayList<>();

    public LiFiSession(LiFi sensor) {
        super(sensor);
    }

    @Override
    public boolean send(NetworkRequestOp requestOp) {
        return false;
    }

    @Override
    public boolean notify(NetworkNotifyOp notifyOp) {
        return false;
    }

    @Override
    public Boolean send(NetworkPacket packet) {
        LOG.warning("LiFISession.send(Packet) not implemented.");
        return false;
    }

    @Override
    public boolean open(String address) {
        return false;
    }

    @Override
    public boolean disconnect() {
        return false;
    }

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public boolean close() {
        return false;
    }

    public boolean connect() {
        return false;
    }

    public void addSessionListener(LiFiSessionListener listener) {
        sessionListeners.add(listener);
    }

    public void removeSessionListener(LiFiSessionListener listener) {
        sessionListeners.remove(listener);
    }
}
