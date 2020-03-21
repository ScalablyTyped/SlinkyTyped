package typingsSlinky.sipJs.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "TransportState")
@js.native
object TransportState extends js.Object {
  /* "Connected" */ val Connected: typingsSlinky.sipJs.transportStateMod.TransportState.Connected with String = js.native
  /* "Connecting" */ val Connecting: typingsSlinky.sipJs.transportStateMod.TransportState.Connecting with String = js.native
  /* "Disconnected" */ val Disconnected: typingsSlinky.sipJs.transportStateMod.TransportState.Disconnected with String = js.native
  /* "Disconnecting" */ val Disconnecting: typingsSlinky.sipJs.transportStateMod.TransportState.Disconnecting with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.sipJs.transportStateMod.TransportState with String] = js.native
}

