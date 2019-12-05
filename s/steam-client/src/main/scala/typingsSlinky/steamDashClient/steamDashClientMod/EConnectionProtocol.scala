package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EConnectionProtocol extends js.Object

@JSImport("steam-client", "EConnectionProtocol")
@js.native
object EConnectionProtocol extends js.Object {
  @js.native
  sealed trait TCP extends EConnectionProtocol
  
  @js.native
  sealed trait UDP extends EConnectionProtocol
  
  @js.native
  sealed trait WebSocket extends EConnectionProtocol
  
  /* 1 */ val TCP: typingsSlinky.steamDashClient.steamDashClientMod.EConnectionProtocol.TCP with Double = js.native
  /* 2 */ val UDP: typingsSlinky.steamDashClient.steamDashClientMod.EConnectionProtocol.UDP with Double = js.native
  /* 3 */ val WebSocket: typingsSlinky.steamDashClient.steamDashClientMod.EConnectionProtocol.WebSocket with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EConnectionProtocol with Double] = js.native
}

