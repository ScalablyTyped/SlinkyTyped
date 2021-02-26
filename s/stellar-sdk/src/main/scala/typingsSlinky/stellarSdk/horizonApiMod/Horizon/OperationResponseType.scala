package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OperationResponseType extends StObject
@JSImport("stellar-sdk/lib/horizon_api", "Horizon.OperationResponseType")
@js.native
object OperationResponseType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OperationResponseType with String] = js.native
  
  @js.native
  sealed trait accountMerge extends OperationResponseType
  /* "account_merge" */ val accountMerge: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.accountMerge with String = js.native
  
  @js.native
  sealed trait allowTrust extends OperationResponseType
  /* "allow_trust" */ val allowTrust: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.allowTrust with String = js.native
  
  @js.native
  sealed trait beginSponsoringFutureReserves extends OperationResponseType
  /* "begin_sponsoring_future_reserves" */ val beginSponsoringFutureReserves: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.beginSponsoringFutureReserves with String = js.native
  
  @js.native
  sealed trait bumpSequence extends OperationResponseType
  /* "bump_sequence" */ val bumpSequence: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.bumpSequence with String = js.native
  
  @js.native
  sealed trait changeTrust extends OperationResponseType
  /* "change_trust" */ val changeTrust: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.changeTrust with String = js.native
  
  @js.native
  sealed trait claimClaimableBalance extends OperationResponseType
  /* "claim_claimable_balance" */ val claimClaimableBalance: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.claimClaimableBalance with String = js.native
  
  @js.native
  sealed trait createAccount extends OperationResponseType
  /* "create_account" */ val createAccount: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.createAccount with String = js.native
  
  @js.native
  sealed trait createClaimableBalance extends OperationResponseType
  /* "create_claimable_balance" */ val createClaimableBalance: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.createClaimableBalance with String = js.native
  
  @js.native
  sealed trait createPassiveOffer extends OperationResponseType
  /* "create_passive_sell_offer" */ val createPassiveOffer: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.createPassiveOffer with String = js.native
  
  @js.native
  sealed trait endSponsoringFutureReserves extends OperationResponseType
  /* "end_sponsoring_future_reserves" */ val endSponsoringFutureReserves: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.endSponsoringFutureReserves with String = js.native
  
  @js.native
  sealed trait inflation extends OperationResponseType
  /* "inflation" */ val inflation: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.inflation with String = js.native
  
  @js.native
  sealed trait manageBuyOffer extends OperationResponseType
  /* "manage_buy_offer" */ val manageBuyOffer: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.manageBuyOffer with String = js.native
  
  @js.native
  sealed trait manageData extends OperationResponseType
  /* "manage_data" */ val manageData: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.manageData with String = js.native
  
  @js.native
  sealed trait manageOffer extends OperationResponseType
  /* "manage_sell_offer" */ val manageOffer: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.manageOffer with String = js.native
  
  @js.native
  sealed trait pathPayment extends OperationResponseType
  /* "path_payment_strict_receive" */ val pathPayment: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.pathPayment with String = js.native
  
  @js.native
  sealed trait pathPaymentStrictSend extends OperationResponseType
  /* "path_payment_strict_send" */ val pathPaymentStrictSend: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.pathPaymentStrictSend with String = js.native
  
  @js.native
  sealed trait payment extends OperationResponseType
  /* "payment" */ val payment: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.payment with String = js.native
  
  @js.native
  sealed trait revokeSponsorship extends OperationResponseType
  /* "revoke_sponsorship" */ val revokeSponsorship: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.revokeSponsorship with String = js.native
  
  @js.native
  sealed trait setOptions extends OperationResponseType
  /* "set_options" */ val setOptions: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.setOptions with String = js.native
}
