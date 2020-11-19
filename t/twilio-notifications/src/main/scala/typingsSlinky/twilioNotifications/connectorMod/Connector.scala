package typingsSlinky.twilioNotifications.connectorMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.std.Set
import typingsSlinky.twilioNotifications.configurationMod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
