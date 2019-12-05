package typingsSlinky.stellarDashBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stellarDashBaseMod {
  import typingsSlinky.node.Buffer
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.AssetType.credit12
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.AssetType.credit4
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.AssetType.native
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.AuthFlag.immutable
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.AuthFlag.required
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.AuthFlag.revocable
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.MemoType.Hash
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.MemoType.ID
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.MemoType.None
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.MemoType.Return
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.MemoType.Text
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.AccountMerge
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.AllowTrust
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.BumpSequence
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.ChangeTrust
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.CreateAccount
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.CreatePassiveSellOffer
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.Inflation
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.ManageBuyOffer
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.ManageData
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.ManageSellOffer
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.PathPaymentStrictReceive
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.PathPaymentStrictSend
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.Payment
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation.SetOptions
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.Signer.Ed25519PublicKey
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.Signer.PreAuthTx
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.Signer.Sha256Hash
  import typingsSlinky.stellarDashBase.stellarDashBaseStrings.ed25519

  type AssetType = native | credit4 | credit12
  type AuthFlag = immutable | required | revocable
  type KeypairType = ed25519
  type MemoType = None | ID | Text | Hash | Return
  type MemoValue = Null | String | Buffer
  type Operation = CreateAccount | Payment | PathPaymentStrictReceive | PathPaymentStrictSend | CreatePassiveSellOffer | ManageSellOffer | ManageBuyOffer | SetOptions[SignerOptions] | ChangeTrust | AllowTrust | AccountMerge | Inflation | ManageData | BumpSequence
  type OperationOptions = typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.CreateAccount | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.Payment | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.PathPaymentStrictReceive | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.PathPaymentStrictSend | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.CreatePassiveSellOffer | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.ManageSellOffer | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.ManageBuyOffer | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.SetOptions[scala.Nothing] | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.ChangeTrust | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.AllowTrust | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.AccountMerge | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.Inflation | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.ManageData | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationOptions.BumpSequence
  type OperationType = typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.CreateAccount | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.Payment | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.PathPaymentStrictReceive | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.PathPaymentStrictSend | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.CreatePassiveSellOffer | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.ManageSellOffer | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.ManageBuyOffer | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.SetOptions | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.ChangeTrust | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.AllowTrust | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.AccountMerge | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.Inflation | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.ManageData | typingsSlinky.stellarDashBase.stellarDashBaseMod.OperationType.BumpSequence
  type Signer = Ed25519PublicKey | Sha256Hash | PreAuthTx
  type SignerOptions = typingsSlinky.stellarDashBase.stellarDashBaseMod.SignerOptions.Ed25519PublicKey | typingsSlinky.stellarDashBase.stellarDashBaseMod.SignerOptions.Sha256Hash | typingsSlinky.stellarDashBase.stellarDashBaseMod.SignerOptions.PreAuthTx
  type TransactionBuilder = TransactionBuilder_
}
