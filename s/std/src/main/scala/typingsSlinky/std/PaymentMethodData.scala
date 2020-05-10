package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodData extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var supportedMethods: java.lang.String | js.Array[java.lang.String] = js.native
}

object PaymentMethodData {
  @scala.inline
  def apply(supportedMethods: java.lang.String | js.Array[java.lang.String]): PaymentMethodData = {
    val __obj = js.Dynamic.literal(supportedMethods = supportedMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodData]
  }
  @scala.inline
  implicit class PaymentMethodDataOps[Self <: PaymentMethodData] (val x: Self) extends AnyVal {
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
  }
  
}

