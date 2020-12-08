package ra.lifi;


import ra.common.Envelope;
import ra.common.network.BaseClientSession;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class LiFiSession extends BaseClientSession {

    private static final Logger LOG = Logger.getLogger(LiFiSession.class.getName());

    private List<LiFiSessionListener> sessionListeners = new ArrayList<>();
    protected LiFiService service;

    public LiFiSession(LiFiService service) {
       this.service = service;
    }

    @Override
    public Boolean send(Envelope envelope) {
        return null;
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
