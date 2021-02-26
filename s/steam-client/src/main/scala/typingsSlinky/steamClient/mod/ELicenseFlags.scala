package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELicenseFlags extends StObject
@JSImport("steam-client", "ELicenseFlags")
@js.native
object ELicenseFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELicenseFlags with Double] = js.native
  
  @js.native
  sealed trait CancelledByAdmin extends ELicenseFlags
  /* 0x20 */ val CancelledByAdmin: typingsSlinky.steamClient.mod.ELicenseFlags.CancelledByAdmin with Double = js.native
  
  @js.native
  sealed trait CancelledByFriendlyFraudLock extends ELicenseFlags
  /* 0x400 */ val CancelledByFriendlyFraudLock: typingsSlinky.steamClient.mod.ELicenseFlags.CancelledByFriendlyFraudLock with Double = js.native
  
  @js.native
  sealed trait CancelledByUser extends ELicenseFlags
  /* 0x10 */ val CancelledByUser: typingsSlinky.steamClient.mod.ELicenseFlags.CancelledByUser with Double = js.native
  
  @js.native
  sealed trait Expired extends ELicenseFlags
  /* 0x08 */ val Expired: typingsSlinky.steamClient.mod.ELicenseFlags.Expired with Double = js.native
  
  @js.native
  sealed trait ForceRunRestriction extends ELicenseFlags
  /* 0x100 */ val ForceRunRestriction: typingsSlinky.steamClient.mod.ELicenseFlags.ForceRunRestriction with Double = js.native
  
  @js.native
  sealed trait ImportedFromSteam2 extends ELicenseFlags
  /* 0x80 */ val ImportedFromSteam2: typingsSlinky.steamClient.mod.ELicenseFlags.ImportedFromSteam2 with Double = js.native
  
  @js.native
  sealed trait LowViolenceContent extends ELicenseFlags
  /* 0x40 */ val LowViolenceContent: typingsSlinky.steamClient.mod.ELicenseFlags.LowViolenceContent with Double = js.native
  
  @js.native
  sealed trait None extends ELicenseFlags
  /* 0 */ val None: typingsSlinky.steamClient.mod.ELicenseFlags.None with Double = js.native
  
  @js.native
  sealed trait NotActivated extends ELicenseFlags
  /* 0x800 */ val NotActivated: typingsSlinky.steamClient.mod.ELicenseFlags.NotActivated with Double = js.native
  
  @js.native
  sealed trait Pending extends ELicenseFlags
  /* 0x04 */ val Pending: typingsSlinky.steamClient.mod.ELicenseFlags.Pending with Double = js.native
  
  @js.native
  sealed trait RegionRestrictionExpired extends ELicenseFlags
  /* 0x200 */ val RegionRestrictionExpired: typingsSlinky.steamClient.mod.ELicenseFlags.RegionRestrictionExpired with Double = js.native
  
  @js.native
  sealed trait Renew extends ELicenseFlags
  /* 0x01 */ val Renew: typingsSlinky.steamClient.mod.ELicenseFlags.Renew with Double = js.native
  
  @js.native
  sealed trait RenewalFailed extends ELicenseFlags
  /* 0x02 */ val RenewalFailed: typingsSlinky.steamClient.mod.ELicenseFlags.RenewalFailed with Double = js.native
}
