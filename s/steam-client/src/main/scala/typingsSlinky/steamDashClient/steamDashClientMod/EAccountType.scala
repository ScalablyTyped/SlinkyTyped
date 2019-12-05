package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EAccountType extends js.Object

@JSImport("steam-client", "EAccountType")
@js.native
object EAccountType extends js.Object {
  @js.native
  sealed trait AnonGameServer extends EAccountType
  
  @js.native
  sealed trait AnonUser extends EAccountType
  
  @js.native
  sealed trait Chat extends EAccountType
  
  @js.native
  sealed trait Clan extends EAccountType
  
  @js.native
  sealed trait ConsoleUser extends EAccountType
  
  @js.native
  sealed trait ContentServer extends EAccountType
  
  @js.native
  sealed trait GameServer extends EAccountType
  
  @js.native
  sealed trait Individual extends EAccountType
  
  @js.native
  sealed trait Invalid extends EAccountType
  
  @js.native
  sealed trait Max extends EAccountType
  
  @js.native
  sealed trait Multiseat extends EAccountType
  
  @js.native
  sealed trait Pending extends EAccountType
  
  /* 4 */ val AnonGameServer: typingsSlinky.steamDashClient.steamDashClientMod.EAccountType.AnonGameServer with Double = js.native
  /* 10 */ val AnonUser: typingsSlinky.steamDashClient.steamDashClientMod.EAccountType.AnonUser with Double = js.native
  /* 8 */ val Chat: typingsSlinky.steamDashClient.steamDashClientMod.EAccountType.Chat with Double = js.native
  /* 7 */ val Clan: typingsSlinky.steamDashClient.steamDashClientMod.EAccountType.Clan with Double = js.native
  /* 9 */ val ConsoleUser: typingsSlinky.steamDashClient.steamDashClientMod.EAccountType.ConsoleUser with Double = js.native
  /* 6 */ val ContentServer: typingsSlinky.steamDashClient.steamDashClientMod.EAccountType.ContentServer with Double = js.native
  /* 3 */ val GameServer: typingsSlinky.steamDashClient.steamDashClientMod.EAccountType.GameServer with Double = js.native
  /* 1 */ val Individual: typingsSlinky.steamDashClient.steamDashClientMod.EAccountType.Individual with Double = js.native
  /* 0 */ val Invalid: typingsSlinky.steamDashClient.steamDashClientMod.EAccountType.Invalid with Double = js.native
  /* 11 */ val Max: typingsSlinky.steamDashClient.steamDashClientMod.EAccountType.Max with Double = js.native
  /* 2 */ val Multiseat: typingsSlinky.steamDashClient.steamDashClientMod.EAccountType.Multiseat with Double = js.native
  /* 5 */ val Pending: typingsSlinky.steamDashClient.steamDashClientMod.EAccountType.Pending with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAccountType with Double] = js.native
}

