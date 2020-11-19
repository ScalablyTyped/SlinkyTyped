package typingsSlinky.stellarSdk.mod

import typingsSlinky.stellarBase.mod.MemoType
import typingsSlinky.stellarBase.mod.TransactionBuilder.TransactionBuilderOptions
import typingsSlinky.stellarBase.xdrMod.default.TransactionEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "TransactionBuilder")
@js.native
class TransactionBuilder protected ()
  extends typingsSlinky.stellarBase.mod.TransactionBuilder {
  def this(sourceAccount: typingsSlinky.stellarBase.mod.Account) = this()
  def this(sourceAccount: typingsSlinky.stellarBase.mod.Account, options: TransactionBuilderOptions) = this()
}
/* static members */
@JSImport("stellar-sdk", "TransactionBuilder")
@js.native
object TransactionBuilder extends js.Object {
  
  def buildFeeBumpTransaction(
    feeSource: typingsSlinky.stellarBase.mod.Keypair,
    baseFee: String,
    innerTx: typingsSlinky.stellarBase.mod.Transaction[
      typingsSlinky.stellarBase.mod.Memo[MemoType], 
      js.Array[typingsSlinky.stellarBase.mod.Operation]
    ],
    networkPassphrase: String
  ): typingsSlinky.stellarBase.mod.FeeBumpTransaction = js.native
  
  def fromXDR(envelope: String, networkPassphrase: String): (typingsSlinky.stellarBase.mod.Transaction[
    typingsSlinky.stellarBase.mod.Memo[MemoType], 
    js.Array[typingsSlinky.stellarBase.mod.Operation]
  ]) | typingsSlinky.stellarBase.mod.FeeBumpTransaction = js.native
  def fromXDR(envelope: TransactionEnvelope, networkPassphrase: String): (typingsSlinky.stellarBase.mod.Transaction[
    typingsSlinky.stellarBase.mod.Memo[MemoType], 
    js.Array[typingsSlinky.stellarBase.mod.Operation]
  ]) | typingsSlinky.stellarBase.mod.FeeBumpTransaction = js.native
}
