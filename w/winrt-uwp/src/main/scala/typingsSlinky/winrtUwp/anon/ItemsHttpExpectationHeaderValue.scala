package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpExpectationHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsHttpExpectationHeaderValue extends js.Object {
  /** An array of HttpExpectationHeaderValue items that start at startIndex in the HttpExpectationHeaderValueCollection . */ var items: HttpExpectationHeaderValue = js.native
  /** The number of items retrieved. */ var returnValue: Double = js.native
}

object ItemsHttpExpectationHeaderValue {
  @scala.inline
  def apply(items: HttpExpectationHeaderValue, returnValue: Double): ItemsHttpExpectationHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpExpectationHeaderValue]
  }
  @scala.inline
  implicit class ItemsHttpExpectationHeaderValueOps[Self <: ItemsHttpExpectationHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: HttpExpectationHeaderValue): Self = {
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

