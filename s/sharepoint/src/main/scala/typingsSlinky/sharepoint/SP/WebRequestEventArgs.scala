package typingsSlinky.sharepoint.SP

import typingsSlinky.microsoftDashAjax.Sys.EventArgs
import typingsSlinky.microsoftDashAjax.Sys.Net.WebRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.WebRequestEventArgs")
@js.native
class WebRequestEventArgs protected () extends EventArgs {
  def this(webRequest: WebRequest) = this()
  def get_webRequest(): WebRequest = js.native
}

