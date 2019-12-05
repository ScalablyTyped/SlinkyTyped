package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPublishedFileVisibility extends js.Object

@JSImport("steam-client", "EPublishedFileVisibility")
@js.native
object EPublishedFileVisibility extends js.Object {
  @js.native
  sealed trait FriendsOnly extends EPublishedFileVisibility
  
  @js.native
  sealed trait Private extends EPublishedFileVisibility
  
  @js.native
  sealed trait Public extends EPublishedFileVisibility
  
  /* 1 */ val FriendsOnly: typingsSlinky.steamDashClient.steamDashClientMod.EPublishedFileVisibility.FriendsOnly with Double = js.native
  /* 2 */ val Private: typingsSlinky.steamDashClient.steamDashClientMod.EPublishedFileVisibility.Private with Double = js.native
  /* 0 */ val Public: typingsSlinky.steamDashClient.steamDashClientMod.EPublishedFileVisibility.Public with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPublishedFileVisibility with Double] = js.native
}

