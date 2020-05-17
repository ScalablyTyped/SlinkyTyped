package typingsSlinky.winrtUwp.Windows.ApplicationModel.Store

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides localized information that details an in-app product. */
@js.native
trait ProductListing extends js.Object {
  var currencyCode: js.Any = js.native
   /* unmapped type */ /** Gets the description for the in-app product. */
  var description: String = js.native
  var formattedBasePrice: js.Any = js.native
   /* unmapped type */ /** Gets the purchase price for the in-app product with the appropriate formatting for the current market. */
  var formattedPrice: String = js.native
  /** Gets the URI of the image associated with the in-app product. */
  var imageUri: Uri = js.native
  var isOnSale: js.Any = js.native
   /* unmapped type */ /** Gets the list of keywords associated with the in-app product. These keywords are useful for filtering product lists by keyword, for example, when calling LoadListingInformationByKeywordsAsync . */
  var keywords: IIterable[String] = js.native
  /** Gets the descriptive name of the in-app product that is displayed customers in the current market. */
  var name: String = js.native
  /** Gets the in-app product ID. */
  var productId: String = js.native
  /** Gets the type of this in-app product. Possible values are defined by ProductType . */
  var productType: ProductType = js.native
  /** Gets the end date of the sale period for the in-app product. */
  var saleEndDate: js.Date = js.native
  /** Gets the tag string that contains custom information about an in-app product. */
  var tag: String = js.native
}

object ProductListing {
  @scala.inline
  def apply(
    currencyCode: js.Any,
    description: String,
    formattedBasePrice: js.Any,
    formattedPrice: String,
    imageUri: Uri,
    isOnSale: js.Any,
    keywords: IIterable[String],
    name: String,
    productId: String,
    productType: ProductType,
    saleEndDate: js.Date,
    tag: String
  ): ProductListing = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formattedBasePrice = formattedBasePrice.asInstanceOf[js.Any], formattedPrice = formattedPrice.asInstanceOf[js.Any], imageUri = imageUri.asInstanceOf[js.Any], isOnSale = isOnSale.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], productType = productType.asInstanceOf[js.Any], saleEndDate = saleEndDate.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductListing]
  }
  @scala.inline
  implicit class ProductListingOps[Self <: ProductListing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencyCode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(value.asInstanceOf[js.Any])
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
    def withImageUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOnSale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOnSale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeywords(value: IIterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductType(value: ProductType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaleEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saleEndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

