package typingsSlinky.stellarBase.mod.TransactionBuilder

import typingsSlinky.stellarBase.mod.FeeBumpTransaction
import typingsSlinky.stellarBase.mod.Keypair
import typingsSlinky.stellarBase.mod.Memo
import typingsSlinky.stellarBase.mod.MemoType
import typingsSlinky.stellarBase.mod.Operation
import typingsSlinky.stellarBase.mod.Transaction
import typingsSlinky.stellarBase.xdrMod.default.TransactionEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "TransactionBuilder")
@js.native
object ^ extends js.Object {
  
  def buildFeeBumpTransaction(
    feeSource: Keypair,
    baseFee: String,
    innerTx: Transaction[Memo[MemoType], js.Array[Operation]],
    networkPassphrase: String
  ): FeeBumpTransaction = js.native
  
  def fromXDR(envelope: String, networkPassphrase: String): (Transaction[Memo[MemoType], js.Array[Operation]]) | FeeBumpTransaction = js.native
  def fromXDR(envelope: TransactionEnvelope, networkPassphrase: String): (Transaction[Memo[MemoType], js.Array[Operation]]) | FeeBumpTransaction = js.native
}
