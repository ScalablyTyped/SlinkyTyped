package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpChallengeHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemsHttpChallengeHeaderValue extends js.Object {
  /** An array of HttpChallengeHeaderValue items that start at startIndex in the HttpChallengeHeaderValueCollection . */ var items: HttpChallengeHeaderValue = js.native
  /** The number of HttpChallengeHeaderValue items retrieved. */ var returnValue: Double = js.native
}

object AnonItemsHttpChallengeHeaderValue {
  @scala.inline
  def apply(items: HttpChallengeHeaderValue, returnValue: Double): AnonItemsHttpChallengeHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsHttpChallengeHeaderValue]
  }
  @scala.inline
  implicit class AnonItemsHttpChallengeHeaderValueOps[Self <: AnonItemsHttpChallengeHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: HttpChallengeHeaderValue): Self = {
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

