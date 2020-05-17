package typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import typingsSlinky.winrtUwp.Windows.Security.Credentials.WebAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the response from a web account provider to a web token request. */
@js.native
trait WebTokenResponse extends js.Object {
  /** Gets the properties of the response */
  var properties: IMap[String, String] = js.native
  /** Gets the error returned by the provider, if any. */
  var providerError: WebProviderError = js.native
  /** Gets the authentication token. */
  var token: String = js.native
  /** Gets the web account for the request. */
  var webAccount: WebAccount = js.native
}

object WebTokenResponse {
  @scala.inline
  def apply(
    properties: IMap[String, String],
    providerError: WebProviderError,
    token: String,
    webAccount: WebAccount
  ): WebTokenResponse = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], providerError = providerError.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], webAccount = webAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebTokenResponse]
  }
  @scala.inline
  implicit class WebTokenResponseOps[Self <: WebTokenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperties(value: IMap[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderError(value: WebProviderError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebAccount(value: WebAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAccount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

