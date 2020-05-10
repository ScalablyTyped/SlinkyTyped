package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpTransferCodingHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemsHttpTransferCodingHeaderValue extends js.Object {
  /** An array of HttpTransferCodingHeaderValue items that start at startIndex in the HttpTransferCodingHeaderValueCollection . */ var items: HttpTransferCodingHeaderValue = js.native
  /** The number of items retrieved. */ var returnValue: Double = js.native
}

object AnonItemsHttpTransferCodingHeaderValue {
  @scala.inline
  def apply(items: HttpTransferCodingHeaderValue, returnValue: Double): AnonItemsHttpTransferCodingHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsHttpTransferCodingHeaderValue]
  }
  @scala.inline
  implicit class AnonItemsHttpTransferCodingHeaderValueOps[Self <: AnonItemsHttpTransferCodingHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: HttpTransferCodingHeaderValue): Self = {
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

