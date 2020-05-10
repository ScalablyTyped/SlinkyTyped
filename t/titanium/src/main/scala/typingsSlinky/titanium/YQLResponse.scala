package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties passed to a yql callback to report a success or failure.
  */
@js.native
trait YQLResponse extends ErrorResponse {
  /**
  	 * The data payload received from the YQL.
  	 */
  var data: js.UndefOr[js.Any] = js.native
  /**
  	 * Error message, if any returned. Use `error` instead
  	 * @deprecated
  	 */
  var message: js.UndefOr[java.lang.String] = js.native
}

object YQLResponse {
  @scala.inline
  def apply(): YQLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YQLResponse]
  }
  @scala.inline
  implicit class YQLResponseOps[Self <: YQLResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

