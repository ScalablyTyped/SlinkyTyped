package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsHttpContentCodingHeaderValue extends js.Object {
  /** An array of HttpContentCodingHeaderValue items that start at startIndex in the HttpContentCodingHeaderValueCollection . */ var items: HttpContentCodingHeaderValue = js.native
  /** The number of HttpContentCodingHeaderValue items retrieved. */ var returnValue: Double = js.native
}

object ItemsHttpContentCodingHeaderValue {
  @scala.inline
  def apply(items: HttpContentCodingHeaderValue, returnValue: Double): ItemsHttpContentCodingHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpContentCodingHeaderValue]
  }
  @scala.inline
  implicit class ItemsHttpContentCodingHeaderValueOps[Self <: ItemsHttpContentCodingHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: HttpContentCodingHeaderValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

