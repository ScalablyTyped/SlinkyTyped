package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentDetailsBase extends js.Object {
  var displayItems: js.UndefOr[js.Array[PaymentItem]] = js.native
  var modifiers: js.UndefOr[js.Array[PaymentDetailsModifier]] = js.native
  var shippingOptions: js.UndefOr[js.Array[PaymentShippingOption]] = js.native
}

object PaymentDetailsBase {
  @scala.inline
  def apply(): PaymentDetailsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDetailsBase]
  }
  @scala.inline
  implicit class PaymentDetailsBaseOps[Self <: PaymentDetailsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayItems(value: js.Array[PaymentItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayItems")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiers(value: js.Array[PaymentDetailsModifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingOptions(value: js.Array[PaymentShippingOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOptions")(js.undefined)
        ret
    }
  }
  
}

