package typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a web account provider trigger. */
@js.native
trait WebAccountProviderTriggerDetails extends js.Object {
  /** Gets the web account provider operation. */
  var operation: IWebAccountProviderOperation = js.native
}

object WebAccountProviderTriggerDetails {
  @scala.inline
  def apply(operation: IWebAccountProviderOperation): WebAccountProviderTriggerDetails = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderTriggerDetails]
  }
  @scala.inline
  implicit class WebAccountProviderTriggerDetailsOps[Self <: WebAccountProviderTriggerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperation(value: IWebAccountProviderOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

