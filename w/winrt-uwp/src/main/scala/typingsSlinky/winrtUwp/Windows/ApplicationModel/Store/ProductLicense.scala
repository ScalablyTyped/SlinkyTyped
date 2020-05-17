package typingsSlinky.winrtUwp.Windows.ApplicationModel.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about a license that is associated with an in-app product. */
@js.native
trait ProductLicense extends js.Object {
  /** Gets the current expiration date and time of the in-app product license. */
  var expirationDate: js.Date = js.native
  /** Indicates if the in-app product license is currently active. */
  var isActive: Boolean = js.native
  /** Indicates if the in-app product is consumable. A consumable product is a product that can be purchased, used, and purchased again. */
  var isConsumable: Boolean = js.native
  /** Gets the ID of an in-app product. This ID is used by the app to get info about the product or feature that is enabled when the customer buys it through an in-app purchase. */
  var productId: String = js.native
}

object ProductLicense {
  @scala.inline
  def apply(expirationDate: js.Date, isActive: Boolean, isConsumable: Boolean, productId: String): ProductLicense = {
    val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isConsumable = isConsumable.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductLicense]
  }
  @scala.inline
  implicit class ProductLicenseOps[Self <: ProductLicense] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpirationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsConsumable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConsumable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

