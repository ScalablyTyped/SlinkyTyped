package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPurchaseResultDetail extends js.Object

@JSImport("steam-client", "EPurchaseResultDetail")
@js.native
object EPurchaseResultDetail extends js.Object {
  @js.native
  sealed trait AVSFailure extends EPurchaseResultDetail
  
  @js.native
  sealed trait AccountLocked extends EPurchaseResultDetail
  
  @js.native
  sealed trait AcctIsBlocked extends EPurchaseResultDetail
  
  @js.native
  sealed trait AcctNotVerified extends EPurchaseResultDetail
  
  @js.native
  sealed trait AlreadyPurchased extends EPurchaseResultDetail
  
  @js.native
  sealed trait BadActivationCode extends EPurchaseResultDetail
  
  @js.native
  sealed trait BillingAgreementAlreadyExists extends EPurchaseResultDetail
  
  @js.native
  sealed trait BillingAgreementCancelled extends EPurchaseResultDetail
  
  @js.native
  sealed trait BundleTypeCannotBeGifted extends EPurchaseResultDetail
  
  @js.native
  sealed trait CanceledByNewTransaction extends EPurchaseResultDetail
  
  @js.native
  sealed trait CancelledByUser extends EPurchaseResultDetail
  
  @js.native
  sealed trait CannotGiftShippedGoods extends EPurchaseResultDetail
  
  @js.native
  sealed trait CannotRedeemCodeFromClient extends EPurchaseResultDetail
  
  @js.native
  sealed trait CannotShipInternationally extends EPurchaseResultDetail
  
  @js.native
  sealed trait CannotShipToCountry extends EPurchaseResultDetail
  
  @js.native
  sealed trait CannotShipToPOBox extends EPurchaseResultDetail
  
  @js.native
  sealed trait CartValueTooHigh extends EPurchaseResultDetail
  
  @js.native
  sealed trait ContactSupport extends EPurchaseResultDetail
  
  @js.native
  sealed trait CreditCardBinMismatchesType extends EPurchaseResultDetail
  
  @js.native
  sealed trait DelayedCompletion extends EPurchaseResultDetail
  
  @js.native
  sealed trait DoesNotOwnRequiredApp extends EPurchaseResultDetail
  
  @js.native
  sealed trait DuplicateActivationCode extends EPurchaseResultDetail
  
  @js.native
  sealed trait EmailNotValidated extends EPurchaseResultDetail
  
  @js.native
  sealed trait ExceededSteamLimit extends EPurchaseResultDetail
  
  @js.native
  sealed trait ExpiredCard extends EPurchaseResultDetail
  
  @js.native
  sealed trait ExpiredCoupon extends EPurchaseResultDetail
  
  @js.native
  sealed trait FailCurrencyTransProvider extends EPurchaseResultDetail
  
  @js.native
  sealed trait FailedCyberCafe extends EPurchaseResultDetail
  
  @js.native
  sealed trait ForceCanceledPending extends EPurchaseResultDetail
  
  @js.native
  sealed trait FraudCheckFailed extends EPurchaseResultDetail
  
  @js.native
  sealed trait HungTransactionCancelled extends EPurchaseResultDetail
  
  @js.native
  sealed trait InsufficientFunds extends EPurchaseResultDetail
  
  @js.native
  sealed trait InsufficientInventory extends EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidAccount extends EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidCoupon extends EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidData extends EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidPackage extends EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidPaymentMethod extends EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidShippingAddress extends EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidTaxAddress extends EPurchaseResultDetail
  
  @js.native
  sealed trait MustLoginPS3AppForPurchase extends EPurchaseResultDetail
  
  @js.native
  sealed trait NeedsPreApproval extends EPurchaseResultDetail
  
  @js.native
  sealed trait NoCachedPaymentMethod extends EPurchaseResultDetail
  
  @js.native
  sealed trait NoDetail extends EPurchaseResultDetail
  
  @js.native
  sealed trait NoWallet extends EPurchaseResultDetail
  
  @js.native
  sealed trait OtherAbortableInProgress extends EPurchaseResultDetail
  
  @js.native
  sealed trait OthersInProgress extends EPurchaseResultDetail
  
  @js.native
  sealed trait OverlappingPackagesInCart extends EPurchaseResultDetail
  
  @js.native
  sealed trait OverlappingPackagesInPendingTransaction extends EPurchaseResultDetail
  
  @js.native
  sealed trait OwnsExcludedApp extends EPurchaseResultDetail
  
  @js.native
  sealed trait POSACodeNotActivated extends EPurchaseResultDetail
  
  @js.native
  sealed trait PaypalInternalError extends EPurchaseResultDetail
  
  @js.native
  sealed trait PhysicalProductLimitExceeded extends EPurchaseResultDetail
  
  @js.native
  sealed trait PreApprovalDenied extends EPurchaseResultDetail
  
  @js.native
  sealed trait PurchaseAmountNoSupportedByProvider extends EPurchaseResultDetail
  
  @js.native
  sealed trait PurchaseCannotBeReplayed extends EPurchaseResultDetail
  
  @js.native
  sealed trait RateLimited extends EPurchaseResultDetail
  
  @js.native
  sealed trait RegionNotSupported extends EPurchaseResultDetail
  
  @js.native
  sealed trait RestrictedCountry extends EPurchaseResultDetail
  
  @js.native
  sealed trait StoreBillingCountryMismatch extends EPurchaseResultDetail
  
  @js.native
  sealed trait Timeout extends EPurchaseResultDetail
  
  @js.native
  sealed trait TransactionExpired extends EPurchaseResultDetail
  
  @js.native
  sealed trait UnknownGlobalCollectError extends EPurchaseResultDetail
  
  @js.native
  sealed trait UseOtherFunctionSource extends EPurchaseResultDetail
  
  @js.native
  sealed trait UseOtherPaymentMethod extends EPurchaseResultDetail
  
  @js.native
  sealed trait WalletCurrencyMismatch extends EPurchaseResultDetail
  
  @js.native
  sealed trait WouldExceedMaxWallet extends EPurchaseResultDetail
  
  @js.native
  sealed trait WrongPrice extends EPurchaseResultDetail
  
  /* 1 */ val AVSFailure: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.AVSFailure with Double = js.native
  /* 44 */ val AccountLocked: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.AccountLocked with Double = js.native
  /* 20 */ val AcctIsBlocked: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.AcctIsBlocked with Double = js.native
  /* 21 */ val AcctNotVerified: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.AcctNotVerified with Double = js.native
  /* 9 */ val AlreadyPurchased: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.AlreadyPurchased with Double = js.native
  /* 14 */ val BadActivationCode: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.BadActivationCode with Double = js.native
  /* 57 */ val BillingAgreementAlreadyExists: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.BillingAgreementAlreadyExists with Double = js.native
  /* 41 */ val BillingAgreementCancelled: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.BillingAgreementCancelled with Double = js.native
  /* 67 */ val BundleTypeCannotBeGifted: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.BundleTypeCannotBeGifted with Double = js.native
  /* 25 */ val CanceledByNewTransaction: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CanceledByNewTransaction with Double = js.native
  /* 12 */ val CancelledByUser: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CancelledByUser with Double = js.native
  /* 39 */ val CannotGiftShippedGoods: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CannotGiftShippedGoods with Double = js.native
  /* 50 */ val CannotRedeemCodeFromClient: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CannotRedeemCodeFromClient with Double = js.native
  /* 40 */ val CannotShipInternationally: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CannotShipInternationally with Double = js.native
  /* 59 */ val CannotShipToCountry: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CannotShipToCountry with Double = js.native
  /* 37 */ val CannotShipToPOBox: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CannotShipToPOBox with Double = js.native
  /* 56 */ val CartValueTooHigh: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CartValueTooHigh with Double = js.native
  /* 3 */ val ContactSupport: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.ContactSupport with Double = js.native
  /* 55 */ val CreditCardBinMismatchesType: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CreditCardBinMismatchesType with Double = js.native
  /* 66 */ val DelayedCompletion: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.DelayedCompletion with Double = js.native
  /* 24 */ val DoesNotOwnRequiredApp: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.DoesNotOwnRequiredApp with Double = js.native
  /* 15 */ val DuplicateActivationCode: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.DuplicateActivationCode with Double = js.native
  /* 32 */ val EmailNotValidated: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.EmailNotValidated with Double = js.native
  /* 46 */ val ExceededSteamLimit: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.ExceededSteamLimit with Double = js.native
  /* 33 */ val ExpiredCard: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.ExpiredCard with Double = js.native
  /* 43 */ val ExpiredCoupon: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.ExpiredCoupon with Double = js.native
  /* 27 */ val FailCurrencyTransProvider: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.FailCurrencyTransProvider with Double = js.native
  /* 28 */ val FailedCyberCafe: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.FailedCyberCafe with Double = js.native
  /* 26 */ val ForceCanceledPending: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.ForceCanceledPending with Double = js.native
  /* 11 */ val FraudCheckFailed: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.FraudCheckFailed with Double = js.native
  /* 60 */ val HungTransactionCancelled: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.HungTransactionCancelled with Double = js.native
  /* 2 */ val InsufficientFunds: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InsufficientFunds with Double = js.native
  /* 38 */ val InsufficientInventory: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InsufficientInventory with Double = js.native
  /* 22 */ val InvalidAccount: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InvalidAccount with Double = js.native
  /* 42 */ val InvalidCoupon: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InvalidCoupon with Double = js.native
  /* 7 */ val InvalidData: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InvalidData with Double = js.native
  /* 5 */ val InvalidPackage: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InvalidPackage with Double = js.native
  /* 6 */ val InvalidPaymentMethod: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InvalidPaymentMethod with Double = js.native
  /* 18 */ val InvalidShippingAddress: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InvalidShippingAddress with Double = js.native
  /* 63 */ val InvalidTaxAddress: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InvalidTaxAddress with Double = js.native
  /* 36 */ val MustLoginPS3AppForPurchase: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.MustLoginPS3AppForPurchase with Double = js.native
  /* 29 */ val NeedsPreApproval: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.NeedsPreApproval with Double = js.native
  /* 49 */ val NoCachedPaymentMethod: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.NoCachedPaymentMethod with Double = js.native
  /* 0 */ val NoDetail: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.NoDetail with Double = js.native
  /* 48 */ val NoWallet: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.NoWallet with Double = js.native
  /* 45 */ val OtherAbortableInProgress: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.OtherAbortableInProgress with Double = js.native
  /* 8 */ val OthersInProgress: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.OthersInProgress with Double = js.native
  /* 47 */ val OverlappingPackagesInCart: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.OverlappingPackagesInCart with Double = js.native
  /* 52 */ val OverlappingPackagesInPendingTransaction: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.OverlappingPackagesInPendingTransaction with Double = js.native
  /* 54 */ val OwnsExcludedApp: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.OwnsExcludedApp with Double = js.native
  /* 58 */ val POSACodeNotActivated: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.POSACodeNotActivated with Double = js.native
  /* 61 */ val PaypalInternalError: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.PaypalInternalError with Double = js.native
  /* 64 */ val PhysicalProductLimitExceeded: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.PhysicalProductLimitExceeded with Double = js.native
  /* 30 */ val PreApprovalDenied: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.PreApprovalDenied with Double = js.native
  /* 51 */ val PurchaseAmountNoSupportedByProvider: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.PurchaseAmountNoSupportedByProvider with Double = js.native
  /* 65 */ val PurchaseCannotBeReplayed: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.PurchaseCannotBeReplayed with Double = js.native
  /* 53 */ val RateLimited: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.RateLimited with Double = js.native
  /* 19 */ val RegionNotSupported: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.RegionNotSupported with Double = js.native
  /* 13 */ val RestrictedCountry: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.RestrictedCountry with Double = js.native
  /* 23 */ val StoreBillingCountryMismatch: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.StoreBillingCountryMismatch with Double = js.native
  /* 4 */ val Timeout: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.Timeout with Double = js.native
  /* 34 */ val TransactionExpired: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.TransactionExpired with Double = js.native
  /* 62 */ val UnknownGlobalCollectError: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.UnknownGlobalCollectError with Double = js.native
  /* 17 */ val UseOtherFunctionSource: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.UseOtherFunctionSource with Double = js.native
  /* 16 */ val UseOtherPaymentMethod: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.UseOtherPaymentMethod with Double = js.native
  /* 31 */ val WalletCurrencyMismatch: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.WalletCurrencyMismatch with Double = js.native
  /* 35 */ val WouldExceedMaxWallet: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.WouldExceedMaxWallet with Double = js.native
  /* 10 */ val WrongPrice: typingsSlinky.steamDashClient.steamDashClientMod.EPurchaseResultDetail.WrongPrice with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPurchaseResultDetail with Double] = js.native
}

