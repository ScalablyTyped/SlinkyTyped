package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Web.Http.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemsHttpMethod extends js.Object {
  /** An array of HttpMethod items that start at startIndex in the HttpMethodHeaderValueCollection . */ var items: HttpMethod = js.native
  /** The number of items retrieved. */ var returnValue: Double = js.native
}

object AnonItemsHttpMethod {
  @scala.inline
  def apply(items: HttpMethod, returnValue: Double): AnonItemsHttpMethod = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsHttpMethod]
  }
  @scala.inline
  implicit class AnonItemsHttpMethodOps[Self <: AnonItemsHttpMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: HttpMethod): Self = {
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

