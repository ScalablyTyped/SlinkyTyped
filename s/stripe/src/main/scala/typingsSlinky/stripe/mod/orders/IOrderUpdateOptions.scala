package typingsSlinky.stripe.mod.orders

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOrderUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * A coupon code that represents a discount to be applied to this order. Must be one-time duration and in same currency as the order.
    */
  var coupon: js.UndefOr[String] = js.native
  /**
    * The shipping method to select for fulfilling this order. If specified, must be one of the ids of a shipping method in the
    * shipping_methods array. If specified, will overwrite the existing selected shipping method, updating items as necessary.
    */
  var selected_shipping_method: js.UndefOr[String] = js.native
  var status: js.UndefOr[OrderStatus] = js.native
}

object IOrderUpdateOptions {
  @scala.inline
  def apply(): IOrderUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOrderUpdateOptions]
  }
  @scala.inline
  implicit class IOrderUpdateOptionsOps[Self <: IOrderUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoupon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coupon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoupon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coupon")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected_shipping_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected_shipping_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected_shipping_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected_shipping_method")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: OrderStatus): Self = {
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
  }
  
}

