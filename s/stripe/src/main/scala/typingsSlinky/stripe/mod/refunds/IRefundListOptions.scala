package typingsSlinky.stripe.mod.refunds

import typingsSlinky.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRefundListOptions extends IListOptions {
  /**
    * Only return refunds for the charge specified by this charge ID.
    */
  var charge: js.UndefOr[String] = js.native
}

object IRefundListOptions {
  @scala.inline
  def apply(): IRefundListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRefundListOptions]
  }
  @scala.inline
  implicit class IRefundListOptionsOps[Self <: IRefundListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charge")(js.undefined)
        ret
    }
  }
  
}

