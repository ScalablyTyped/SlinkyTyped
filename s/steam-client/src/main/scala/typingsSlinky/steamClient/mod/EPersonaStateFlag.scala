package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPersonaStateFlag extends StObject
@JSImport("steam-client", "EPersonaStateFlag")
@js.native
object EPersonaStateFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPersonaStateFlag with Double] = js.native
  
  // removed "renamed to ClientTypeMobile"
  @js.native
  sealed trait ClientTypeMobile extends EPersonaStateFlag
  /* 512 */ val ClientTypeMobile: typingsSlinky.steamClient.mod.EPersonaStateFlag.ClientTypeMobile with Double = js.native
  
  // removed "renamed to ClientTypeTenfoot"
  @js.native
  sealed trait ClientTypeTenfoot extends EPersonaStateFlag
  /* 1024 */ val ClientTypeTenfoot: typingsSlinky.steamClient.mod.EPersonaStateFlag.ClientTypeTenfoot with Double = js.native
  
  // removed "renamed to ClientTypeVR"
  @js.native
  sealed trait ClientTypeVR extends EPersonaStateFlag
  /* 2048 */ val ClientTypeVR: typingsSlinky.steamClient.mod.EPersonaStateFlag.ClientTypeVR with Double = js.native
  
  // removed "renamed to ClientTypeWeb"
  @js.native
  sealed trait ClientTypeWeb extends EPersonaStateFlag
  /* 256 */ val ClientTypeWeb: typingsSlinky.steamClient.mod.EPersonaStateFlag.ClientTypeWeb with Double = js.native
  
  @js.native
  sealed trait Golden extends EPersonaStateFlag
  /* 4 */ val Golden: typingsSlinky.steamClient.mod.EPersonaStateFlag.Golden with Double = js.native
  
  @js.native
  sealed trait HasRichPresence extends EPersonaStateFlag
  /* 1 */ val HasRichPresence: typingsSlinky.steamClient.mod.EPersonaStateFlag.HasRichPresence with Double = js.native
  
  @js.native
  sealed trait InJoinableGame extends EPersonaStateFlag
  /* 2 */ val InJoinableGame: typingsSlinky.steamClient.mod.EPersonaStateFlag.InJoinableGame with Double = js.native
  
  @js.native
  sealed trait LaunchTypeGamepad extends EPersonaStateFlag
  /* 4096 */ val LaunchTypeGamepad: typingsSlinky.steamClient.mod.EPersonaStateFlag.LaunchTypeGamepad with Double = js.native
  
  @js.native
  sealed trait OnlineUsingBigPicture extends EPersonaStateFlag
  /* 1024 */ val OnlineUsingBigPicture: typingsSlinky.steamClient.mod.EPersonaStateFlag.OnlineUsingBigPicture with Double = js.native
  
  @js.native
  sealed trait OnlineUsingMobile extends EPersonaStateFlag
  /* 512 */ val OnlineUsingMobile: typingsSlinky.steamClient.mod.EPersonaStateFlag.OnlineUsingMobile with Double = js.native
  
  @js.native
  sealed trait OnlineUsingVR extends EPersonaStateFlag
  /* 2048 */ val OnlineUsingVR: typingsSlinky.steamClient.mod.EPersonaStateFlag.OnlineUsingVR with Double = js.native
  
  // removed "no longer has any effect"
  @js.native
  sealed trait OnlineUsingWeb extends EPersonaStateFlag
  /* 256 */ val OnlineUsingWeb: typingsSlinky.steamClient.mod.EPersonaStateFlag.OnlineUsingWeb with Double = js.native
}
