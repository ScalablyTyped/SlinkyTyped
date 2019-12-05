package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EAccountFlags extends js.Object

@JSImport("steam-client", "EAccountFlags")
@js.native
object EAccountFlags extends js.Object {
  @js.native
  sealed trait Admin extends EAccountFlags
  
  @js.native
  sealed trait AppEditor extends EAccountFlags
  
  @js.native
  sealed trait BannedFromWebAPI extends EAccountFlags
  
  @js.native
  sealed trait ClansOnlyFromFriends extends EAccountFlags
  
  @js.native
  sealed trait Debug extends EAccountFlags
  
  @js.native
  sealed trait Disabled extends EAccountFlags
  
  @js.native
  sealed trait EmailValidated extends EAccountFlags
  
  @js.native
  sealed trait ForceEmailVerification extends EAccountFlags
  
  @js.native
  sealed trait ForcePasswordChange extends EAccountFlags
  
  @js.native
  sealed trait GlobalModerator extends EAccountFlags
  
  @js.native
  sealed trait HWIDSet extends EAccountFlags
  
  @js.native
  sealed trait LimitedUser extends EAccountFlags
  
  @js.native
  sealed trait LimitedUserForce extends EAccountFlags
  
  @js.native
  sealed trait Lockdown extends EAccountFlags
  
  @js.native
  sealed trait LogonExtraSecurity extends EAccountFlags
  
  @js.native
  sealed trait LogonExtraSecurityDisabled extends EAccountFlags
  
  @js.native
  sealed trait MarketingTreatment extends EAccountFlags
  
  @js.native
  sealed trait MasterAppEditor extends EAccountFlags
  
  @js.native
  sealed trait NeedLogs extends EAccountFlags
  
  @js.native
  sealed trait NeedsSSANextSteamLogon extends EAccountFlags
  
  @js.native
  sealed trait NormalUser extends EAccountFlags
  
  @js.native
  sealed trait OGGInviteOptOut extends EAccountFlags
  
  @js.native
  sealed trait ParentalSettings extends EAccountFlags
  
  @js.native
  sealed trait PasswordSet extends EAccountFlags
  
  @js.native
  sealed trait PersonaNameSet extends EAccountFlags
  
  @js.native
  sealed trait PersonalQASet extends EAccountFlags
  
  @js.native
  sealed trait Steam2MigrationComplete extends EAccountFlags
  
  @js.native
  sealed trait Supervisor extends EAccountFlags
  
  @js.native
  sealed trait Support extends EAccountFlags
  
  @js.native
  sealed trait ThirdPartySupport extends EAccountFlags
  
  @js.native
  sealed trait Unbannable extends EAccountFlags
  
  @js.native
  sealed trait VacBeta extends EAccountFlags
  
  /* 16 */ val Admin: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.Admin with Double = js.native
  /* 64 */ val AppEditor: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.AppEditor with Double = js.native
  /* 33554432 */ val BannedFromWebAPI: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.BannedFromWebAPI with Double = js.native
  /* 67108864 */ val ClansOnlyFromFriends: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.ClansOnlyFromFriends with Double = js.native
  /* 1024 */ val Debug: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.Debug with Double = js.native
  /* 2048 */ val Disabled: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.Disabled with Double = js.native
  /* 16384 */ val EmailValidated: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.EmailValidated with Double = js.native
  /* 262144 */ val ForceEmailVerification: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.ForceEmailVerification with Double = js.native
  /* 131072 */ val ForcePasswordChange: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.ForcePasswordChange with Double = js.native
  /* 134217728 */ val GlobalModerator: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.GlobalModerator with Double = js.native
  /* 128 */ val HWIDSet: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.HWIDSet with Double = js.native
  /* 4096 */ val LimitedUser: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.LimitedUser with Double = js.native
  /* 8192 */ val LimitedUserForce: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.LimitedUserForce with Double = js.native
  /* 8388608 */ val Lockdown: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.Lockdown with Double = js.native
  /* 524288 */ val LogonExtraSecurity: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.LogonExtraSecurity with Double = js.native
  /* 1048576 */ val LogonExtraSecurityDisabled: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.LogonExtraSecurityDisabled with Double = js.native
  /* 32768 */ val MarketingTreatment: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.MarketingTreatment with Double = js.native
  /* 16777216 */ val MasterAppEditor: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.MasterAppEditor with Double = js.native
  /* 4194304 */ val NeedLogs: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.NeedLogs with Double = js.native
  /* 1073741824 */ val NeedsSSANextSteamLogon: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.NeedsSSANextSteamLogon with Double = js.native
  /* 0 */ val NormalUser: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.NormalUser with Double = js.native
  /* 65536 */ val OGGInviteOptOut: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.OGGInviteOptOut with Double = js.native
  /* 268435456 */ val ParentalSettings: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.ParentalSettings with Double = js.native
  /* 4 */ val PasswordSet: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.PasswordSet with Double = js.native
  /* 1 */ val PersonaNameSet: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.PersonaNameSet with Double = js.native
  /* 256 */ val PersonalQASet: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.PersonalQASet with Double = js.native
  /* 2097152 */ val Steam2MigrationComplete: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.Steam2MigrationComplete with Double = js.native
  /* 32 */ val Supervisor: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.Supervisor with Double = js.native
  /* 8 */ val Support: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.Support with Double = js.native
  /* 536870912 */ val ThirdPartySupport: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.ThirdPartySupport with Double = js.native
  /* 2 */ val Unbannable: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.Unbannable with Double = js.native
  /* 512 */ val VacBeta: typingsSlinky.steamDashClient.steamDashClientMod.EAccountFlags.VacBeta with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAccountFlags with Double] = js.native
}

