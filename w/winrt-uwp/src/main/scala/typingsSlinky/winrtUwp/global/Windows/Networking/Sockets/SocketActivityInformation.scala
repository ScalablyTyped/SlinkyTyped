package typingsSlinky.winrtUwp.global.Windows.Networking.Sockets

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information on the transferred socket from the Socket Broker. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityInformation")
@js.native
abstract class SocketActivityInformation ()
  extends typingsSlinky.winrtUwp.Windows.Networking.Sockets.SocketActivityInformation

/* static members */
@JSGlobal("Windows.Networking.Sockets.SocketActivityInformation")
@js.native
object SocketActivityInformation extends js.Object {
  /** Gets a list of all the sockets transferred to the socket brokering service by this app. */
  var allSockets: IMapView[
    String, 
    typingsSlinky.winrtUwp.Windows.Networking.Sockets.SocketActivityInformation
  ] = js.native
}

