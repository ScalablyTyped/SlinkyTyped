package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EResult extends StObject
@JSImport("steam-client", "EResult")
@js.native
object EResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EResult with Double] = js.native
  
  @js.native
  sealed trait AccessDenied extends EResult
  /* 15 */ val AccessDenied: typingsSlinky.steamClient.mod.EResult.AccessDenied with Double = js.native
  
  @js.native
  sealed trait AccountActivityLimitExceeded extends EResult
  /* 96 */ val AccountActivityLimitExceeded: typingsSlinky.steamClient.mod.EResult.AccountActivityLimitExceeded with Double = js.native
  
  // removed "renamed to AccountAssociatedToMultiplePartners"
  @js.native
  sealed trait AccountAssociatedToMultiplePartners extends EResult
  /* 90 */ val AccountAssociatedToMultiplePartners: typingsSlinky.steamClient.mod.EResult.AccountAssociatedToMultiplePartners with Double = js.native
  
  @js.native
  sealed trait AccountAssociatedToMultiplePlayers extends EResult
  /* 90 */ val AccountAssociatedToMultiplePlayers: typingsSlinky.steamClient.mod.EResult.AccountAssociatedToMultiplePlayers with Double = js.native
  
  @js.native
  sealed trait AccountDisabled extends EResult
  /* 43 */ val AccountDisabled: typingsSlinky.steamClient.mod.EResult.AccountDisabled with Double = js.native
  
  // removed "renamed to AccountLimitExceeded"
  @js.native
  sealed trait AccountLimitExceeded extends EResult
  /* 95 */ val AccountLimitExceeded: typingsSlinky.steamClient.mod.EResult.AccountLimitExceeded with Double = js.native
  
  @js.native
  sealed trait AccountLocked extends EResult
  /* 73 */ val AccountLocked: typingsSlinky.steamClient.mod.EResult.AccountLocked with Double = js.native
  
  // removed "renamed to AccountLockedDown"
  @js.native
  sealed trait AccountLockedDown extends EResult
  /* 73 */ val AccountLockedDown: typingsSlinky.steamClient.mod.EResult.AccountLockedDown with Double = js.native
  
  // removed "renamed to AccountLoginDeniedNeedTwoFactor"
  @js.native
  sealed trait AccountLoginDeniedNeedTwoFactor extends EResult
  /* 85 */ val AccountLoginDeniedNeedTwoFactor: typingsSlinky.steamClient.mod.EResult.AccountLoginDeniedNeedTwoFactor with Double = js.native
  
  @js.native
  sealed trait AccountLoginDeniedThrottle extends EResult
  /* 87 */ val AccountLoginDeniedThrottle: typingsSlinky.steamClient.mod.EResult.AccountLoginDeniedThrottle with Double = js.native
  
  @js.native
  sealed trait AccountLogonDenied extends EResult
  /* 63 */ val AccountLogonDenied: typingsSlinky.steamClient.mod.EResult.AccountLogonDenied with Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedNeedTwoFactorCode extends EResult
  /* 85 */ val AccountLogonDeniedNeedTwoFactorCode: typingsSlinky.steamClient.mod.EResult.AccountLogonDeniedNeedTwoFactorCode with Double = js.native
  
  // removed "renamed to AccountLogonDeniedNoMail"
  @js.native
  sealed trait AccountLogonDeniedNoMail extends EResult
  /* 66 */ val AccountLogonDeniedNoMail: typingsSlinky.steamClient.mod.EResult.AccountLogonDeniedNoMail with Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedNoMailSent extends EResult
  /* 66 */ val AccountLogonDeniedNoMailSent: typingsSlinky.steamClient.mod.EResult.AccountLogonDeniedNoMailSent with Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedVerifiedEmailRequired extends EResult
  /* 74 */ val AccountLogonDeniedVerifiedEmailRequired: typingsSlinky.steamClient.mod.EResult.AccountLogonDeniedVerifiedEmailRequired with Double = js.native
  
  @js.native
  sealed trait AccountNotFeatured extends EResult
  /* 45 */ val AccountNotFeatured: typingsSlinky.steamClient.mod.EResult.AccountNotFeatured with Double = js.native
  
  @js.native
  sealed trait AccountNotFound extends EResult
  /* 18 */ val AccountNotFound: typingsSlinky.steamClient.mod.EResult.AccountNotFound with Double = js.native
  
  @js.native
  sealed trait AdministratorOK extends EResult
  /* 46 */ val AdministratorOK: typingsSlinky.steamClient.mod.EResult.AdministratorOK with Double = js.native
  
  @js.native
  sealed trait AlreadyLoggedInElsewhere extends EResult
  /* 50 */ val AlreadyLoggedInElsewhere: typingsSlinky.steamClient.mod.EResult.AlreadyLoggedInElsewhere with Double = js.native
  
  @js.native
  sealed trait AlreadyOwned extends EResult
  /* 30 */ val AlreadyOwned: typingsSlinky.steamClient.mod.EResult.AlreadyOwned with Double = js.native
  
  @js.native
  sealed trait AlreadyRedeemed extends EResult
  /* 28 */ val AlreadyRedeemed: typingsSlinky.steamClient.mod.EResult.AlreadyRedeemed with Double = js.native
  
  @js.native
  sealed trait BadResponse extends EResult
  /* 76 */ val BadResponse: typingsSlinky.steamClient.mod.EResult.BadResponse with Double = js.native
  
  @js.native
  sealed trait Banned extends EResult
  /* 17 */ val Banned: typingsSlinky.steamClient.mod.EResult.Banned with Double = js.native
  
  @js.native
  sealed trait Blocked extends EResult
  /* 40 */ val Blocked: typingsSlinky.steamClient.mod.EResult.Blocked with Double = js.native
  
  @js.native
  sealed trait Busy extends EResult
  /* 10 */ val Busy: typingsSlinky.steamClient.mod.EResult.Busy with Double = js.native
  
  @js.native
  sealed trait Cancelled extends EResult
  /* 52 */ val Cancelled: typingsSlinky.steamClient.mod.EResult.Cancelled with Double = js.native
  
  @js.native
  sealed trait CannotUseOldPassword extends EResult
  /* 64 */ val CannotUseOldPassword: typingsSlinky.steamClient.mod.EResult.CannotUseOldPassword with Double = js.native
  
  @js.native
  sealed trait ConnectFailed extends EResult
  /* 35 */ val ConnectFailed: typingsSlinky.steamClient.mod.EResult.ConnectFailed with Double = js.native
  
  @js.native
  sealed trait ContentVersion extends EResult
  /* 47 */ val ContentVersion: typingsSlinky.steamClient.mod.EResult.ContentVersion with Double = js.native
  
  @js.native
  sealed trait DataCorruption extends EResult
  /* 53 */ val DataCorruption: typingsSlinky.steamClient.mod.EResult.DataCorruption with Double = js.native
  
  @js.native
  sealed trait Disabled extends EResult
  /* 80 */ val Disabled: typingsSlinky.steamClient.mod.EResult.Disabled with Double = js.native
  
  @js.native
  sealed trait DiskFull extends EResult
  /* 54 */ val DiskFull: typingsSlinky.steamClient.mod.EResult.DiskFull with Double = js.native
  
  @js.native
  sealed trait DuplicateName extends EResult
  /* 14 */ val DuplicateName: typingsSlinky.steamClient.mod.EResult.DuplicateName with Double = js.native
  
  @js.native
  sealed trait DuplicateRequest extends EResult
  /* 29 */ val DuplicateRequest: typingsSlinky.steamClient.mod.EResult.DuplicateRequest with Double = js.native
  
  @js.native
  sealed trait EmailSendFailure extends EResult
  /* 99 */ val EmailSendFailure: typingsSlinky.steamClient.mod.EResult.EmailSendFailure with Double = js.native
  
  @js.native
  sealed trait EncryptionFailure extends EResult
  /* 23 */ val EncryptionFailure: typingsSlinky.steamClient.mod.EResult.EncryptionFailure with Double = js.native
  
  @js.native
  sealed trait Expired extends EResult
  /* 27 */ val Expired: typingsSlinky.steamClient.mod.EResult.Expired with Double = js.native
  
  @js.native
  sealed trait ExpiredLoginAuthCode extends EResult
  /* 71 */ val ExpiredLoginAuthCode: typingsSlinky.steamClient.mod.EResult.ExpiredLoginAuthCode with Double = js.native
  
  @js.native
  sealed trait ExternalAccountAlreadyLinked extends EResult
  /* 59 */ val ExternalAccountAlreadyLinked: typingsSlinky.steamClient.mod.EResult.ExternalAccountAlreadyLinked with Double = js.native
  
  @js.native
  sealed trait ExternalAccountUnlinked extends EResult
  /* 57 */ val ExternalAccountUnlinked: typingsSlinky.steamClient.mod.EResult.ExternalAccountUnlinked with Double = js.native
  
  @js.native
  sealed trait FacebookQueryError extends EResult
  /* 70 */ val FacebookQueryError: typingsSlinky.steamClient.mod.EResult.FacebookQueryError with Double = js.native
  
  @js.native
  sealed trait Fail extends EResult
  /* 2 */ val Fail: typingsSlinky.steamClient.mod.EResult.Fail with Double = js.native
  
  @js.native
  sealed trait FileNotFound extends EResult
  /* 9 */ val FileNotFound: typingsSlinky.steamClient.mod.EResult.FileNotFound with Double = js.native
  
  @js.native
  sealed trait GSLTDenied extends EResult
  /* 102 */ val GSLTDenied: typingsSlinky.steamClient.mod.EResult.GSLTDenied with Double = js.native
  
  @js.native
  sealed trait GSLTExpired extends EResult
  /* 106 */ val GSLTExpired: typingsSlinky.steamClient.mod.EResult.GSLTExpired with Double = js.native
  
  @js.native
  sealed trait GSOwnerDenied extends EResult
  /* 103 */ val GSOwnerDenied: typingsSlinky.steamClient.mod.EResult.GSOwnerDenied with Double = js.native
  
  @js.native
  sealed trait HandshakeFailed extends EResult
  /* 36 */ val HandshakeFailed: typingsSlinky.steamClient.mod.EResult.HandshakeFailed with Double = js.native
  
  @js.native
  sealed trait HardwareNotCapableOfIPT extends EResult
  /* 67 */ val HardwareNotCapableOfIPT: typingsSlinky.steamClient.mod.EResult.HardwareNotCapableOfIPT with Double = js.native
  
  @js.native
  sealed trait IOFailure extends EResult
  /* 37 */ val IOFailure: typingsSlinky.steamClient.mod.EResult.IOFailure with Double = js.native
  
  @js.native
  sealed trait IPBanned extends EResult
  /* 105 */ val IPBanned: typingsSlinky.steamClient.mod.EResult.IPBanned with Double = js.native
  
  @js.native
  sealed trait IPLoginRestrictionFailed extends EResult
  /* 72 */ val IPLoginRestrictionFailed: typingsSlinky.steamClient.mod.EResult.IPLoginRestrictionFailed with Double = js.native
  
  @js.native
  sealed trait IPNotFound extends EResult
  /* 31 */ val IPNotFound: typingsSlinky.steamClient.mod.EResult.IPNotFound with Double = js.native
  
  @js.native
  sealed trait IPTInitError extends EResult
  /* 68 */ val IPTInitError: typingsSlinky.steamClient.mod.EResult.IPTInitError with Double = js.native
  
  @js.native
  sealed trait Ignored extends EResult
  /* 41 */ val Ignored: typingsSlinky.steamClient.mod.EResult.Ignored with Double = js.native
  
  @js.native
  sealed trait IllegalPassword extends EResult
  /* 61 */ val IllegalPassword: typingsSlinky.steamClient.mod.EResult.IllegalPassword with Double = js.native
  
  @js.native
  sealed trait InsufficientFunds extends EResult
  /* 107 */ val InsufficientFunds: typingsSlinky.steamClient.mod.EResult.InsufficientFunds with Double = js.native
  
  @js.native
  sealed trait InsufficientPrivilege extends EResult
  /* 24 */ val InsufficientPrivilege: typingsSlinky.steamClient.mod.EResult.InsufficientPrivilege with Double = js.native
  
  @js.native
  sealed trait Invalid extends EResult
  /* 0 */ val Invalid: typingsSlinky.steamClient.mod.EResult.Invalid with Double = js.native
  
  @js.native
  sealed trait InvalidCEGSubmission extends EResult
  /* 81 */ val InvalidCEGSubmission: typingsSlinky.steamClient.mod.EResult.InvalidCEGSubmission with Double = js.native
  
  @js.native
  sealed trait InvalidEmail extends EResult
  /* 13 */ val InvalidEmail: typingsSlinky.steamClient.mod.EResult.InvalidEmail with Double = js.native
  
  @js.native
  sealed trait InvalidItemType extends EResult
  /* 104 */ val InvalidItemType: typingsSlinky.steamClient.mod.EResult.InvalidItemType with Double = js.native
  
  @js.native
  sealed trait InvalidLoginAuthCode extends EResult
  /* 65 */ val InvalidLoginAuthCode: typingsSlinky.steamClient.mod.EResult.InvalidLoginAuthCode with Double = js.native
  
  @js.native
  sealed trait InvalidName extends EResult
  /* 12 */ val InvalidName: typingsSlinky.steamClient.mod.EResult.InvalidName with Double = js.native
  
  @js.native
  sealed trait InvalidParam extends EResult
  /* 8 */ val InvalidParam: typingsSlinky.steamClient.mod.EResult.InvalidParam with Double = js.native
  
  @js.native
  sealed trait InvalidPassword extends EResult
  /* 5 */ val InvalidPassword: typingsSlinky.steamClient.mod.EResult.InvalidPassword with Double = js.native
  
  @js.native
  sealed trait InvalidProtocolVer extends EResult
  /* 7 */ val InvalidProtocolVer: typingsSlinky.steamClient.mod.EResult.InvalidProtocolVer with Double = js.native
  
  @js.native
  sealed trait InvalidState extends EResult
  /* 11 */ val InvalidState: typingsSlinky.steamClient.mod.EResult.InvalidState with Double = js.native
  
  @js.native
  sealed trait InvalidSteamID extends EResult
  /* 19 */ val InvalidSteamID: typingsSlinky.steamClient.mod.EResult.InvalidSteamID with Double = js.native
  
  // removed "renamed to ItemDeleted"
  @js.native
  sealed trait ItemDeleted extends EResult
  /* 86 */ val ItemDeleted: typingsSlinky.steamClient.mod.EResult.ItemDeleted with Double = js.native
  
  @js.native
  sealed trait ItemOrEntryHasBeenDeleted extends EResult
  /* 86 */ val ItemOrEntryHasBeenDeleted: typingsSlinky.steamClient.mod.EResult.ItemOrEntryHasBeenDeleted with Double = js.native
  
  @js.native
  sealed trait LimitExceeded extends EResult
  /* 25 */ val LimitExceeded: typingsSlinky.steamClient.mod.EResult.LimitExceeded with Double = js.native
  
  @js.native
  sealed trait LockingFailed extends EResult
  /* 33 */ val LockingFailed: typingsSlinky.steamClient.mod.EResult.LockingFailed with Double = js.native
  
  @js.native
  sealed trait LoggedInElsewhere extends EResult
  /* 6 */ val LoggedInElsewhere: typingsSlinky.steamClient.mod.EResult.LoggedInElsewhere with Double = js.native
  
  @js.native
  sealed trait LogonSessionReplaced extends EResult
  /* 34 */ val LogonSessionReplaced: typingsSlinky.steamClient.mod.EResult.LogonSessionReplaced with Double = js.native
  
  @js.native
  sealed trait NeedCaptcha extends EResult
  /* 101 */ val NeedCaptcha: typingsSlinky.steamClient.mod.EResult.NeedCaptcha with Double = js.native
  
  @js.native
  sealed trait NoConnection extends EResult
  /* 3 */ val NoConnection: typingsSlinky.steamClient.mod.EResult.NoConnection with Double = js.native
  
  @js.native
  sealed trait NoMatch extends EResult
  /* 42 */ val NoMatch: typingsSlinky.steamClient.mod.EResult.NoMatch with Double = js.native
  
  @js.native
  sealed trait NoMatchingURL extends EResult
  /* 75 */ val NoMatchingURL: typingsSlinky.steamClient.mod.EResult.NoMatchingURL with Double = js.native
  
  // removed "renamed to NoMobileDevice"
  @js.native
  sealed trait NoMobileDevice extends EResult
  /* 92 */ val NoMobileDevice: typingsSlinky.steamClient.mod.EResult.NoMobileDevice with Double = js.native
  
  @js.native
  sealed trait NoMobileDeviceAvailable extends EResult
  /* 92 */ val NoMobileDeviceAvailable: typingsSlinky.steamClient.mod.EResult.NoMobileDeviceAvailable with Double = js.native
  
  @js.native
  sealed trait NoSiteLicensesFound extends EResult
  /* 109 */ val NoSiteLicensesFound: typingsSlinky.steamClient.mod.EResult.NoSiteLicensesFound with Double = js.native
  
  @js.native
  sealed trait NotLoggedOn extends EResult
  /* 21 */ val NotLoggedOn: typingsSlinky.steamClient.mod.EResult.NotLoggedOn with Double = js.native
  
  @js.native
  sealed trait NotModified extends EResult
  /* 91 */ val NotModified: typingsSlinky.steamClient.mod.EResult.NotModified with Double = js.native
  
  @js.native
  sealed trait NotSettled extends EResult
  /* 100 */ val NotSettled: typingsSlinky.steamClient.mod.EResult.NotSettled with Double = js.native
  
  @js.native
  sealed trait OK extends EResult
  /* 1 */ val OK: typingsSlinky.steamClient.mod.EResult.OK with Double = js.native
  
  @js.native
  sealed trait PSNTicketInvalid extends EResult
  /* 58 */ val PSNTicketInvalid: typingsSlinky.steamClient.mod.EResult.PSNTicketInvalid with Double = js.native
  
  @js.native
  sealed trait ParentalControlRestricted extends EResult
  /* 69 */ val ParentalControlRestricted: typingsSlinky.steamClient.mod.EResult.ParentalControlRestricted with Double = js.native
  
  @js.native
  sealed trait PasswordNotSet extends EResult
  /* 56 */ val PasswordNotSet: typingsSlinky.steamClient.mod.EResult.PasswordNotSet with Double = js.native
  
  @js.native
  sealed trait PasswordRequiredToKickSession extends EResult
  /* 49 */ val PasswordRequiredToKickSession: typingsSlinky.steamClient.mod.EResult.PasswordRequiredToKickSession with Double = js.native
  
  // removed "renamed to PasswordUnset"
  @js.native
  sealed trait PasswordUnset extends EResult
  /* 56 */ val PasswordUnset: typingsSlinky.steamClient.mod.EResult.PasswordUnset with Double = js.native
  
  @js.native
  sealed trait Pending extends EResult
  /* 22 */ val Pending: typingsSlinky.steamClient.mod.EResult.Pending with Double = js.native
  
  @js.native
  sealed trait PersistFailed extends EResult
  /* 32 */ val PersistFailed: typingsSlinky.steamClient.mod.EResult.PersistFailed with Double = js.native
  
  @js.native
  sealed trait PhoneActivityLimitExceeded extends EResult
  /* 97 */ val PhoneActivityLimitExceeded: typingsSlinky.steamClient.mod.EResult.PhoneActivityLimitExceeded with Double = js.native
  
  @js.native
  sealed trait RateLimitExceeded extends EResult
  /* 84 */ val RateLimitExceeded: typingsSlinky.steamClient.mod.EResult.RateLimitExceeded with Double = js.native
  
  @js.native
  sealed trait RefundToWallet extends EResult
  /* 98 */ val RefundToWallet: typingsSlinky.steamClient.mod.EResult.RefundToWallet with Double = js.native
  
  @js.native
  sealed trait RegionLocked extends EResult
  /* 83 */ val RegionLocked: typingsSlinky.steamClient.mod.EResult.RegionLocked with Double = js.native
  
  @js.native
  sealed trait RemoteCallFailed extends EResult
  /* 55 */ val RemoteCallFailed: typingsSlinky.steamClient.mod.EResult.RemoteCallFailed with Double = js.native
  
  @js.native
  sealed trait RemoteDisconnect extends EResult
  /* 38 */ val RemoteDisconnect: typingsSlinky.steamClient.mod.EResult.RemoteDisconnect with Double = js.native
  
  @js.native
  sealed trait RemoteFileConflict extends EResult
  /* 60 */ val RemoteFileConflict: typingsSlinky.steamClient.mod.EResult.RemoteFileConflict with Double = js.native
  
  @js.native
  sealed trait RequirePasswordReEntry extends EResult
  /* 77 */ val RequirePasswordReEntry: typingsSlinky.steamClient.mod.EResult.RequirePasswordReEntry with Double = js.native
  
  @js.native
  sealed trait RestrictedDevice extends EResult
  /* 82 */ val RestrictedDevice: typingsSlinky.steamClient.mod.EResult.RestrictedDevice with Double = js.native
  
  @js.native
  sealed trait Revoked extends EResult
  /* 26 */ val Revoked: typingsSlinky.steamClient.mod.EResult.Revoked with Double = js.native
  
  @js.native
  sealed trait SMSCodeFailed extends EResult
  /* 94 */ val SMSCodeFailed: typingsSlinky.steamClient.mod.EResult.SMSCodeFailed with Double = js.native
  
  @js.native
  sealed trait SameAsPreviousValue extends EResult
  /* 62 */ val SameAsPreviousValue: typingsSlinky.steamClient.mod.EResult.SameAsPreviousValue with Double = js.native
  
  @js.native
  sealed trait ServiceReadOnly extends EResult
  /* 44 */ val ServiceReadOnly: typingsSlinky.steamClient.mod.EResult.ServiceReadOnly with Double = js.native
  
  @js.native
  sealed trait ServiceUnavailable extends EResult
  /* 20 */ val ServiceUnavailable: typingsSlinky.steamClient.mod.EResult.ServiceUnavailable with Double = js.native
  
  @js.native
  sealed trait ShoppingCartNotFound extends EResult
  /* 39 */ val ShoppingCartNotFound: typingsSlinky.steamClient.mod.EResult.ShoppingCartNotFound with Double = js.native
  
  @js.native
  sealed trait Suspended extends EResult
  /* 51 */ val Suspended: typingsSlinky.steamClient.mod.EResult.Suspended with Double = js.native
  
  @js.native
  sealed trait TimeIsOutOfSync extends EResult
  /* 93 */ val TimeIsOutOfSync: typingsSlinky.steamClient.mod.EResult.TimeIsOutOfSync with Double = js.native
  
  // removed "renamed to TimeNotSynced"
  @js.native
  sealed trait TimeNotSynced extends EResult
  /* 93 */ val TimeNotSynced: typingsSlinky.steamClient.mod.EResult.TimeNotSynced with Double = js.native
  
  @js.native
  sealed trait Timeout extends EResult
  /* 16 */ val Timeout: typingsSlinky.steamClient.mod.EResult.Timeout with Double = js.native
  
  @js.native
  sealed trait TooManyAccountsAccessThisResource extends EResult
  /* 95 */ val TooManyAccountsAccessThisResource: typingsSlinky.steamClient.mod.EResult.TooManyAccountsAccessThisResource with Double = js.native
  
  @js.native
  sealed trait TooManyPending extends EResult
  /* 108 */ val TooManyPending: typingsSlinky.steamClient.mod.EResult.TooManyPending with Double = js.native
  
  @js.native
  sealed trait TryAnotherCM extends EResult
  /* 48 */ val TryAnotherCM: typingsSlinky.steamClient.mod.EResult.TryAnotherCM with Double = js.native
  
  @js.native
  sealed trait TwoFactorActivationCodeMismatch extends EResult
  /* 89 */ val TwoFactorActivationCodeMismatch: typingsSlinky.steamClient.mod.EResult.TwoFactorActivationCodeMismatch with Double = js.native
  
  @js.native
  sealed trait TwoFactorCodeMismatch extends EResult
  /* 88 */ val TwoFactorCodeMismatch: typingsSlinky.steamClient.mod.EResult.TwoFactorCodeMismatch with Double = js.native
  
  @js.native
  sealed trait UnexpectedError extends EResult
  /* 79 */ val UnexpectedError: typingsSlinky.steamClient.mod.EResult.UnexpectedError with Double = js.native
  
  @js.native
  sealed trait ValueOutOfRange extends EResult
  /* 78 */ val ValueOutOfRange: typingsSlinky.steamClient.mod.EResult.ValueOutOfRange with Double = js.native
  
  @js.native
  sealed trait WGNetworkSendExceeded extends EResult
  /* 110 */ val WGNetworkSendExceeded: typingsSlinky.steamClient.mod.EResult.WGNetworkSendExceeded with Double = js.native
}
