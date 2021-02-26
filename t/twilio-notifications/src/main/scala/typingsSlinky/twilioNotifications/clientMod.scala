package typingsSlinky.twilioNotifications

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.twilioNotifications.connectorMod.ChannelType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  /**
    * @class
    * @alias Notifications
    * @classdesc The helper library for the notification service.
    * Provides high level api for creating and managing notification subscriptions and receiving messages
    * Creates the instance of Notification helper library
    *
    * @constructor
    * @param {string} token - Twilio access token
    * @param {Notifications#ClientOptions} options - Options to customize client behavior
    */
  @JSImport("twilio-notifications/lib/client", "Client")
  @js.native
  class Client protected () extends EventEmitter {
    def this(token: String) = this()
    def this(token: String, options: js.Any) = this()
    
    var _onNeedReliableTransport: js.Any = js.native
    
    var _onRegistrationStateChange: js.Any = js.native
    
    var _onTransportStateChange: js.Any = js.native
    
    /**
      * Routes messages to the external subscribers
      * @private
      */
    var _routeMessage: js.Any = js.native
    
    var _updateTransportState: js.Any = js.native
    
    def connectionState: ConnectionState = js.native
    
    /**
      * Handle incoming push notification.
      * Client application should call this method when it receives push notifications and pass the received data
      * @param {Object} message push message
      * @return {PushNotification}
      */
    def handlePushNotification(message: js.Any): PushNotification = js.native
    
    val registrar: js.Any = js.native
    
    val reliableTransportState: js.Any = js.native
    
    var services: js.Any = js.native
    
    /**
      * Set APN/GCM/FCM token to enable application register for a push messages
      * @param {string} gcmToken/fcmToken Token received from GCM/FCM system
      */
    def setPushRegistrationId(registrationId: String, channelType: ChannelType): Unit = js.native
    
    /**
      * Adds the subscription for the given message type
      * @param {string} messageType The type of message that you want to receive
      * @param {string} channelType. Supported are 'twilsock', 'gcm' and 'fcm'
      */
    def subscribe(messageType: String): js.Promise[Unit] = js.native
    def subscribe(messageType: String, channelType: ChannelType): js.Promise[Unit] = js.native
    
    /**
      * Remove the subscription for the particular message type
      * @param {string} messageType The type of message that you don't want to receive anymore
      * @param {string} channelType. Supported are 'twilsock', 'gcm' and 'fcm'
      */
    def unsubscribe(messageType: String): js.Promise[Unit] = js.native
    def unsubscribe(messageType: String, channelType: ChannelType): js.Promise[Unit] = js.native
    
    /**
      * Updates auth token for registration
      * @param {string} token Authentication token for registrations
      */
    def updateToken(token: String): js.Promise[Unit] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.twilioNotifications.twilioNotificationsStrings.connecting
    - typingsSlinky.twilioNotifications.twilioNotificationsStrings.connected
    - typingsSlinky.twilioNotifications.twilioNotificationsStrings.disconnecting
    - typingsSlinky.twilioNotifications.twilioNotificationsStrings.disconnected
    - typingsSlinky.twilioNotifications.twilioNotificationsStrings.denied
  */
  trait ConnectionState extends StObject
  object ConnectionState {
    
    @scala.inline
    def connected: typingsSlinky.twilioNotifications.twilioNotificationsStrings.connected = "connected".asInstanceOf[typingsSlinky.twilioNotifications.twilioNotificationsStrings.connected]
    
    @scala.inline
    def connecting: typingsSlinky.twilioNotifications.twilioNotificationsStrings.connecting = "connecting".asInstanceOf[typingsSlinky.twilioNotifications.twilioNotificationsStrings.connecting]
    
    @scala.inline
    def denied: typingsSlinky.twilioNotifications.twilioNotificationsStrings.denied = "denied".asInstanceOf[typingsSlinky.twilioNotifications.twilioNotificationsStrings.denied]
    
    @scala.inline
    def disconnected: typingsSlinky.twilioNotifications.twilioNotificationsStrings.disconnected = "disconnected".asInstanceOf[typingsSlinky.twilioNotifications.twilioNotificationsStrings.disconnected]
    
    @scala.inline
    def disconnecting: typingsSlinky.twilioNotifications.twilioNotificationsStrings.disconnecting = "disconnecting".asInstanceOf[typingsSlinky.twilioNotifications.twilioNotificationsStrings.disconnecting]
  }
  
  @js.native
  trait PushNotification extends StObject {
    
    var messageType: String = js.native
    
    var payload: js.Any = js.native
  }
  object PushNotification {
    
    @scala.inline
    def apply(messageType: String, payload: js.Any): PushNotification = {
      val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushNotification]
    }
    
    @scala.inline
    implicit class PushNotificationMutableBuilder[Self <: PushNotification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
