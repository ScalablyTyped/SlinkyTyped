package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentDetailsModifier extends js.Object {
  var additionalDisplayItems: js.UndefOr[js.Array[PaymentItem]] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var supportedMethods: java.lang.String | js.Array[java.lang.String] = js.native
  var total: js.UndefOr[PaymentItem] = js.native
}

object PaymentDetailsModifier {
  @scala.inline
  def apply(supportedMethods: java.lang.String | js.Array[java.lang.String]): PaymentDetailsModifier = {
    val __obj = js.Dynamic.literal(supportedMethods = supportedMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetailsModifier]
  }
  @scala.inline
  implicit class PaymentDetailsModifierOps[Self <: PaymentDetailsModifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSupportedMethods(value: java.lang.String | js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalDisplayItems(value: js.Array[PaymentItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalDisplayItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalDisplayItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalDisplayItems")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: PaymentItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

