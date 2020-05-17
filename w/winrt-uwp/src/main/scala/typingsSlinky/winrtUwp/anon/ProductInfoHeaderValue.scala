package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpProductInfoHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductInfoHeaderValue extends js.Object {
  /** The HttpProductInfoHeaderValue version of the string. */ var productInfoHeaderValue: HttpProductInfoHeaderValue = js.native
  /** true if input is valid HttpProductInfoHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object ProductInfoHeaderValue {
  @scala.inline
  def apply(productInfoHeaderValue: HttpProductInfoHeaderValue, returnValue: Boolean): ProductInfoHeaderValue = {
    val __obj = js.Dynamic.literal(productInfoHeaderValue = productInfoHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductInfoHeaderValue]
  }
  @scala.inline
  implicit class ProductInfoHeaderValueOps[Self <: ProductInfoHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductInfoHeaderValue(value: HttpProductInfoHeaderValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productInfoHeaderValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

