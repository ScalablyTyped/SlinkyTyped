package typingsSlinky.stellarDashSdk.stellarDashSdkMod

import typingsSlinky.stellarDashBase.stellarDashBaseMod.MemoType
import typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.TransactionEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Transaction")
@js.native
class Transaction[TMemo /* <: typingsSlinky.stellarDashBase.stellarDashBaseMod.Memo[MemoType] */, TOps /* <: js.Array[typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation] */] protected ()
  extends typingsSlinky.stellarDashBase.stellarDashBaseMod.Transaction[TMemo, TOps] {
  def this(envelope: String) = this()
  def this(envelope: TransactionEnvelope) = this()
  def this(envelope: String, networkPassphrase: String) = this()
  def this(envelope: TransactionEnvelope, networkPassphrase: String) = this()
}

