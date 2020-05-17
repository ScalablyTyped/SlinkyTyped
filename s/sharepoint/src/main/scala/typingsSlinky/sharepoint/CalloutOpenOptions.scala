package typingsSlinky.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalloutOpenOptions extends js.Object {
  /** Callout will be closed on blur */
  var closeCalloutOnBlur: Boolean = js.native
  /** HTML event name, e.g. "click" */
  var event: String = js.native
  /** Close button will be shown within the callout window */
  var showCloseButton: Boolean = js.native
}

object CalloutOpenOptions {
  @scala.inline
  def apply(closeCalloutOnBlur: Boolean, event: String, showCloseButton: Boolean): CalloutOpenOptions = {
    val __obj = js.Dynamic.literal(closeCalloutOnBlur = closeCalloutOnBlur.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], showCloseButton = showCloseButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutOpenOptions]
  }
  @scala.inline
  implicit class CalloutOpenOptionsOps[Self <: CalloutOpenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseCalloutOnBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeCalloutOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

