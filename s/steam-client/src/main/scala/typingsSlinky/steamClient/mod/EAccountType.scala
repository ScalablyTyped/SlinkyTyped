package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAccountType extends StObject
@JSImport("steam-client", "EAccountType")
@js.native
object EAccountType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAccountType with Double] = js.native
  
  @js.native
  sealed trait AnonGameServer extends EAccountType
  /* 4 */ val AnonGameServer: typingsSlinky.steamClient.mod.EAccountType.AnonGameServer with Double = js.native
  
  @js.native
  sealed trait AnonUser extends EAccountType
  /* 10 */ val AnonUser: typingsSlinky.steamClient.mod.EAccountType.AnonUser with Double = js.native
  
  @js.native
  sealed trait Chat extends EAccountType
  /* 8 */ val Chat: typingsSlinky.steamClient.mod.EAccountType.Chat with Double = js.native
  
  @js.native
  sealed trait Clan extends EAccountType
  /* 7 */ val Clan: typingsSlinky.steamClient.mod.EAccountType.Clan with Double = js.native
  
  @js.native
  sealed trait ConsoleUser extends EAccountType
  /* 9 */ val ConsoleUser: typingsSlinky.steamClient.mod.EAccountType.ConsoleUser with Double = js.native
  
  @js.native
  sealed trait ContentServer extends EAccountType
  /* 6 */ val ContentServer: typingsSlinky.steamClient.mod.EAccountType.ContentServer with Double = js.native
  
  @js.native
  sealed trait GameServer extends EAccountType
  /* 3 */ val GameServer: typingsSlinky.steamClient.mod.EAccountType.GameServer with Double = js.native
  
  @js.native
  sealed trait Individual extends EAccountType
  /* 1 */ val Individual: typingsSlinky.steamClient.mod.EAccountType.Individual with Double = js.native
  
  @js.native
  sealed trait Invalid extends EAccountType
  /* 0 */ val Invalid: typingsSlinky.steamClient.mod.EAccountType.Invalid with Double = js.native
  
  @js.native
  sealed trait Max extends EAccountType
  /* 11 */ val Max: typingsSlinky.steamClient.mod.EAccountType.Max with Double = js.native
  
  @js.native
  sealed trait Multiseat extends EAccountType
  /* 2 */ val Multiseat: typingsSlinky.steamClient.mod.EAccountType.Multiseat with Double = js.native
  
  @js.native
  sealed trait Pending extends EAccountType
  /* 5 */ val Pending: typingsSlinky.steamClient.mod.EAccountType.Pending with Double = js.native
}
