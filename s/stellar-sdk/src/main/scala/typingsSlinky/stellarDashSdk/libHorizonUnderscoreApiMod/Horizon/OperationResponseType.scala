package typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OperationResponseType extends js.Object

@JSImport("stellar-sdk/lib/horizon_api", "Horizon.OperationResponseType")
@js.native
object OperationResponseType extends js.Object {
  @js.native
  sealed trait accountMerge extends OperationResponseType
  
  @js.native
  sealed trait allowTrust extends OperationResponseType
  
  @js.native
  sealed trait bumpSequence extends OperationResponseType
  
  @js.native
  sealed trait changeTrust extends OperationResponseType
  
  @js.native
  sealed trait createAccount extends OperationResponseType
  
  @js.native
  sealed trait createPassiveOffer extends OperationResponseType
  
  @js.native
  sealed trait inflation extends OperationResponseType
  
  @js.native
  sealed trait manageData extends OperationResponseType
  
  @js.native
  sealed trait manageOffer extends OperationResponseType
  
  @js.native
  sealed trait pathPayment extends OperationResponseType
  
  @js.native
  sealed trait payment extends OperationResponseType
  
  @js.native
  sealed trait setOptions extends OperationResponseType
  
  /* "account_merge" */ val accountMerge: typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.accountMerge with String = js.native
  /* "allow_trust" */ val allowTrust: typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.allowTrust with String = js.native
  /* "bump_sequence" */ val bumpSequence: typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.bumpSequence with String = js.native
  /* "change_trust" */ val changeTrust: typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.changeTrust with String = js.native
  /* "create_account" */ val createAccount: typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.createAccount with String = js.native
  /* "create_passive_offer" */ val createPassiveOffer: typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.createPassiveOffer with String = js.native
  /* "inflation" */ val inflation: typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.inflation with String = js.native
  /* "manage_data" */ val manageData: typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.manageData with String = js.native
  /* "manage_offer" */ val manageOffer: typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.manageOffer with String = js.native
  /* "path_payment" */ val pathPayment: typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.pathPayment with String = js.native
  /* "payment" */ val payment: typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.payment with String = js.native
  /* "set_options" */ val setOptions: typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.setOptions with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OperationResponseType with String] = js.native
}

