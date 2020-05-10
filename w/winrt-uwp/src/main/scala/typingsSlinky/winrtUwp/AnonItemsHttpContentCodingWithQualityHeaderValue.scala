package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemsHttpContentCodingWithQualityHeaderValue extends js.Object {
  /** An array of HttpContentCodingWithQualityHeaderValue items that start at startIndex in the HttpContentCodingWithQualityHeaderValueCollection . */ var items: HttpContentCodingWithQualityHeaderValue = js.native
  /** The number of HttpContentCodingWithQualityHeaderValue items retrieved. */ var returnValue: Double = js.native
}

object AnonItemsHttpContentCodingWithQualityHeaderValue {
  @scala.inline
  def apply(items: HttpContentCodingWithQualityHeaderValue, returnValue: Double): AnonItemsHttpContentCodingWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsHttpContentCodingWithQualityHeaderValue]
  }
  @scala.inline
  implicit class AnonItemsHttpContentCodingWithQualityHeaderValueOps[Self <: AnonItemsHttpContentCodingWithQualityHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: HttpContentCodingWithQualityHeaderValue): Self = {
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

