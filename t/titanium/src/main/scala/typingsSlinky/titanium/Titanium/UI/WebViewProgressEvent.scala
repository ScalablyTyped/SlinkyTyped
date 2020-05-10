package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when webpage download progresses.
		 */
@js.native
trait WebViewProgressEvent extends WebViewBaseEvent {
  /**
  			 * URL of the web document being loaded.
  			 */
  var url: String = js.native
  /**
  			 * An estimate of what fraction of the current navigation has been loaded.
  			 */
  var value: Double = js.native
}

object WebViewProgressEvent {
  @scala.inline
  def apply(source: WebView, url: String, value: Double): WebViewProgressEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewProgressEvent]
  }
  @scala.inline
  implicit class WebViewProgressEventOps[Self <: WebViewProgressEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

