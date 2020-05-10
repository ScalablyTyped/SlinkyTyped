package typingsSlinky.stripe.mod.issuing.cards

import typingsSlinky.stripe.mod.issuing.cardholders.ICardholderBillingAddress
import typingsSlinky.stripe.stripeStrings.bulk
import typingsSlinky.stripe.stripeStrings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIssuingCardShippingAddress extends js.Object {
  /**
    * Shipping address.
    */
  var address: ICardholderBillingAddress = js.native
  /**
    * Recipient name.
    */
  var name: String = js.native
  /**
    * One of bulk or individual. Bulk shipments will be grouped and mailed together, while individual ones will not.
    */
  var `type`: js.UndefOr[bulk | individual] = js.native
}

object IIssuingCardShippingAddress {
  @scala.inline
  def apply(address: ICardholderBillingAddress, name: String): IIssuingCardShippingAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingCardShippingAddress]
  }
  @scala.inline
  implicit class IIssuingCardShippingAddressOps[Self <: IIssuingCardShippingAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: ICardholderBillingAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: bulk | individual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

