package typingsSlinky.sharepoint.SP

import typingsSlinky.microsoftAjax.Sys.EventArgs
import typingsSlinky.microsoftAjax.Sys.Net.WebRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebRequestEventArgs extends EventArgs {
  def get_webRequest(): WebRequest = js.native
}

object WebRequestEventArgs {
  @scala.inline
  def apply(Empty: EventArgs, get_webRequest: () => WebRequest): WebRequestEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_webRequest = js.Any.fromFunction0(get_webRequest))
    __obj.asInstanceOf[WebRequestEventArgs]
  }
  @scala.inline
  implicit class WebRequestEventArgsOps[Self <: WebRequestEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_webRequest(value: () => WebRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_webRequest")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

