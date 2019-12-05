package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatFlags extends js.Object

@JSImport("steam-client", "EChatFlags")
@js.native
object EChatFlags extends js.Object {
  @js.native
  sealed trait InvisibleToFriends extends EChatFlags
  
  @js.native
  sealed trait Locked extends EChatFlags
  
  @js.native
  sealed trait Moderated extends EChatFlags
  
  @js.native
  sealed trait Unjoinable extends EChatFlags
  
  /* 2 */ val InvisibleToFriends: typingsSlinky.steamDashClient.steamDashClientMod.EChatFlags.InvisibleToFriends with Double = js.native
  /* 1 */ val Locked: typingsSlinky.steamDashClient.steamDashClientMod.EChatFlags.Locked with Double = js.native
  /* 4 */ val Moderated: typingsSlinky.steamDashClient.steamDashClientMod.EChatFlags.Moderated with Double = js.native
  /* 8 */ val Unjoinable: typingsSlinky.steamDashClient.steamDashClientMod.EChatFlags.Unjoinable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatFlags with Double] = js.native
}

