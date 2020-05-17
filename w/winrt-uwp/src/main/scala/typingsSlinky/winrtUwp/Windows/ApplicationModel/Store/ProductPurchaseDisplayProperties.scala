package typingsSlinky.winrtUwp.Windows.ApplicationModel.Store

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to provide the product name that is displayed to the user at time of purchase. */
@js.native
trait ProductPurchaseDisplayProperties extends js.Object {
  /** Windows Phone only. This is an internal product description. */
  var description: String = js.native
  /** Windows Phone only. Gets or sets the location of an image used to represent the product at time of purchase. */
  var image: Uri = js.native
  /** Gets or sets the product name that is displayed to the user at time of purchase. */
  var name: String = js.native
}

object ProductPurchaseDisplayProperties {
  @scala.inline
  def apply(description: String, image: Uri, name: String): ProductPurchaseDisplayProperties = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductPurchaseDisplayProperties]
  }
  @scala.inline
  implicit class ProductPurchaseDisplayPropertiesOps[Self <: ProductPurchaseDisplayProperties] (val x: Self) extends AnyVal {
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
    def withImage(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

