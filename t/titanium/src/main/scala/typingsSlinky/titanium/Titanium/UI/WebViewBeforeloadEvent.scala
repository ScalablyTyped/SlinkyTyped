package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired before the web view starts loading its content.
		 */
@js.native
trait WebViewBeforeloadEvent extends WebViewBaseEvent {
  /**
  			 * Indicate if the event was generated from the main page or an iframe.
  			 */
  var isMainFrame: Boolean = js.native
  /**
  			 * Constant indicating the user's action.
  			 */
  var navigationType: Double = js.native
  /**
  			 * URL of the web document being loaded.
  			 */
  var url: String = js.native
}

object WebViewBeforeloadEvent {
  @scala.inline
  def apply(isMainFrame: Boolean, navigationType: Double, source: WebView, url: String): WebViewBeforeloadEvent = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any], navigationType = navigationType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewBeforeloadEvent]
  }
  @scala.inline
  implicit class WebViewBeforeloadEventOps[Self <: WebViewBeforeloadEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMainFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMainFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationType")(value.asInstanceOf[js.Any])
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

