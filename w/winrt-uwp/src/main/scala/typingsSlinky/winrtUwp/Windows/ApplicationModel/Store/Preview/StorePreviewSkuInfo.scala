package typingsSlinky.winrtUwp.Windows.ApplicationModel.Store.Preview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the available SKUs for an in-app product. */
@js.native
trait StorePreviewSkuInfo extends js.Object {
  /** Gets the currency code for the current market. */
  var currencyCode: String = js.native
  /** Gets custom developer data for the current SKU. */
  var customDeveloperData: String = js.native
  /** Gets the description for the current SKU. */
  var description: String = js.native
  /** Gets extended data for the current SKU. */
  var extendedData: String = js.native
  /** Gets the current SKU's purchase price with the appropriate formatting for the current market. */
  var formattedListPrice: String = js.native
  /** Gets the ID of the product that this SKU is associated with. */
  var productId: String = js.native
  /** Gets the ID of this SKU. */
  var skuId: String = js.native
  /** Gets a string that specifies the type of the in-app product SKU. */
  var skuType: String = js.native
  /** Gets the name of the in-app product SKU that is displayed to customers. */
  var title: String = js.native
}

object StorePreviewSkuInfo {
  @scala.inline
  def apply(
    currencyCode: String,
    customDeveloperData: String,
    description: String,
    extendedData: String,
    formattedListPrice: String,
    productId: String,
    skuId: String,
    skuType: String,
    title: String
  ): StorePreviewSkuInfo = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], customDeveloperData = customDeveloperData.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], extendedData = extendedData.asInstanceOf[js.Any], formattedListPrice = formattedListPrice.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], skuId = skuId.asInstanceOf[js.Any], skuType = skuType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePreviewSkuInfo]
  }
  @scala.inline
  implicit class StorePreviewSkuInfoOps[Self <: StorePreviewSkuInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomDeveloperData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDeveloperData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattedListPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedListPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkuId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkuType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

