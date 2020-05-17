package typingsSlinky.winrtUwp.Windows.ApplicationModel.Store.Preview

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an in-app product, including details about available SKUs. */
@js.native
trait StorePreviewProductInfo extends js.Object {
  /** Gets the description of the in-app product. */
  var description: String = js.native
  /** Gets the ID of the in-app product. */
  var productId: String = js.native
  /** Gets the type of the in-app product. */
  var productType: String = js.native
  /** Gets information about the available SKUs for the in-app product. */
  var skuInfoList: IVectorView[StorePreviewSkuInfo] = js.native
  /** Gets the name of the in-app product that is displayed to customers. */
  var title: String = js.native
}

object StorePreviewProductInfo {
  @scala.inline
  def apply(
    description: String,
    productId: String,
    productType: String,
    skuInfoList: IVectorView[StorePreviewSkuInfo],
    title: String
  ): StorePreviewProductInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], productType = productType.asInstanceOf[js.Any], skuInfoList = skuInfoList.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePreviewProductInfo]
  }
  @scala.inline
  implicit class StorePreviewProductInfoOps[Self <: StorePreviewProductInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkuInfoList(value: IVectorView[StorePreviewSkuInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuInfoList")(value.asInstanceOf[js.Any])
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

