package typingsSlinky.stripe.mod.charges

import typingsSlinky.stripe.anon.Object
import typingsSlinky.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChargeListOptions extends IListOptionsCreated {
  /**
    * Only return charges for the customer specified by this customer ID.
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * A filter on the list based on the source of the charge. The value can be a
    * dictionary with the following options:
    */
  var source: js.UndefOr[Object] = js.native
}

object IChargeListOptions {
  @scala.inline
  def apply(): IChargeListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChargeListOptions]
  }
  @scala.inline
  implicit class IChargeListOptionsOps[Self <: IChargeListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSource(value: Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

