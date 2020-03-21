package typingsSlinky.stellarSdk.mod

import typingsSlinky.stellarBase.mod.MemoType
import typingsSlinky.stellarBase.mod.xdr.TransactionEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Transaction")
@js.native
class Transaction[TMemo /* <: typingsSlinky.stellarBase.mod.Memo[MemoType] */, TOps /* <: js.Array[typingsSlinky.stellarBase.mod.Operation] */] protected ()
  extends typingsSlinky.stellarBase.mod.Transaction[TMemo, TOps] {
  def this(envelope: String) = this()
  def this(envelope: TransactionEnvelope) = this()
  def this(envelope: String, networkPassphrase: String) = this()
  def this(envelope: TransactionEnvelope, networkPassphrase: String) = this()
}

