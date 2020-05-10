package typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet

import typingsSlinky.yandexMoneySdk.AnonAmount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationHistoryResult extends js.Object {
  var error: js.UndefOr[String] = js.native
  var next_record: js.UndefOr[String] = js.native
  var operations: js.UndefOr[js.Array[AnonAmount]] = js.native
}

object OperationHistoryResult {
  @scala.inline
  def apply(): OperationHistoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationHistoryResult]
  }
  @scala.inline
  implicit class OperationHistoryResultOps[Self <: OperationHistoryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withNext_record(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_record")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext_record: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_record")(js.undefined)
        ret
    }
    @scala.inline
    def withOperations(value: js.Array[AnonAmount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(js.undefined)
        ret
    }
  }
  
}

