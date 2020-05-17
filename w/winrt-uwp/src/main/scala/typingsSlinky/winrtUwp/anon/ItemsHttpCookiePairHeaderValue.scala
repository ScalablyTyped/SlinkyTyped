package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpCookiePairHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsHttpCookiePairHeaderValue extends js.Object {
  /** An array of HttpCookiePairHeaderValue items that start at startIndex in the HttpCookiePairHeaderValueCollection . */ var items: HttpCookiePairHeaderValue = js.native
  /** The number of HttpCookiePairHeaderValue items retrieved. */ var returnValue: Double = js.native
}

object ItemsHttpCookiePairHeaderValue {
  @scala.inline
  def apply(items: HttpCookiePairHeaderValue, returnValue: Double): ItemsHttpCookiePairHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpCookiePairHeaderValue]
  }
  @scala.inline
  implicit class ItemsHttpCookiePairHeaderValueOps[Self <: ItemsHttpCookiePairHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: HttpCookiePairHeaderValue): Self = {
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

