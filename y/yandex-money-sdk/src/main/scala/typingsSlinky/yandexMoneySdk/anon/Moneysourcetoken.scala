package typingsSlinky.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moneysourcetoken extends js.Object {
  var money_source_token: js.UndefOr[String] = js.native
  var pan_fragment: js.UndefOr[String] = js.native
  var payment_card_type: String = js.native
  var `type`: String = js.native
}

object Moneysourcetoken {
  @scala.inline
  def apply(payment_card_type: String, `type`: String): Moneysourcetoken = {
    val __obj = js.Dynamic.literal(payment_card_type = payment_card_type.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Moneysourcetoken]
  }
  @scala.inline
  implicit class MoneysourcetokenOps[Self <: Moneysourcetoken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayment_card_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_card_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoney_source_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("money_source_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoney_source_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("money_source_token")(js.undefined)
        ret
    }
    @scala.inline
    def withPan_fragment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan_fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPan_fragment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan_fragment")(js.undefined)
        ret
    }
  }
  
}

