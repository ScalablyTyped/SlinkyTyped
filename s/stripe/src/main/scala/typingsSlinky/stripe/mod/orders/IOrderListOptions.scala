package typingsSlinky.stripe.mod.orders

import typingsSlinky.stripe.AnonFulfilled
import typingsSlinky.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOrderListOptions extends IListOptionsCreated {
  /**
    * Only return orders for the given customer
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * Only return orders with the given IDs
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Only return orders that have the given status. One of "created", "paid", "fulfilled", or "refunded".
    */
  var status: OrderStatus = js.native
  /**
    * Filter orders based on when they were "paid", "fulfilled", "canceled", or "returned"
    */
  var status_transitions: js.UndefOr[AnonFulfilled] = js.native
}

object IOrderListOptions {
  @scala.inline
  def apply(status: OrderStatus): IOrderListOptions = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrderListOptions]
  }
  @scala.inline
  implicit class IOrderListOptionsOps[Self <: IOrderListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: OrderStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(js.undefined)
        ret
    }
    @scala.inline
    def withIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus_transitions(value: AnonFulfilled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_transitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus_transitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_transitions")(js.undefined)
        ret
    }
  }
  
}

