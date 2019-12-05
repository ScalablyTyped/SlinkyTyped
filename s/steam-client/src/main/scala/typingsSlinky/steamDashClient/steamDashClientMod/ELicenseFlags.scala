package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ELicenseFlags extends js.Object

@JSImport("steam-client", "ELicenseFlags")
@js.native
object ELicenseFlags extends js.Object {
  @js.native
  sealed trait CancelledByAdmin extends ELicenseFlags
  
  @js.native
  sealed trait CancelledByFriendlyFraudLock extends ELicenseFlags
  
  @js.native
  sealed trait CancelledByUser extends ELicenseFlags
  
  @js.native
  sealed trait Expired extends ELicenseFlags
  
  @js.native
  sealed trait ForceRunRestriction extends ELicenseFlags
  
  @js.native
  sealed trait ImportedFromSteam2 extends ELicenseFlags
  
  @js.native
  sealed trait LowViolenceContent extends ELicenseFlags
  
  @js.native
  sealed trait None extends ELicenseFlags
  
  @js.native
  sealed trait NotActivated extends ELicenseFlags
  
  @js.native
  sealed trait Pending extends ELicenseFlags
  
  @js.native
  sealed trait RegionRestrictionExpired extends ELicenseFlags
  
  @js.native
  sealed trait Renew extends ELicenseFlags
  
  @js.native
  sealed trait RenewalFailed extends ELicenseFlags
  
  /* 0x20 */ val CancelledByAdmin: typingsSlinky.steamDashClient.steamDashClientMod.ELicenseFlags.CancelledByAdmin with Double = js.native
  /* 0x400 */ val CancelledByFriendlyFraudLock: typingsSlinky.steamDashClient.steamDashClientMod.ELicenseFlags.CancelledByFriendlyFraudLock with Double = js.native
  /* 0x10 */ val CancelledByUser: typingsSlinky.steamDashClient.steamDashClientMod.ELicenseFlags.CancelledByUser with Double = js.native
  /* 0x08 */ val Expired: typingsSlinky.steamDashClient.steamDashClientMod.ELicenseFlags.Expired with Double = js.native
  /* 0x100 */ val ForceRunRestriction: typingsSlinky.steamDashClient.steamDashClientMod.ELicenseFlags.ForceRunRestriction with Double = js.native
  /* 0x80 */ val ImportedFromSteam2: typingsSlinky.steamDashClient.steamDashClientMod.ELicenseFlags.ImportedFromSteam2 with Double = js.native
  /* 0x40 */ val LowViolenceContent: typingsSlinky.steamDashClient.steamDashClientMod.ELicenseFlags.LowViolenceContent with Double = js.native
  /* 0 */ val None: typingsSlinky.steamDashClient.steamDashClientMod.ELicenseFlags.None with Double = js.native
  /* 0x800 */ val NotActivated: typingsSlinky.steamDashClient.steamDashClientMod.ELicenseFlags.NotActivated with Double = js.native
  /* 0x04 */ val Pending: typingsSlinky.steamDashClient.steamDashClientMod.ELicenseFlags.Pending with Double = js.native
  /* 0x200 */ val RegionRestrictionExpired: typingsSlinky.steamDashClient.steamDashClientMod.ELicenseFlags.RegionRestrictionExpired with Double = js.native
  /* 0x01 */ val Renew: typingsSlinky.steamDashClient.steamDashClientMod.ELicenseFlags.Renew with Double = js.native
  /* 0x02 */ val RenewalFailed: typingsSlinky.steamDashClient.steamDashClientMod.ELicenseFlags.RenewalFailed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELicenseFlags with Double] = js.native
}

