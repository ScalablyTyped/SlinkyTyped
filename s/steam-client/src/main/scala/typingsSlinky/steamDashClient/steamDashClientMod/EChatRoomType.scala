package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatRoomType extends js.Object

@JSImport("steam-client", "EChatRoomType")
@js.native
object EChatRoomType extends js.Object {
  @js.native
  sealed trait Friend extends EChatRoomType
  
  @js.native
  sealed trait Lobby extends EChatRoomType
  
  @js.native
  sealed trait MUC extends EChatRoomType
  
  /* 1 */ val Friend: typingsSlinky.steamDashClient.steamDashClientMod.EChatRoomType.Friend with Double = js.native
  /* 3 */ val Lobby: typingsSlinky.steamDashClient.steamDashClientMod.EChatRoomType.Lobby with Double = js.native
  /* 2 */ val MUC: typingsSlinky.steamDashClient.steamDashClientMod.EChatRoomType.MUC with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomType with Double] = js.native
}

