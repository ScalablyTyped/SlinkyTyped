package typingsSlinky.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "TransportState")
@js.native
object TransportState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.sipJs.transportStateMod.TransportState with String] = js.native
  
  /* "Connected" */ val Connected: typingsSlinky.sipJs.transportStateMod.TransportState.Connected with String = js.native
  
  /* "Connecting" */ val Connecting: typingsSlinky.sipJs.transportStateMod.TransportState.Connecting with String = js.native
  
  /* "Disconnected" */ val Disconnected: typingsSlinky.sipJs.transportStateMod.TransportState.Disconnected with String = js.native
  
  /* "Disconnecting" */ val Disconnecting: typingsSlinky.sipJs.transportStateMod.TransportState.Disconnecting with String = js.native
}
