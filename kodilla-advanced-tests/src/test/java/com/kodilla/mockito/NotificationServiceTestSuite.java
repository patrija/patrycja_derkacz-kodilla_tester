package com.kodilla.mockito;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import com.kodilla.notification.NotificationService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTestSuite {

    NotificationService notificationService = new NotificationService();
    Client client = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
       // NotificationService notificationService = new NotificationService();
       // Client client = Mockito.mock(Client.class);
        //Notification notification = Mockito.mock(Notification.class);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);


    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
        //NotificationService notificationService = new NotificationService();
        //Client client = Mockito.mock(Client.class);

        //Notification notification = Mockito.mock(Notification.class);
        notificationService.addSubscriber(client);
        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {
        NotificationService notificationService = new NotificationService();
        //Client client1 = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Client client3 = Mockito.mock(Client.class);
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client2);
        notificationService.addSubscriber(client3);

        Notification notification = Mockito.mock(Notification.class);
        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
        Mockito.verify(client3, Mockito.times(1)).receive(notification);

    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
       // NotificationService notificationService = new NotificationService();

       // Client client = Mockito.mock(Client.class);
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);
        //Notification notification = Mockito.mock(Notification.class);

        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);

    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
       // NotificationService notificationService = new NotificationService();

       //Client client = Mockito.mock(Client.class);
        notificationService.addSubscriber(client);
        //Notification notification = Mockito.mock(Notification.class);
        notificationService.removeSubscriber(client);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
}
