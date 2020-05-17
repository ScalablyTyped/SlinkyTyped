package typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet

import typingsSlinky.yandexMoneySdk.anon.Article
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationDetailsResult extends js.Object {
  var amount: js.UndefOr[Double] = js.native
  var amount_due: js.UndefOr[Double] = js.native
  var answer_datetime: js.UndefOr[String] = js.native
  var codepro: js.UndefOr[Boolean] = js.native
  var comment: js.UndefOr[String] = js.native
  var datetime: js.UndefOr[String] = js.native
  var details: js.UndefOr[String] = js.native
  var digital_goods: js.UndefOr[Article] = js.native
  var direction: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var expires: js.UndefOr[String] = js.native
  var fee: js.UndefOr[Double] = js.native
  var label: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var operation_id: js.UndefOr[String] = js.native
  var pattern_id: js.UndefOr[String] = js.native
  var protection_code: js.UndefOr[String] = js.native
  var recipient: js.UndefOr[String] = js.native
  var recipient_type: js.UndefOr[String] = js.native
  var sender: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object OperationDetailsResult {
  @scala.inline
  def apply(): OperationDetailsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationDetailsResult]
  }
  @scala.inline
  implicit class OperationDetailsResultOps[Self <: OperationDetailsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
    @scala.inline
    def withAmount_due(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_due")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount_due: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_due")(js.undefined)
        ret
    }
    @scala.inline
    def withAnswer_datetime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answer_datetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswer_datetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answer_datetime")(js.undefined)
        ret
    }
    @scala.inline
    def withCodepro(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codepro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodepro: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codepro")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withDatetime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime")(js.undefined)
        ret
    }
    @scala.inline
    def withDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withDigital_goods(value: Article): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digital_goods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigital_goods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digital_goods")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
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
    def withExpires(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(js.undefined)
        ret
    }
    @scala.inline
    def withFee(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fee")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation_id")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern_id")(js.undefined)
        ret
    }
    @scala.inline
    def withProtection_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtection_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection_code")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipient(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipient_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipient_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient_type")(js.undefined)
        ret
    }
    @scala.inline
    def withSender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

