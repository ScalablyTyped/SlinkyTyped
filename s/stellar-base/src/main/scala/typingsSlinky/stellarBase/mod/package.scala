package typingsSlinky.stellarBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stellarBase.mod.Operation.CreateAccount_
    - typingsSlinky.stellarBase.mod.Operation.Payment_
    - typingsSlinky.stellarBase.mod.Operation.PathPaymentStrictReceive_
    - typingsSlinky.stellarBase.mod.Operation.PathPaymentStrictSend_
    - typingsSlinky.stellarBase.mod.Operation.CreatePassiveSellOffer_
    - typingsSlinky.stellarBase.mod.Operation.ManageSellOffer_
    - typingsSlinky.stellarBase.mod.Operation.ManageBuyOffer_
    - typingsSlinky.stellarBase.mod.Operation.SetOptions_[typingsSlinky.stellarBase.mod.SignerOptions]
    - typingsSlinky.stellarBase.mod.Operation.ChangeTrust_
    - typingsSlinky.stellarBase.mod.Operation.AllowTrust_
    - typingsSlinky.stellarBase.mod.Operation.AccountMerge_
    - typingsSlinky.stellarBase.mod.Operation.Inflation_
    - typingsSlinky.stellarBase.mod.Operation.ManageData_
    - typingsSlinky.stellarBase.mod.Operation.BumpSequence_
    - typingsSlinky.stellarBase.mod.Operation.CreateClaimableBalance_
    - typingsSlinky.stellarBase.mod.Operation.ClaimClaimableBalance_
    - typingsSlinky.stellarBase.mod.Operation.BeginSponsoringFutureReserves_
    - typingsSlinky.stellarBase.mod.Operation.EndSponsoringFutureReserves_
    - typingsSlinky.stellarBase.mod.Operation.RevokeAccountSponsorship_
    - typingsSlinky.stellarBase.mod.Operation.RevokeTrustlineSponsorship_
    - typingsSlinky.stellarBase.mod.Operation.RevokeOfferSponsorship_
    - typingsSlinky.stellarBase.mod.Operation.RevokeDataSponsorship_
    - typingsSlinky.stellarBase.mod.Operation.RevokeClaimableBalanceSponsorship_
    - typingsSlinky.stellarBase.mod.Operation.RevokeSignerSponsorship_
  */
  type Operation = typingsSlinky.stellarBase.mod._Operation | typingsSlinky.stellarBase.mod.Operation.SetOptions_[typingsSlinky.stellarBase.mod.SignerOptions] | typingsSlinky.stellarBase.mod.Operation.Inflation_ | typingsSlinky.stellarBase.mod.Operation.EndSponsoringFutureReserves_
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stellarBase.mod.OperationOptions.CreateAccount
    - typingsSlinky.stellarBase.mod.OperationOptions.Payment
    - typingsSlinky.stellarBase.mod.OperationOptions.PathPaymentStrictReceive
    - typingsSlinky.stellarBase.mod.OperationOptions.PathPaymentStrictSend
    - typingsSlinky.stellarBase.mod.OperationOptions.CreatePassiveSellOffer
    - typingsSlinky.stellarBase.mod.OperationOptions.ManageSellOffer
    - typingsSlinky.stellarBase.mod.OperationOptions.ManageBuyOffer
    - typingsSlinky.stellarBase.mod.OperationOptions.SetOptions[scala.Nothing]
    - typingsSlinky.stellarBase.mod.OperationOptions.ChangeTrust
    - typingsSlinky.stellarBase.mod.OperationOptions.AllowTrust
    - typingsSlinky.stellarBase.mod.OperationOptions.AccountMerge
    - typingsSlinky.stellarBase.mod.OperationOptions.Inflation
    - typingsSlinky.stellarBase.mod.OperationOptions.ManageData
    - typingsSlinky.stellarBase.mod.OperationOptions.BumpSequence
    - typingsSlinky.stellarBase.mod.OperationOptions.CreateClaimableBalance
    - typingsSlinky.stellarBase.mod.OperationOptions.ClaimClaimableBalance
    - typingsSlinky.stellarBase.mod.OperationOptions.BeginSponsoringFutureReserves
    - typingsSlinky.stellarBase.mod.OperationOptions.RevokeAccountSponsorship
    - typingsSlinky.stellarBase.mod.OperationOptions.RevokeTrustlineSponsorship
    - typingsSlinky.stellarBase.mod.OperationOptions.RevokeOfferSponsorship
    - typingsSlinky.stellarBase.mod.OperationOptions.RevokeDataSponsorship
    - typingsSlinky.stellarBase.mod.OperationOptions.RevokeClaimableBalanceSponsorship
    - typingsSlinky.stellarBase.mod.OperationOptions.RevokeSignerSponsorship
  */
  type OperationOptions = typingsSlinky.stellarBase.mod._OperationOptions | typingsSlinky.stellarBase.mod.OperationOptions.SetOptions[scala.Nothing] | typingsSlinky.stellarBase.mod.OperationOptions.Inflation
  
  type AssetType = typingsSlinky.stellarBase.mod.AssetType.native | typingsSlinky.stellarBase.mod.AssetType.credit4 | typingsSlinky.stellarBase.mod.AssetType.credit12
  
  type AuthFlag = typingsSlinky.stellarBase.mod.AuthFlag.immutable | typingsSlinky.stellarBase.mod.AuthFlag.required | typingsSlinky.stellarBase.mod.AuthFlag.revocable
  
  @scala.inline
  def AuthImmutableFlag: typingsSlinky.stellarBase.stellarBaseNumbers.`4` = typingsSlinky.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AuthImmutableFlag").asInstanceOf[typingsSlinky.stellarBase.stellarBaseNumbers.`4`]
  
  @scala.inline
  def AuthRequiredFlag: typingsSlinky.stellarBase.stellarBaseNumbers.`1` = typingsSlinky.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AuthRequiredFlag").asInstanceOf[typingsSlinky.stellarBase.stellarBaseNumbers.`1`]
  
  @scala.inline
  def AuthRevocableFlag: typingsSlinky.stellarBase.stellarBaseNumbers.`2` = typingsSlinky.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AuthRevocableFlag").asInstanceOf[typingsSlinky.stellarBase.stellarBaseNumbers.`2`]
  
  @scala.inline
  def BASE_FEE: /* "100" */ java.lang.String = typingsSlinky.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("BASE_FEE").asInstanceOf[/* "100" */ java.lang.String]
  
  @scala.inline
  def FastSigning: scala.Boolean = typingsSlinky.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("FastSigning").asInstanceOf[scala.Boolean]
  
  type KeypairType = typingsSlinky.stellarBase.stellarBaseStrings.ed25519
  
  @scala.inline
  def MemoHash: /* "hash" */ java.lang.String = typingsSlinky.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoHash").asInstanceOf[/* "hash" */ java.lang.String]
  
  @scala.inline
  def MemoID: /* "id" */ java.lang.String = typingsSlinky.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoID").asInstanceOf[/* "id" */ java.lang.String]
  
  @scala.inline
  def MemoNone: /* "none" */ java.lang.String = typingsSlinky.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoNone").asInstanceOf[/* "none" */ java.lang.String]
  
  @scala.inline
  def MemoReturn: /* "return" */ java.lang.String = typingsSlinky.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoReturn").asInstanceOf[/* "return" */ java.lang.String]
  
  @scala.inline
  def MemoText: /* "text" */ java.lang.String = typingsSlinky.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoText").asInstanceOf[/* "text" */ java.lang.String]
  
  type MemoType = typingsSlinky.stellarBase.mod.MemoType.None | typingsSlinky.stellarBase.mod.MemoType.ID | typingsSlinky.stellarBase.mod.MemoType.Text | typingsSlinky.stellarBase.mod.MemoType.Hash | typingsSlinky.stellarBase.mod.MemoType.Return
  
  type MemoValue = scala.Null | java.lang.String | typingsSlinky.node.Buffer
  
  type OperationType = typingsSlinky.stellarBase.mod.OperationType.CreateAccount | typingsSlinky.stellarBase.mod.OperationType.Payment | typingsSlinky.stellarBase.mod.OperationType.PathPaymentStrictReceive | typingsSlinky.stellarBase.mod.OperationType.PathPaymentStrictSend | typingsSlinky.stellarBase.mod.OperationType.CreatePassiveSellOffer | typingsSlinky.stellarBase.mod.OperationType.ManageSellOffer | typingsSlinky.stellarBase.mod.OperationType.ManageBuyOffer | typingsSlinky.stellarBase.mod.OperationType.SetOptions | typingsSlinky.stellarBase.mod.OperationType.ChangeTrust | typingsSlinky.stellarBase.mod.OperationType.AllowTrust | typingsSlinky.stellarBase.mod.OperationType.AccountMerge | typingsSlinky.stellarBase.mod.OperationType.Inflation | typingsSlinky.stellarBase.mod.OperationType.ManageData | typingsSlinky.stellarBase.mod.OperationType.BumpSequence | typingsSlinky.stellarBase.mod.OperationType.CreateClaimableBalance | typingsSlinky.stellarBase.mod.OperationType.ClaimClaimableBalance | typingsSlinky.stellarBase.mod.OperationType.BeginSponsoringFutureReserves | typingsSlinky.stellarBase.mod.OperationType.EndSponsoringFutureReserves | typingsSlinky.stellarBase.mod.OperationType.RevokeSponsorship
  
  @scala.inline
  def TimeoutInfinite: /* 0 */ scala.Double = typingsSlinky.stellarBase.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TimeoutInfinite").asInstanceOf[/* 0 */ scala.Double]
  
  type TrustLineFlag = typingsSlinky.stellarBase.mod.TrustLineFlag.deauthorize | typingsSlinky.stellarBase.mod.TrustLineFlag.authorize | typingsSlinky.stellarBase.mod.TrustLineFlag.authorizeToMaintainLiabilities
  
  @scala.inline
  def hash(data: typingsSlinky.node.Buffer): typingsSlinky.node.Buffer = typingsSlinky.stellarBase.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def sign(data: typingsSlinky.node.Buffer, rawSecret: typingsSlinky.node.Buffer): typingsSlinky.node.Buffer = (typingsSlinky.stellarBase.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(data.asInstanceOf[js.Any], rawSecret.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def verify(
    data: typingsSlinky.node.Buffer,
    signature: typingsSlinky.node.Buffer,
    rawPublicKey: typingsSlinky.node.Buffer
  ): scala.Boolean = (typingsSlinky.stellarBase.mod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(data.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], rawPublicKey.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
}
