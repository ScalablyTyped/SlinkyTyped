package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDenyReason extends StObject
@JSImport("steam-client", "EDenyReason")
@js.native
object EDenyReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDenyReason with Double] = js.native
  
  @js.native
  sealed trait Cheater extends EDenyReason
  /* 5 */ val Cheater: typingsSlinky.steamClient.mod.EDenyReason.Cheater with Double = js.native
  
  @js.native
  sealed trait Generic extends EDenyReason
  /* 2 */ val Generic: typingsSlinky.steamClient.mod.EDenyReason.Generic with Double = js.native
  
  @js.native
  sealed trait IncompatibleAnticheat extends EDenyReason
  /* 8 */ val IncompatibleAnticheat: typingsSlinky.steamClient.mod.EDenyReason.IncompatibleAnticheat with Double = js.native
  
  @js.native
  sealed trait IncompatibleSoftware extends EDenyReason
  /* 10 */ val IncompatibleSoftware: typingsSlinky.steamClient.mod.EDenyReason.IncompatibleSoftware with Double = js.native
  
  @js.native
  sealed trait InvalidVersion extends EDenyReason
  /* 1 */ val InvalidVersion: typingsSlinky.steamClient.mod.EDenyReason.InvalidVersion with Double = js.native
  
  @js.native
  sealed trait LoggedInElseWhere extends EDenyReason
  /* 6 */ val LoggedInElseWhere: typingsSlinky.steamClient.mod.EDenyReason.LoggedInElseWhere with Double = js.native
  
  @js.native
  sealed trait MemoryCorruption extends EDenyReason
  /* 9 */ val MemoryCorruption: typingsSlinky.steamClient.mod.EDenyReason.MemoryCorruption with Double = js.native
  
  @js.native
  sealed trait NoLicense extends EDenyReason
  /* 4 */ val NoLicense: typingsSlinky.steamClient.mod.EDenyReason.NoLicense with Double = js.native
  
  @js.native
  sealed trait NotLoggedOn extends EDenyReason
  /* 3 */ val NotLoggedOn: typingsSlinky.steamClient.mod.EDenyReason.NotLoggedOn with Double = js.native
  
  @js.native
  sealed trait SteamConnectionError extends EDenyReason
  /* 12 */ val SteamConnectionError: typingsSlinky.steamClient.mod.EDenyReason.SteamConnectionError with Double = js.native
  
  @js.native
  sealed trait SteamConnectionLost extends EDenyReason
  /* 11 */ val SteamConnectionLost: typingsSlinky.steamClient.mod.EDenyReason.SteamConnectionLost with Double = js.native
  
  @js.native
  sealed trait SteamOwnerLeftGuestUser extends EDenyReason
  /* 15 */ val SteamOwnerLeftGuestUser: typingsSlinky.steamClient.mod.EDenyReason.SteamOwnerLeftGuestUser with Double = js.native
  
  @js.native
  sealed trait SteamResponseTimedOut extends EDenyReason
  /* 13 */ val SteamResponseTimedOut: typingsSlinky.steamClient.mod.EDenyReason.SteamResponseTimedOut with Double = js.native
  
  @js.native
  sealed trait SteamValidationStalled extends EDenyReason
  /* 14 */ val SteamValidationStalled: typingsSlinky.steamClient.mod.EDenyReason.SteamValidationStalled with Double = js.native
  
  @js.native
  sealed trait UnknownText extends EDenyReason
  /* 7 */ val UnknownText: typingsSlinky.steamClient.mod.EDenyReason.UnknownText with Double = js.native
}
