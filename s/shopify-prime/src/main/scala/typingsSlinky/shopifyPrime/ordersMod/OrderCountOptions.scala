package typingsSlinky.shopifyPrime.ordersMod

import typingsSlinky.shopifyPrime.financialStatusMod.FinancialStatus
import typingsSlinky.shopifyPrime.fulfillmentStatusMod.FulfillmentStatus
import typingsSlinky.shopifyPrime.optionsBaseMod.DateOptions
import typingsSlinky.shopifyPrime.orderStatusMod.OrderStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderCountOptions extends DateOptions {
  var financial_status: js.UndefOr[FinancialStatus] = js.native
  var fulfillment_status: js.UndefOr[FulfillmentStatus] = js.native
  var status: js.UndefOr[OrderStatus] = js.native
}

object OrderCountOptions {
  @scala.inline
  def apply(): OrderCountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderCountOptions]
  }
  @scala.inline
  implicit class OrderCountOptionsOps[Self <: OrderCountOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinancial_status(value: FinancialStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("financial_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinancial_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("financial_status")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfillment_status(value: FulfillmentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillment_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfillment_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillment_status")(js.undefined)
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

