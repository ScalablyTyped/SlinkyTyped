package typingsSlinky.twilioNotifications

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.std.Set
import typingsSlinky.twilioNotifications.configurationMod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectorMod {
  
  @JSImport("twilio-notifications/lib/connector", "Connector")
  @js.native
  abstract class Connector protected () extends EventEmitter {
    def this(config: Configuration) = this()
    
    val config: Configuration = js.native
    
    val currentState: RegistrationState = js.native
    
    val desiredState: RegistrationState = js.native
    
    var hasActiveAttempt: js.Any = js.native
    
    var persistRegistration: js.Any = js.native
    
    /* protected */ def removeRegistration(): js.Promise[Unit] = js.native
    
    def setNotificationId(notificationId: String): Unit = js.native
    
    def subscribe(messageType: String): js.Promise[Unit] = js.native
    
    def unsubscribe(messageType: String): js.Promise[Unit] = js.native
    
    /* protected */ def updateRegistration(registration: RegistrationState, reasons: Set[UpdateReason]): js.Promise[RegistrationState] = js.native
    
    def updateToken(token: String): Unit = js.native
  }
  
  @JSImport("twilio-notifications/lib/connector", "RegistrationState")
  @js.native
  class RegistrationState () extends StObject {
    def this(token: String) = this()
    def this(token: js.UndefOr[scala.Nothing], notificationId: String) = this()
    def this(token: String, notificationId: String) = this()
    def this(
      token: js.UndefOr[scala.Nothing],
      notificationId: js.UndefOr[scala.Nothing],
      messageTypes: Set[String]
    ) = this()
    def this(token: js.UndefOr[scala.Nothing], notificationId: String, messageTypes: Set[String]) = this()
    def this(token: String, notificationId: js.UndefOr[scala.Nothing], messageTypes: Set[String]) = this()
    def this(token: String, notificationId: String, messageTypes: Set[String]) = this()
    
    var messageTypes: Set[String] = js.native
    
    var notificationId: String = js.native
    
    var token: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.twilioNotifications.twilioNotificationsStrings.twilsock
    - typingsSlinky.twilioNotifications.twilioNotificationsStrings.gcm
    - typingsSlinky.twilioNotifications.twilioNotificationsStrings.fcm
    - typingsSlinky.twilioNotifications.twilioNotificationsStrings.apn
  */
  trait ChannelType extends StObject
  object ChannelType {
    
    @scala.inline
    def apn: typingsSlinky.twilioNotifications.twilioNotificationsStrings.apn = "apn".asInstanceOf[typingsSlinky.twilioNotifications.twilioNotificationsStrings.apn]
    
    @scala.inline
    def fcm: typingsSlinky.twilioNotifications.twilioNotificationsStrings.fcm = "fcm".asInstanceOf[typingsSlinky.twilioNotifications.twilioNotificationsStrings.fcm]
    
    @scala.inline
    def gcm: typingsSlinky.twilioNotifications.twilioNotificationsStrings.gcm = "gcm".asInstanceOf[typingsSlinky.twilioNotifications.twilioNotificationsStrings.gcm]
    
    @scala.inline
    def twilsock: typingsSlinky.twilioNotifications.twilioNotificationsStrings.twilsock = "twilsock".asInstanceOf[typingsSlinky.twilioNotifications.twilioNotificationsStrings.twilsock]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.twilioNotifications.twilioNotificationsStrings.token
    - typingsSlinky.twilioNotifications.twilioNotificationsStrings.notificationId
    - typingsSlinky.twilioNotifications.twilioNotificationsStrings.messageType
  */
  trait UpdateReason extends StObject
  object UpdateReason {
    
    @scala.inline
    def messageType: typingsSlinky.twilioNotifications.twilioNotificationsStrings.messageType = "messageType".asInstanceOf[typingsSlinky.twilioNotifications.twilioNotificationsStrings.messageType]
    
    @scala.inline
    def notificationId: typingsSlinky.twilioNotifications.twilioNotificationsStrings.notificationId = "notificationId".asInstanceOf[typingsSlinky.twilioNotifications.twilioNotificationsStrings.notificationId]
    
    @scala.inline
    def token: typingsSlinky.twilioNotifications.twilioNotificationsStrings.token = "token".asInstanceOf[typingsSlinky.twilioNotifications.twilioNotificationsStrings.token]
  }
}
