package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsHttpNameValueHeaderValue extends js.Object {
  /** An array of HttpNameValueHeaderValue items that start at startIndex in the HttpCacheDirectiveHeaderValueCollection . */ var items: HttpNameValueHeaderValue = js.native
  /** The number of HttpNameValueHeaderValue items retrieved. */ var returnValue: Double = js.native
}

object ItemsHttpNameValueHeaderValue {
  @scala.inline
  def apply(items: HttpNameValueHeaderValue, returnValue: Double): ItemsHttpNameValueHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpNameValueHeaderValue]
  }
  @scala.inline
  implicit class ItemsHttpNameValueHeaderValueOps[Self <: ItemsHttpNameValueHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: HttpNameValueHeaderValue): Self = {
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

