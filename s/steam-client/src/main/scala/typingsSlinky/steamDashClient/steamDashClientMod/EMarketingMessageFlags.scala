package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EMarketingMessageFlags extends js.Object

@JSImport("steam-client", "EMarketingMessageFlags")
@js.native
object EMarketingMessageFlags extends js.Object {
  @js.native
  sealed trait HighPriority extends EMarketingMessageFlags
  
  @js.native
  sealed trait None extends EMarketingMessageFlags
  
  @js.native
  sealed trait PlatformLinux extends EMarketingMessageFlags
  
  @js.native
  sealed trait PlatformMac extends EMarketingMessageFlags
  
  @js.native
  sealed trait PlatformRestrictions extends EMarketingMessageFlags
  
  @js.native
  sealed trait PlatformWindows extends EMarketingMessageFlags
  
  /* 1 */ val HighPriority: typingsSlinky.steamDashClient.steamDashClientMod.EMarketingMessageFlags.HighPriority with Double = js.native
  /* 0 */ val None: typingsSlinky.steamDashClient.steamDashClientMod.EMarketingMessageFlags.None with Double = js.native
  /* 8 */ val PlatformLinux: typingsSlinky.steamDashClient.steamDashClientMod.EMarketingMessageFlags.PlatformLinux with Double = js.native
  /* 4 */ val PlatformMac: typingsSlinky.steamDashClient.steamDashClientMod.EMarketingMessageFlags.PlatformMac with Double = js.native
  /* 2 | 4 | 8 */ val PlatformRestrictions: typingsSlinky.steamDashClient.steamDashClientMod.EMarketingMessageFlags.PlatformRestrictions with Double = js.native
  /* 2 */ val PlatformWindows: typingsSlinky.steamDashClient.steamDashClientMod.EMarketingMessageFlags.PlatformWindows with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMarketingMessageFlags with Double] = js.native
}

