package typingsSlinky.shopifyPrime.chargeMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.accepted
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.active
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.cancelled
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.declined
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.expired
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Charge extends ShopifyObject {
  /**
    * The URL that the customer should be sent to, to accept or decline the application charge.
    */
  var confirmation_url: js.UndefOr[String] = js.native
  /**
    * The date and time when the application charge was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The name of the application charge, e.g. "Super Expensive One-time Charge".
    */
  var name: String = js.native
  /**
    * The price of the application charge. Note: Shopify returns this value as a string.
    */
  var price: js.UndefOr[String | Double] = js.native
  /**
    * The URL the customer is sent to once they accept/decline a charge.
    */
  var return_url: js.UndefOr[String] = js.native
  /**
    * The status of the charge.
    */
  var status: js.UndefOr[pending | accepted | active | cancelled | declined | expired] = js.native
  /**
    * Whether or not the application charge is a test transaction.
    */
  var test: js.UndefOr[Boolean] = js.native
  /**
    * The date and time when the recurring application charge was last updated.
    */
  var updated_at: js.UndefOr[String] = js.native
}

object Charge {
  @scala.inline
  def apply(name: String): Charge = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charge]
  }
  @scala.inline
  implicit class ChargeOps[Self <: Charge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfirmation_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmation_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmation_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmation_url")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withPrice(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_url")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: pending | accepted | active | cancelled | declined | expired): Self = {
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
    @scala.inline
    def withTest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(js.undefined)
        ret
    }
  }
  
}

