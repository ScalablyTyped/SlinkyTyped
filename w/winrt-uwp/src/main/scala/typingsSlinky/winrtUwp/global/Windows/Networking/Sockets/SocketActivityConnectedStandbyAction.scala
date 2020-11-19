package typingsSlinky.winrtUwp.global.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates whether an app that uses the socket brokering service can receive packets when the system goes to connected stand by. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityConnectedStandbyAction")
@js.native
object SocketActivityConnectedStandbyAction extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.winrtUwp.Windows.Networking.Sockets.SocketActivityConnectedStandbyAction with Double
  ] = js.native
  
  /* 0 */ val doNotWake: typingsSlinky.winrtUwp.Windows.Networking.Sockets.SocketActivityConnectedStandbyAction.doNotWake with Double = js.native
  
  /* 1 */ val wake: typingsSlinky.winrtUwp.Windows.Networking.Sockets.SocketActivityConnectedStandbyAction.wake with Double = js.native
}
