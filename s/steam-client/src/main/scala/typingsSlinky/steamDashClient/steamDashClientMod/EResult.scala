package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EResult extends js.Object

@JSImport("steam-client", "EResult")
@js.native
object EResult extends js.Object {
  @js.native
  sealed trait AccessDenied extends EResult
  
  @js.native
  sealed trait AccountActivityLimitExceeded extends EResult
  
  @js.native
  sealed trait AccountAssociatedToMultiplePartners extends EResult
  
   // removed "renamed to AccountAssociatedToMultiplePartners"
  @js.native
  sealed trait AccountAssociatedToMultiplePlayers extends EResult
  
  @js.native
  sealed trait AccountDisabled extends EResult
  
  @js.native
  sealed trait AccountLimitExceeded extends EResult
  
   // removed "renamed to AccountLockedDown"
  @js.native
  sealed trait AccountLocked extends EResult
  
  @js.native
  sealed trait AccountLockedDown extends EResult
  
  @js.native
  sealed trait AccountLoginDeniedNeedTwoFactor extends EResult
  
  @js.native
  sealed trait AccountLoginDeniedThrottle extends EResult
  
  @js.native
  sealed trait AccountLogonDenied extends EResult
  
   // removed "renamed to AccountLoginDeniedNeedTwoFactor"
  @js.native
  sealed trait AccountLogonDeniedNeedTwoFactorCode extends EResult
  
  @js.native
  sealed trait AccountLogonDeniedNoMail extends EResult
  
   // removed "renamed to AccountLogonDeniedNoMail"
  @js.native
  sealed trait AccountLogonDeniedNoMailSent extends EResult
  
  @js.native
  sealed trait AccountLogonDeniedVerifiedEmailRequired extends EResult
  
  @js.native
  sealed trait AccountNotFeatured extends EResult
  
  @js.native
  sealed trait AccountNotFound extends EResult
  
  @js.native
  sealed trait AdministratorOK extends EResult
  
  @js.native
  sealed trait AlreadyLoggedInElsewhere extends EResult
  
  @js.native
  sealed trait AlreadyOwned extends EResult
  
  @js.native
  sealed trait AlreadyRedeemed extends EResult
  
  @js.native
  sealed trait BadResponse extends EResult
  
  @js.native
  sealed trait Banned extends EResult
  
  @js.native
  sealed trait Blocked extends EResult
  
  @js.native
  sealed trait Busy extends EResult
  
  @js.native
  sealed trait Cancelled extends EResult
  
  @js.native
  sealed trait CannotUseOldPassword extends EResult
  
  @js.native
  sealed trait ConnectFailed extends EResult
  
  @js.native
  sealed trait ContentVersion extends EResult
  
  @js.native
  sealed trait DataCorruption extends EResult
  
  @js.native
  sealed trait Disabled extends EResult
  
  @js.native
  sealed trait DiskFull extends EResult
  
  @js.native
  sealed trait DuplicateName extends EResult
  
  @js.native
  sealed trait DuplicateRequest extends EResult
  
  @js.native
  sealed trait EmailSendFailure extends EResult
  
  @js.native
  sealed trait EncryptionFailure extends EResult
  
  @js.native
  sealed trait Expired extends EResult
  
  @js.native
  sealed trait ExpiredLoginAuthCode extends EResult
  
  @js.native
  sealed trait ExternalAccountAlreadyLinked extends EResult
  
  @js.native
  sealed trait ExternalAccountUnlinked extends EResult
  
  @js.native
  sealed trait FacebookQueryError extends EResult
  
  @js.native
  sealed trait Fail extends EResult
  
  @js.native
  sealed trait FileNotFound extends EResult
  
  @js.native
  sealed trait GSLTDenied extends EResult
  
  @js.native
  sealed trait GSLTExpired extends EResult
  
  @js.native
  sealed trait GSOwnerDenied extends EResult
  
  @js.native
  sealed trait HandshakeFailed extends EResult
  
  @js.native
  sealed trait HardwareNotCapableOfIPT extends EResult
  
  @js.native
  sealed trait IOFailure extends EResult
  
  @js.native
  sealed trait IPBanned extends EResult
  
  @js.native
  sealed trait IPLoginRestrictionFailed extends EResult
  
  @js.native
  sealed trait IPNotFound extends EResult
  
  @js.native
  sealed trait IPTInitError extends EResult
  
  @js.native
  sealed trait Ignored extends EResult
  
  @js.native
  sealed trait IllegalPassword extends EResult
  
  @js.native
  sealed trait InsufficientFunds extends EResult
  
  @js.native
  sealed trait InsufficientPrivilege extends EResult
  
  @js.native
  sealed trait Invalid extends EResult
  
  @js.native
  sealed trait InvalidCEGSubmission extends EResult
  
  @js.native
  sealed trait InvalidEmail extends EResult
  
  @js.native
  sealed trait InvalidItemType extends EResult
  
  @js.native
  sealed trait InvalidLoginAuthCode extends EResult
  
  @js.native
  sealed trait InvalidName extends EResult
  
  @js.native
  sealed trait InvalidParam extends EResult
  
  @js.native
  sealed trait InvalidPassword extends EResult
  
  @js.native
  sealed trait InvalidProtocolVer extends EResult
  
  @js.native
  sealed trait InvalidState extends EResult
  
  @js.native
  sealed trait InvalidSteamID extends EResult
  
  @js.native
  sealed trait ItemDeleted extends EResult
  
   // removed "renamed to ItemDeleted"
  @js.native
  sealed trait ItemOrEntryHasBeenDeleted extends EResult
  
  @js.native
  sealed trait LimitExceeded extends EResult
  
  @js.native
  sealed trait LockingFailed extends EResult
  
  @js.native
  sealed trait LoggedInElsewhere extends EResult
  
  @js.native
  sealed trait LogonSessionReplaced extends EResult
  
  @js.native
  sealed trait NeedCaptcha extends EResult
  
  @js.native
  sealed trait NoConnection extends EResult
  
  @js.native
  sealed trait NoMatch extends EResult
  
  @js.native
  sealed trait NoMatchingURL extends EResult
  
  @js.native
  sealed trait NoMobileDevice extends EResult
  
   // removed "renamed to NoMobileDevice"
  @js.native
  sealed trait NoMobileDeviceAvailable extends EResult
  
  @js.native
  sealed trait NoSiteLicensesFound extends EResult
  
  @js.native
  sealed trait NotLoggedOn extends EResult
  
  @js.native
  sealed trait NotModified extends EResult
  
  @js.native
  sealed trait NotSettled extends EResult
  
  @js.native
  sealed trait OK extends EResult
  
  @js.native
  sealed trait PSNTicketInvalid extends EResult
  
  @js.native
  sealed trait ParentalControlRestricted extends EResult
  
   // removed "renamed to PasswordUnset"
  @js.native
  sealed trait PasswordNotSet extends EResult
  
  @js.native
  sealed trait PasswordRequiredToKickSession extends EResult
  
  @js.native
  sealed trait PasswordUnset extends EResult
  
  @js.native
  sealed trait Pending extends EResult
  
  @js.native
  sealed trait PersistFailed extends EResult
  
  @js.native
  sealed trait PhoneActivityLimitExceeded extends EResult
  
  @js.native
  sealed trait RateLimitExceeded extends EResult
  
  @js.native
  sealed trait RefundToWallet extends EResult
  
  @js.native
  sealed trait RegionLocked extends EResult
  
  @js.native
  sealed trait RemoteCallFailed extends EResult
  
  @js.native
  sealed trait RemoteDisconnect extends EResult
  
  @js.native
  sealed trait RemoteFileConflict extends EResult
  
  @js.native
  sealed trait RequirePasswordReEntry extends EResult
  
  @js.native
  sealed trait RestrictedDevice extends EResult
  
  @js.native
  sealed trait Revoked extends EResult
  
  @js.native
  sealed trait SMSCodeFailed extends EResult
  
  @js.native
  sealed trait SameAsPreviousValue extends EResult
  
  @js.native
  sealed trait ServiceReadOnly extends EResult
  
  @js.native
  sealed trait ServiceUnavailable extends EResult
  
  @js.native
  sealed trait ShoppingCartNotFound extends EResult
  
  @js.native
  sealed trait Suspended extends EResult
  
   // removed "renamed to TimeNotSynced"
  @js.native
  sealed trait TimeIsOutOfSync extends EResult
  
  @js.native
  sealed trait TimeNotSynced extends EResult
  
  @js.native
  sealed trait Timeout extends EResult
  
   // removed "renamed to AccountLimitExceeded"
  @js.native
  sealed trait TooManyAccountsAccessThisResource extends EResult
  
  @js.native
  sealed trait TooManyPending extends EResult
  
  @js.native
  sealed trait TryAnotherCM extends EResult
  
  @js.native
  sealed trait TwoFactorActivationCodeMismatch extends EResult
  
  @js.native
  sealed trait TwoFactorCodeMismatch extends EResult
  
  @js.native
  sealed trait UnexpectedError extends EResult
  
  @js.native
  sealed trait ValueOutOfRange extends EResult
  
  @js.native
  sealed trait WGNetworkSendExceeded extends EResult
  
  /* 15 */ val AccessDenied: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AccessDenied with Double = js.native
  /* 96 */ val AccountActivityLimitExceeded: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AccountActivityLimitExceeded with Double = js.native
  /* 90 */ val AccountAssociatedToMultiplePartners: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AccountAssociatedToMultiplePartners with Double = js.native
  /* 90 */ val AccountAssociatedToMultiplePlayers: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AccountAssociatedToMultiplePlayers with Double = js.native
  /* 43 */ val AccountDisabled: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AccountDisabled with Double = js.native
  /* 95 */ val AccountLimitExceeded: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AccountLimitExceeded with Double = js.native
  /* 73 */ val AccountLocked: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AccountLocked with Double = js.native
  /* 73 */ val AccountLockedDown: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AccountLockedDown with Double = js.native
  /* 85 */ val AccountLoginDeniedNeedTwoFactor: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AccountLoginDeniedNeedTwoFactor with Double = js.native
  /* 87 */ val AccountLoginDeniedThrottle: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AccountLoginDeniedThrottle with Double = js.native
  /* 63 */ val AccountLogonDenied: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AccountLogonDenied with Double = js.native
  /* 85 */ val AccountLogonDeniedNeedTwoFactorCode: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AccountLogonDeniedNeedTwoFactorCode with Double = js.native
  /* 66 */ val AccountLogonDeniedNoMail: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AccountLogonDeniedNoMail with Double = js.native
  /* 66 */ val AccountLogonDeniedNoMailSent: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AccountLogonDeniedNoMailSent with Double = js.native
  /* 74 */ val AccountLogonDeniedVerifiedEmailRequired: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AccountLogonDeniedVerifiedEmailRequired with Double = js.native
  /* 45 */ val AccountNotFeatured: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AccountNotFeatured with Double = js.native
  /* 18 */ val AccountNotFound: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AccountNotFound with Double = js.native
  /* 46 */ val AdministratorOK: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AdministratorOK with Double = js.native
  /* 50 */ val AlreadyLoggedInElsewhere: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AlreadyLoggedInElsewhere with Double = js.native
  /* 30 */ val AlreadyOwned: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AlreadyOwned with Double = js.native
  /* 28 */ val AlreadyRedeemed: typingsSlinky.steamDashClient.steamDashClientMod.EResult.AlreadyRedeemed with Double = js.native
  /* 76 */ val BadResponse: typingsSlinky.steamDashClient.steamDashClientMod.EResult.BadResponse with Double = js.native
  /* 17 */ val Banned: typingsSlinky.steamDashClient.steamDashClientMod.EResult.Banned with Double = js.native
  /* 40 */ val Blocked: typingsSlinky.steamDashClient.steamDashClientMod.EResult.Blocked with Double = js.native
  /* 10 */ val Busy: typingsSlinky.steamDashClient.steamDashClientMod.EResult.Busy with Double = js.native
  /* 52 */ val Cancelled: typingsSlinky.steamDashClient.steamDashClientMod.EResult.Cancelled with Double = js.native
  /* 64 */ val CannotUseOldPassword: typingsSlinky.steamDashClient.steamDashClientMod.EResult.CannotUseOldPassword with Double = js.native
  /* 35 */ val ConnectFailed: typingsSlinky.steamDashClient.steamDashClientMod.EResult.ConnectFailed with Double = js.native
  /* 47 */ val ContentVersion: typingsSlinky.steamDashClient.steamDashClientMod.EResult.ContentVersion with Double = js.native
  /* 53 */ val DataCorruption: typingsSlinky.steamDashClient.steamDashClientMod.EResult.DataCorruption with Double = js.native
  /* 80 */ val Disabled: typingsSlinky.steamDashClient.steamDashClientMod.EResult.Disabled with Double = js.native
  /* 54 */ val DiskFull: typingsSlinky.steamDashClient.steamDashClientMod.EResult.DiskFull with Double = js.native
  /* 14 */ val DuplicateName: typingsSlinky.steamDashClient.steamDashClientMod.EResult.DuplicateName with Double = js.native
  /* 29 */ val DuplicateRequest: typingsSlinky.steamDashClient.steamDashClientMod.EResult.DuplicateRequest with Double = js.native
  /* 99 */ val EmailSendFailure: typingsSlinky.steamDashClient.steamDashClientMod.EResult.EmailSendFailure with Double = js.native
  /* 23 */ val EncryptionFailure: typingsSlinky.steamDashClient.steamDashClientMod.EResult.EncryptionFailure with Double = js.native
  /* 27 */ val Expired: typingsSlinky.steamDashClient.steamDashClientMod.EResult.Expired with Double = js.native
  /* 71 */ val ExpiredLoginAuthCode: typingsSlinky.steamDashClient.steamDashClientMod.EResult.ExpiredLoginAuthCode with Double = js.native
  /* 59 */ val ExternalAccountAlreadyLinked: typingsSlinky.steamDashClient.steamDashClientMod.EResult.ExternalAccountAlreadyLinked with Double = js.native
  /* 57 */ val ExternalAccountUnlinked: typingsSlinky.steamDashClient.steamDashClientMod.EResult.ExternalAccountUnlinked with Double = js.native
  /* 70 */ val FacebookQueryError: typingsSlinky.steamDashClient.steamDashClientMod.EResult.FacebookQueryError with Double = js.native
  /* 2 */ val Fail: typingsSlinky.steamDashClient.steamDashClientMod.EResult.Fail with Double = js.native
  /* 9 */ val FileNotFound: typingsSlinky.steamDashClient.steamDashClientMod.EResult.FileNotFound with Double = js.native
  /* 102 */ val GSLTDenied: typingsSlinky.steamDashClient.steamDashClientMod.EResult.GSLTDenied with Double = js.native
  /* 106 */ val GSLTExpired: typingsSlinky.steamDashClient.steamDashClientMod.EResult.GSLTExpired with Double = js.native
  /* 103 */ val GSOwnerDenied: typingsSlinky.steamDashClient.steamDashClientMod.EResult.GSOwnerDenied with Double = js.native
  /* 36 */ val HandshakeFailed: typingsSlinky.steamDashClient.steamDashClientMod.EResult.HandshakeFailed with Double = js.native
  /* 67 */ val HardwareNotCapableOfIPT: typingsSlinky.steamDashClient.steamDashClientMod.EResult.HardwareNotCapableOfIPT with Double = js.native
  /* 37 */ val IOFailure: typingsSlinky.steamDashClient.steamDashClientMod.EResult.IOFailure with Double = js.native
  /* 105 */ val IPBanned: typingsSlinky.steamDashClient.steamDashClientMod.EResult.IPBanned with Double = js.native
  /* 72 */ val IPLoginRestrictionFailed: typingsSlinky.steamDashClient.steamDashClientMod.EResult.IPLoginRestrictionFailed with Double = js.native
  /* 31 */ val IPNotFound: typingsSlinky.steamDashClient.steamDashClientMod.EResult.IPNotFound with Double = js.native
  /* 68 */ val IPTInitError: typingsSlinky.steamDashClient.steamDashClientMod.EResult.IPTInitError with Double = js.native
  /* 41 */ val Ignored: typingsSlinky.steamDashClient.steamDashClientMod.EResult.Ignored with Double = js.native
  /* 61 */ val IllegalPassword: typingsSlinky.steamDashClient.steamDashClientMod.EResult.IllegalPassword with Double = js.native
  /* 107 */ val InsufficientFunds: typingsSlinky.steamDashClient.steamDashClientMod.EResult.InsufficientFunds with Double = js.native
  /* 24 */ val InsufficientPrivilege: typingsSlinky.steamDashClient.steamDashClientMod.EResult.InsufficientPrivilege with Double = js.native
  /* 0 */ val Invalid: typingsSlinky.steamDashClient.steamDashClientMod.EResult.Invalid with Double = js.native
  /* 81 */ val InvalidCEGSubmission: typingsSlinky.steamDashClient.steamDashClientMod.EResult.InvalidCEGSubmission with Double = js.native
  /* 13 */ val InvalidEmail: typingsSlinky.steamDashClient.steamDashClientMod.EResult.InvalidEmail with Double = js.native
  /* 104 */ val InvalidItemType: typingsSlinky.steamDashClient.steamDashClientMod.EResult.InvalidItemType with Double = js.native
  /* 65 */ val InvalidLoginAuthCode: typingsSlinky.steamDashClient.steamDashClientMod.EResult.InvalidLoginAuthCode with Double = js.native
  /* 12 */ val InvalidName: typingsSlinky.steamDashClient.steamDashClientMod.EResult.InvalidName with Double = js.native
  /* 8 */ val InvalidParam: typingsSlinky.steamDashClient.steamDashClientMod.EResult.InvalidParam with Double = js.native
  /* 5 */ val InvalidPassword: typingsSlinky.steamDashClient.steamDashClientMod.EResult.InvalidPassword with Double = js.native
  /* 7 */ val InvalidProtocolVer: typingsSlinky.steamDashClient.steamDashClientMod.EResult.InvalidProtocolVer with Double = js.native
  /* 11 */ val InvalidState: typingsSlinky.steamDashClient.steamDashClientMod.EResult.InvalidState with Double = js.native
  /* 19 */ val InvalidSteamID: typingsSlinky.steamDashClient.steamDashClientMod.EResult.InvalidSteamID with Double = js.native
  /* 86 */ val ItemDeleted: typingsSlinky.steamDashClient.steamDashClientMod.EResult.ItemDeleted with Double = js.native
  /* 86 */ val ItemOrEntryHasBeenDeleted: typingsSlinky.steamDashClient.steamDashClientMod.EResult.ItemOrEntryHasBeenDeleted with Double = js.native
  /* 25 */ val LimitExceeded: typingsSlinky.steamDashClient.steamDashClientMod.EResult.LimitExceeded with Double = js.native
  /* 33 */ val LockingFailed: typingsSlinky.steamDashClient.steamDashClientMod.EResult.LockingFailed with Double = js.native
  /* 6 */ val LoggedInElsewhere: typingsSlinky.steamDashClient.steamDashClientMod.EResult.LoggedInElsewhere with Double = js.native
  /* 34 */ val LogonSessionReplaced: typingsSlinky.steamDashClient.steamDashClientMod.EResult.LogonSessionReplaced with Double = js.native
  /* 101 */ val NeedCaptcha: typingsSlinky.steamDashClient.steamDashClientMod.EResult.NeedCaptcha with Double = js.native
  /* 3 */ val NoConnection: typingsSlinky.steamDashClient.steamDashClientMod.EResult.NoConnection with Double = js.native
  /* 42 */ val NoMatch: typingsSlinky.steamDashClient.steamDashClientMod.EResult.NoMatch with Double = js.native
  /* 75 */ val NoMatchingURL: typingsSlinky.steamDashClient.steamDashClientMod.EResult.NoMatchingURL with Double = js.native
  /* 92 */ val NoMobileDevice: typingsSlinky.steamDashClient.steamDashClientMod.EResult.NoMobileDevice with Double = js.native
  /* 92 */ val NoMobileDeviceAvailable: typingsSlinky.steamDashClient.steamDashClientMod.EResult.NoMobileDeviceAvailable with Double = js.native
  /* 109 */ val NoSiteLicensesFound: typingsSlinky.steamDashClient.steamDashClientMod.EResult.NoSiteLicensesFound with Double = js.native
  /* 21 */ val NotLoggedOn: typingsSlinky.steamDashClient.steamDashClientMod.EResult.NotLoggedOn with Double = js.native
  /* 91 */ val NotModified: typingsSlinky.steamDashClient.steamDashClientMod.EResult.NotModified with Double = js.native
  /* 100 */ val NotSettled: typingsSlinky.steamDashClient.steamDashClientMod.EResult.NotSettled with Double = js.native
  /* 1 */ val OK: typingsSlinky.steamDashClient.steamDashClientMod.EResult.OK with Double = js.native
  /* 58 */ val PSNTicketInvalid: typingsSlinky.steamDashClient.steamDashClientMod.EResult.PSNTicketInvalid with Double = js.native
  /* 69 */ val ParentalControlRestricted: typingsSlinky.steamDashClient.steamDashClientMod.EResult.ParentalControlRestricted with Double = js.native
  /* 56 */ val PasswordNotSet: typingsSlinky.steamDashClient.steamDashClientMod.EResult.PasswordNotSet with Double = js.native
  /* 49 */ val PasswordRequiredToKickSession: typingsSlinky.steamDashClient.steamDashClientMod.EResult.PasswordRequiredToKickSession with Double = js.native
  /* 56 */ val PasswordUnset: typingsSlinky.steamDashClient.steamDashClientMod.EResult.PasswordUnset with Double = js.native
  /* 22 */ val Pending: typingsSlinky.steamDashClient.steamDashClientMod.EResult.Pending with Double = js.native
  /* 32 */ val PersistFailed: typingsSlinky.steamDashClient.steamDashClientMod.EResult.PersistFailed with Double = js.native
  /* 97 */ val PhoneActivityLimitExceeded: typingsSlinky.steamDashClient.steamDashClientMod.EResult.PhoneActivityLimitExceeded with Double = js.native
  /* 84 */ val RateLimitExceeded: typingsSlinky.steamDashClient.steamDashClientMod.EResult.RateLimitExceeded with Double = js.native
  /* 98 */ val RefundToWallet: typingsSlinky.steamDashClient.steamDashClientMod.EResult.RefundToWallet with Double = js.native
  /* 83 */ val RegionLocked: typingsSlinky.steamDashClient.steamDashClientMod.EResult.RegionLocked with Double = js.native
  /* 55 */ val RemoteCallFailed: typingsSlinky.steamDashClient.steamDashClientMod.EResult.RemoteCallFailed with Double = js.native
  /* 38 */ val RemoteDisconnect: typingsSlinky.steamDashClient.steamDashClientMod.EResult.RemoteDisconnect with Double = js.native
  /* 60 */ val RemoteFileConflict: typingsSlinky.steamDashClient.steamDashClientMod.EResult.RemoteFileConflict with Double = js.native
  /* 77 */ val RequirePasswordReEntry: typingsSlinky.steamDashClient.steamDashClientMod.EResult.RequirePasswordReEntry with Double = js.native
  /* 82 */ val RestrictedDevice: typingsSlinky.steamDashClient.steamDashClientMod.EResult.RestrictedDevice with Double = js.native
  /* 26 */ val Revoked: typingsSlinky.steamDashClient.steamDashClientMod.EResult.Revoked with Double = js.native
  /* 94 */ val SMSCodeFailed: typingsSlinky.steamDashClient.steamDashClientMod.EResult.SMSCodeFailed with Double = js.native
  /* 62 */ val SameAsPreviousValue: typingsSlinky.steamDashClient.steamDashClientMod.EResult.SameAsPreviousValue with Double = js.native
  /* 44 */ val ServiceReadOnly: typingsSlinky.steamDashClient.steamDashClientMod.EResult.ServiceReadOnly with Double = js.native
  /* 20 */ val ServiceUnavailable: typingsSlinky.steamDashClient.steamDashClientMod.EResult.ServiceUnavailable with Double = js.native
  /* 39 */ val ShoppingCartNotFound: typingsSlinky.steamDashClient.steamDashClientMod.EResult.ShoppingCartNotFound with Double = js.native
  /* 51 */ val Suspended: typingsSlinky.steamDashClient.steamDashClientMod.EResult.Suspended with Double = js.native
  /* 93 */ val TimeIsOutOfSync: typingsSlinky.steamDashClient.steamDashClientMod.EResult.TimeIsOutOfSync with Double = js.native
  /* 93 */ val TimeNotSynced: typingsSlinky.steamDashClient.steamDashClientMod.EResult.TimeNotSynced with Double = js.native
  /* 16 */ val Timeout: typingsSlinky.steamDashClient.steamDashClientMod.EResult.Timeout with Double = js.native
  /* 95 */ val TooManyAccountsAccessThisResource: typingsSlinky.steamDashClient.steamDashClientMod.EResult.TooManyAccountsAccessThisResource with Double = js.native
  /* 108 */ val TooManyPending: typingsSlinky.steamDashClient.steamDashClientMod.EResult.TooManyPending with Double = js.native
  /* 48 */ val TryAnotherCM: typingsSlinky.steamDashClient.steamDashClientMod.EResult.TryAnotherCM with Double = js.native
  /* 89 */ val TwoFactorActivationCodeMismatch: typingsSlinky.steamDashClient.steamDashClientMod.EResult.TwoFactorActivationCodeMismatch with Double = js.native
  /* 88 */ val TwoFactorCodeMismatch: typingsSlinky.steamDashClient.steamDashClientMod.EResult.TwoFactorCodeMismatch with Double = js.native
  /* 79 */ val UnexpectedError: typingsSlinky.steamDashClient.steamDashClientMod.EResult.UnexpectedError with Double = js.native
  /* 78 */ val ValueOutOfRange: typingsSlinky.steamDashClient.steamDashClientMod.EResult.ValueOutOfRange with Double = js.native
  /* 110 */ val WGNetworkSendExceeded: typingsSlinky.steamDashClient.steamDashClientMod.EResult.WGNetworkSendExceeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EResult with Double] = js.native
}

