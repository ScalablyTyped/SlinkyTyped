package typingsSlinky.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplePay extends js.Object {
  var applePay: js.UndefOr[Boolean] = js.native
}

object ApplePay {
  @scala.inline
  def apply(): ApplePay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplePay]
  }
  @scala.inline
  implicit class ApplePayOps[Self <: ApplePay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplePay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applePay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplePay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applePay")(js.undefined)
        ret
    }
  }
  
}

