package typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider

import typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a web provider token response. */
@js.native
trait WebProviderTokenResponse extends js.Object {
  /** Gets the response from the provider to the client. */
  var clientResponse: WebTokenResponse = js.native
}

object WebProviderTokenResponse {
  @scala.inline
  def apply(clientResponse: WebTokenResponse): WebProviderTokenResponse = {
    val __obj = js.Dynamic.literal(clientResponse = clientResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebProviderTokenResponse]
  }
  @scala.inline
  implicit class WebProviderTokenResponseOps[Self <: WebProviderTokenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientResponse(value: WebTokenResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

