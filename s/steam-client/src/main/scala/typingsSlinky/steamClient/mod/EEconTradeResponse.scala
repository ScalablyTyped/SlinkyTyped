package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EEconTradeResponse extends StObject
@JSImport("steam-client", "EEconTradeResponse")
@js.native
object EEconTradeResponse extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EEconTradeResponse with Double] = js.native
  
  @js.native
  sealed trait Accepted extends EEconTradeResponse
  /* 0 */ val Accepted: typingsSlinky.steamClient.mod.EEconTradeResponse.Accepted with Double = js.native
  
  @js.native
  sealed trait AlreadyHasTradeRequest extends EEconTradeResponse
  /* 12 */ val AlreadyHasTradeRequest: typingsSlinky.steamClient.mod.EEconTradeResponse.AlreadyHasTradeRequest with Double = js.native
  
  @js.native
  sealed trait AlreadyTrading extends EEconTradeResponse
  /* 11 */ val AlreadyTrading: typingsSlinky.steamClient.mod.EEconTradeResponse.AlreadyTrading with Double = js.native
  
  @js.native
  sealed trait Cancel extends EEconTradeResponse
  /* 7 */ val Cancel: typingsSlinky.steamClient.mod.EEconTradeResponse.Cancel with Double = js.native
  
  @js.native
  sealed trait ConnectionFailed extends EEconTradeResponse
  /* 10 */ val ConnectionFailed: typingsSlinky.steamClient.mod.EEconTradeResponse.ConnectionFailed with Double = js.native
  
  @js.native
  sealed trait CyberCafeInitiator extends EEconTradeResponse
  /* 14 */ val CyberCafeInitiator: typingsSlinky.steamClient.mod.EEconTradeResponse.CyberCafeInitiator with Double = js.native
  
  @js.native
  sealed trait CyberCafeTarget extends EEconTradeResponse
  /* 15 */ val CyberCafeTarget: typingsSlinky.steamClient.mod.EEconTradeResponse.CyberCafeTarget with Double = js.native
  
  @js.native
  sealed trait Declined extends EEconTradeResponse
  /* 1 */ val Declined: typingsSlinky.steamClient.mod.EEconTradeResponse.Declined with Double = js.native
  
  @js.native
  sealed trait Disabled extends EEconTradeResponse
  /* 5 */ val Disabled: typingsSlinky.steamClient.mod.EEconTradeResponse.Disabled with Double = js.native
  
  @js.native
  sealed trait InitiatorBlockedTarget extends EEconTradeResponse
  /* 18 */ val InitiatorBlockedTarget: typingsSlinky.steamClient.mod.EEconTradeResponse.InitiatorBlockedTarget with Double = js.native
  
  @js.native
  sealed trait InitiatorNeedsSteamGuard extends EEconTradeResponse
  /* 21 */ val InitiatorNeedsSteamGuard: typingsSlinky.steamClient.mod.EEconTradeResponse.InitiatorNeedsSteamGuard with Double = js.native
  
  @js.native
  sealed trait InitiatorNeedsVerifiedEmail extends EEconTradeResponse
  /* 20 */ val InitiatorNeedsVerifiedEmail: typingsSlinky.steamClient.mod.EEconTradeResponse.InitiatorNeedsVerifiedEmail with Double = js.native
  
  @js.native
  sealed trait InitiatorNewDeviceCooldown extends EEconTradeResponse
  /* 25 */ val InitiatorNewDeviceCooldown: typingsSlinky.steamClient.mod.EEconTradeResponse.InitiatorNewDeviceCooldown with Double = js.native
  
  @js.native
  sealed trait InitiatorPasswordResetProbation extends EEconTradeResponse
  /* 24 */ val InitiatorPasswordResetProbation: typingsSlinky.steamClient.mod.EEconTradeResponse.InitiatorPasswordResetProbation with Double = js.native
  
  @js.native
  sealed trait InitiatorRecentEmailChange extends EEconTradeResponse
  /* 28 */ val InitiatorRecentEmailChange: typingsSlinky.steamClient.mod.EEconTradeResponse.InitiatorRecentEmailChange with Double = js.native
  
  @js.native
  sealed trait InitiatorSentInvalidCookie extends EEconTradeResponse
  /* 26 */ val InitiatorSentInvalidCookie: typingsSlinky.steamClient.mod.EEconTradeResponse.InitiatorSentInvalidCookie with Double = js.native
  
  @js.native
  sealed trait InitiatorSteamGuardDuration extends EEconTradeResponse
  /* 23 */ val InitiatorSteamGuardDuration: typingsSlinky.steamClient.mod.EEconTradeResponse.InitiatorSteamGuardDuration with Double = js.native
  
  @js.native
  sealed trait NeedsEmailConfirmation extends EEconTradeResponse
  /* 27 */ val NeedsEmailConfirmation: typingsSlinky.steamClient.mod.EEconTradeResponse.NeedsEmailConfirmation with Double = js.native
  
  @js.native
  sealed trait NeedsMobileConfirmation extends EEconTradeResponse
  /* 29 */ val NeedsMobileConfirmation: typingsSlinky.steamClient.mod.EEconTradeResponse.NeedsMobileConfirmation with Double = js.native
  
  @js.native
  sealed trait NoResponse extends EEconTradeResponse
  /* 13 */ val NoResponse: typingsSlinky.steamClient.mod.EEconTradeResponse.NoResponse with Double = js.native
  
  @js.native
  sealed trait NotLoggedIn extends EEconTradeResponse
  /* 6 */ val NotLoggedIn: typingsSlinky.steamClient.mod.EEconTradeResponse.NotLoggedIn with Double = js.native
  
  @js.native
  sealed trait OKToDeliver extends EEconTradeResponse
  /* 50 */ val OKToDeliver: typingsSlinky.steamClient.mod.EEconTradeResponse.OKToDeliver with Double = js.native
  
  @js.native
  sealed trait SchoolLabInitiator extends EEconTradeResponse
  /* 16 */ val SchoolLabInitiator: typingsSlinky.steamClient.mod.EEconTradeResponse.SchoolLabInitiator with Double = js.native
  
  @js.native
  sealed trait SchoolLabTarget extends EEconTradeResponse
  /* 16 */ val SchoolLabTarget: typingsSlinky.steamClient.mod.EEconTradeResponse.SchoolLabTarget with Double = js.native
  
  @js.native
  sealed trait TargetAccountCannotTrade extends EEconTradeResponse
  /* 22 */ val TargetAccountCannotTrade: typingsSlinky.steamClient.mod.EEconTradeResponse.TargetAccountCannotTrade with Double = js.native
  
  @js.native
  sealed trait TargetAlreadyTrading extends EEconTradeResponse
  /* 4 */ val TargetAlreadyTrading: typingsSlinky.steamClient.mod.EEconTradeResponse.TargetAlreadyTrading with Double = js.native
  
  @js.native
  sealed trait TooSoon extends EEconTradeResponse
  /* 8 */ val TooSoon: typingsSlinky.steamClient.mod.EEconTradeResponse.TooSoon with Double = js.native
  
  @js.native
  sealed trait TooSoonPenalty extends EEconTradeResponse
  /* 9 */ val TooSoonPenalty: typingsSlinky.steamClient.mod.EEconTradeResponse.TooSoonPenalty with Double = js.native
  
  @js.native
  sealed trait TradeBannedInitiator extends EEconTradeResponse
  /* 2 */ val TradeBannedInitiator: typingsSlinky.steamClient.mod.EEconTradeResponse.TradeBannedInitiator with Double = js.native
  
  @js.native
  sealed trait TradeBannedTarget extends EEconTradeResponse
  /* 3 */ val TradeBannedTarget: typingsSlinky.steamClient.mod.EEconTradeResponse.TradeBannedTarget with Double = js.native
  
  @js.native
  sealed trait TradingHoldForClearedTradeOffersInitiator extends EEconTradeResponse
  /* 30 */ val TradingHoldForClearedTradeOffersInitiator: typingsSlinky.steamClient.mod.EEconTradeResponse.TradingHoldForClearedTradeOffersInitiator with Double = js.native
  
  @js.native
  sealed trait WouldExceedMaxAssetCount extends EEconTradeResponse
  /* 31 */ val WouldExceedMaxAssetCount: typingsSlinky.steamClient.mod.EEconTradeResponse.WouldExceedMaxAssetCount with Double = js.native
}
