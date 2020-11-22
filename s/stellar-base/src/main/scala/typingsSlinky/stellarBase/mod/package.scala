package typingsSlinky.stellarBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AssetType = typingsSlinky.stellarBase.mod.AssetType.native | typingsSlinky.stellarBase.mod.AssetType.credit4 | typingsSlinky.stellarBase.mod.AssetType.credit12
  
  type AuthFlag = typingsSlinky.stellarBase.mod.AuthFlag.immutable | typingsSlinky.stellarBase.mod.AuthFlag.required | typingsSlinky.stellarBase.mod.AuthFlag.revocable
  
  type KeypairType = typingsSlinky.stellarBase.stellarBaseStrings.ed25519
  
  type MemoType = typingsSlinky.stellarBase.mod.MemoType.None | typingsSlinky.stellarBase.mod.MemoType.ID | typingsSlinky.stellarBase.mod.MemoType.Text | typingsSlinky.stellarBase.mod.MemoType.Hash | typingsSlinky.stellarBase.mod.MemoType.Return
  
  type MemoValue = scala.Null | java.lang.String | typingsSlinky.node.Buffer
  
  type Operation = typingsSlinky.stellarBase.mod.Operation.CreateAccount_ | typingsSlinky.stellarBase.mod.Operation.Payment_ | typingsSlinky.stellarBase.mod.Operation.PathPaymentStrictReceive_ | typingsSlinky.stellarBase.mod.Operation.PathPaymentStrictSend_ | typingsSlinky.stellarBase.mod.Operation.CreatePassiveSellOffer_ | typingsSlinky.stellarBase.mod.Operation.ManageSellOffer_ | typingsSlinky.stellarBase.mod.Operation.ManageBuyOffer_ | typingsSlinky.stellarBase.mod.Operation.SetOptions_[typingsSlinky.stellarBase.mod.SignerOptions] | typingsSlinky.stellarBase.mod.Operation.ChangeTrust_ | typingsSlinky.stellarBase.mod.Operation.AllowTrust_ | typingsSlinky.stellarBase.mod.Operation.AccountMerge_ | typingsSlinky.stellarBase.mod.Operation.Inflation_ | typingsSlinky.stellarBase.mod.Operation.ManageData_ | typingsSlinky.stellarBase.mod.Operation.BumpSequence_ | typingsSlinky.stellarBase.mod.Operation.CreateClaimableBalance_ | typingsSlinky.stellarBase.mod.Operation.ClaimClaimableBalance_ | typingsSlinky.stellarBase.mod.Operation.BeginSponsoringFutureReserves_ | typingsSlinky.stellarBase.mod.Operation.EndSponsoringFutureReserves_ | typingsSlinky.stellarBase.mod.Operation.RevokeAccountSponsorship_ | typingsSlinky.stellarBase.mod.Operation.RevokeTrustlineSponsorship_ | typingsSlinky.stellarBase.mod.Operation.RevokeOfferSponsorship_ | typingsSlinky.stellarBase.mod.Operation.RevokeDataSponsorship_ | typingsSlinky.stellarBase.mod.Operation.RevokeClaimableBalanceSponsorship_ | typingsSlinky.stellarBase.mod.Operation.RevokeSignerSponsorship_
  
  type OperationOptions = typingsSlinky.stellarBase.mod.OperationOptions.CreateAccount | typingsSlinky.stellarBase.mod.OperationOptions.Payment | typingsSlinky.stellarBase.mod.OperationOptions.PathPaymentStrictReceive | typingsSlinky.stellarBase.mod.OperationOptions.PathPaymentStrictSend | typingsSlinky.stellarBase.mod.OperationOptions.CreatePassiveSellOffer | typingsSlinky.stellarBase.mod.OperationOptions.ManageSellOffer | typingsSlinky.stellarBase.mod.OperationOptions.ManageBuyOffer | typingsSlinky.stellarBase.mod.OperationOptions.SetOptions[scala.Nothing] | typingsSlinky.stellarBase.mod.OperationOptions.ChangeTrust | typingsSlinky.stellarBase.mod.OperationOptions.AllowTrust | typingsSlinky.stellarBase.mod.OperationOptions.AccountMerge | typingsSlinky.stellarBase.mod.OperationOptions.Inflation | typingsSlinky.stellarBase.mod.OperationOptions.ManageData | typingsSlinky.stellarBase.mod.OperationOptions.BumpSequence | typingsSlinky.stellarBase.mod.OperationOptions.CreateClaimableBalance | typingsSlinky.stellarBase.mod.OperationOptions.ClaimClaimableBalance | typingsSlinky.stellarBase.mod.OperationOptions.BeginSponsoringFutureReserves | typingsSlinky.stellarBase.mod.OperationOptions.RevokeAccountSponsorship | typingsSlinky.stellarBase.mod.OperationOptions.RevokeTrustlineSponsorship | typingsSlinky.stellarBase.mod.OperationOptions.RevokeOfferSponsorship | typingsSlinky.stellarBase.mod.OperationOptions.RevokeDataSponsorship | typingsSlinky.stellarBase.mod.OperationOptions.RevokeClaimableBalanceSponsorship | typingsSlinky.stellarBase.mod.OperationOptions.RevokeSignerSponsorship
  
  type OperationType = typingsSlinky.stellarBase.mod.OperationType.CreateAccount | typingsSlinky.stellarBase.mod.OperationType.Payment | typingsSlinky.stellarBase.mod.OperationType.PathPaymentStrictReceive | typingsSlinky.stellarBase.mod.OperationType.PathPaymentStrictSend | typingsSlinky.stellarBase.mod.OperationType.CreatePassiveSellOffer | typingsSlinky.stellarBase.mod.OperationType.ManageSellOffer | typingsSlinky.stellarBase.mod.OperationType.ManageBuyOffer | typingsSlinky.stellarBase.mod.OperationType.SetOptions | typingsSlinky.stellarBase.mod.OperationType.ChangeTrust | typingsSlinky.stellarBase.mod.OperationType.AllowTrust | typingsSlinky.stellarBase.mod.OperationType.AccountMerge | typingsSlinky.stellarBase.mod.OperationType.Inflation | typingsSlinky.stellarBase.mod.OperationType.ManageData | typingsSlinky.stellarBase.mod.OperationType.BumpSequence | typingsSlinky.stellarBase.mod.OperationType.CreateClaimableBalance | typingsSlinky.stellarBase.mod.OperationType.ClaimClaimableBalance | typingsSlinky.stellarBase.mod.OperationType.BeginSponsoringFutureReserves | typingsSlinky.stellarBase.mod.OperationType.EndSponsoringFutureReserves | typingsSlinky.stellarBase.mod.OperationType.RevokeSponsorship
  
  type Signer = typingsSlinky.stellarBase.mod.Signer.Ed25519PublicKey | typingsSlinky.stellarBase.mod.Signer.Sha256Hash | typingsSlinky.stellarBase.mod.Signer.PreAuthTx
  
  type SignerKeyOptions = typingsSlinky.stellarBase.mod.SignerKeyOptions.Ed25519PublicKey | typingsSlinky.stellarBase.mod.SignerKeyOptions.Sha256Hash | typingsSlinky.stellarBase.mod.SignerKeyOptions.PreAuthTx
  
  type SignerOptions = typingsSlinky.stellarBase.mod.SignerOptions.Ed25519PublicKey | typingsSlinky.stellarBase.mod.SignerOptions.Sha256Hash | typingsSlinky.stellarBase.mod.SignerOptions.PreAuthTx
  
  type TransactionBuilder = typingsSlinky.stellarBase.mod.TransactionBuilder_
  
  type TrustLineFlag = typingsSlinky.stellarBase.mod.TrustLineFlag.deauthorize | typingsSlinky.stellarBase.mod.TrustLineFlag.authorize | typingsSlinky.stellarBase.mod.TrustLineFlag.authorizeToMaintainLiabilities
}
