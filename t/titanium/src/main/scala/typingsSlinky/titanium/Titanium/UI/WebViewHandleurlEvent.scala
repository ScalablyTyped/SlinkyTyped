package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when <Titanium.UI.WebView.allowedURLSchemes> contains scheme of opening url.
		 */
@js.native
trait WebViewHandleurlEvent extends WebViewBaseEvent {
  /**
  			 * Handler <Titanium.UI.iOS.WebViewDecisionHandler>.
  			 */
  var handler: String = js.native
  /**
  			 * URL of the web document being loaded.
  			 */
  var url: String = js.native
}

object WebViewHandleurlEvent {
  @scala.inline
  def apply(handler: String, source: WebView, url: String): WebViewHandleurlEvent = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewHandleurlEvent]
  }
  @scala.inline
  implicit class WebViewHandleurlEventOps[Self <: WebViewHandleurlEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandler(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

