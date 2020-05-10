package typingsSlinky.stripe.mod.products

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The dimensions of this product for shipping purposes. A SKU associated with this product can override this value by having its
  * own package_dimensions
  */
@js.native
trait IPackageDimensions extends js.Object {
  /**
    * Height, in inches. Maximum precision is 2 decimal places.
    */
  var height: Double = js.native
  /**
    * Length, in inches. Maximum precision is 2 decimal places.
    */
  var length: Double = js.native
  /**
    * Weight, in ounces. Maximum precision is 2 decimal places.
    */
  var weight: Double = js.native
  /**
    * Width, in inches. Maximum precision is 2 decimal places.
    */
  var width: Double = js.native
}

object IPackageDimensions {
  @scala.inline
  def apply(height: Double, length: Double, weight: Double, width: Double): IPackageDimensions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPackageDimensions]
  }
  @scala.inline
  implicit class IPackageDimensionsOps[Self <: IPackageDimensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

