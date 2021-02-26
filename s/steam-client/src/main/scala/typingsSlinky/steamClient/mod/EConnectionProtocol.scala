package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EConnectionProtocol extends StObject
@JSImport("steam-client", "EConnectionProtocol")
@js.native
object EConnectionProtocol extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EConnectionProtocol with Double] = js.native
  
  @js.native
  sealed trait TCP extends EConnectionProtocol
  /* 1 */ val TCP: typingsSlinky.steamClient.mod.EConnectionProtocol.TCP with Double = js.native
  
  @js.native
  sealed trait UDP extends EConnectionProtocol
  /* 2 */ val UDP: typingsSlinky.steamClient.mod.EConnectionProtocol.UDP with Double = js.native
  
  @js.native
  sealed trait WebSocket extends EConnectionProtocol
  /* 3 */ val WebSocket: typingsSlinky.steamClient.mod.EConnectionProtocol.WebSocket with Double = js.native
}
