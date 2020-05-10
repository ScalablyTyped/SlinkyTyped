package typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingTransferAcceptResult extends js.Object {
  var error: js.UndefOr[String] = js.native
  var ext_action_uri: js.UndefOr[String] = js.native
  var protection_code_attempts_available: js.UndefOr[Double] = js.native
  var status: String = js.native
}

object IncomingTransferAcceptResult {
  @scala.inline
  def apply(status: String): IncomingTransferAcceptResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingTransferAcceptResult]
  }
  @scala.inline
  implicit class IncomingTransferAcceptResultOps[Self <: IncomingTransferAcceptResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
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
    def withExt_action_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext_action_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt_action_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext_action_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withProtection_code_attempts_available(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection_code_attempts_available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtection_code_attempts_available: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection_code_attempts_available")(js.undefined)
        ret
    }
  }
  
}

