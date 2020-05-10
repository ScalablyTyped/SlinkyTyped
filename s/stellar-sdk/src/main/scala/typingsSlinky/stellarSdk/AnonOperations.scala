package typingsSlinky.stellarSdk

import typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOperations extends js.Object {
  var operations: js.Array[String] = js.native
  var transaction: TransactionFailedResultCodes = js.native
}

object AnonOperations {
  @scala.inline
  def apply(operations: js.Array[String], transaction: TransactionFailedResultCodes): AnonOperations = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOperations]
  }
  @scala.inline
  implicit class AnonOperationsOps[Self <: AnonOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransaction(value: TransactionFailedResultCodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

