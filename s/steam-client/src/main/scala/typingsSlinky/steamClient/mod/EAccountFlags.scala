package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAccountFlags extends StObject
@JSImport("steam-client", "EAccountFlags")
@js.native
object EAccountFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAccountFlags with Double] = js.native
  
  @js.native
  sealed trait Admin extends EAccountFlags
  /* 16 */ val Admin: typingsSlinky.steamClient.mod.EAccountFlags.Admin with Double = js.native
  
  @js.native
  sealed trait AppEditor extends EAccountFlags
  /* 64 */ val AppEditor: typingsSlinky.steamClient.mod.EAccountFlags.AppEditor with Double = js.native
  
  @js.native
  sealed trait BannedFromWebAPI extends EAccountFlags
  /* 33554432 */ val BannedFromWebAPI: typingsSlinky.steamClient.mod.EAccountFlags.BannedFromWebAPI with Double = js.native
  
  @js.native
  sealed trait ClansOnlyFromFriends extends EAccountFlags
  /* 67108864 */ val ClansOnlyFromFriends: typingsSlinky.steamClient.mod.EAccountFlags.ClansOnlyFromFriends with Double = js.native
  
  @js.native
  sealed trait Debug extends EAccountFlags
  /* 1024 */ val Debug: typingsSlinky.steamClient.mod.EAccountFlags.Debug with Double = js.native
  
  @js.native
  sealed trait Disabled extends EAccountFlags
  /* 2048 */ val Disabled: typingsSlinky.steamClient.mod.EAccountFlags.Disabled with Double = js.native
  
  @js.native
  sealed trait EmailValidated extends EAccountFlags
  /* 16384 */ val EmailValidated: typingsSlinky.steamClient.mod.EAccountFlags.EmailValidated with Double = js.native
  
  @js.native
  sealed trait ForceEmailVerification extends EAccountFlags
  /* 262144 */ val ForceEmailVerification: typingsSlinky.steamClient.mod.EAccountFlags.ForceEmailVerification with Double = js.native
  
  @js.native
  sealed trait ForcePasswordChange extends EAccountFlags
  /* 131072 */ val ForcePasswordChange: typingsSlinky.steamClient.mod.EAccountFlags.ForcePasswordChange with Double = js.native
  
  @js.native
  sealed trait GlobalModerator extends EAccountFlags
  /* 134217728 */ val GlobalModerator: typingsSlinky.steamClient.mod.EAccountFlags.GlobalModerator with Double = js.native
  
  @js.native
  sealed trait HWIDSet extends EAccountFlags
  /* 128 */ val HWIDSet: typingsSlinky.steamClient.mod.EAccountFlags.HWIDSet with Double = js.native
  
  @js.native
  sealed trait LimitedUser extends EAccountFlags
  /* 4096 */ val LimitedUser: typingsSlinky.steamClient.mod.EAccountFlags.LimitedUser with Double = js.native
  
  @js.native
  sealed trait LimitedUserForce extends EAccountFlags
  /* 8192 */ val LimitedUserForce: typingsSlinky.steamClient.mod.EAccountFlags.LimitedUserForce with Double = js.native
  
  @js.native
  sealed trait Lockdown extends EAccountFlags
  /* 8388608 */ val Lockdown: typingsSlinky.steamClient.mod.EAccountFlags.Lockdown with Double = js.native
  
  @js.native
  sealed trait LogonExtraSecurity extends EAccountFlags
  /* 524288 */ val LogonExtraSecurity: typingsSlinky.steamClient.mod.EAccountFlags.LogonExtraSecurity with Double = js.native
  
  @js.native
  sealed trait LogonExtraSecurityDisabled extends EAccountFlags
  /* 1048576 */ val LogonExtraSecurityDisabled: typingsSlinky.steamClient.mod.EAccountFlags.LogonExtraSecurityDisabled with Double = js.native
  
  @js.native
  sealed trait MarketingTreatment extends EAccountFlags
  /* 32768 */ val MarketingTreatment: typingsSlinky.steamClient.mod.EAccountFlags.MarketingTreatment with Double = js.native
  
  @js.native
  sealed trait MasterAppEditor extends EAccountFlags
  /* 16777216 */ val MasterAppEditor: typingsSlinky.steamClient.mod.EAccountFlags.MasterAppEditor with Double = js.native
  
  @js.native
  sealed trait NeedLogs extends EAccountFlags
  /* 4194304 */ val NeedLogs: typingsSlinky.steamClient.mod.EAccountFlags.NeedLogs with Double = js.native
  
  @js.native
  sealed trait NeedsSSANextSteamLogon extends EAccountFlags
  /* 1073741824 */ val NeedsSSANextSteamLogon: typingsSlinky.steamClient.mod.EAccountFlags.NeedsSSANextSteamLogon with Double = js.native
  
  @js.native
  sealed trait NormalUser extends EAccountFlags
  /* 0 */ val NormalUser: typingsSlinky.steamClient.mod.EAccountFlags.NormalUser with Double = js.native
  
  @js.native
  sealed trait OGGInviteOptOut extends EAccountFlags
  /* 65536 */ val OGGInviteOptOut: typingsSlinky.steamClient.mod.EAccountFlags.OGGInviteOptOut with Double = js.native
  
  @js.native
  sealed trait ParentalSettings extends EAccountFlags
  /* 268435456 */ val ParentalSettings: typingsSlinky.steamClient.mod.EAccountFlags.ParentalSettings with Double = js.native
  
  @js.native
  sealed trait PasswordSet extends EAccountFlags
  /* 4 */ val PasswordSet: typingsSlinky.steamClient.mod.EAccountFlags.PasswordSet with Double = js.native
  
  @js.native
  sealed trait PersonaNameSet extends EAccountFlags
  /* 1 */ val PersonaNameSet: typingsSlinky.steamClient.mod.EAccountFlags.PersonaNameSet with Double = js.native
  
  @js.native
  sealed trait PersonalQASet extends EAccountFlags
  /* 256 */ val PersonalQASet: typingsSlinky.steamClient.mod.EAccountFlags.PersonalQASet with Double = js.native
  
  @js.native
  sealed trait Steam2MigrationComplete extends EAccountFlags
  /* 2097152 */ val Steam2MigrationComplete: typingsSlinky.steamClient.mod.EAccountFlags.Steam2MigrationComplete with Double = js.native
  
  @js.native
  sealed trait Supervisor extends EAccountFlags
  /* 32 */ val Supervisor: typingsSlinky.steamClient.mod.EAccountFlags.Supervisor with Double = js.native
  
  @js.native
  sealed trait Support extends EAccountFlags
  /* 8 */ val Support: typingsSlinky.steamClient.mod.EAccountFlags.Support with Double = js.native
  
  @js.native
  sealed trait ThirdPartySupport extends EAccountFlags
  /* 536870912 */ val ThirdPartySupport: typingsSlinky.steamClient.mod.EAccountFlags.ThirdPartySupport with Double = js.native
  
  @js.native
  sealed trait Unbannable extends EAccountFlags
  /* 2 */ val Unbannable: typingsSlinky.steamClient.mod.EAccountFlags.Unbannable with Double = js.native
  
  @js.native
  sealed trait VacBeta extends EAccountFlags
  /* 512 */ val VacBeta: typingsSlinky.steamClient.mod.EAccountFlags.VacBeta with Double = js.native
}
