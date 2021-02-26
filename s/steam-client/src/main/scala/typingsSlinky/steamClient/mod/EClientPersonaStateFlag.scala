package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClientPersonaStateFlag extends StObject
@JSImport("steam-client", "EClientPersonaStateFlag")
@js.native
object EClientPersonaStateFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientPersonaStateFlag with Double] = js.native
  
  @js.native
  sealed trait ClanInfo extends EClientPersonaStateFlag
  /* 128 */ val ClanInfo: typingsSlinky.steamClient.mod.EClientPersonaStateFlag.ClanInfo with Double = js.native
  
  @js.native
  sealed trait ClanTag extends EClientPersonaStateFlag
  /* 1024 */ val ClanTag: typingsSlinky.steamClient.mod.EClientPersonaStateFlag.ClanTag with Double = js.native
  
  @js.native
  sealed trait Facebook extends EClientPersonaStateFlag
  /* 2048 */ val Facebook: typingsSlinky.steamClient.mod.EClientPersonaStateFlag.Facebook with Double = js.native
  
  @js.native
  sealed trait GameDataBlob extends EClientPersonaStateFlag
  /* 512 */ val GameDataBlob: typingsSlinky.steamClient.mod.EClientPersonaStateFlag.GameDataBlob with Double = js.native
  
  @js.native
  sealed trait GameExtraInfo extends EClientPersonaStateFlag
  /* 256 */ val GameExtraInfo: typingsSlinky.steamClient.mod.EClientPersonaStateFlag.GameExtraInfo with Double = js.native
  
  // removed
  @js.native
  sealed trait LastSeen extends EClientPersonaStateFlag
  /* 64 */ val LastSeen: typingsSlinky.steamClient.mod.EClientPersonaStateFlag.LastSeen with Double = js.native
  
  @js.native
  sealed trait Metadata extends EClientPersonaStateFlag
  /* 32 */ val Metadata: typingsSlinky.steamClient.mod.EClientPersonaStateFlag.Metadata with Double = js.native
  
  @js.native
  sealed trait PlayerName extends EClientPersonaStateFlag
  /* 2 */ val PlayerName: typingsSlinky.steamClient.mod.EClientPersonaStateFlag.PlayerName with Double = js.native
  
  @js.native
  sealed trait Presence extends EClientPersonaStateFlag
  /* 16 */ val Presence: typingsSlinky.steamClient.mod.EClientPersonaStateFlag.Presence with Double = js.native
  
  @js.native
  sealed trait QueryPort extends EClientPersonaStateFlag
  /* 4 */ val QueryPort: typingsSlinky.steamClient.mod.EClientPersonaStateFlag.QueryPort with Double = js.native
  
  @js.native
  sealed trait SourceID extends EClientPersonaStateFlag
  /* 8 */ val SourceID: typingsSlinky.steamClient.mod.EClientPersonaStateFlag.SourceID with Double = js.native
  
  @js.native
  sealed trait Status extends EClientPersonaStateFlag
  /* 1 */ val Status: typingsSlinky.steamClient.mod.EClientPersonaStateFlag.Status with Double = js.native
}
