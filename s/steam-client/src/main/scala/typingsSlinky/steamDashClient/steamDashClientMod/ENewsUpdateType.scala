package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ENewsUpdateType extends js.Object

@JSImport("steam-client", "ENewsUpdateType")
@js.native
object ENewsUpdateType extends js.Object {
  @js.native
  sealed trait AppNews extends ENewsUpdateType
  
  @js.native
  sealed trait CDDBUpdate extends ENewsUpdateType
  
  @js.native
  sealed trait ClientUpdate extends ENewsUpdateType
  
  @js.native
  sealed trait SteamAds extends ENewsUpdateType
  
  @js.native
  sealed trait SteamNews extends ENewsUpdateType
  
  /* 0 */ val AppNews: typingsSlinky.steamDashClient.steamDashClientMod.ENewsUpdateType.AppNews with Double = js.native
  /* 3 */ val CDDBUpdate: typingsSlinky.steamDashClient.steamDashClientMod.ENewsUpdateType.CDDBUpdate with Double = js.native
  /* 4 */ val ClientUpdate: typingsSlinky.steamDashClient.steamDashClientMod.ENewsUpdateType.ClientUpdate with Double = js.native
  /* 1 */ val SteamAds: typingsSlinky.steamDashClient.steamDashClientMod.ENewsUpdateType.SteamAds with Double = js.native
  /* 2 */ val SteamNews: typingsSlinky.steamDashClient.steamDashClientMod.ENewsUpdateType.SteamNews with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ENewsUpdateType with Double] = js.native
}

