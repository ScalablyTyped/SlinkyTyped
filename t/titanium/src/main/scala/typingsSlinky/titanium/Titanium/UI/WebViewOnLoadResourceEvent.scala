package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when loading resource.
		 */
@js.native
trait WebViewOnLoadResourceEvent extends WebViewBaseEvent {
  /**
  			 * The url of the resource that will load.
  			 */
  var url: String = js.native
}

object WebViewOnLoadResourceEvent {
  @scala.inline
  def apply(source: WebView, url: String): WebViewOnLoadResourceEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewOnLoadResourceEvent]
  }
  @scala.inline
  implicit class WebViewOnLoadResourceEventOps[Self <: WebViewOnLoadResourceEvent] (val x: Self) extends AnyVal {
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
  }
  
}

