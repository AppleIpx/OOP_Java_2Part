package Task6;

class EmailNotifier extends EventNotifier {
    @Override
    protected void getEventDetails() {
        System.out.println("Получаем детали мероприятия для уведомления по Email.");
    }

    @Override
    protected void sendNotification() {
        System.out.println("Отправляем уведомление по Email.");
    }
}
