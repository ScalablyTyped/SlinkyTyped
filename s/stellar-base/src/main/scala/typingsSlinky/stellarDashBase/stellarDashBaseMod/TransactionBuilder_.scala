package typingsSlinky.stellarDashBase.stellarDashBaseMod

import typingsSlinky.stellarDashBase.stellarDashBaseMod.TransactionBuilder.TransactionBuilderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "TransactionBuilder")
@js.native
class TransactionBuilder_ protected () extends js.Object {
  def this(sourceAccount: Account) = this()
  def this(sourceAccount: Account, options: TransactionBuilderOptions) = this()
  def addMemo(memo: Memo[MemoType]): this.type = js.native
  def addOperation(operation: typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[Operation]): this.type = js.native
  def build(): Transaction[Memo[MemoType], js.Array[Operation]] = js.native
  def setNetworkPassphrase(networkPassphrase: String): this.type = js.native
  def setTimeout(timeoutInSeconds: Double): this.type = js.native
}

