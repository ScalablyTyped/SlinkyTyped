package typingsSlinky.stellarBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type KeypairType = typingsSlinky.stellarBase.stellarBaseStrings.ed25519
  type Operation = typingsSlinky.stellarBase.mod.Operation.CreateAccount_ | typingsSlinky.stellarBase.mod.Operation.Payment_ | typingsSlinky.stellarBase.mod.Operation.PathPaymentStrictReceive_ | typingsSlinky.stellarBase.mod.Operation.PathPaymentStrictSend_ | typingsSlinky.stellarBase.mod.Operation.CreatePassiveSellOffer_ | typingsSlinky.stellarBase.mod.Operation.ManageSellOffer_ | typingsSlinky.stellarBase.mod.Operation.ManageBuyOffer_ | typingsSlinky.stellarBase.mod.Operation.SetOptions_[typingsSlinky.stellarBase.mod.SignerOptions] | typingsSlinky.stellarBase.mod.Operation.ChangeTrust_ | typingsSlinky.stellarBase.mod.Operation.AllowTrust_ | typingsSlinky.stellarBase.mod.Operation.AccountMerge_ | typingsSlinky.stellarBase.mod.Operation.Inflation_ | typingsSlinky.stellarBase.mod.Operation.ManageData_ | typingsSlinky.stellarBase.mod.Operation.BumpSequence_
  type OperationOptions = typingsSlinky.stellarBase.mod.OperationOptions.CreateAccount | typingsSlinky.stellarBase.mod.OperationOptions.Payment | typingsSlinky.stellarBase.mod.OperationOptions.PathPaymentStrictReceive | typingsSlinky.stellarBase.mod.OperationOptions.PathPaymentStrictSend | typingsSlinky.stellarBase.mod.OperationOptions.CreatePassiveSellOffer | typingsSlinky.stellarBase.mod.OperationOptions.ManageSellOffer | typingsSlinky.stellarBase.mod.OperationOptions.ManageBuyOffer | typingsSlinky.stellarBase.mod.OperationOptions.SetOptions[scala.Nothing] | typingsSlinky.stellarBase.mod.OperationOptions.ChangeTrust | typingsSlinky.stellarBase.mod.OperationOptions.AllowTrust | typingsSlinky.stellarBase.mod.OperationOptions.AccountMerge | typingsSlinky.stellarBase.mod.OperationOptions.Inflation | typingsSlinky.stellarBase.mod.OperationOptions.ManageData | typingsSlinky.stellarBase.mod.OperationOptions.BumpSequence
  type Signer = typingsSlinky.stellarBase.mod.Signer.Ed25519PublicKey | typingsSlinky.stellarBase.mod.Signer.Sha256Hash | typingsSlinky.stellarBase.mod.Signer.PreAuthTx
  type SignerOptions = typingsSlinky.stellarBase.mod.SignerOptions.Ed25519PublicKey | typingsSlinky.stellarBase.mod.SignerOptions.Sha256Hash | typingsSlinky.stellarBase.mod.SignerOptions.PreAuthTx
  type TransactionBuilder = typingsSlinky.stellarBase.mod.TransactionBuilder_
}
