package ra.lifi;

import ra.common.Envelope;
import ra.common.messaging.MessageProducer;
import ra.common.network.Network;
import ra.common.network.NetworkService;
import ra.common.service.ServiceStatusObserver;

import java.util.Properties;
import java.util.logging.Logger;

public final class LiFiService extends NetworkService implements LiFiSessionListener {

    private static final Logger LOG = Logger.getLogger(LiFiService.class.getName());

    private Thread taskRunnerThread;
    private LiFiSession session;

    public LiFiService() {
       super(Network.LiFi);
//        taskRunner = new TaskRunner(1, 1);
    }

    public LiFiService(MessageProducer messageProducer, ServiceStatusObserver observer) {
        super(Network.LiFi, messageProducer, observer);
//        taskRunner = new TaskRunner(1, 1);
    }

    /**
     * Sends UTF-8 content to a Destination using LiFi.
     * @param envelope Envelope of data for request.
     *                 To DID must contain base64 encoded LiFi destination key.
     * @return boolean was successful
     */
    @Override
    public Boolean sendOut(Envelope envelope) {
        LOG.info("Sending LiFi Message...");
        return false;
    }

    /**
     * Will be called only if you register via
     * setSessionListener() or addSessionListener().
     * And if you are doing that, just use LiFiSessionListener.
     *
     * @param session session to notify
     * @param msgId message number available
     * @param size size of the message - why it's a long and not an int is a mystery
     */
    @Override
    public void messageAvailable(LiFiSession session, int msgId, long size) {
        LOG.info("Message received by LiFi Sensor...");

//        EventMessage m = (EventMessage) e.getMessage();
//        m.setName(fingerprint);
//        m.setMessage(strPayload);
//        DLC.addRoute(NotificationService.class, NotificationService.OPERATION_PUBLISH, e);
//        LOG.info("Sending Event Message to Notification Service...");
//        sendIn(e);
    }

    /**
     * Notify the service that the session has been terminated.
     * All registered listeners will be called.
     *
     * @param session session to report disconnect to
     */
    @Override
    public void disconnected(LiFiSession session) {
        LOG.warning("LiFi Session reporting disconnection.");

    }

    /**
     * Notify the client that some throwable occurred.
     * All registered listeners will be called.
     *
     * @param session session to report error occurred
     * @param message message received describing error
     * @param throwable throwable thrown during error
     */
    @Override
    public void errorOccurred(LiFiSession session, String message, Throwable throwable) {
        LOG.severe("Router says: "+message+": "+throwable.getLocalizedMessage());

    }


    @Override
    public boolean start(Properties properties) {

//        taskRunnerThread = new Thread(taskRunner);
//        taskRunnerThread.setDaemon(true);
//        taskRunnerThread.setName("LiFiSensor-TaskRunnerThread");
//        taskRunnerThread.start();
        return true;
    }

    @Override
    public boolean pause() {
        return false;
    }

    @Override
    public boolean unpause() {
        return false;
    }

    @Override
    public boolean restart() {
        return false;
    }

    @Override
    public boolean shutdown() {
        return false;
    }

    @Override
    public boolean gracefulShutdown() {
        return false;
    }
}
