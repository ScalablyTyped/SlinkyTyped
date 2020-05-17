package typingsSlinky.winrtUwp.Windows.ApplicationModel.Store

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the listing info that describes the app in the Windows Store. */
@js.native
trait ListingInformation extends js.Object {
  /** Gets the age rating for the app. */
  var ageRating: Double = js.native
  var currencyCode: js.Any = js.native
   /* unmapped type */ /** Gets the country code associated with the user's location, such as US or CA, that is used to identify their market for transactions in the current session. */
  var currentMarket: String = js.native
  /** Gets the app's description in the current market. */
  var description: String = js.native
  var formattedBasePrice: js.Any = js.native
   /* unmapped type */ /** Gets the app's purchase price formatted for the current market and currency. */
  var formattedPrice: String = js.native
  var isOnSale: js.Any = js.native
   /* unmapped type */ /** Gets the app's name in the current market. */
  var name: String = js.native
  /** Gets information about in-app products available for purchase. */
  var productListings: IMapView[String, ProductListing] = js.native
  var saleEndDate: js.Any = js.native
}

object ListingInformation {
  @scala.inline
  def apply(
    ageRating: Double,
    currencyCode: js.Any,
    currentMarket: String,
    description: String,
    formattedBasePrice: js.Any,
    formattedPrice: String,
    isOnSale: js.Any,
    name: String,
    productListings: IMapView[String, ProductListing],
    saleEndDate: js.Any
  ): ListingInformation = {
    val __obj = js.Dynamic.literal(ageRating = ageRating.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], currentMarket = currentMarket.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formattedBasePrice = formattedBasePrice.asInstanceOf[js.Any], formattedPrice = formattedPrice.asInstanceOf[js.Any], isOnSale = isOnSale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productListings = productListings.asInstanceOf[js.Any], saleEndDate = saleEndDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListingInformation]
  }
  @scala.inline
  implicit class ListingInformationOps[Self <: ListingInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgeRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencyCode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentMarket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMarket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattedBasePrice(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedBasePrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattedPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOnSale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOnSale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductListings(value: IMapView[String, ProductListing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productListings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaleEndDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saleEndDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

