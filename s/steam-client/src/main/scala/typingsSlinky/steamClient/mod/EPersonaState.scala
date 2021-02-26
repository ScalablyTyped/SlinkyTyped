package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPersonaState extends StObject
@JSImport("steam-client", "EPersonaState")
@js.native
object EPersonaState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPersonaState with Double] = js.native
  
  @js.native
  sealed trait Away extends EPersonaState
  /* 3 */ val Away: typingsSlinky.steamClient.mod.EPersonaState.Away with Double = js.native
  
  @js.native
  sealed trait Busy extends EPersonaState
  /* 2 */ val Busy: typingsSlinky.steamClient.mod.EPersonaState.Busy with Double = js.native
  
  @js.native
  sealed trait LookingToPlay extends EPersonaState
  /* 6 */ val LookingToPlay: typingsSlinky.steamClient.mod.EPersonaState.LookingToPlay with Double = js.native
  
  @js.native
  sealed trait LookingToTrade extends EPersonaState
  /* 5 */ val LookingToTrade: typingsSlinky.steamClient.mod.EPersonaState.LookingToTrade with Double = js.native
  
  @js.native
  sealed trait Max extends EPersonaState
  /* 7 */ val Max: typingsSlinky.steamClient.mod.EPersonaState.Max with Double = js.native
  
  @js.native
  sealed trait Offline extends EPersonaState
  /* 0 */ val Offline: typingsSlinky.steamClient.mod.EPersonaState.Offline with Double = js.native
  
  @js.native
  sealed trait Online extends EPersonaState
  /* 1 */ val Online: typingsSlinky.steamClient.mod.EPersonaState.Online with Double = js.native
  
  @js.native
  sealed trait Snooze extends EPersonaState
  /* 4 */ val Snooze: typingsSlinky.steamClient.mod.EPersonaState.Snooze with Double = js.native
}
