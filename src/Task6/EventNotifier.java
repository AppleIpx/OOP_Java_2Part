package Task6;

abstract class EventNotifier {
    public final void notifyUser() {
        getEventDetails();
        if (userWantsNotification()) {
            sendNotification();
        }
    }

    protected abstract void getEventDetails();

    protected boolean userWantsNotification() {
        return true;
    }

    protected abstract void sendNotification();
}
