package typingsSlinky.twilsock

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.twilsock.packetinterfaceMod.PacketInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock/lib/services/registrations", JSImport.Namespace)
@js.native
object registrationsMod extends js.Object {
  
  /**
    * Registrations module handles all operations with registration contexts through twilsock
    * Main role: it automatically refreshes all registrations after reconnect.
    */
  @js.native
  class Registrations protected () extends EventEmitter {
    def this(transport: PacketInterface) = this()
    
    var deleteNotificationContext: js.Any = js.native
    
    var putNotificationContext: js.Any = js.native
    
    val registrations: js.Any = js.native
    
    val registrationsInProgress: js.Any = js.native
    
    def removeNotificationsContext(contextId: String): js.Promise[Unit] = js.native
    
    def setNotificationsContext(contextId: js.Any, context: js.Any): Unit = js.native
    
    val transport: js.Any = js.native
    
    var updateRegistration: js.Any = js.native
    
    def updateRegistrations(): Unit = js.native
  }
}
