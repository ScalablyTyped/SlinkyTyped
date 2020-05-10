package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when an SSL error occurred.
		 */
@js.native
trait WebViewSslerrorEvent extends WebViewBaseEvent {
  /**
  			 * SSL error code.
  			 */
  var code: Double = js.native
}

object WebViewSslerrorEvent {
  @scala.inline
  def apply(code: Double, source: WebView): WebViewSslerrorEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewSslerrorEvent]
  }
  @scala.inline
  implicit class WebViewSslerrorEventOps[Self <: WebViewSslerrorEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

