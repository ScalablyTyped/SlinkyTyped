package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EClanRank extends js.Object

@JSImport("steam-client", "EClanRank")
@js.native
object EClanRank extends js.Object {
  @js.native
  sealed trait Member extends EClanRank
  
  @js.native
  sealed trait Moderator extends EClanRank
  
  @js.native
  sealed trait None extends EClanRank
  
  @js.native
  sealed trait Officer extends EClanRank
  
  @js.native
  sealed trait Owner extends EClanRank
  
  /* 3 */ val Member: typingsSlinky.steamDashClient.steamDashClientMod.EClanRank.Member with Double = js.native
  /* 4 */ val Moderator: typingsSlinky.steamDashClient.steamDashClientMod.EClanRank.Moderator with Double = js.native
  /* 0 */ val None: typingsSlinky.steamDashClient.steamDashClientMod.EClanRank.None with Double = js.native
  /* 2 */ val Officer: typingsSlinky.steamDashClient.steamDashClientMod.EClanRank.Officer with Double = js.native
  /* 1 */ val Owner: typingsSlinky.steamDashClient.steamDashClientMod.EClanRank.Owner with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanRank with Double] = js.native
}

