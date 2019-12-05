package typingsSlinky.sipDotJs.libApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "TransportState")
@js.native
object TransportState extends js.Object {
  /* "Connected" */ val Connected: typingsSlinky.sipDotJs.libApiTransportDashStateMod.TransportState.Connected with String = js.native
  /* "Connecting" */ val Connecting: typingsSlinky.sipDotJs.libApiTransportDashStateMod.TransportState.Connecting with String = js.native
  /* "Disconnected" */ val Disconnected: typingsSlinky.sipDotJs.libApiTransportDashStateMod.TransportState.Disconnected with String = js.native
  /* "Disconnecting" */ val Disconnecting: typingsSlinky.sipDotJs.libApiTransportDashStateMod.TransportState.Disconnecting with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.sipDotJs.libApiTransportDashStateMod.TransportState with String] = js.native
}

