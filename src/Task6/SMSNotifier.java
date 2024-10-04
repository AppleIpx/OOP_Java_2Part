package Task6;

class SMSNotifier extends EventNotifier {
    @Override
    protected void getEventDetails() {
        System.out.println("Получаем детали мероприятия для уведомления по SMS.");
    }

    @Override
    protected void sendNotification() {
        System.out.println("Отправляем уведомление по SMS.");
    }
}
